package CodingBat;

public class Warmup1Solutions {
    public String backAround(String input) {
        if (input.isBlank()) return "";
        char lastCharacter = input.charAt(input.length() - 1);
        return lastCharacter + input + lastCharacter;
    }

    public int close(int a, int b) {
        int absA = Math.abs(a - 10);
        int absB = Math.abs(b - 10);

        if (absA == absB) return 0;
        if (absA > absB) return b;
        return a;
    }

    public int diff21(int n) {
        if (n > 21) return Math.abs((21 - n) * 2);

        return Math.abs(21 - n);
    }

    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public boolean isTeen(int i) {
        return 19 >= i && i >= 13;
    }

    public String missingChar(String input, int indexToBeDeleted) {
        if (indexToBeDeleted < 0 || indexToBeDeleted > input.length() || input.isBlank())
            return input;

        return input.substring(0, indexToBeDeleted) + input.substring(indexToBeDeleted + 1);
    }

    public boolean mixStart(String input) {
        return input.matches(".ix.*");
    }

    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }

    public boolean sleepIn(boolean isWeekday, boolean isVacation) {
        if (isVacation) return true;
        return !isWeekday;
    }

    public boolean startHi(String input) {
        return input.startsWith("hi");
    }

    public boolean stringE(String input) {
        int counter = 0;
        for (char c : input.toCharArray())
            if (c == 'e')
                counter++;

        return counter <= 3 && counter >= 1;
    }

    public String everyNth(String str, int n) {
        String result = "";

        for (int i = 0; i < str.length(); i += n)
            result += str.charAt(i);

        return result;
    }

    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
                ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    public String front3(String str) {
        String front3 = str.length() < 3 ? str : str.substring(0, 3);

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 3; i++)
            builder.append(front3);

        return builder.toString();
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return !aSmile ^ bSmile;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (!negative) return (a < 0 ^ b < 0);
        else return a < 0 && b < 0;
    }

    public String frontBack(String str) {
        if (str.length() < 2)
            return str;

        char[] charArray = str.toCharArray();
        char temp = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = charArray[0];
        charArray[0] = temp;

        return new String(charArray);
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 && temp2 < 0) || (temp2 > 100 && temp1 < 0);
    }

    public boolean loneTeen(int a, int b) {
        return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);
    }

    public String startOz(String str) {
        String result = "";

        if (str.isEmpty())
            return result;

        if (str.charAt(0) == 'o')
            result += "o";

        if (str.length() < 2)
            return result;

        if (str.charAt(1) == 'z')
            result += "z";

        return result;
    }

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    public int sumDouble(int a, int b) {
        if (a == b)
            return 4 * a;
        else
            return a + b;
    }

    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    public String notString(String str) {
        if (str.toLowerCase().startsWith("not"))
            return str;
        else
            return "not " + str;
    }

    public String front22(String str) {
        if (str.isEmpty())
            return "";

        if (str.length() > 2)
            return str.substring(0, 2) + str + str.substring(0, 2);

        else
            return str + str + str;
    }

    public String delDel(String str) {
        if (str.length() < 4)
            return str;

        if (str.substring(1, 4).equalsIgnoreCase("del"))
            return str.replaceFirst("del", "");

        return str;
    }

    public int intMax(int a, int b, int c) {
        return Integer.max(Integer.max(a, b), c);
    }

    public int max1020(int a, int b) {
        boolean aViable = a >= 10 && a <= 20;
        boolean bViable = b >= 10 && b <= 20;

        if(!aViable && !bViable) return 0;
        if(!aViable) return b;
        if(!bViable) return a;

        return Integer.max(a, b);
    }

    public String endUp(String str) {
        return str.length() < 4 ?
                str.toUpperCase() :
                str.substring(0, str.length()-3) + str.substring(str.length()-3).toUpperCase();
    }
}
