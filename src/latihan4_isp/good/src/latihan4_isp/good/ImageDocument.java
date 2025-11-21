package latihan4_isp.good.src.latihan4_isp.good;

public class ImageDocument implements Readable, Resizable {
    private String fileName;

    public ImageDocument(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read() {
        System.out.println("[ImageDocument] Reading Image: " + fileName);
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("[ImageDocument] Resizing Image: " + fileName + " to " + width + "x" + height);
    }
}
