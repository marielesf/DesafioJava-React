package banco.com.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ContaDigital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identificador;
    private double saldo;
    private double limite;

    public ContaDigital(){}

    public ContaDigital(int identificador) {
        this.identificador = identificador;
        this.saldo = 1000.00;
        this.limite = 500.00;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
