public class Order {
    private String customerName;
    private String orderID;
    private int burgerQty;
    private String phone;
    private double total;
    private int status;
    public Order(String customerName, String orderID, int burgerQty, String phone, double total,int status) {
        this.customerName = customerName;
        this.orderID = orderID;
        this.burgerQty = burgerQty;
        this.phone = phone;
        this.total = total;
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderID() {
        return orderID;
    }

    public int getBurgerQty() {
        return burgerQty;
    }

    public String getPhone() {
        return phone;
    }

    public double getTotal() {
        return total;
    }
    public int getStatus() {
        return status;
    }

    public void setTotal(double total){this.total = total;}
    public void setStatus(int status){this.status = status;}
    public void setBurgerQty(int qty){burgerQty = qty;}
}
