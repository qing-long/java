public class InputOutPut {
    public String Name(String name) {
        return name;
    }

    public static void main(String[] args) {
        String name = "buglan";

        System.out.println(new InputOutPut().Name(name));

    }
}
