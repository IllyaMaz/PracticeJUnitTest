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
                A.setColVo(A.getColVo()+1);
            } else if (s.equals("B")){
                B.setColVo(B.getColVo()+1);
            } else if (s.equals("C")){
                C.setColVo(C.getColVo()+1);
            } else if (s.equals("D")){
                D.setColVo(D.getColVo()+1);
            }
        }

        while (A.getColVo() % 3 == 0 && A.getColVo()!=0 || C.getColVo() % 6 == 0 && C.getColVo() != 0){
            if (A.getColVo()%3==0 && A.getColVo() != 0){
                result+=3f;
                A.setColVo(A.getColVo()-3);
            }
            if (C.getColVo() % 6 == 0 && C.getColVo() !=0){
                result+=5f;
                C.setColVo(C.getColVo()-6);
            }
        }

        result+=A.getColVo() * A.getPrice() + B.getColVo() * B.getPrice() + C.getColVo() * C.getPrice() + D.getColVo() * D.getPrice();

        return result;
    }



}
