public class Arbitro extends Entidade {
    private String localResidencia;
    private String classificacao;
    private String profissao;
    private int jogosApitados;
    private double salarioBase;
    private static double ajudaCustoAcumulada = 0;
    private static final double AJUDA_CUSTO_POR_JOGO = 240.57;

    public Arbitro(String nome, String areaGeografica, String contacto, String nif,
                   String localResidencia, String classificacao, String profissao,
                   int jogosApitados, double salarioBase) {
        super(nome, areaGeografica, contacto, nif);
        this.localResidencia = localResidencia;
        this.classificacao = classificacao;
        this.profissao = profissao;
        this.jogosApitados = jogosApitados;
        this.salarioBase = salarioBase;
    }

    public double calcularReceitas() {
        double ajuda = jogosApitados * AJUDA_CUSTO_POR_JOGO;
        ajudaCustoAcumulada += ajuda;
        return salarioBase + ajuda;
    }

    public static void limparAjudaCusto() {
        ajudaCustoAcumulada = 0;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Local de Residência: " + localResidencia);
        System.out.println("Classificação: " + classificacao);
        System.out.println("Profissão: " + profissao);
        System.out.println("Jogos Apitados: " + jogosApitados);
        System.out.println("Receitas: " + calcularReceitas() + "€");
    }
}