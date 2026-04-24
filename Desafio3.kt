fun main() {
    print("Informe sua idade: ")
    val idade = readLine()!!.toInt()

    if (idade >= 0 && idade <= 12) {
        println("Você é uma criança.")
    } else if (idade >= 13 && idade <= 18) {
        println("Você é um adolescente.")
    } else {
        println("Você é um adulto.")
    }
}
