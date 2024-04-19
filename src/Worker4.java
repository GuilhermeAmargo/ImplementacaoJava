public class Worker4 implements Worker{

    @Override
    public String getName() {
        return "Claudia";
    }

    @Override
    public String getBirthDate() {
        return "25/10/1989";
    }

    @Override
    public int getID() {
        return 53442;
    }

    @Override
    public String getPost() {
        return "Gerente";
    }

    @Override
    public String toString(){
        return "Funcionário-4 [Nome=" + getName() + " Data de nascimento=" + getBirthDate() + " ID=" + getID() + " Cargo=" + getPost() + "]";
    }
}