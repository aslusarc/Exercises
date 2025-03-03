package CodingBat.Warmup1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SleepInTest {
    @MethodSource
    private static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of(true, true, true),
                Arguments.of(true, false, false),
                Arguments.of(false, false, true),
                Arguments.of(false, true, true)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSource")
    public void test(boolean isWeekday, boolean isVacation, boolean expectedOutput) {
        SleepIn sleepIn = new SleepIn();
        assert sleepIn.execute(isWeekday, isVacation) == expectedOutput;
    }
}
