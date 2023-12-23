public class Abonent {
    private int Id;
    private String LastName;
    private String Name;
    private String Surname;
    private String Address;
    private int TotalCallTime;
    private String CreditCardNumber;
    private double Debet;

    public Abonent(int id, String lastName, String name, String surname, String address, int totalCallTime, String creditCardNumber, double debet) {
        this.Id = id;
        this.LastName = lastName;
        this.Name = name;
        this.Surname = surname;
        this.Address = address;
        this.TotalCallTime = totalCallTime;
        this.CreditCardNumber = creditCardNumber;
        this.Debet = debet;
    }

    public Abonent(String lastName, String firstName, String address) {
        this.LastName = LastName;
        this.Name = Name;
        this.Address = Address;
    }

    public int getId() {
        return Id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public int getTotalCallTime() {
        return TotalCallTime;
    }

    public void setTotalCallTime(int totalCallTime) {
        this.TotalCallTime = totalCallTime;
    }

    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.CreditCardNumber = creditCardNumber;
    }

    public double getDebet() {
        return Debet;
    }

    public void setDebet(double debet) {
        this.Debet = debet;
    }
}

