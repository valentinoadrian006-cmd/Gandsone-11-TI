package latihan4_isp.bad;

public class ImageDocument implements Document {

    @Override
    public void read() {
        System.out.println("Viewing Image document...");
    }

    @Override
    public void edit(String content) {
        System.out.println("ERROR: Image cannot edit text content!");
    }

    @Override
    public void print() {
        System.out.println("ERROR: Image typically cannot be printed as a document!");
    }

    @Override
    public void calculate(String formula) {
        System.out.println("ERROR: Image cannot calculate formulas!");
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("Resizing image to " + width + "x" + height);
    }
}
