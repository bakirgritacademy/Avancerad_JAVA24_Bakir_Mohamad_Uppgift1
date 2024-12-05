public class Car extends Vehicle {
    private boolean isElectric;

    public Car(String modell, String regNumber,double rentPrice,  boolean isElectric) {
        super(modell, regNumber, rentPrice);
        this.isElectric = isElectric;
    }

    @Override
    public void displayInfo() {
        System.out.println("Modell" + getModell() +
                " Reg Number" + getRegNumber() +
                " Rent Price" + getRentPrice() +
                " Electric" + (isElectric ? "Yes" : "No"));

    }
}
