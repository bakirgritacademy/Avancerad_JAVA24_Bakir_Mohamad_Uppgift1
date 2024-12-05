public class SUV extends Vehicle {

    private boolean fourWD;

    public SUV(String modell, String regNumber,double rentPrice,  boolean fourWD) {
        super(modell, regNumber, rentPrice);
        this.fourWD = fourWD;
    }

    @Override
    public void displayInfo() {
        System.out.println("Modell" + getModell() +
                " Reg Number" + getRegNumber() +
                " Rent Price" + getRentPrice() +
                " Have 4WD" + (fourWD ? "Yes" : "No"));

    }
}
