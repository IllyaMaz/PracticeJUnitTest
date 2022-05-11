public class Product {

    private char name;
    private float price;
    private int colVo = 0;

    public Product(char name,float price){
        this.name=name;
        this.price=price;
    }

    //what the ColVo means? amount? I suggest use english words, if you have issues with it use translator it's also ok
    public int getColVo() {
        return colVo;
    }

    public void setColVo(int colVo) {
        this.colVo = colVo;
    }

    public char getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

}

