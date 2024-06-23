import java.util.*;

public class Coleções1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> grupos = new HashMap<>();
        grupos.put("Masculino", new HashSet<>());
        grupos.put("Feminino", new HashSet<>());

        while (true) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            String grupo;
            while (true) {
                System.out.print("Digite o sexo (M/F): ");
                char sexo = scanner.next().charAt(0);
                scanner.nextLine();

                if (sexo == 'M' || sexo == 'm') {
                    grupo = "Masculino";
                } else if (sexo == 'F' || sexo == 'f') {
                    grupo = "Feminino";
                } else {
                    System.out.print("Sexo inválido! Tente novamente.");
                    continue;
                }

                break;
            }

            grupos.get(grupo).add(nome);

            System.out.println("Pessoa adicionada ao grupo " + grupo);
        }
    }
}