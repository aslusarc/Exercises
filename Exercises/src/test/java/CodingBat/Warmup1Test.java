package CodingBat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Warmup1Test {
    private static Warmup1Solutions solutions;

    @BeforeAll
    public static void init() {
        solutions = new Warmup1Solutions();
    }

    @MethodSource
    private static Stream<Arguments> backAroundSource() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("Banana", "aBananaa"),
                Arguments.of("aaa", "aaaaa"),
                Arguments.of("cat", "tcatt"),
                Arguments.of("a", "aaa")
        );
    }

    @ParameterizedTest
    @MethodSource("backAroundSource")
    public void backAroundTest(String input, String expectedOutput) {
        assert solutions.backAround(input).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> closeSource() {
        return Stream.of(
                Arguments.of(1,1,0),
                Arguments.of(-1,1,1),
                Arguments.of(9,11,0),
                Arguments.of(-9, 9, 9),
                Arguments.of(-9, -1, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("closeSource")
    public void closeTest(int a, int b, int expectedOutput) {
        assert solutions.close(a, b) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> diff21Source() {
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
    @MethodSource("diff21Source")
    public void diff21Test(int n, int expectedValue) {
        assert solutions.diff21(n) == expectedValue;
    }

    @MethodSource
    private static Stream<Arguments> hasTeenSource() {
        return Stream.of(
                Arguments.of(1, 2, 3, false),
                Arguments.of(20, 21, 22, false),
                Arguments.of(1, 15, 20, true),
                Arguments.of(14, 15, 16, true)
        );
    }

    @ParameterizedTest
    @MethodSource("hasTeenSource")
    public void hasTeenTest(int a, int b, int c, boolean expectedOutput) {
        assert solutions.hasTeen(a, b, c) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> missingCharSource() {
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
    @MethodSource("missingCharSource")
    public void missingCharTest(String input, int indexToBeDeleted, String expectedOutput) {
        assert solutions.missingChar(input, indexToBeDeleted).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> mixStartSource() {
        return Stream.of(
                Arguments.of("mix", true),
                Arguments.of("lix", true),
                Arguments.of("mixing soup", true),
                Arguments.of("lix soup", true),
                Arguments.of("soup ", false),
                Arguments.of("", false)
        );
    }

    @ParameterizedTest
    @MethodSource("mixStartSource")
    public void mixStartTest(String input, boolean expectedOutput) {
        assert solutions.mixStart(input) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> nearHundredSource() {
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
    @MethodSource("nearHundredSource")
    public void nearHundredTest(int n, boolean expectedOutput) {
        assert solutions.nearHundred(n) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> sleepInSource() {
        return Stream.of(
                Arguments.of(true, true, true),
                Arguments.of(true, false, false),
                Arguments.of(false, false, true),
                Arguments.of(false, true, true)
        );
    }

    @ParameterizedTest
    @MethodSource("sleepInSource")
    public void sleepInTest(boolean isWeekday, boolean isVacation, boolean expectedOutput) {
        assert solutions.sleepIn(isWeekday, isVacation) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> startHiSource() {
        return Stream.of(
                Arguments.of("hipnoza", true),
                Arguments.of("hi", true),
                Arguments.of("machine", false),
                Arguments.of("hello hi", false),
                Arguments.of("", false)
        );
    }

    @ParameterizedTest
    @MethodSource("startHiSource")
    public void startHiTest(String input, boolean expectedOutput) {
        assert solutions.startHi(input) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> stringESource() {
        return Stream.of(
                Arguments.of("aaa", false),
                Arguments.of("aaae", true),
                Arguments.of("", false),
                Arguments.of("eaeaeae", false),
                Arguments.of("ee", true),
                Arguments.of("eee", true),
                Arguments.of("Degenerate", false)

        );
    }

    @ParameterizedTest
    @MethodSource("stringESource")
    public void stringETest(String input, boolean expectedOutput) {
        assert solutions.stringE(input) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> everyNthSource() {
        return Stream.of(Arguments.of("Banana", 1, "Banana"),
                Arguments.of("Banana", 2, "Bnn"),
                Arguments.of("Dogs", "3", "Ds"),
                Arguments.of("Computers", "4", "Cus"));
    }

    @ParameterizedTest
    @MethodSource("everyNthSource")
    public void everyNthTest(String str, int n, String expectedOutput) {
        assert solutions.everyNth(str, n).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> in3050Source() {
        return Stream.of(Arguments.of(1, 1, false),
                Arguments.of(30, 1, false),
                Arguments.of(30, 40, true),
                Arguments.of(30, 50, false),
                Arguments.of(40, 50, true),
                Arguments.of(35, 35, true)
        );
    }

    @ParameterizedTest
    @MethodSource("in3050Source")
    public void in3050Test(int a, int b, boolean expectedOutput) {
        assert solutions.in3050(a, b) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> front3Source() {
        return Stream.of(Arguments.of("A", "AAA"),
                Arguments.of("AB", "ABABAB"),
                Arguments.of("Talar", "TalTalTal"),
                Arguments.of("", ""),
                Arguments.of("Banana", "BanBanBan")
        );
    }

    @ParameterizedTest
    @MethodSource("front3Source")
    public void front3Test(String input, String expectedOutput) {
        assert solutions.front3(input).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> monkeyTroubleSource() {
        return Stream.of(Arguments.of(true, true, true),
                Arguments.of(true, false, false),
                Arguments.of(false, false, true),
                Arguments.of(false, true , false)
        );
    }

    @ParameterizedTest
    @MethodSource("monkeyTroubleSource")
    public void monkeyTroubleTest(boolean a, boolean b, boolean expectedOutput) {
        assert solutions.monkeyTrouble(a, b) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> parrotTroubleSource() {
        return Stream.of(Arguments.of(true, 10, false),
                Arguments.of(false, 21, false),
                Arguments.of(true, 1, true),
                Arguments.of(true, 22 , true)
        );
    }

    @ParameterizedTest
    @MethodSource("parrotTroubleSource")
    public void monkeyTroubleTest(boolean talking, int hour, boolean expectedOutput) {
        assert solutions.parrotTrouble(talking, hour) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> posNegSource() {
        return Stream.of(Arguments.of(1, 2, false, false),
                Arguments.of(-1, 2, false, true),
                Arguments.of(-1, -2, false, false),
                Arguments.of(-1, -2, true, true)
        );
    }

    @ParameterizedTest
    @MethodSource("posNegSource")
    public void posNegTest(int a, int b, boolean negative, boolean expectedOutput) {
        assert solutions.posNeg(a, b ,negative) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> frontBackSource() {
        return Stream.of(Arguments.of("Banana", "aananB"),
                Arguments.of("Talar", "ralaT"),
                Arguments.of("Rat", "taR"),
                Arguments.of("String", "gtrinS")
        );
    }

    @ParameterizedTest
    @MethodSource("frontBackSource")
    public void posNegTest(String str, String expectedOutput) {
        assert solutions.frontBack(str).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> icyHotSource() {
        return Stream.of(Arguments.of(1, 1, false),
                Arguments.of(-1, 2, false),
                Arguments.of(-1, 101, true),
                Arguments.of(101, -1, true),
                Arguments.of(-1, -1, false),
                Arguments.of(101, 101, false)
        );
    }

    @ParameterizedTest
    @MethodSource("icyHotSource")
    public void posNegTest(int temp1, int temp2, boolean expectedOutput) {
        assert solutions.icyHot(temp1, temp2) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> loneTeenSource() {
        return Stream.of(Arguments.of(1, 1, false),
                Arguments.of(13, 2, true),
                Arguments.of(13, 19, false),
                Arguments.of(101, 19, true)
        );
    }

    @ParameterizedTest
    @MethodSource("loneTeenSource")
    public void loneTeenTest(int a, int b, boolean expectedOutput) {
        assert solutions.loneTeen(a, b) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> startOzSource() {
        return Stream.of(Arguments.of("Talar", ""),
                Arguments.of("a", ""),
                Arguments.of("", ""),
                Arguments.of("orange", "o"),
                Arguments.of("ozor", "oz"),
                Arguments.of("o", "o")
        );
    }

    @ParameterizedTest
    @MethodSource("startOzSource")
    public void startOzTest(String str, String expectedOutput) {
        assert solutions.startOz(str).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> lastDigitSource() {
        return Stream.of(Arguments.of(1, 1, true),
                Arguments.of(10, 20, true),
                Arguments.of(11, 10, false),
                Arguments.of(111, 222, false),
                Arguments.of(213, 683, true)
        );
    }

    @ParameterizedTest
    @MethodSource("lastDigitSource")
    public void lastDigitTest(int a, int b, boolean expectedOutput) {
        assert solutions.lastDigit(a, b) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> sumDoubleSource() {
        return Stream.of(Arguments.of(1, 1, 4),
                Arguments.of(10, 20, 30),
                Arguments.of(11, 10, 21),
                Arguments.of(111, 222, 333),
                Arguments.of(115, 115, 460)
        );
    }

    @ParameterizedTest
    @MethodSource("sumDoubleSource")
    public void sumDoubleTest(int a, int b, int expectedOutput) {
        assert solutions.sumDouble(a, b) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> makes10Source() {
        return Stream.of(Arguments.of(1, 1, false),
                Arguments.of(10, 20, true),
                Arguments.of(1, 10, true),
                Arguments.of(10, 10, true),
                Arguments.of(5, 5, true)
        );
    }

    @ParameterizedTest
    @MethodSource("makes10Source")
    public void makes10Test(int a, int b, boolean expectedOutput) {
        assert solutions.makes10(a, b) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> notStringSource() {
        return Stream.of(Arguments.of("dog", "not dog"),
                Arguments.of("not cat", "not cat"),
                Arguments.of("Notre Dame", "Notre Dame")
        );
    }

    @ParameterizedTest
    @MethodSource("notStringSource")
    public void notStringTest(String str, String expectedOutput) {
        assert solutions.notString(str).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> front22Source() {
        return Stream.of(Arguments.of("dog", "dodogdo"),
                Arguments.of("A", "AAA"),
                Arguments.of("", ""),
                Arguments.of("Talar", "TaTalarTa")
        );
    }

    @ParameterizedTest
    @MethodSource("front22Source")
    public void front22Test(String str, String expectedOutput) {
        assert solutions.front22(str).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> delDelSource() {
        return Stream.of(Arguments.of("Dog", "Dog"),
                Arguments.of("Delete", "Delete"),
                Arguments.of("Adelle", "Ale")
        );
    }

    @ParameterizedTest
    @MethodSource("delDelSource")
    public void delDelTest(String str, String expectedOutput) {
        assert solutions.delDel(str).equals(expectedOutput);
    }

    @MethodSource
    private static Stream<Arguments> intMaxSource() {
        return Stream.of(Arguments.of(1, 1, 1, 1),
                Arguments.of(1, 2, 3, 3),
                Arguments.of(1 ,2 ,2, 2),
                Arguments.of(-1 ,-2 ,-3, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("intMaxSource")
    public void intMaxTest(int a, int b, int c, int expectedOutput) {
        assert solutions.intMax(a, b, c) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> max1020Source() {
        return Stream.of(Arguments.of(1, 1, 0),
                Arguments.of(10, 2, 10),
                Arguments.of(1 ,20 ,20),
                Arguments.of(21 ,10 ,10),
                Arguments.of(21 ,10 ,10),
                Arguments.of(50 ,9 ,0),
                Arguments.of(15 ,10 ,15),
                Arguments.of(20 ,10, 20)
        );
    }

    @ParameterizedTest
    @MethodSource("max1020Source")
    public void max1020Test(int a, int b, int expectedOutput) {
        assert solutions.max1020(a, b) == expectedOutput;
    }

    @MethodSource
    private static Stream<Arguments> endUpSource() {
        return Stream.of(Arguments.of("Dog", "DOG"),
                Arguments.of("Delete", "DelETE"),
                Arguments.of("Adelle", "AdeLLE"),
                Arguments.of("Talar", "TaLAR"),
                Arguments.of("no", "NO"),
                Arguments.of("a", "A"),
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("endUpSource")
    public void endUpTest(String str, String expectedOutput) {
        String s = solutions.endUp(str);
        assert s.equals(expectedOutput);
    }
}
