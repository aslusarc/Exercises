package Warmup1;

public class Diff21 {
    public int execute(int n) {
        if(n > 21) return Math.abs((21-n)*2);

        return Math.abs(21-n);
    }
}
