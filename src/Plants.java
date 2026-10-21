public abstract class Plants implements Waterable {
    String name;
    double height;

    public Plants(String name, double height) {
        this.name = name;
        this.height = height;
    }
    public String getName() {
        return name;
    }
}
