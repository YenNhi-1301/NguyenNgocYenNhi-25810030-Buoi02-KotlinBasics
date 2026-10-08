// Nguyen Ngoc Yen Nhi - 25810030
fun main() {
    var a = 0
    var b = 1
    var viTri = 1

    for (i in 1..100) {
        if (a >= 100) {
            break
        }

        println("Vị trí $viTri: $a")

        val c = a + b
        a = b
        b = c
        viTri++
    }
}