package latihan4_isp.good.src.latihan4_isp.bad;

// FAT INTERFACE - melanggar ISP
public interface Document {

    void read();                       // Semua dokumen bisa baca
    void edit(String content);         // Tidak semua bisa edit
    void print();                      // Tidak semua bisa print
    void calculate(String formula);    // Hanya spreadsheet
    void resize(int width, int height);// Hanya image
}
