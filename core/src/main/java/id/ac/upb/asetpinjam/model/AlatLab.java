package id.ac.upb.asetpinjam.model;
import id.ac.upb.asetpinjam.config.Varian;

/** Minggu 3: alat laboratorium. Laboratorium tidak boleh kosong; risiko tidak boleh null. */
public class AlatLab extends Aset {

    private final String laboratorium;
    private final TingkatRisiko tingkatRisiko;
 
    public AlatLab(String kode, String nama, String laboratorium, TingkatRisiko tingkatRisiko) {
        super(kode, nama);
        this.laboratorium = wajibIsi(laboratorium, "laboratorium");
        if (tingkatRisiko == null) {
            throw new IllegalArgumentException("tingkatRisiko tidak boleh null");
        }
        this.tingkatRisiko = tingkatRisiko;
    }
 
    public String getLaboratorium() {
        return laboratorium;
    }
 
    public TingkatRisiko getTingkatRisiko() {
        return tingkatRisiko;
    }
 
    @Override
    public JenisAset getJenis() {
        return JenisAset.ALAT_LAB;
    }
 
    // TODO minggu 4: override hitungDenda(int).
   @Override
public long hitungDenda(int hariTerlambat) {
    if (hariTerlambat < 0) {
    throw new IllegalArgumentException("hari terlambat tidak boleh negatif");
    }
    return (long) hariTerlambat * Varian.aktif().dendaPerHari * 4L;
    }
}