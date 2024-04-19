public class Bread extends Products{

    private String Bread_Type;

    private boolean Integral_Bread;


    public Bread(String price, String product_Name, int product_Code, String expiration_Date, String brand, String Corridor, String Bread_Type, boolean Integral_Bread) {
        super(price, product_Name, product_Code, expiration_Date, brand, Corridor);
        this.Bread_Type=Bread_Type;
        this.Integral_Bread=Integral_Bread;
    }

    public String getBread_Type() {
        return Bread_Type;
    }

    public boolean isIntegral_Bread() {
        return Integral_Bread;
    }

    public void setBread_Type(String bread_Type) {
        Bread_Type = bread_Type;
    }

    public void setIntegral_Bread(boolean integral_Bread) {
        Integral_Bread = integral_Bread;
    }

    @Override
    public String toString(){
        return "Pão [Preço="+getPrice()+" Nome="+getProduct_Name()+ " Código="+getProduct_Code()+" Validade="+getExpiration_Date()+" Marca="+getBrand()+" Corredor="+getCorridor()+" Tipo="+getBread_Type()+" Integral="+isIntegral_Bread()+"]";
    }
}
