package banco.com.banco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.ArrayList;

@Entity
public class Usuario {

    @Id
    private String cpf;
    private String nome;
    private String telefoneCelular;
    @OneToOne
    private ContaDigital contaDigital;
    private ArrayList<Usuario> favorecidos;

    public Usuario(){}

    public Usuario(String nome, String cpf, String telefoneCelular) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefoneCelular = telefoneCelular;
    }

    public Usuario(String nome, String cpf, String telefoneCelular, ContaDigital contaDigital) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefoneCelular = telefoneCelular;
        this.contaDigital = contaDigital;
    }

    public Usuario(String nome, String cpf, String telefoneCelular, ContaDigital contaDigital, ArrayList<Usuario> favorecidos) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefoneCelular = telefoneCelular;
        this.contaDigital = contaDigital;
        this.favorecidos = favorecidos;
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

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public ContaDigital getContaDigital() {
        return contaDigital;
    }

    public void setContaDigital(ContaDigital contaDigital) {
        this.contaDigital = contaDigital;
    }

    public ArrayList<Usuario> getFavorecidos() {
        return favorecidos;
    }

    public void setFavorecidos(ArrayList<Usuario> favorecidos) {
        this.favorecidos = favorecidos;
    }
}
