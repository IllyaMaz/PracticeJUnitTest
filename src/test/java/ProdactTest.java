import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProdactTest {

    private static final Product PRODUCT = new Product('A',10f);

    @Test
    void testVariableIsNotNull(){
        assertNotNull(PRODUCT.getName());
        assertNotNull(PRODUCT.getPrice());
        assertNotNull(PRODUCT.getColVo());
    }

    @Test
    void testMethodGetColVoReturnedNotNull(){
        assertNotNull(PRODUCT.getColVo());
    }

    @Test
    void testVariableColVoEqualsZero(){
        assertEquals(PRODUCT.getColVo(),0);
    }
}
