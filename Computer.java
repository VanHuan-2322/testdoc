public class Computer {
private String code;
    private String name;
    private String manufacturer;
    private String configuration;
    private double price;
    private boolean isAvailable;

    public Computer() {

    }

    public Computer(String code, String name, String manufacturer, String configuration, double price, boolean isAvailable) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.configuration = configuration;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}






