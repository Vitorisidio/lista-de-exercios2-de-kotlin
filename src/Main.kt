

//Exercícios

//12 -) Escreva um programa que conte de 1 a 100 e:
//● Se for múltiplo de 3, mostre “Batata”
//● Se for múltiplo de 5, mostre “Quente”
//● Se for múltiplo de 3 e 5, mostre “BatataQuente”

//13 -) Dada uma lista de números, crie uma nova lista apenas com os ímpares

//14 -) Dada uma lista de preços, calcule o total da compra

//15 -) Dada uma lista de idades, calcule a média dos maiores de idade

//16 -) Dada uma variável numérica, calcule o seu fatorial (ex: 5! = 5 * 4 * 3 * 2 * 1 =  120)

//17 -) Crie um objeto “pessoa” com nome, idade e cidade, depois exiba uma frase com
//os dados do objeto por meio de um métod: "Maria tem 25 anos e mora em São Paulo.”

//18 -) Crie um array de objetos representando produtos (nome, preço) e mostre o nome do produto mais caro

//19 -) Crie uma classe “ContaBancaria” com os atributos “nomeTitular” e “saldo”
//(privado) e crie funções para depositar um valor, sacar um valor e para consultar o saldo

//20 -) Crie uma classe “Funcionario” com “nome”, “salario” e uma função que retorne o
//salário, depois crie uma classe “Gerente” que herde “Funcionario” e sobrescreva a
//função que retorna o salário, retornando o salário com 20% de comissão (aumento)


import model.Pessoa
import model.Produtos
import model.ContaBancaria

fun main() {
    println("Atividade 12 - Batata Quente")
    batataQuente()
    println("/-------------------------/")

    println("Atividade 13 - impar e par/")
    parImpares()
    println("/-------------------------/")

    println("Atividade 14 - total do preço/")
    Listapreco()
    println("/-------------------------/")

    println("Atividade 15 - media maior de idade/")
    mediaIdade()
    println("/-------------------------/")

    println("Atividade 16 - fatorial/")
    fatorial()
    println("/-------------------------/")

    println("Atividade 17 - classe pessoa/")
  var pessoa = Pessoa()
    pessoa.idade = 25
    pessoa.nome = "Maria"
    pessoa.cidade ="São Paulo"
    println("${pessoa.nome} tem ${pessoa.idade} anos e mora em ${pessoa.cidade}")
    println("/-------------------------/")

    println("Atividade 18 - Produtos/")
    listaProdutos()
    println("/-------------------------/")

    contaBancaria()


}

fun batataQuente(){

    for (numeros in 1 .. 100) {

         if (numeros % 3 == 0 && numeros % 5 == 0) {
            println("Batata Quente: $numeros")
        }else if (numeros % 3 == 0) {
        println("Batata: $numeros")
        } else if (numeros % 5 == 0) {
            println("quente: $numeros")
        }

    }

}

fun parImpares(){
    val numeros =(1..20).toList()

    val impar = numeros.filter { it % 2 == 1 }
    println("lista de impares: $impar")

    val par = numeros.filter { it % 2 == 0 }
    println("lista de pares: $par")
}

fun Listapreco(){

    val preco = (1..20).toList()

    val soma = preco.reduce{ acumulador, numero -> acumulador + numero}
    println(soma)
}

fun mediaIdade(){
    val idade =(1..40).toList()

    val maiorDeIdade = idade.filter { it >= 18 }

    val media = maiorDeIdade.average()

    println(media)
}

fun fatorial() {

    var numero = 5
    var resultado = 1

    while (numero > 0){

        resultado = resultado * numero
        numero--
    }
    println(resultado)
}

fun listaProdutos(){

    val produtos = arrayOf(
                Produtos("Feijão", 20.0),
                Produtos("Arroz", 60.0),
                Produtos("coca-cola", 15.0)
    )
    var produtosMaisCaro = produtos[0]

    for ( produto in produtos ){
        if (produto.preco > produtosMaisCaro.preco){
            produtosMaisCaro = produto
        }
    }
    println(produtosMaisCaro.nome)

}

fun contaBancaria(){
    val conta = ContaBancaria()

    conta.nomeTitular = "Vitor"
    conta.depositsar(500.00)
    println( conta.consultarSaldo())
}
