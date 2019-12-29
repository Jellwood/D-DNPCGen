import java.util.Random;
public class ClassSelector {
    private String[] charClasses = {"Barbarian", "Rogue", "Wizard", "Sorcerer"};
    private Random randIntGen = new Random();
    private String charClass;

    public ClassSelector() {
        charClass = charClasses[randIntGen.nextInt(charClasses.length - 1)];
    }

    public ClassSelector(String newClass) throws NoSuchClassException {
        for(int i = 0; i < charClasses.length; i++) {
            if(newClass.equals(charClasses[i])) {
                charClass = newClass;
            }
        }
        if(charClass == null) {
            throw new NoSuchClassException();
        }
    }
    
    public String getCharClass() throws NoSuchClassException {
        return charClass;
    }
    public void changeClass(String newClass) throws NoSuchClassException {
        for(int i = 0; i < charClasses.length; i++) {
            if(newClass.equals(charClasses[i])) {
                charClass = newClass;
            }
        }
        if(charClass == null) {
            throw new NoSuchClassException();
        }
    }
    @Override
    public String toString() {
        return ("Character Class: " + charClass);
    }

    public static void main(String[] args) {
        ClassSelector testClass1 = new ClassSelector();
        System.out.println("Class 1: " + testClass1);
        try{
            ClassSelector testClass2 = new ClassSelector("Wizard");
            System.out.println("Class 2: " + testClass2);
            testClass2 = new ClassSelector("lmao");
            System.out.println("Fail Case: " + testClass2);
        }catch(NoSuchClassException e) {
            System.out.println("Invalid Class");
        }
    }
}