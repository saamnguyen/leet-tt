package easy;

public class SqrtX {
    public int mySqrt(int x){
        long r = x;
        while (r * r > x){
            r = (r + x / r) / 2;

        }
        return (int ) r;
    }

    public static void main(String[] args) {
        SqrtX sqrtX = new SqrtX();
        System.out.println(sqrtX.mySqrt(8));
    }
}
