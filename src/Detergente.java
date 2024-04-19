public class Detergente extends Products{

    private String Tipo_detergente;

    public Detergente(String price, String product_Name, int product_Code, String expiration_Date, String brand, String Corridor, String Tipo_detergente) {
        super(price, product_Name, product_Code, expiration_Date, brand, Corridor);
        this.Tipo_detergente=Tipo_detergente;
    }

    public String getTipo_detergente() {
        return Tipo_detergente;
    }

    public void setTipo_detergente(String tipo_detergente) {
        Tipo_detergente = tipo_detergente;
    }

    @Override
    public String toString(){
        return "Detergente [Preço="+getPrice()+" Nome="+getProduct_Name()+ " Código="+getProduct_Code()+" Validade="+getExpiration_Date()+" Marca="+getBrand()+" Corredor="+getCorridor()+" Tipo de detergente="+getTipo_detergente()+"]";
    }
}
