package latihan4_isp.good.src.latihan4_isp.bad;

public class PdfDocument implements Document {

    @Override
    public void read() {
        System.out.println("Reading PDF document...");
    }

    @Override
    public void edit(String content) {
        System.out.println("ERROR: PDF cannot be edited!");
    }

    @Override
    public void print() {
        System.out.println("Printing PDF document...");
    }

    @Override
    public void calculate(String formula) {
        System.out.println("ERROR: PDF cannot calculate!");
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("ERROR: PDF cannot be resized!");
    }
}
