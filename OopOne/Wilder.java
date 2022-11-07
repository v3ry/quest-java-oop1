package OopOne;
public class Wilder {

    //Attributs
    private String firstname;
    private boolean aware;

    //Constructors
    public Wilder(String name,boolean awar) {
        this.firstname = name;
        this.aware = awar;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setFirstname(String name) {
        this.firstname = name;
    }

    public void setAware(Boolean bAware) {
        this.aware = bAware;
    }
    
    public String whoAmI() {
        return "Je m'appelle " + getFirstname() + " et je " + (isAware() ? "suis aware":"ne suis pas aware");
    }

    
}
