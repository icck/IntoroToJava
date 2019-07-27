package c12;

public class Computer extends TangibleAsset {
    private String markerName;

    public Computer(String name, int price, String color, String markerName) {
        super(name, price, color);
        this.markerName =  markerName;
    }

    public String getMarkerName() {
        return markerName;
    }


}
