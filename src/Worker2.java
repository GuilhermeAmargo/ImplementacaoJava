public class Worker2 implements Worker{

    @Override
    public String getName() {
        return "Luiz";
    }

    @Override
    public String getBirthDate() {
        return "14/09/1998";
    }

    @Override
    public int getID() {
        return 32134;
    }

    @Override
    public String getPost() {
        return "Padaria";
    }

    @Override
    public String toString(){
        return "Funcionário-2 [Nome=" + getName() + " Data de nascimento=" + getBirthDate() + " ID=" + getID() + " Cargo=" + getPost() + "]";
    }
}
