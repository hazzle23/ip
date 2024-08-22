import java.util.Scanner;
import java.util.ArrayList;

public class Rose {
    static final String horizontal = "____________________________________________________________";
    static final String name = "Rose";
    static ArrayList<String> tasks = new ArrayList<>();

    private static void addTask(String task) {
        tasks.add(task);
        System.out.println((horizontal + "\nadded: " + task +
                "\n" + horizontal).indent(4));
    }

    private static void showList() {
        System.out.println(horizontal.indent(4));
        for (int i = 1; i <= tasks.size(); i++) {
            System.out.print((i + ". " + tasks.get(i - 1)).indent(4));
        }
        System.out.println(horizontal.indent(4));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opening = horizontal + "\nHi gorgeous! I'm " + name + "~~\n"
                + "How can I help you today?\n" + horizontal;
        String closing = horizontal + "\nSee you~~ Don't forget to drink some water ^_^\n" + horizontal;

        System.out.println(opening.indent(4));

        String command = scanner.nextLine();

        while (!command.equals("bye")) {
            if (command.equals("list")) {
                showList();
                command = scanner.nextLine();
                continue;
            }
            addTask(command);
            command = scanner.nextLine();
        }

        System.out.println(closing.indent(4));
    }
}
