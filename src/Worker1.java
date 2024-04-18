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
    public String getID() {
        return "03134";
    }

    @Override
    public String getPost() {
        return "Caixa";
    }

    @Override
    public String toString(){
        return "Worker [Name=" + getName() + ", Birth Date=" + getBirthDate() + ", ID=" + getID() + ", Post=" + getPost() + "]";
    }
}

