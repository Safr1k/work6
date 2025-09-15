fun main() {
    print("Введите 1-ое число: ")
    val chast01 = readln()
    print("Ввeдите 2-ое число: ")
    val chast02 = readln()

    var chetNechet = false

    val chast01All = chast01 + chast02
    if (chast01All.toInt() % 2 == 1) {
        println("Нечетное число - $chast01All")
        chetNechet = true
    }
    val chast02All = chast02 + chast01
    if (chast02All.toInt() % 2 == 1) {
        println("Нечетное число - $chast02All")
        chetNechet = true
    }
    if (!chetNechet){
        println("Нечетное число создать невозмижно")
    }
}