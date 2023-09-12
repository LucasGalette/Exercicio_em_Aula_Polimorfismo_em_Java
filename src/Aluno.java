public class Aluno extends Pessoa{
    private float nota;

    public Aluno(String nome, int matricula, float nota) {
        super(nome, matricula);
        this.nota = nota;
    }

    @Override
    public void quemSouEu(){
        System.out.println("Eu sou um aluno");
    }

}
