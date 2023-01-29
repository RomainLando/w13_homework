public class Guitar implements IPlay{

    private static int stringNumber;

    public Guitar() {
        this.stringNumber = 6;
    }

    public String play(){
        return "struuum";
    }
}
