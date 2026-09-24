// Nguyen Ngoc Yen Nhi - 25810030
fun main() {
    val canNang: Double = 54.0
    val chieuCao: Double = 1.65
    val bmi: Double = canNang / (chieuCao * chieuCao)
    val ketQua: String

    if (bmi < 18.5) {
        ketQua = "Gay"
    } else if (bmi < 25.0) {
        ketQua = "Binh thuong"
    } else if (bmi < 30.0) {
        ketQua = "Thua can"
    } else {
        ketQua = "Beo phi"
    }
    println("Chi so BMI: $bmi")
    println("Phan loai: $ketQua")
}