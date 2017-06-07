public class MahasiswaJava {

    private String nama;
    private String jeniskelamin;
    private int umur;

    public MahasiswaJava() {
        super();
    }

    public MahasiswaJava(final String nama, final String jeniskelamin, final int umur) {
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(final String nama) {
        this.nama = nama;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(final String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
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

        final MahasiswaJava mahasiswa = (MahasiswaJava) o;
        return umur == mahasiswa.umur && nama.equals(mahasiswa.nama) && jeniskelamin.equals(mahasiswa.jeniskelamin);
    }

    @Override
    public int hashCode() {
        int result = nama.hashCode();
        result = 31 * result + jeniskelamin.hashCode();
        result = 31 * result + umur;

        return result;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", jeniskelamin='" + jeniskelamin + '\'' +
                ", umur=" + umur +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}