public class TesteAula3 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lucas", 12345);
        Aluno aluno = new Aluno("Lucas", 12345, 100);
        Funcionario funcionario = new Funcionario("Lucas", 12345, "TI");
        Professor professor = new Professor("Lucas", 12345, "Matemática");

        //pessoa.falarNome();
        //aluno.falarNome();
        //funcionario.falarNome();
        //professor.falarNome();

        pessoa.quemSouEu();
        aluno.quemSouEu();
        funcionario.quemSouEu();
        professor.quemSouEu();
    }
}
