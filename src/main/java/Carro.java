
import java.util.Date;

public class Carro {

    private int codigoCarro;
    private String nome;
    private String modelo;
    private Date dataFabricacao;
    private String marca;
    private boolean possuiArCondicionado;
    private String modeloRoda;
    private String tipoCombustivel;
    private boolean airBag;
    private String cor;
    private int numeroPortas;


    public Carro()
    {
        this.codigoCarro = 0;
        this.nome = "";
    }

    public int getCodigoCarro() {
        return codigoCarro;
    }

    public Carro setCodigoCarro(int codigoCarro) {
        this.codigoCarro = codigoCarro;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Carro setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Carro setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public Carro setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Carro setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public boolean isPossuiArCondicionado() {
        return possuiArCondicionado;
    }

    public Carro setPossuiArCondicionado(boolean possuiArCondicionado) {
        this.possuiArCondicionado = possuiArCondicionado;
        return this;
    }

    public String getModeloRoda() {
        return modeloRoda;
    }

    public Carro setModeloRoda(String modeloRoda) {
        this.modeloRoda = modeloRoda;
        return this;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public Carro setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        return this;
    }

    public boolean isAirBag() {
        return airBag;
    }

    public Carro setAirBag(boolean airBag) {
        this.airBag = airBag;
        return this;
    }

    public String getCor() {
        return cor;
    }

    public Carro setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public Carro setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
        return this;
    }
}
