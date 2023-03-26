public class Main {
    public static void main(String[] args){
        double C = -32.43;
        double F = (9.0 / 5.0) * C + 32.0;
        F = Math.round(F * 10.0) / 10.0;
        System.out.print(F);
    }
}