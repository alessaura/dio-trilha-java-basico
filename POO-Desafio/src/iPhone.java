// Interface ReprodutorMusical
interface ReprodutorMusical {
    void tocar();

    void pausar();

    void selecionarMusica(String musica);
}

// Interface AparelhoTelefonico
interface AparelhoTelefonico {
    void ligar();

    void atender();

    void iniciarCorrerioVoz();
}

// Interface NavegadorInternet
interface NavegadorInternet {
    void exibirPagina(String url);

    void adicionarNovaAba();

    void atualizarPagina();
}

// Classe iPhone implementando as interfaces ReprodutorMusical,
// AparelhoTelefonico e NavegadorInternet
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String cor;

    // Construtor
    public iPhone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método principal para teste
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone("iPhone 1st Gen", "Preto");

        // Testando os métodos do iPhone
        meuiPhone.ligar();
        meuiPhone.atender();
        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.exibirPagina("www.exemplo.com");
    }
};
