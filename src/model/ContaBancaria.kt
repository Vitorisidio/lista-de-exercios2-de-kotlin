package model

class ContaBancaria {

    var nomeTitular: String = ""
    private var saldo: Double = 0.0

    fun depositsar(dinheiro: Double){
        saldo += dinheiro
    }

    fun consultarSaldo(): Double{
        return saldo
    }

    fun sacar(dinheiro: Double){
        saldo -= dinheiro
    }
}

//19 -) Crie uma classe “ContaBancaria” com os atributos “nomeTitular” e “saldo”
//(privado) e crie funções para depositar um valor, sacar um valor e para consultar o saldo