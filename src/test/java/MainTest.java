import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {

    @Test
    //what actually we test here? the keyword new? we have to test our business logic only
    void testObjectMagazineNotNull(){
        Magezin magezin = new Magezin();

        assertNotNull(magezin);
    }


}
