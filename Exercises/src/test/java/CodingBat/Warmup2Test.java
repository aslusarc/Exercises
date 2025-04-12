package CodingBat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Warmup2Test {
    @MethodSource
    private static Stream<Arguments> stringTimesSource() {
        return Stream.of(
                arguments("", 4, ""),
                arguments("A", 1, "A"),
                arguments("A", 10, "AAAAAAAAAA")
        );
    }

    @ParameterizedTest
    @MethodSource("stringTimesSource")
    public void stringTimesTest(String input, int n, String expectedOutput) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.stringTimes(input, n).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> doubleXSource() {
        return Stream.of(
                arguments("", false),
                arguments("xaxxa", false),
                arguments("axxaaax", true),
                arguments("xxxxxxx", true)
        );
    }

    @ParameterizedTest
    @MethodSource("doubleXSource")
    public void doubleXTest(String input, boolean expectedOutput) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.doubleX(input) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> last2Source() {
        return Stream.of(
                arguments("", 0),
                arguments("h", 0),
                arguments("AAAAAA", 4),
                arguments("xxxx", 2),
                arguments("axxaaax", 1),
                arguments("hihihihi", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("last2Source")
    public void last2Test(String input, int expectedOutput) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.last2(input) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> array123Source() {
        return Stream.of(
                arguments(new int[]{}, false),
                arguments(new int[]{1}, false),
                arguments(new int[]{1, 2}, false),
                arguments(new int[]{1, 2, 3}, true),
                arguments(new int[]{1, 2, 4, 3}, false),
                arguments(new int[]{1, 2, 4, 5, 6}, false),
                arguments(new int[]{1, 2, 3, 4, 5, 6}, true),
                arguments(new int[]{4, 5, 6, 1, 2, 3}, true),
                arguments(new int[]{6, 5, 4, 3, 2, 1}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("array123Source")
    public void array123Test(int[] array, boolean expectedOutput) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.array123(array) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> altPairsSource() {
        return Stream.of(
                arguments("kitten", "kien"),
                arguments("Chocolate", "Chole"),
                arguments("CodingHorror", "Congrr"),
                arguments("yak", "ya"),
                arguments("y", "y"),
                arguments("", ""),
                arguments("ThisThatTheOther", "ThThThth")
        );
    }

    @ParameterizedTest
    @MethodSource("altPairsSource")
    public void altPairsTest(String str, String expectedOutput) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.altPairs(str).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> noTriplesSource() {
        return Stream.of(
                arguments(new int[]{}, true),
                arguments(new int[]{1}, true),
                arguments(new int[]{1, 2}, true),
                arguments(new int[]{1, 2, 3}, true),
                arguments(new int[]{1, 2, 4, 3}, true),
                arguments(new int[]{1, 1, 1, 6}, false),
                arguments(new int[]{1, 2, 3, 6, 6, 6}, false),
                arguments(new int[]{4, 5, 6, 2, 2, 2}, false),
                arguments(new int[]{6, 5, 3, 3, 3, 1}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("noTriplesSource")
    public void noTriplesTest(int[] array, boolean expectedOutput) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.noTriples(array) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> frontTimesSource() {
        return Stream.of(
                arguments("", 10, ""),
                arguments("Talar", -1, ""),
                arguments("Talar", 5, "TalTalTalTalTal"),
                arguments("Ta", 2, "TaTa"),
                arguments("T", 2, "TT")
        );
    }

    @ParameterizedTest
    @MethodSource("frontTimesSource")
    public void frontTimesTest(String str, int n, String expectedOutput) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.frontTimes(str, n).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> stringBitsSource() {
        return Stream.of(
                arguments("", ""),
                arguments("Talar", "Tlr"),
                arguments("Bee", "Be"),
                arguments("Ta", "T")
        );
    }

    @ParameterizedTest
    @MethodSource("stringBitsSource")
    public void stringBitsTest(String str, String expectedOutput) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.stringBits(str).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> arrayCount9Source() {
        return Stream.of(
                arguments(new int[]{}, 0),
                arguments(new int[]{1}, 0),
                arguments(new int[]{1, 2}, 0),
                arguments(new int[]{1, 2, 3}, 0),
                arguments(new int[]{1, 2, 4, 9}, 1),
                arguments(new int[]{9, 1, 1, 6}, 1),
                arguments(new int[]{1, 9, 3, 6, 9, 9, 3}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("arrayCount9Source")
    public void arrayCount9Test(int[] array, int expectedOutput) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.arrayCount9(array) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> stringMatchSource() {
        return Stream.of(
                arguments("xxcaazz", "xxbaaz", 3),
                arguments("abc", "abc", 2),
                arguments("abc", "axc", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("stringMatchSource")
    public void stringMatchTest(String a, String b, int expectedValue) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.stringMatch(a, b) == expectedValue;
    }

    @MethodSource
    private static Stream<Arguments> stringYakSource() {
        return Stream.of(
                arguments("yakPak", "Pak"),
                arguments("yikPak", "Pak"),
                arguments("yikyak", ""),
                arguments("yak123", "123"),
                arguments("RedyakPak", "RedPak"),
                arguments("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("stringYakSource")
    public void stringYakTest(String a, String expectedValue) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.stringYak(a).equals(expectedValue);
    }

    @MethodSource
    private static Stream<Arguments> has271Source() {
        return Stream.of(
                arguments(new int[]{1, 2, 7, 1}, true),
                arguments(new int[]{1, 2, 8, 1}, false),
                arguments(new int[]{2, 7, 1}, true),
                arguments(new int[]{3, 8, 2}, true),
                arguments(new int[]{2, 7, 3}, true),
                arguments(new int[]{2, 7, 4}, false),
                arguments(new int[]{2, 7, -1}, true),
                arguments(new int[]{2, 7, -2}, false),
                arguments(new int[]{4, 5, 3, 8, 0}, true),
                arguments(new int[]{2, 7, 5, 10, 4}, true),
                arguments(new int[]{2, 7, -2, 4, 9, 3}, true),
                arguments(new int[]{2, 7, 5, 10, 1}, false),
                arguments(new int[]{2, 7, -2, 4, 10, 2}, false),
                arguments(new int[]{1, 1, 4, 9, 0}, false),
                arguments(new int[]{1, 1, 4, 9, 4, 9, 2}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("has271Source")
    public void has271Test(int[] nums, boolean expectedValue) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.has271(nums) == expectedValue;
    }

    @MethodSource
    private static Stream<Arguments> countXXSource() {
        return Stream.of(
                arguments("", 0),
                arguments("x", 0),
                arguments("xx", 1),
                arguments("xxx", 2),
                arguments("xxxx", 3),
                arguments("axxaxxa", 2),
                arguments("axaxaxaxaxa", 0),
                arguments("axxxxaxxa", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("countXXSource")
    public void countXXTest(String str, int expectedValue) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.countXX(str) == expectedValue;
    }

    @MethodSource
    private static Stream<Arguments> stringSplosionSource() {
        return Stream.of(
                arguments("", ""),
                arguments("s", "s"),
                arguments("Code", "CCoCodCode"),
                arguments("abc", "aababc"),
                arguments("ab", "aab")
        );
    }

    @ParameterizedTest
    @MethodSource("stringSplosionSource")
    public void stringSplosionTest(String str, String expectedValue) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.stringSplosion(str).equals(expectedValue);
    }

    @MethodSource
    private static Stream<Arguments> arrayFront9Source() {
        return Stream.of(
                arguments(new int[] {1, 2, 9, 3, 4}, true),
                arguments(new int[] {1, 2, 3, 4, 9}, false),
                arguments(new int[] {1, 2, 3, 4, 5}, false),
                arguments(new int[] {}, false),
                arguments(new int[] {1,9}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("arrayFront9Source")
    public void arrayFront9Test(int[] nums, boolean expectedValue) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.arrayFront9(nums) == expectedValue;
    }

    @MethodSource
    private static Stream<Arguments> stringXSource() {
        return Stream.of(
                arguments("x", "x"),
                arguments("xx", "xx"),
                arguments("xxx", "xx"),
                arguments("xax", "xax"),
                arguments("xxHxix", "xHix"),
                arguments("abxxxcd", "abcd"),
                arguments("xabxxxcdx", "xabcdx")
        );
    }

    @ParameterizedTest
    @MethodSource("stringXSource")
    public void stringXTest(String str, String expectedValue) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.stringX(str).equals(expectedValue);
    }

    @MethodSource
    private static Stream<Arguments> array667Source() {
        return Stream.of(
                arguments(new int[] {6}, 0),
                arguments(new int[] {6, 1}, 0),
                arguments(new int[] {6, 6}, 1),
                arguments(new int[] {6, 6, 2}, 1),
                arguments(new int[] {2, 6, 6}, 1),
                arguments(new int[] {6, 6, 2, 6}, 1),
                arguments(new int[] {6, 7, 2, 6}, 1),
                arguments(new int[] {6, 7, 2, 6, 7}, 2),
                arguments(new int[] {6, 7, 2, 6, 6}, 2),
                arguments(new int[] {6, 7, 2, 6, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("array667Source")
    public void array667Test(int[] nums, int expectedValue) {
        Warmup2Solutions solutions = new Warmup2Solutions();
        assert solutions.array667(nums) == expectedValue;
    }
}
