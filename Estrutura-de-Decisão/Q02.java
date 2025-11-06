import java.util.Scanner;
public class Q02 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o valor da sua hora de trabalho: ");
    double horatrabalho = entrada.nextDouble();

    System.out.print("Digite o número de horas trabalhadas no mês: ");
    double horastrabalhadas = entrada.nextDouble();

    double salariobruto = horatrabalho * horastrabalhadas;
    double PercentualIR, inss, fgts;

    if (salariobruto <= 1518){
        PercentualIR = 0;
    }else if (salariobruto > 1518 && salariobruto <= 2700) {
        PercentualIR = 5;
    }else if (salariobruto > 2700 && salariobruto <= 3400) {
        PercentualIR = 10;
    }else{
        PercentualIR = 20;
    }

    double descontoIR = salariobruto * (PercentualIR / 100);
    inss = salariobruto * 0.10;
    fgts = salariobruto * 0.11;
    double salarioliquido = salariobruto - descontoIR - inss;

    System.out.printf("\n" + "Salário Bruto: R$ %.2f%n", salariobruto);
    System.out.printf("Percentual do IR: %.0f%%%n", PercentualIR);
    System.out.printf("Desconto do IR: R$ %.2f%n", descontoIR);
    System.out.printf("Desconto do INSS: R$ %.2f%n", inss);
    System.out.printf("FGTS: R$ %.2f%n", fgts);
    System.out.printf("Salário Líquido: R$ %.2f%n", salarioliquido);

    entrada.close();

    }
}    