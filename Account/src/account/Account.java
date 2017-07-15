/*
*Lucas Souza
*15/07/2017
*07:34 PM
* Classe Account com um construtor para validar
* e inicializar a variável de instância balance do tipo double.
*/
package account;
public class Account {
private double balance; // variável de instância que armazena o saldo.
// construtor
public Account(double initialBalance)
{
    // valida que initialBalance é maior que 0.0;
    // se não, o saldo é inicializado com o valor 0.0
    if ( initialBalance > 0.0)
        balance = initialBalance;
}// fim do construtor Account

// credita (adiciona) uma quantia à conta
public void credit( double amount )
{
    balance = balance + amount; // adiciona a quantia ao saldo
}// fim do método credit

// retorna o saldo da conta
public double getBalance()
{
    return balance; // fornece o valor de saldo ao método chamador
}// fim do método getBalance
}// fim da classe Account
