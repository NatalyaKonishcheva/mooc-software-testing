package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "{0}: message = {1}, shift = {2}, expectedResult = {3}")
    @CsvSource({
            //Shift more than 26, different messages
            "'shift > 26 border letters', 'xyz abc', 135, 'cde fgh'",
            "'shift > 26 invalid symbols(figure)', 'toy 3', 100, 'invalid'",
            "'shift > 26 high case letters', 'Toy', 100, 'invalid'",

            //Shift from 0 to 26, different messages
            "'0 < shift < 26 border letters', 'xyz abc', 3, 'abc def'",
            "'0 < shift < 26 invalid symbols(figure)', 'toy 3', 20, 'invalid'",
            "'0 < shift < 26 high case letters', 'Toy', 21, 'invalid'",

            //Shift less than 0, different messages
            "'shift < 0 border letters', 'xyz abc', -7, 'qrs tuv'",
            "'shift < 0 invalid symbols(figure)', 'toy 3', -10, 'invalid'",
            "'shift < 0 high case letters', 'Toy', -21, 'invalid'"
    })
    public void testAlgorithm(String partition, String message, int shift, String expectedResult){
        String result = new CaesarShiftCipher().CaesarShiftCipher(message, shift);

        Assertions.assertEquals(expectedResult, result);
    }
}
