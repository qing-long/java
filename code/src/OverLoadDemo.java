public class OverLoadDemo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(compare("some"));
        System.out.println(compare(1));
    }
    private static String compare(String a) {
        return a;
    }
    private static int compare(int a) {
        return a;
    }
}
