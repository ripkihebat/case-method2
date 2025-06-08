public class TransaksiLayanan08 {
    Pasien08 pasien08;
    Dokter08 dokter08;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan08 (Pasien08 pasien08, Dokter08 dokter08, int durasiLayanan){
        this.pasien08 = pasien08;
        this.dokter08 = dokter08;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    public int hitungBiaya() {
        return durasiLayanan * 50000;
    }
}
