public class CarRide {
    public static void main(String[] args) {
        Cabriolet ride1 = new Cabriolet("A1", "Volvo");
        ride1.setMoving(true);
        ride1.setRoofOpen(true);
        System.out.printf("%s%s%nMoving: %b%nisRoofOpen: %b%n", ride1.getBrand(), ride1.getName(), ride1.isMoving(), ride1.isRoofOpen());
        ride1.changeRoofState(false);
        System.out.printf("isRoofOpen: %b%n", ride1.isRoofOpen());

        System.out.println("-----------------------------------------------------------");

        Cabriolet ride2 = new Cabriolet("B2", "Volvo");
        ride2.setMoving(false);
        ride2.setRoofOpen(true);
        System.out.printf("%s%s%nMoving: %b%nisRoofOpen: %b%n", ride2.getBrand(), ride2.getName(), ride2.isMoving(), ride2.isRoofOpen());
        ride2.changeRoofState(false);
        System.out.printf("isRoofOpen: %b", ride2.isRoofOpen());
    }
}
