public class Main {
    public static void main(String[] args) {

        // Criar um Árbitro
        Arbitro arbitro = new Arbitro(
            "João Silva", "Norte", "912345678", "123456789",
            "Porto", "Nacional", "Professor", 4, 2000.00
        );

        // Criar um Clube
        Clube clube = new Clube(
            "Sport Lisboa e Benfica", "Sul", "213400000", "500281282",
            "Lisboa", "Rui Costa", "Geral", 4, 50000
        );

        // Criar um Jogador
        Jogador jogador = new Jogador(
            "Cristiano Ronaldo", "Norte", "911111111", "999999999",
            "Portugal", "Al Nassr", "Avançado",
            1.87, 83.0, 4, 5000.00, 3
        );

        // Imprimir dados
        System.out.println("=== ÁRBITRO ===");
        arbitro.imprimirDados();

        System.out.println("\n=== CLUBE ===");
        clube.imprimirDados();

        System.out.println("\n=== JOGADOR ===");
        jogador.imprimirDados();

        // Limpar valores acumulados
        System.out.println("\n=== LIMPAR VALORES ACUMULADOS ===");
        Arbitro.limparAjudaCusto();
        Clube.limparPublicidade();
        Jogador.limparDireitosImagem();
        System.out.println("Valores limpos com sucesso!");
    }
}