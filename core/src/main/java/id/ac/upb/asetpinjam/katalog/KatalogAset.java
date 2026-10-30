package id.ac.upb.asetpinjam.katalog;

import id.ac.upb.asetpinjam.model.Aset;
import id.ac.upb.asetpinjam.model.JenisAset;
import java.util.ArrayList;
import java.util.List;

/** Katalog aset di memori. tambah() dan semua() DISEDIAKAN; Anda mengerjakan dua overload cari() (minggu 4). */
public class KatalogAset {

    private final List<Aset> daftar = new ArrayList<>();

    public void tambah(Aset aset) {
        daftar.add(aset);
    }

    public List<Aset> semua() {
        return List.copyOf(daftar);
    }

/**
 * Mencari aset berdasarkan kata pada nama,
 * tanpa membedakan huruf besar dan kecil.
 */
public List<Aset> cari(String kata) {
    String kataKecil = kata.toLowerCase();

    return daftar.stream()
            .filter(aset -> aset.getNama()
                    .toLowerCase()
                    .contains(kataKecil))
            .toList();
}

/**
* Mencari aset berdasarkan kata dan jenis aset.
 */
public List<Aset> cari(String kata, JenisAset jenis) {
    return cari(kata).stream()
            .filter(aset -> aset.getJenis() == jenis)
            .toList();
}
}
