import java.util.List;

public class Empregado {
    private String id;
    private String nome;
    private String email;
    private String telefone;
    private List<String> alergias;
    private List<String> problemasMedicos;

    public Empregado(String id, String nome, String email, String telefone, List<String> alergias, List<String> problemasMedicos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public List<String> getProblemasMedicos() {
        return problemasMedicos;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone + 
               "\nAlergias: " + String.join(", ", alergias) + "\nProblemas Médicos: " + String.join(", ", problemasMedicos);
    }
}

