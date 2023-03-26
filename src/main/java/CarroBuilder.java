
import java.util.Date;
public class CarroBuilder {

    private Carro carro;

    public CarroBuilder()
    {
        carro = new Carro();
    }


    public Carro build() {
        if (carro.getCodigoCarro() == 0) {
            throw new IllegalArgumentException("Codigo Invalido");
        }
        if (carro.getNome().equals("")) {
            throw new IllegalArgumentException("Nome Invalido");
        }
        return carro;
    }

    public CarroBuilder setCodigo(int codigoCarro)
    {
        carro.setCodigoCarro(codigoCarro);
        return this;
    }

    public CarroBuilder setNome(String nome)
    {
        carro.setNome(nome);
        return this;
    }

    public CarroBuilder setModelo(String modelo)
    {
        carro.setModelo(modelo);
        return this;
    }

    public CarroBuilder setDataFabricacao(Date dataFabricacao)
    {
        carro.setDataFabricacao(dataFabricacao);
        return this;
    }

    public CarroBuilder setMarca(String marca)
    {
        carro.setMarca(marca);
        return this;
    }

    public CarroBuilder setPossuiArcondicionado(boolean arcondicionado)
    {
        carro.setPossuiArCondicionado(arcondicionado);
        return this;
    }

    public CarroBuilder setModeloRoda(String modeloRoda)
    {
        carro.setModeloRoda(modeloRoda);
        return this;
    }

    public CarroBuilder setTipoCombustivel(String tipoCombustivel)
    {
        carro.setTipoCombustivel(tipoCombustivel);
        return this;
    }

    public CarroBuilder setAirbag(boolean airbag)
    {
        carro.setAirBag(airbag);
        return this;
    }

    public CarroBuilder setCor(String cor) {
        carro.setCor(cor);
        return this;
    }

    public CarroBuilder setNumeroPortas(int numeroPortas)
    {
        carro.setNumeroPortas(numeroPortas);
        return this;
    }
}
