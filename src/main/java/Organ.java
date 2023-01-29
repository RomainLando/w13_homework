public class Organ extends Keyboards implements IPlay{

    private static int keysNumber = 61;

    public Organ() {
        super(keysNumber);
    }

    public String play(){
        return "Toooonk!";
    }
}
