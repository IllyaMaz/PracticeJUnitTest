public class Magezin {
    private  Product A = new Product('A',1.25f);
    private  Product B = new Product('B',4.25f);
    private  Product C = new Product('C',1f);
    private  Product D = new Product('D',0.75f);

    public float getTotalPrice(String totalPrice){
        float result=0;

        String[] product = totalPrice.split("");
        for (String s:product) {
            if (s.equals("A")){
                A.setAmount(A.getAmount()+1);
            } else if (s.equals("B")){
                B.setAmount(B.getAmount()+1);
            } else if (s.equals("C")){
                C.setAmount(C.getAmount()+1);
            } else if (s.equals("D")){
                D.setAmount(D.getAmount()+1);
            }
        }

        int amountProductA = A.getAmount();
        int amountProductC = C.getAmount();

        while (amountProductA % 3 == 0 && amountProductA!=0 || amountProductC % 6 == 0 && amountProductC != 0){
            if (amountProductA%3==0 && amountProductA != 0){
                result+=3f;
                amountProductA-=3;
                A.setAmount(amountProductA);
            }
            if (amountProductC % 6 == 0 && amountProductC !=0){
                result+=5f;
                amountProductC-=6;
                C.setAmount(amountProductC);
            }
        }

        return result+=sum();
    }

    private float sum(){
        return (A.getAmount() * A.getPrice())
                + (B.getAmount() * B.getPrice())
                + (C.getAmount() * C.getPrice())
                + (D.getAmount() * D.getPrice());
    }

}
