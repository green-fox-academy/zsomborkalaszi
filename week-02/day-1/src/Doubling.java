public class Doubling {

    public static void main(String[] args) {
        int result, baseNum;

        baseNum = 123;
        result = doubling(baseNum);
        System.out.println("doubling(baseNum) " + result);

    }

    static int doubling(int i) {
        return i * 2;
    }
}