package Warmup1;

public class MissingChar {
    public String execute(String input, int indexToBeDeleted) {
        if (indexToBeDeleted < 0 || indexToBeDeleted > input.length() || input.isBlank())
            return input;

        return input.substring(0, indexToBeDeleted) + input.substring(indexToBeDeleted + 1);
    }
}