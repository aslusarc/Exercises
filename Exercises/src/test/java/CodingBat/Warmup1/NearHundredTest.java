package CodingBat.Warmup1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class NearHundredTest {
    @MethodSource
    private static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of(10, false),
                Arguments.of(80, false),
                Arguments.of(90, true),
                Arguments.of(101, true),
                Arguments.of(150, false),
                Arguments.of(180, false),
                Arguments.of(191, true),
                Arguments.of(200, true),
                Arguments.of(205, true),
                Arguments.of(215, false),
                Arguments.of(305, false)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSource")
    public void test(int n, boolean expectedOutput) {
        NearHundred nearHundred = new NearHundred();
        assert nearHundred.execute(n) == expectedOutput;
    }
}
