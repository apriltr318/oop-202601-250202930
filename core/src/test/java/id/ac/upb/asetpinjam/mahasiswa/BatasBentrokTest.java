package id.ac.upb.asetpinjam.mahasiswa;

import static id.ac.upb.asetpinjam.TestSupport.pinjam;
import static org.assertj.core.api.Assertions.assertThat;

import id.ac.upb.asetpinjam.TestSupport;
import id.ac.upb.asetpinjam.jadwal.JadwalPeminjaman;
import id.ac.upb.asetpinjam.model.Peminjaman;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * FOLDER INI MILIK ANDA. Tulis tes Anda sendiri di sini (minggu 7 dan seterusnya).
 *
 * <p>Tes dosen sengaja tidak menentukan: apakah peminjaman 09:00-11:00 dan 11:00-13:00 pada aset yang sama
 * bentrok? Putuskan, catat alasannya di docs/asumsi.md, lalu tuliskan tesnya di sini.
 * Hapus @Disabled setelah Anda mengisinya.
 *
 * <p>Syarat minggu 10: folder ini memuat minimal 8 tes (tidak termasuk contoh bawaan ini).
 */

@Tag("week7")
class BatasBentrokTest {

    @Test
    void selesaiSamaDenganMulai() {
        JadwalPeminjaman jadwal = new JadwalPeminjaman(2);

        var peminjam = TestSupport.peminjam("P1");
        var aset = TestSupport.ruang("R-1");

        // Peminjaman pertama berlangsung pukul 09.00 sampai 11.00.
        jadwal.tambah(pinjam("1", peminjam, aset, 9, 11));

        // Peminjaman kedua dimulai tepat pukul 11.00.
        Peminjaman baru = pinjam("2", peminjam, aset, 11, 13);

        assertThat(jadwal.bentrok(baru)).isFalse();
    }
}
