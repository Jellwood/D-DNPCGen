public class NameGenerator {
    private String fName;
    private String lName;

    public NameGenerator() {
        fName = generateFirstName();
        lName = generateLastName();
    }

    public String generateFirstName() {
        return "James";
    }

    public String generateLastName() {
        return "Phoenix";
    }

    public void setFName(String newFName) {
        if(newFName != null) {
            fName = newFName;
        }
    }
    
    public void setLName(String newLName) {
        if(newLName != null) {
            fName = newLName;
        }
    }

    public String getFName() {
        return fName;
    }
    
    public String getLName() {
        return lName;
    }

    public String toString() {
        return (fName + " " + lName);
    }

    public static void main(String[] args) {
        NameGenerator nameGen = new NameGenerator();
        System.out.println(nameGen);
    }
    
}