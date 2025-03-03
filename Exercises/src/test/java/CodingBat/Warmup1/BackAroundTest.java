package CodingBat.Warmup1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BackAroundTest {
    @MethodSource
    private static Stream<Arguments> methodSource() {
        return Stream.of(
            Arguments.of("", ""),
                Arguments.of("Banana", "aBananaa"),
                Arguments.of("aaa", "aaaaa"),
                Arguments.of("cat", "tcatt"),
                Arguments.of("a", "aaa")
        );
    }

    @ParameterizedTest
    @MethodSource("methodSource")
    public void test(String input, String expectedOutput) {
        BackAround backAround = new BackAround();
        assert backAround.execute(input).equals(expectedOutput);
    }
}
