fun main(args: Array<String>) {

    val mahasiswaJava = MahasiswaJava("Budi", "Laki", 29)
    val name = mahasiswaJava.nama
    println("Nama MHS = $name")

    val berat: Int = 10
    val tinggi: Int = 100

    val namaSaya: String? = null
    println(namaSaya)
    println(hitung(berat, tinggi))

    val test = Test()
    println(test.menghitung())
}