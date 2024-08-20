public class Main {
    public static void main(String[] args) {

        //inf Claudio
        String nome = "Claudio";
        int idade = 22;
        double altura = 1.70;
        boolean estudante = true;

        //inf Claudia
        String nome2 = "Claudia";
        int idade2 = 25;
        double altura2 = 1.65;
        boolean estudante2 = true;

        //operações
        int somaIdade = idade + idade2;
        double alturaMult = altura * 2;

        System.out.println("Olá, " + nome + "!");
        System.out.println("Você tem " + idade + " anos.");
        System.out.println("Você tem " + altura + " m de altura.");
        System.out.println("Você estuda então é " + estudante + "!");
        System.out.println("A soma da idade de " + nome + " e " + nome2 + " é " + somaIdade + ".");
        System.out.println("Se multiplicarmos sua altura ficaria, " + alturaMult + " metros, grande né?");


    }
}