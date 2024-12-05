public class Truck extends Vehicle {
    private boolean hasTrailer;

    public Truck(String modell, String regNumber,double rentPrice,  boolean hasTrailer) {
        super(modell, regNumber, rentPrice);
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void displayInfo() {
        System.out.println("Modell" + getModell() +
                " Reg Number" + getRegNumber() +
                " Rent Price" + getRentPrice() +
                " Has Trailer" + (hasTrailer ? "Yes" : "No"));

    }
}
