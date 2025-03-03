package CodingBat.Warmup1;

public class BackAround {
    public String execute(String input) {
        if (input.isBlank()) return "";
        char lastCharacter = input.charAt(input.length()-1);
        return lastCharacter + input + lastCharacter;
    }
}
