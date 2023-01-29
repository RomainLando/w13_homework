public class Piano extends Keyboards implements IPlay{

    private static int keysNumber = 88;

    public Piano() {
        super(keysNumber);
    }

    public String play(){
        return "Tink";
    }
}
