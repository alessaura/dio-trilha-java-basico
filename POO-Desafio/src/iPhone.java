// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();

    void pausar();

    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar();

    void atender();

    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);

    void adicionarNovaAba();

    void atualizarPagina();
}

// Classe iPhone implementando todas as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        // Implementação para tocar música
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        // Implementação para pausar música
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação para selecionar música
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar() {
        // Implementação para ligar o telefone
        System.out.println("Telefone ligado");
    }

    @Override
    public void atender() {
        // Implementação para atender uma chamada
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação para iniciar correio de voz
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação para exibir página na internet
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação para adicionar nova aba no navegador
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar página no navegador
        System.out.println("Página atualizada");
    }
}
