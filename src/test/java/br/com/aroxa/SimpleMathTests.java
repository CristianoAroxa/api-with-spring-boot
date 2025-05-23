package br.com.aroxa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe SimpleMath")
class SimpleMathTests {

    @Test
    @DisplayName("Teste de Soma - 8D + 2D = 10D")
    void testSum_EightAddTwoEqualTen() {

        //GIVEN
        SimpleMath math = new SimpleMath();
        //WHEN
        double actual = math.sum(8D,2D);
        double expectd = 10D;
        //THEN
        assertEquals(expectd, actual);
    }

    @Test
    @DisplayName("Teste de Subtração - 8D - 2D = 6D")
    void testSub_EightSubTwoEqualSix() {

        //GIVEN
        SimpleMath math = new SimpleMath();
        //WHEN
        double actual = math.sub(8D,2D);
        double expectd = 6D;
        //THEN
        assertEquals(expectd, actual);
    }

    @Test
    @DisplayName("Teste de Multiplicação - 5D * 2D = 10D")
    void testMult_FiveXTwoEqualTen() {

        //GIVEN
        SimpleMath math = new SimpleMath();
        //WHEN
        double actual = math.mult(5D,2D);
        double expectd = 10D;
        //THEN
        assertEquals(expectd, actual);
    }

    @Test
    @DisplayName("Teste de Divisão - 8D / 2D = 4D")
    void testDiv_EightDivTwoEqualFour() {

        //GIVEN
        SimpleMath math = new SimpleMath();
        //WHEN
        double actual = math.div(8D,2D);
        double expectd = 4D;
        //THEN
        assertEquals(expectd, actual);
    }
    
}
