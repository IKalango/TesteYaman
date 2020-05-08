import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Teste {

    @Test
    public void testCarro() {
        Carro carro = new Carro("Vermelho", "Ferrari", 320.00);

        Assertions.assertEquals("Vermelho", carro.getCor());

        carro.ligaEDesliga();
        Assertions.assertEquals(true, carro.getLigado());

        carro.acelera(100.0);
        Assertions.assertEquals(100.0, carro.getVelocidadeAtual());

        Assertions.assertEquals(3, carro.pegaMarcha());
    }

    @Test

    public void testMoto(){
        Moto moto = new Moto ("Preto", 150, "Titan", "Honda", 160);

        Assertions.assertEquals("Preto", moto.getCor());
        Assertions.assertEquals(150, moto.getCilindradas());
        Assertions.assertEquals("Titan", moto.getModelo());
        Assertions.assertEquals("Honda", moto.getFabricante());
        Assertions.assertEquals(160, moto.getVelocidadeMaxima());

        moto.ligaEDesliga();
        Assertions.assertEquals(true, moto.isLigado());

        moto.acelerar(50);
        Assertions.assertEquals(50, moto.getVelocidadeAtual());

        moto.parar();
        Assertions.assertEquals(0, moto.getVelocidadeAtual());





    }
}
