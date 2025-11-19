public class Car {
    private String modelNamel;
    private String engineType;
    private String color;
    private String transmission;
    private boolean sunroof;
    private boolean infotainmentSystem;

    public Car(String modelName, String engineType, String color, String transmission, boolean sunroof, boolean infotainmentSystem) {
        this.modelNamel = modelName;
        this.engineType = engineType;
        this.color = color;
        this.transmission = transmission;
        this.sunroof = sunroof;
        this.infotainmentSystem = infotainmentSystem;
    }

    @Override
    public String toString() {
        return "-Model Name: " + modelNamel + "\n" +
               "-Engine Type: " + engineType + "\n" +
               "-Color: " + color + "\n" +
               "-Transmission: " + transmission + "\n" +
               "-Sunroof: " + (sunroof? "Yes" : "No") + "\n" +
               "-Infotainment System: " + (infotainmentSystem? "Yes" : "No") + "\n";
    }
}
