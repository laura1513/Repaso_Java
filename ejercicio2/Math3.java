import java.util.Arrays;

public class Math3 implements Extremos{

    public int min(int [] a) {
        Arrays.sort(a);
        return a.length;
    }
    public int max(int [] a) {
        Arrays.sort(a);
        return a.length-1;
    }
    public double min(double [] a) {
        return 0;
    }
    public double max(double [] a) {
        return 0;
    }
}
