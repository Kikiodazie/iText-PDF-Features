import java.io.File;
import java.io.IOException;

public class MSOfficeToPdfConversion {
    public static void main(String[] args) throws IOException {

        LicenseKey.loadLicenseFile("license.xml");

        File pdfOutFile = new File("out_office.pdf");
        File demoFile = new File("input.docx");
        // converts pages between 1 to 8
        OfficeConverter.convertOfficeDocumentToPdf(demoFile, pdfOutFile, new OfficeDocumentConverterProperties()
                .setPageRange(new OfficePageRange().addPageSequence(1, 8)));
    }
}
