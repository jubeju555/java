public class greeter {
    public greeter(String Name) {
        name = Name;

    }

    public static void main(String[] args) {
        greeter greeter = new greeter("judah");
        System.out.println(greeter.hello());
    }

    public String hello() {
        return "hello, " + name + "!";
    }

    private String name;
}