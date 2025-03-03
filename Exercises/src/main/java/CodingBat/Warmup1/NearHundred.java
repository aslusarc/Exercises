package CodingBat.Warmup1;

public class NearHundred {
    public boolean execute(int n) {
        return Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10;
    }
}
