public abstract class Vehicle implements Rentable{

    private String modell;
    private String regNumber;
    private double rentPrice;
    private boolean isRented;
    private int daysRented;

    public Vehicle(String modell, String regNumber, double rentPrice) {
        this.modell = modell;
        this.regNumber = regNumber;
        this.rentPrice = rentPrice;
        this.isRented = false;
    }
    public String getModell() {
        return modell;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public boolean isRented() {
        return isRented;
    }

    @Override
    public void rent(int days) {
        if (!isRented) {
            daysRented = days;
            isRented = true;
            System.out.println(modell + " uthyrdes i " + days + " dagar");
        }
        else {
            System.out.println(modell + "Är inte ledig");
        }

    }

    @Override
    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println(modell + " returnerades.");
        } else {
            System.out.println(modell + " har inte returnerats.");
        }
        }

    @Override
    public double rentCost() {
        return daysRented * rentPrice;

        }

        public abstract void displayInfo ();

    }



