import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroBuilderTest {

    @Test
    void deveRetornarExcecaoParaCarroSemCodigo()
    {
        try
        {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setNome("Corolla")
                    .setCor("Bege")
                    .build();
            fail();
        }
        catch(IllegalArgumentException e)
        {
            assertEquals("Codigo Invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCarroSemNome()
    {
        try
        {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setCodigo(1)
                    .setCor("Bege")
                    .setMarca("Toyotta")
                    .build();
            fail();
        }
        catch(IllegalArgumentException e)
        {
            assertEquals("Nome Invalido", e.getMessage());
        }
    }


    @Test
    void deveRetornarCarroValido()
    {
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setCodigo(22)
                .setNome("Ka")
                .setMarca("Ford")
                .setCor("Preto")
                .build();

        assertNotNull(carro);
    }

}
