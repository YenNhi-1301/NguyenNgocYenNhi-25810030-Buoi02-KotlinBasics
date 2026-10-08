// Nguyen Ngoc Yen Nhi - 25810030
fun main() {
    val diem = arrayOf(7.5, 8.0, 6.5, 9.0, 5.5, 8.5, 7.0, 6.0, 9.5, 7.5)

    var tong = 0.0
    var diemCaoNhat = diem[0]
    var diemThapNhat = diem[0]

    for (i in diem.indices) {
        tong = tong + diem[i]

        if (diem[i] > diemCaoNhat) {
            diemCaoNhat = diem[i]
        }

        if (diem[i] < diemThapNhat) {
            diemThapNhat = diem[i]
        }
    }

    val diemTrungBinh = tong / diem.size

    println("Điểm trung bình: $diemTrungBinh")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}