// Nguyen Ngoc Yen Nhi - 25810030
fun main() {
    val soLuong: Int = 8
    val donGia: Double = 15000.0

    val tienHang: Double = soLuong.toDouble() * donGia
    val tienThue: Double = tienHang * 0.08
    val tongTien: Double = tienHang + tienThue

    println("Tien hang: $tienHang VND")
    println("Tien thue 8%: $tienThue VND")
    println("Tong tien phai tra: $tongTien VND")
}