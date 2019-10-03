class Task {
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();

        t1.level = 9;
        t2.level = 46;
        System.out.println("1: t1.level: " + t1.level + ", l2.level" + t2.level);
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", l2.level" + t2.level);
        t1.level = 27;
        System.out.println("3: t1.level: " + t1.level + ", l2.level" + t2.level);
    }
}