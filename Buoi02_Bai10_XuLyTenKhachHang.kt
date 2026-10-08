// Nguyen Ngoc Yen Nhi - 25810030
fun main() {
    val tenKhachHang: String? = null

    val doDai = tenKhachHang?.length
    println("Độ dài tên: $doDai")

    val tenMacDinh = tenKhachHang ?: "Khách vãng lai"
    println("Tên khách hàng: $tenMacDinh")

    // Toán tử !! chỉ dùng khi chắc chắn biến không null.
    // Nếu biến là null thì chương trình sẽ bị lỗi.
    val tenKhongRong: String? = "Nguyen Ngoc Yen Nhi"
    println("Tên bằng !!: ${tenKhongRong!!}")
}