package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CaesarShiftCipherTest {

    @Test
    public void test1(){
        CaesarShiftCipher text = new CaesarShiftCipher();
        String result = text.CaesarShiftCipher("abcde", 2);
        Assertions.assertEquals("cdefg", result);

    }


}
