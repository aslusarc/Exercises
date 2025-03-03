package Warmup1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MissingCharTest {
    @MethodSource
    private static Stream<Arguments> getTestArgs() {
        return Stream.of(
                Arguments.of("", 0, ""),
                Arguments.of("Banana", 0, "anana"),
                Arguments.of("Apple", 1, "Aple"),
                Arguments.of("Talar", 10, "Talar"),
                Arguments.of("Talar", 4, "Tala"),
                Arguments.of("Talar", -1, "Talar")
        );
    }

    @ParameterizedTest
    @MethodSource("getTestArgs")
    public void test(String input, int indexToBeDeleted, String expectedOutput) {
        MissingChar missingChar = new MissingChar();
        assert missingChar.execute(input, indexToBeDeleted).equals(expectedOutput);
    }
}
