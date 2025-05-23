public class Goalkeeper extends Player{
    // Default constructor
    public Goalkeeper() {
        super();
        setPosition("Goalkeeper");
    }

    //constructor
    public Goalkeeper(String name, int ovr, int salary) {
        super(name, "Goalkeeper", ovr, salary);
    }

    // Overridden getters and setters
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    @Override
    public void setPosition(String position) {
        super.setPosition(position);
    }

    @Override
    public int getOvr() {
        return super.getOvr();
    }

    @Override
    public void setOvr(int ovr) {
        super.setOvr(ovr);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}