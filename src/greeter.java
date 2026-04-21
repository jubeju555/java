public class greeter {
    public greeter(String Name) {
        name = Name;

    }

    public String hello() {
        return "hellow, " + name + "!";
    }

    private String name;
}