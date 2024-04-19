public class Coffee extends Products{
    private String Coffee_Type;

    private String Package_Coffee;

    public Coffee(String price, String product_Name, int product_Code, String expiration_Date, String brand, String Corridor, String coffee_Type, String package_Coffee) {
        super(price, product_Name, product_Code, expiration_Date, brand, Corridor);
        Coffee_Type = coffee_Type;
        Package_Coffee = package_Coffee;
    }

    public String getCoffee_Type() {
        return Coffee_Type;
    }

    public String getPackage_Coffee() {
        return Package_Coffee;
    }

    public void setCoffee_Type(String coffee_Type) {
        Coffee_Type = coffee_Type;
    }

    public void setPackage_Coffee(String package_Coffee) {
        Package_Coffee = package_Coffee;
    }

    @Override
    public String toString(){
        return "Café [Preço="+getPrice()+" Nome="+getProduct_Name()+ " Código="+getProduct_Code()+" Validade="+getExpiration_Date()+" Marca="+getBrand()+" Corredor="+getCorridor()+" Tipo de Café="+getCoffee_Type()+" Tamanho do pacote="+getPackage_Coffee()+"]";
    }
}
