public class Room {

    private double width;
    private double length;
    private double height;
    private Carpet carpet;
    private Windows windows;
    private Lamp lamp;

    public Room(double width, double length, double height, Carpet carpet, Windows windows, Lamp lamp) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.carpet = carpet;
        this.windows = windows;
        this.lamp = lamp;
    }
}
