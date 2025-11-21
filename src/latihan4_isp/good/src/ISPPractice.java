package latihan4_isp.good.src;

import latihan4_isp.good.src.latihan4_isp.good.*;
import latihan4_isp.good.src.latihan4_isp.good.Readable;

import java.util.ArrayList;
import java.util.List;

public class ISPPractice {
    public static void main(String[] args) {

        System.out.println("\n=== Demonstrasi Interface Segregation Principle ===\n");

        // =============================
        // SECTION 1: Reading capability
        // =============================
        Readable r1 = new PdfDocument("Doc.pdf");
        Readable r2 = new WordDocument("Report.docx");

        r1.read();
        r2.read();

        // =============================
        // SECTION 2: Print all printable
        // =============================
        System.out.println("\nPrinting all printable documents:");

        List<Printable> printableDocs = new ArrayList<>();
        printableDocs.add(new PdfDocument("Doc.pdf"));
        printableDocs.add(new WordDocument("Report.docx"));
        printableDocs.add(new SpreadsheetDocument("Data.xlsx"));
        // printableDocs.add(new ImageDocument("Photo.jpg")); // TIDAK BOLEH (Image tidak printable)

        for (Printable doc : printableDocs) {
            doc.print();
        }

        // ===================================
        // SECTION 3: Editing capability
        // ===================================
        System.out.println("\nEditing editable documents:");

        Editable e1 = new WordDocument("Report.docx");
        Editable e2 = new SpreadsheetDocument("Data.xlsx");

        e1.edit("Update paragraph...");
        e2.edit("Update cell value...");

        // ===================================
        // SECTION 4: Calculating capability
        // ===================================
        System.out.println("\nCalculating using Spreadsheet:");

        Calculable calc = new SpreadsheetDocument("Data.xlsx");
        calc.calculate("SUM(A1:A10)");

        // ===================================
        // SECTION 5: Resize capability (Image)
        // ===================================
        System.out.println("\nResizing Image:");

        Resizable img = new ImageDocument("Landscape.jpg");
        img.resize(1920, 1080);

        // =============================
        // END
        // =============================
        System.out.println("\n--- Keuntungan Setelah Refactoring ---");
        System.out.println("✔ Focused  - Setiap interface punya capability spesifik");
        System.out.println("✔ Flexible - Class hanya implement apa yang perlu");
        System.out.println("✔ Aman     - Tidak ada method yang tidak digunakan");
        System.out.println("---------------------------------------\n");
    }
}
