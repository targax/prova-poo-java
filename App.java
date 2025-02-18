import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        proprietario p[] = new proprietario [4];
        int valorMin, valorMax;

        p[0] = new proprietario(111,"Bruno", 998545242);
        p[1] = new proprietario(222,"Victor", 996872595);
        p[2] = new proprietario(333,"Luana", 997137582);
        p[3] = new proprietario(444,"Eduardo", 996242896);

        imovel i[] = new imovel [4];

        i[0] = new imovel("Rua 1", 1000, 60000, p[0],true);
        i[1] = new imovel("Rua 2", 2000, 70000, p[1],true);
        i[2] = new imovel("Rua 3", 3000, 80000, p[2],false);
        i[3] = new imovel("Rua 4", 4000, 90000, p[3],false);

        System.out.println("Digite um valor mínimo que deseja pagar para o metro quadrado do terreno:");
        valorMin = entrada.nextInt();
        System.out.println("Digite um valor máximo que deseja pagar para o metro quadrado do terreno:");
        valorMax = entrada.nextInt();

        for (int j = 0; j < 4; j++) {
            double valorMetro = i[j].calculaMetro(i[j].getValor(), i[j].getMetragem()); // Armazena o resultado uma vez
            System.out.println("Imóvel " + (j + 1) + " - Valor por metro quadrado: " + valorMetro); // Debug
        
            if (valorMetro >= valorMin && valorMetro <= valorMax) { // Agora a comparação é correta
                System.out.println("---Informações---");
                System.out.println(p[j].getNome());
                System.out.println(p[j].getTelefone());
                System.out.println(p[j].getCpf());
                System.out.println(i[j].getEndereco());
                System.out.println();
            }
        }
    entrada.close();
    }
}
