public class Convertible extends Vehicle{
    private int seats;

    public Convertible(String modell, String regNumber,double rentPrice,  int seats) {
        super(modell, regNumber, rentPrice);
        this.seats = seats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Modell" + getModell() +
                " Reg Number" + getRegNumber() +
                " Rent Price" + getRentPrice() +
                " Number of seats: " + seats);

    }
}
