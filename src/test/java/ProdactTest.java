import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProdactTest {

    private static final Product PRODUCT = new Product('A',10f);

    @Test
    //We have to test only methods contain our logic. Getter doesn't contain any logic
    void testVariableIsNotNull(){
        assertNotNull(PRODUCT.getName());
        assertNotNull(PRODUCT.getPrice());
        assertNotNull(PRODUCT.getColVo());
    }

    @Test
    //actually you already test it
    void testMethodGetColVoReturnedNotNull(){
        assertNotNull(PRODUCT.getColVo());
    }

    @Test
    //the same here, getter doesn't contain any logic
    void testVariableColVoEqualsZero(){
        assertEquals(PRODUCT.getColVo(),0);
    }
}
