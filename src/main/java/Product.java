public class Product {

    private char name;
    private float price;
    private int amount = 0;

    public Product(char name,float price){
        this.name=name;
        this.price=price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public char getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

}

