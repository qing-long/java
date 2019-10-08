public class Fab {

    private static int fab(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return fab(index - 1) + fab(index - 2);
    }

    public static void main(String[] args) {
        System.out.println(fab(6));
    }
}

