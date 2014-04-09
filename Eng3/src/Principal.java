import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        Aluno aluno1 = new Aluno();
        
        System.out.println("Nome:");
        aluno1.setNome(sc.next());
        
        System.out.println("Idade:");
        aluno1.setIdade(sc.nextInt());
        
        System.out.println("Semestre:");
        aluno1.setSemestre(sc.nextInt());
        
        System.out.println("Valor estágio:");
        aluno1.setValorEstagio(sc.nextDouble());
        
        Aluno aluno2 = new Aluno();
        
        System.out.println("Nome:");
        aluno2.setNome(sc.next());
        
        System.out.println("Idade:");
        aluno2.setIdade(sc.nextInt());
        
        System.out.println("Semestre:");
        aluno2.setSemestre(sc.nextInt());
        
        System.out.println("Valor estágio:");
        aluno2.setValorEstagio(sc.nextDouble());
        
        Aluno aluno3 = new Aluno();
        
        System.out.println("Nome:");
        aluno3.setNome(sc.next());
        
        System.out.println("Idade:");
        aluno3.setIdade(sc.nextInt());
        
        System.out.println("Semestre:");
        aluno3.setSemestre(sc.nextInt());
        
        System.out.println("Valor estágio:");
        aluno3.setValorEstagio(sc.nextDouble());
        
        Aluno aluno4 = new Aluno();
        
        System.out.println("Nome:");
        aluno4.setNome(sc.next());
        
        System.out.println("Idade:");
        aluno4.setIdade(sc.nextInt());
        
        System.out.println("Semestre:");
        aluno4.setSemestre(sc.nextInt());
        
        System.out.println("Valor estágio:");
        aluno4.setValorEstagio(sc.nextDouble());
        
        System.out.println(aluno1.getNome()+" recebe, anualmente, "+aluno1.calculaSalAnual());
        System.out.println(aluno2.getNome()+" recebe, anualmente, "+aluno2.calculaSalAnual());
        System.out.println(aluno3.getNome()+" recebe, anualmente, "+aluno3.calculaSalAnual());
        System.out.println(aluno4.getNome()+" recebe, anualmente, "+aluno4.calculaSalAnual());
        
        aluno1.aumentaSalario();
        aluno2.aumentaSalario();
        aluno3.aumentaSalario();
        aluno4.aumentaSalario();
        
        System.out.println(aluno1.getNome()+" recebe, semestralmente, "+aluno1.calculaSalSemestral());
        System.out.println(aluno2.getNome()+" recebe, semestralmente, "+aluno2.calculaSalSemestral());
        System.out.println(aluno3.getNome()+" recebe, semestralmente, "+aluno3.calculaSalSemestral());
        System.out.println(aluno4.getNome()+" recebe, semestralmente, "+aluno4.calculaSalSemestral());
    }    
}
