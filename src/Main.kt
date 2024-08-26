// Desafio - Crie um programa que acompanhe sua leitura!
//
//O que você precisa fazer:
//
//	Desenvolva um programa que receba o nome do livro, o número total de ​páginas e o número de páginas lidas.
//	O programa deve calcular e retornar a progressão de leitura em ​porcentagem, junto com o nome do livro.
//
//
//Entradas:
//
//        Nome do livro
//        Número total de páginas
//        Páginas lidas
//
//
//Saídas:
//
//        Nome do livro
//        Progressão em porcentagem

fun main() {
    println("Digite o nome do livro: ")
    var livro = readLine()
    println("Qual o número total de páginas?")
    var pag_total = readlnOrNull()?.toInt() ?: 0
    println("Qual o número de páginas lidas?")
    var pag_lidas = readlnOrNull()?.toInt() ?: 0

    println("Nome do Livro: $livro")
    println("Progressão na Leitura: ${100*pag_lidas/pag_total}%")
}