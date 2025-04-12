package CodingBat;

public class Warmup2Solutions {
    public String stringTimes(String str, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++)
            builder.append(str);

        return builder.toString();
    }

    public boolean doubleX(String str) {
        int firstIndex = str.indexOf('x');
        if (firstIndex == -1 || firstIndex + 1 >= str.length())
            return false;

        return str.charAt(firstIndex + 1) == 'x';
    }

    public int last2(String str) {
        int result = 0;
        if (str.length() < 2)
            return result;

        String substring = str.substring(str.length() - 2);
        int index = 1;

        while (index < str.length()) {
            if (str.charAt(index - 1) == substring.charAt(0) && str.charAt(index) == substring.charAt(1))
                result++;

            index++;
        }

        if (str.endsWith(substring))
            result--;

        return result;
    }

    public boolean array123(int[] nums) {
        if (nums.length < 3)
            return false;

        int index = 1, one, two, three;

        while (index + 1 < nums.length) {
            one = nums[index - 1];
            two = nums[index];
            three = nums[index + 1];

            if (one == 1 && two == 2 && three == 3)
                return true;

            index++;
        }

        return false;
    }

    public String altPairs(String str) {
        StringBuilder result = new StringBuilder();
        if (str.length() < 3)
            return str;

        int i = 0;
        while (i < str.length()) {
            if (i % 4 < 2)
                result.append(str.charAt(i));

            i++;
        }
        return result.toString();
    }

    public boolean noTriples(int[] nums) {
        if (nums.length < 3)
            return true;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i - 2] == nums[i - 1] && nums[i - 1] == nums[i])
                return false;
        }

        return true;
    }

    public String frontTimes(String str, int n) {
        if (n < 0)
            return "";

        String front = str.length() > 3 ? str.substring(0, 3) : str;
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < n; i++) {
            b.append(front);
        }

        return b.toString();
    }

    public String stringBits(String str) {
        StringBuilder b = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            if (i % 2 == 0)
                b.append(str.charAt(i++));

            i++;
        }


        return b.toString();
    }

    public int arrayCount9(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 9)
                counter++;

        return counter;
    }

    public int stringMatch(String a, String b) {
        if (a.isEmpty() || b.isEmpty())
            return 0;

        int result = 0;
        int length = Math.min(a.length(), b.length());

        for (int i = 0; i < length - 1; i++) {
            String substringA = a.substring(i, i + 2);
            String substringB = b.substring(i, i + 2);

            if (substringA.equals(substringB))
                result++;
        }

        return result;
    }

    public String stringYak(String a) {
        return a.replaceAll("y.k", "");
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];

            if (b == a + 5 && Math.abs(c - (a - 1)) <= 2)
                return true;
        }

        return false;
    }

    public int countXX(String str) {
        int result = 0;
        if (str.length() < 2)
            return result;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("xx", i))
                result++;
        }

        return result;
    }

    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();

        if (str.isEmpty())
            return result.toString();

        for (int i = 1; i < str.length()+1; i++)
            result.append(str, 0, i);

        return result.toString();
    }

    public boolean arrayFront9(int[] nums) {
        int max = Math.min(nums.length, 4);

        for(int i=0;i<max;i++)
            if(nums[i] == 9)
                return true;

        return false;
    }

    public String stringX(String str) {
        return str.length() < 2 ? str : str.charAt(0) + str.substring(1, str.length()-1).replaceAll("x", "") + str.charAt(str.length()-1);
    }

    public int array667(int[] nums) {
        if(nums.length < 2) return 0;
        int result = 0;

        for(int i=1; i<nums.length;i++)
            if(nums[i-1] == 6 && (nums[i] == 6 || nums[i] == 7))
                result++;

        return result;
    }
}