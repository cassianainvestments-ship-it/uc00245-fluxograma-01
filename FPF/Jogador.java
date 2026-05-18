public class Jogador extends Entidade {
    private String paisOrigem;
    private String clube;
    private String posicao;
    private double altura;
    private double peso;
    private int jogosParticipados;
    private double salarioBase;
    private int vitorias;
    private static double direitosImagemAcumulados = 0;
    private static final double PREMIO_VITORIA = 650.00;
    private static final double PERC_DIREITOS_IMAGEM = 0.115;

    public Jogador(String nome, String areaGeografica, String contacto, String nif,
                   String paisOrigem, String clube, String posicao,
                   double altura, double peso, int jogosParticipados,
                   double salarioBase, int vitorias) {
        super(nome, areaGeografica, contacto, nif);
        this.paisOrigem = paisOrigem;
        this.clube = clube;
        this.posicao = posicao;
        this.altura = altura;
        this.peso = peso;
        this.jogosParticipados = jogosParticipados;
        this.salarioBase = salarioBase;
        this.vitorias = vitorias;
    }

    public double calcularReceitas() {
        double premios = vitorias * PREMIO_VITORIA;
        double direitosImagem = salarioBase * PERC_DIREITOS_IMAGEM;
        direitosImagemAcumulados += direitosImagem;
        return salarioBase + premios + direitosImagem;
    }

    public static void limparDireitosImagem() {
        direitosImagemAcumulados = 0;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("País de Origem: " + paisOrigem);
        System.out.println("Clube: " + clube);
        System.out.println("Posição: " + posicao);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Jogos Participados: " + jogosParticipados);
        System.out.println("Receitas: " + calcularReceitas() + "€");
    }
}