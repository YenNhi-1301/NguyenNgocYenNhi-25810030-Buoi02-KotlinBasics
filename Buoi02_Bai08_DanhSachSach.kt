// Nguyen Ngoc Yen Nhi - 25810030
fun main() {
    val danhSachSach = mutableListOf(
        "Lập trình Kotlin",
        "Cơ sở dữ liệu",
        "Lập trình Java"
    )

    println("Danh sách sách ban đầu:")
    println(danhSachSach)

    danhSachSach.add("Lập trình Python")
    danhSachSach.add("Cấu trúc dữ liệu")

    println()
    println("Danh sách sau khi thêm:")
    println(danhSachSach)

    danhSachSach.sort()

    println()
    println("Danh sách sau khi sắp xếp:")
    println(danhSachSach)
}