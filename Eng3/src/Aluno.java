public class Aluno {
    
    String nome;
    int idade;
    int semestre;
    double valorEstagio;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 16){
            idade = 16;
        }
        this.idade = idade;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getValorEstagio() {
        return valorEstagio;
    }

    public void setValorEstagio(double valorEstagio) {
        if(valorEstagio < 600){
            valorEstagio = 600;
        }
        this.valorEstagio = valorEstagio;
    }
    
    public double calculaSalAnual(){
        double resultado = 0;        
        resultado = valorEstagio*12;        
        return resultado;
    }
    
    public double calculaSalSemestral(){
        double resultado = 0;        
        resultado = valorEstagio*6;        
        return resultado;
    }
    
    public void aumentaSalario(){
        this.valorEstagio+=(this.valorEstagio*23.4)/100;
    }
}
