
package id.ac.upb.asetpinjam.jadwal;

import id.ac.upb.asetpinjam.model.Peminjaman;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Jadwal peminjaman di memori.
 *
 * <p>Minggu 7: bentrok, semuaUrutMulai, perAset, hapus. Minggu 9: ajukan (melempar exception).
 * tambah() DISEDIAKAN dan sengaja TIDAK memeriksa apa pun.
 */
public class JadwalPeminjaman {

    private final List<Peminjaman> daftar = new ArrayList<>();
    private final int kuotaLaptop;

    public JadwalPeminjaman(int kuotaLaptop) {
        this.kuotaLaptop = kuotaLaptop;
    }

    protected int kuotaLaptop() {
        return kuotaLaptop;
    }

    protected List<Peminjaman> daftarMutable() {
        return daftar;
    }

    /** Menambah apa adanya tanpa pemeriksaan. */
    public void tambah(Peminjaman p) {
        daftar.add(p);
    }

    /**
     * Memeriksa bentrok untuk aset yang sama.
     * Jadwal yang selesai tepat saat jadwal lain dimulai tidak dianggap bentrok.
     */
    public boolean bentrok(Peminjaman baru) {
        for (Peminjaman lama : daftar) {
            boolean asetSama = lama.getAset().getKode()
                    .equals(baru.getAset().getKode());

            boolean waktuBentrok = baru.getMulai().isBefore(lama.getSelesai())
                    && lama.getMulai().isBefore(baru.getSelesai());

            if (asetSama && waktuBentrok) {
                return true;
            }
        }

        return false;
    }

    /** Mengembalikan seluruh peminjaman berdasarkan waktu mulai paling awal. */
    public List<Peminjaman> semuaUrutMulai() {
        List<Peminjaman> hasil = new ArrayList<>(daftar);

        hasil.sort(Comparator.comparing(Peminjaman::getMulai));

        return hasil;
    }

    /** Mengelompokkan peminjaman berdasarkan kode aset. */
    public Map<String, List<Peminjaman>> perAset() {
        Map<String, List<Peminjaman>> hasil = new LinkedHashMap<>();

        for (Peminjaman p : daftar) {
            String kodeAset = p.getAset().getKode();

            hasil.computeIfAbsent(kodeAset, k -> new ArrayList<>()).add(p);
        }

        return hasil;
    }

    /** Menghapus peminjaman berdasarkan ID. */
    public boolean hapus(String id) {
        return daftar.removeIf(p -> p.getId().equals(id));
    }

    /**
     * TODO minggu 9: periksa lalu tambahkan.
     * Bentrok: PeminjamanBentrokException. Peminjam sudah memegang {@link #kuotaLaptop()} laptop yang
     * aktif (status DISETUJUI atau DIPINJAM) dan mengajukan laptop lagi: KuotaHabisException.
     */
    public void ajukan(Peminjaman baru) {
        throw new UnsupportedOperationException("TODO minggu 9: ajukan");
    }
}
