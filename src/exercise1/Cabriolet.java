package exercise1;

public class Cabriolet {
    private String name;
    private String brand;
    private boolean moving;
    private boolean roofOpen;

    public Cabriolet(String name, String brand) {
        setBrand(brand);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving){
        this.moving = moving;
    }
    public boolean isRoofOpen(){
        return roofOpen;
    }

    public void setRoofOpen(boolean roofOpen){
        this.roofOpen = roofOpen;
    }

    public void changeRoofState(boolean roof) {
        if (this.moving) {
            System.out.println("Error you cannot open/close roof while car is moving.");
        } else {
            setRoofOpen(roof);
        }
    }
}
