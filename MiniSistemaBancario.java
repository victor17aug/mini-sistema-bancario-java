package miniProjetos;

import java.util.Scanner;

public class MiniSistemaBancario {
    public static void menu(){
        System.out.println("Escolha uma opção abaixo: ");
        System.out.println("1- Ver saldo \n"+ "2- Depositar \n"+ "3- Sacar \n"+ "0- Sair");
    }
    public static double sacar(double saque,double saldoParaSaque) {
        return saldoParaSaque-saque;
    }
    public static double depositar(double deposito, double saldoPreDeposito){
        return deposito+saldoPreDeposito;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double saldo= 1000;
        menu();
        int n=scanner.nextInt();

        while(n!=0){
            switch (n){
                case 1:
                    System.out.println("Seu saldo é: R$"+saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    double deposito=scanner.nextDouble();
                    if(deposito<0){
                        System.out.println("Não é permitido depósito negativo");
                        System.out.println("Seu saldo é: R$ "+saldo);
                        break;
                    }else{
                    saldo=depositar(deposito,saldo);
                    System.out.println("Seu saldo agora é: R$ "+ saldo);

                    }
                    break;
                case 3:
                    System.out.println("Digite o valor a ser sacado: ");
                    double saque=scanner.nextDouble();
                    if(saque>saldo){
                        System.out.println("Saldo insuficiente para saque");
                        System.out.println("Seu saldo é: R$ "+saldo);
                        break;
                    }else{
                    saldo=sacar(saque,saldo);
                    System.out.println("Seu saldo agora é: R$ "+ saldo);

                    }
                    break;

                default:
                    System.out.println("Selecione uma opção válida");

            }
            menu();
            n=scanner.nextInt();

        }
        System.out.println("Encerrando Sistema...");
    }

}