public class Harp extends Strings implements IPlay{

    private static int stringNumber = 47;

    public Harp() {
        super(stringNumber);
    }

    public String play(){
        return "Striuuum";
    }
}
