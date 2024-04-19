public class Worker3 implements Worker{

    @Override
    public String getName() {
        return "Martha";
    }

    @Override
    public String getBirthDate() {
        return "05/08/1985";
    }

    @Override
    public int getID() {
        return 87322;
    }

    @Override
    public String getPost() {
        return "Limpeza";
    }

    @Override
    public String toString(){
        return "Funcionário-3 [Nome=" + getName() + " Data de nascimento=" + getBirthDate() + " ID=" + getID() + " Cargo=" + getPost() + "]";
    }
}