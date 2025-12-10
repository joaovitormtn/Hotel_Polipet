import entitys.Animal;
import entitys.Domesticavel;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);
        boolean key = true;

        do{
            System.out.println("""
              
                Escolha uma das opções abaixo!!
                1. Listar Animais;
                2. Somar diárias;
                3. Exibir Animais Domesticáveis;
                4. Sair;
                """);
            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(hotel.listar());
                    break;
                case 2:
                    System.out.printf("\nO custo diário dos animais é R$%.2f\n",hotel.somar());
                    break;
                case 3:
                    StringBuilder sb = new StringBuilder();
                    for(Domesticavel a: hotel.filtrar()){
                        sb.append("-----------------------\n")
                                .append(a.toString())
                                .append("Iteração: " + a.interagir())
                                .append("\n\n");
                    }
                    System.out.printf("""
                            
                            Os animais domesticáveis são!!!
                            -------------------------------
                            %s
                            """, sb.toString());
                    break;
                case 4:
                    key = false;
                    break;
            }
        }while (key);
    }
}