fun main(args: Array<String>) {
/*Exercício 2

1 - Crie um projeto chamado Calculadora de Comissão
2 - O App deve calcular a comissão dos representantes de vendas
com base neste gráfico usado pela loja de varejo:

Faixa de Vendas        Comissão
acima de R$10000    30%
R$5001 - R$9999        20%
R$1001 - R$4999        10%
abaixo de R$1000     N / D

 */
    var vend = 0.0
    var comi = 0.0

    println("Digite o valor total de suas vendas: ")
    vend = readLine()!!.toDouble()


    if (vend >= 10000 ){
        comi = vend * 0.3
        println("Parabéns! Sua comissão foi de $comi")
    }else if(vend >= 5000 && vend <= 9999){
        comi = vend * 0.2
        println("Parabéns! Sua comissão foi de $comi")
    }else if(vend >= 1000 && vend <= 4999 ){
        comi = vend * 0.1
        println("Parabéns! Sua comissão foi de $comi")
    }else{
        println("Infelizmente você não atingiu o valor necessário para comissão.")
    }



}