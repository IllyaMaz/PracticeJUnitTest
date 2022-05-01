import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {

    @Test
    void testObjectMagazineNotNull(){
        Magezin magezin = new Magezin();

        assertNotNull(magezin);
    }


}
