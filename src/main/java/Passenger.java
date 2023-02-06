import java.util.HashMap;

public class Passenger{

    private String name;
    private int personID;
    private HashMap<Long, String> contactInfo = new HashMap<Long, String>();

    public Passenger(String name, int personID){
        this.name = name;
        this.personID = personID; // remove from constructor and call method here
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public HashMap<Long, String> getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(HashMap<Long, String> contactInfo) {
        this.contactInfo = contactInfo;
    }

    // generate ID method
    // check user is unique/ is it random?
    // int generateID(){}
    // UUID method

}
