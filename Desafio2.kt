fun main() {
    print("Informe seu nome: ")
    val nome = readLine()!!

    print("Informe sua idade: ")
    val idade = readLine()!!.toInt()

    println("Olá, $nome! Você tem $idade anos.")
}
