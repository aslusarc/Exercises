package Warmup1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Diff21Test {
    @MethodSource
    private static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of(0, 21),
                Arguments.of(22, 2),
                Arguments.of(1, 20),
                Arguments.of(10, 11),
                Arguments.of(21, 0),
                Arguments.of(-1, 22),
                Arguments.of(25, 8)
                );
    }

    @ParameterizedTest
    @MethodSource("methodSource")
    public void test(int n, int expectedValue) {
        Diff21 diff21 = new Diff21();
        assert diff21.execute(n) == expectedValue;
    }
}
