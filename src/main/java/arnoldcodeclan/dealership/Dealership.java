package arnoldcodeclan.dealership;
import arnoldcodeclan.vehicles.Vehicle;
import java.util.ArrayList;

public class Dealership {

    private Till till;
    ArrayList<Dealer> dealers;
    ArrayList<Customer> customers;
    ArrayList<Vehicle> stock;

    public Dealership(Till till) {
        this.till = till;
        dealers = new ArrayList<>();
        customers = new ArrayList<>();
        stock = new ArrayList<>();
    }

    public Till getTill() {
        return till;
    }

    public ArrayList<Dealer> getDealers() {
        return dealers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void addDealer(Dealer dealer) {
        this.dealers.add(dealer);
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void addStock(Vehicle vehicle) {
        this.stock.add(vehicle);
    }

}
