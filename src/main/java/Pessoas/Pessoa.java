package Pessoas;

/**
 *
 * @author Jefferson
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private char sexo;
    private Endereco endResidencial;
    private Endereco endComercial;
    
    public Pessoa(String nome, String cpf, char sexo, Endereco endResidencial, Endereco endComercial){
        this.nome=nome;
        this.cpf=cpf;
        this.sexo=sexo;
        this.endResidencial=endResidencial;
        this.endComercial=endComercial;
    }
        
    public Pessoa(String nome, String cpf, char sexo, Endereco endResidencial){
        this.nome=nome;
        this.cpf=cpf;
        this.sexo=sexo;
        this.endResidencial=endResidencial;
        this.endComercial=endResidencial;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndResidencial() {
        return endResidencial;
    }

    public void setEndResidencial(Endereco endResidencial) {
        this.endResidencial = endResidencial;
    }

    public Endereco getEndComercial() {
        return endComercial;
    }

    public void setEndComercial(Endereco endComercial) {
        this.endComercial = endComercial;
    }
    
    public String apresentar(){
        String retorno ="";
        retorno=retorno+
                "Nome: "+getNome()+
                ", CPF: "+getCpf()+
                ", Sexo: "+getSexo()+
                ", End. Res.: "+getEndResidencial().apresentar();
        
        return retorno;
    }
    
}
