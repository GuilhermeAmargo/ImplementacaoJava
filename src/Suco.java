public class Suco extends Products{

    private String Sabor_Suco;

    private boolean Suco_Gelado;

    private String Litros;

    public Suco(String price, String product_Name, int product_Code, String expiration_Date, String brand, String Corridor, String Sabor_Suco, boolean Suco_Gelado, String Litros) {
        super(price, product_Name, product_Code, expiration_Date, brand, Corridor);
        this.Litros=Litros;
        this.Sabor_Suco=Sabor_Suco;
        this.Suco_Gelado=Suco_Gelado;
    }

    public String getSabor_Suco() {
        return Sabor_Suco;
    }

    public boolean isSuco_Gelado() {
        return Suco_Gelado;
    }

    public String getLitros() {
        return Litros;
    }

    public void setSabor_Suco(String Sabor_Suco) {
        Sabor_Suco = Sabor_Suco;
    }

    public void setSuco_Gelado(boolean Suco_Gelado) {
        Suco_Gelado = Suco_Gelado;
    }

    public void setLitros(String litros) {
        Litros = Litros;
    }

    @Override
    public String toString(){
        return "Suco [Preço="+getPrice()+" Nome="+getProduct_Name()+ " Código="+getProduct_Code()+" Validade="+getExpiration_Date()+" Marca="+getBrand()+" Corredor="+getCorridor()+" Sabor do Suco="+getSabor_Suco()+" Suco é gelado="+isSuco_Gelado()+" Litros="+getLitros()+"]";
    }
}
