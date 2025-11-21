package latihan4_isp.good.src.latihan4_isp.good;

public class SpreadsheetDocument implements Readable, Editable, Printable, Calculable {
    private String fileName;

    public SpreadsheetDocument(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read() {
        System.out.println("[SpreadsheetDocument] Reading Spreadsheet: " + fileName);
    }

    @Override
    public void edit(String content) {
        System.out.println("[SpreadsheetDocument] Editing Spreadsheet: " + fileName + " with content: " + content);
    }

    @Override
    public void calculate(String formula) {
        // contoh output bila mau mock
        System.out.println("[SpreadsheetDocument] Calculating formula: " + formula + " = 5500");
    }

    @Override
    public void print() {
        System.out.println("[SpreadsheetDocument] Printing Spreadsheet: " + fileName);
    }
}
