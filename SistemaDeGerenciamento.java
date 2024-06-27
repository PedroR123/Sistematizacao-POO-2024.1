import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SistemaDeGerenciamento {
    private Map<String, Empregado> empregados;

    public SistemaDeGerenciamento() {
        this.empregados = new HashMap<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.put(empregado.getId(), empregado);
    }

    public Empregado buscarEmpregado(String id) {
        return empregados.get(id);
    }

    public static void main(String[] args) {
        SistemaDeGerenciamento sistema = new SistemaDeGerenciamento();
        Scanner scanner = new Scanner(System.in);

        // Coletar dados do empregado
        System.out.println("Digite o ID do empregado:");
        String id = scanner.nextLine();
        
        System.out.println("Digite o nome do empregado:");
        String nome = scanner.nextLine();

        System.out.println("Digite o email do empregado:");
        String email = scanner.nextLine();

        System.out.println("Digite o telefone do empregado:");
        String telefone = scanner.nextLine();

        System.out.println("Digite as alergias do empregado (separadas por vírgula):");
        String alergiasInput = scanner.nextLine();
        List<String> alergias = new ArrayList<>();
        for (String alergia : alergiasInput.split(",")) {
            alergias.add(alergia.trim());
        }

        System.out.println("Digite os problemas médicos do empregado (separados por vírgula):");
        String problemasMedicosInput = scanner.nextLine();
        List<String> problemasMedicos = new ArrayList<>();
        for (String problema : problemasMedicosInput.split(",")) {
            problemasMedicos.add(problema.trim());
        }

        Empregado empregado = new Empregado(id, nome, email, telefone, alergias, problemasMedicos);
        sistema.adicionarEmpregado(empregado);

        // Buscar e exibir o cartão de identificação do empregado
        System.out.println("Digite o ID do empregado para buscar:");
        String buscaId = scanner.nextLine();
        Empregado encontrado = sistema.buscarEmpregado(buscaId);
        
        if (encontrado != null) {
            CartaoDeIdentificacao cartao = new CartaoDeIdentificacao(encontrado);
            cartao.exibirCartao();
        } else {
            System.out.println("Empregado não encontrado.");
        }

        scanner.close();
    }
}
