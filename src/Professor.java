public class Professor extends Pessoa{
    private String livro;

    public Professor(String nome, int matricula, String livro) {
        super(nome, matricula);
        this.livro = livro;
    }

    @Override
    public void quemSouEu(){
        System.out.println("Eu sou um professor");
    }

}
