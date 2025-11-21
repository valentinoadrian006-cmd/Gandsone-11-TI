package latihan4_isp.bad;

public class WordDocument implements Document {

    @Override
    public void read() {
        System.out.println("Reading Word document...");
    }

    @Override
    public void edit(String content) {
        System.out.println("Editing Word document with content: " + content);
    }

    @Override
    public void print() {
        System.out.println("Printing Word document...");
    }

    @Override
    public void calculate(String formula) {
        System.out.println("ERROR: Word cannot calculate formulas!");
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("ERROR: Word cannot be resized like an image!");
    }
}
