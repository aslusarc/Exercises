package Warmup1;

public class SleepIn {
    public boolean execute(boolean isWeekday, boolean isVacation) {
        if(isVacation) return true;
        return !isWeekday;
    }
}
