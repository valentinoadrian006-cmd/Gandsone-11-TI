package latihan4_isp.good;

public class PdfDocument implements Readable, Printable {
    private String fileName;

    public PdfDocument(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read() {
        System.out.println("[PdfDocument] Reading PDF: " + fileName);
    }

    @Override
    public void print() {
        System.out.println("[PdfDocument] Printing PDF: " + fileName);
    }
}
