public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Budi", "Laki", 30);
        String name = mahasiswa.getNama();
        System.out.println(name);

        int berat = 10;
        int tinggi = 100;
        int hitung = HitungKt.hitung(berat, tinggi);
        System.out.println(hitung);
    }
}