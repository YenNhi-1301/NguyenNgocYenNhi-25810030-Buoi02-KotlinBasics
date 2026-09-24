// Nguyen Ngoc Yen Nhi - 25810030
fun main() {
    val diem: Double = 9.5

    val xepLoai = when (diem) {
        in 9.0..10.0 -> "Xuat sac"
        in 8.0..8.99 -> "Gioi"
        in 6.5..7.99 -> "Kha"
        in 5.0..6.49 -> "Trung binh"
        in 0.0..4.99 -> "Yeu"
        else -> "Diem khong hop le"
    }

    println("Diem: $diem")
    println("Xep loai: $xepLoai")
}