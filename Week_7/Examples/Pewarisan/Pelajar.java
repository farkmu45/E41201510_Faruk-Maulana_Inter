package Week_7.Examples.Pewarisan;

public class Pelajar extends Orang {
    private String nim;
    private String asalSekolah;
    private double nilai;

    public Pelajar(String nama, double tinggi, double berat, String nim, String asalSekolah, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.asalSekolah = asalSekolah;
        this.nilai = nilai;
    }

    public String toString() {
        return (super.toString() + "\nNIM : " + nim + "\nSekolah : " + asalSekolah + "\nNilai : " + nilai);
    }

}
