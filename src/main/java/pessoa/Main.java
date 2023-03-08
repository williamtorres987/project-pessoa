package pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Guilherme", 29,5,1999);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getDataNascimento());
        System.out.println(pessoa.calculaIdade());
    }
}
