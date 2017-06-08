public class MahasiswaJava {

    private String nama;
    private String jenisKelamin;
    private int umur;

    public MahasiswaJava(final String nama, final String jenisKelamin, final int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(final String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(final String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(final int umur) {
        this.umur = umur;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final MahasiswaJava that = (MahasiswaJava) o;

        return umur == that.umur && nama.equals(that.nama) && jenisKelamin.equals(that.jenisKelamin);
    }

    @Override
    public int hashCode() {
        int result = nama.hashCode();
        result = 31 * result + jenisKelamin.hashCode();
        result = 31 * result + umur;
        return result;
    }

    @Override
    public String toString() {
        return "MahasiswaJava{" +
                "nama='" + nama + '\'' +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                ", umur=" + umur +
                '}';
    }
}