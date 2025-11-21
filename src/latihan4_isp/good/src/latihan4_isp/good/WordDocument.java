package latihan4_isp.good.src.latihan4_isp.good;

public class WordDocument implements Readable, Editable, Printable {
    private String fileName;

    public WordDocument(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read() {
        System.out.println("[WordDocument] Reading Word: " + fileName);
    }

    @Override
    public void edit(String content) {
        System.out.println("[WordDocument] Editing Word: " + fileName + " with content: " + content);
    }

    @Override
    public void print() {
        System.out.println("[WordDocument] Printing Word: " + fileName);
    }
}
