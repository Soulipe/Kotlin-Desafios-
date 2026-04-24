fun classificarIdade(idade: Int): String {
    if (idade >= 0 && idade <= 12) {
        return "Você é uma criança."
    } else if (idade >= 13 && idade <= 18) {
        return "Você é um adolescente."
    } else {
        return "Você é um adulto."
    }
}

fun main() {
    print("Informe sua idade: ")
    val idade = readLine()!!.toInt()

    val resultado = classificarIdade(idade)
    println(resultado)
}
