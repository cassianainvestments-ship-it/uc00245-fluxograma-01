using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("\n📘 EXERCÍCIOS GERAIS DE REVISÃO");
        Console.WriteLine("====================\n");

        // Exercício 1
        Console.WriteLine("📝 Exercício 1");
        int numero = -5;
        if (numero > 0)
            Console.WriteLine("Número positivo");
        else
            Console.WriteLine("Número negativo ou zero");

        // Exercício 2
        Console.WriteLine("📝 Exercício 2");
        int a = 10, b = 7;
        if (a > b)
            Console.WriteLine($"{a} é maior que {b}");
        else
            Console.WriteLine($"{b} é maior que {a}");

        // Exercício 3
        Console.WriteLine("📝 Exercício 3");
        double compra = 120;
        double desconto = compra > 100 ? compra * 0.10 : 0;
        Console.WriteLine($"Desconto: {desconto}");

        // Exercício 4
        Console.WriteLine("📝 Exercício 4");
        int idade = 15;
        if (idade < 12)
            Console.WriteLine("Criança");
        else if (idade < 18)
            Console.WriteLine("Adolescente");
        else
            Console.WriteLine("Adulto");

        // Exercício 5
        Console.WriteLine("📝 Exercício 5");
        int opcao = 2;
        switch (opcao)
        {
            case 1: Console.WriteLine("Novo jogo"); break;
            case 2: Console.WriteLine("Carregar jogo"); break;
            case 3: Console.WriteLine("Sair"); break;
            default: Console.WriteLine("Opção inválida"); break;
        }

        // Exercício 6
        Console.WriteLine("📝 Exercício 6");
        int idadeAcesso = 20;
        bool temConvite = true;
        bool podeEntrar = idadeAcesso >= 18 && temConvite;
        Console.WriteLine($"pode entrar? {podeEntrar}");
    }
}