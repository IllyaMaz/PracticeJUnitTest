import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagazine {

    Magezin magezin = new Magezin();

    @ParameterizedTest(name = "#{index} = {0} {1} ")
    @MethodSource("sumProvider")
    void magezinTest(String a, float b){
        float input = magezin.getTotalPrice(a);
        assertEquals(b,input);
    }

    private static Stream<Arguments> sumProvider() {
        return Stream.of(
                Arguments.of("ABCDABA",13.25f),
                Arguments.of("CCCCCCCCCCCC",10f),
                Arguments.of("AAAAAA",6),
                Arguments.of("BBBBBB",25.5f),
                Arguments.of("DDDDDD",4.5f)
        );
    }


}
