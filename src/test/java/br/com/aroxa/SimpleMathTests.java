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
    
}
