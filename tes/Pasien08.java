public class Pasien08 {
    String nama;
    String nik;
    String keluhan;

    public Pasien08 (String nama, String nik, String keluhan){
    this.nama = nama;
    this.nik = nik;
    this.keluhan = keluhan;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama      : " + nama);
        System.out.println("NIK       : " + nik);
        System.out.println("Keluhan : " + keluhan);
    }
}
