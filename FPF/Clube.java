public class Clube extends Entidade {
    private String sedeSocial;
    private String presidente;
    private String vocacao;
    private int jogosDisputados;
    private int assistencias;
    private static double publicidadeAcumulada = 0;
    private static final double PRECO_BILHETE = 12.50;
    private static final double PUBLICIDADE_POR_JOGO = 120000.00;

    public Clube(String nome, String areaGeografica, String contacto, String nif,
                 String sedeSocial, String presidente, String vocacao,
                 int jogosDisputados, int assistencias) {
        super(nome, areaGeografica, contacto, nif);
        this.sedeSocial = sedeSocial;
        this.presidente = presidente;
        this.vocacao = vocacao;
        this.jogosDisputados = jogosDisputados;
        this.assistencias = assistencias;
    }

    public double calcularReceitas() {
        double bilheteira = assistencias * PRECO_BILHETE;
        double publicidade = jogosDisputados * PUBLICIDADE_POR_JOGO;
        publicidadeAcumulada += publicidade;
        return bilheteira + publicidade;
    }

    public static void limparPublicidade() {
        publicidadeAcumulada = 0;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Sede Social: " + sedeSocial);
        System.out.println("Presidente: " + presidente);
        System.out.println("Vocação: " + vocacao);
        System.out.println("Jogos Disputados: " + jogosDisputados);
        System.out.println("Receitas: " + calcularReceitas() + "€");
    }
}