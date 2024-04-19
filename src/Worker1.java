public class Worker1 implements Worker{

    @Override
    public String getName() {
        return "Clara";
    }

    @Override
    public String getBirthDate() {
        return "01/06/2002";
    }

    @Override
    public int getID() {
        return 3134;
    }

    @Override
    public String getPost() {
        return "Caixa";
    }

    @Override
    public String toString(){
        return "Funcionário-1 [Nome=" + getName() + " Data de nascimento=" + getBirthDate() + " ID=" + getID() + " Cargo=" + getPost() + "]";
    }
}

