import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tipo de combustível abastecido (A-Álcool, G-Gasolina): ");
        char tipoCombustivel = entrada.next().toUpperCase().charAt(0);

        if (tipoCombustivel != 'A' && tipoCombustivel != 'G') {
            System.out.println("Tipo de combustível inválido.");
            entrada.close();
            return;
        }
        System.out.print("Digite a quantidade de litros abastecidos: ");
        double litrosAbastecidos = entrada.nextDouble();

        double precoPorlitro=0, desconto=0, valorbrut, valordesconto, valorfinal;

        if (tipoCombustivel == 'A') {
            precoPorlitro = 1.90;
            if(litrosAbastecidos <= 25){
                desconto = 0.035;
            }else{
                desconto = 0.053;
            }
        }else if (tipoCombustivel == 'G') {
            precoPorlitro = 2.50;
            if(litrosAbastecidos <= 35){
                desconto = 0.04;
            }else{
                desconto = 0.06;
            }    
            }
        valorbrut = litrosAbastecidos * precoPorlitro;
        valordesconto = valorbrut * desconto;
        valorfinal = valorbrut - valordesconto;

        System.out.printf("Valor final a pagar: R$ %.2f%n", valorfinal);
            entrada.close();

    }
}
