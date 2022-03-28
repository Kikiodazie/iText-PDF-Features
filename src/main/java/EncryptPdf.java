import com.itextpdf.kernel.pdf.*;

import java.io.File;

public class EncryptPdf {
    public static final String DEST = "GeneratedPDFs/encrypt_pdf.pdf";
    public static final String SRC = "src/main/resources/pdfs/hello.pdf";

    public static final String OWNER_PASSWORD = "World";
    public static final String USER_PASSWORD = "Hello";

    public static void main(String[] args) throws Exception {
        File file = new File(DEST);
        file.getParentFile().mkdirs();

        new EncryptPdf().manipulatePdf(DEST);
    }

    protected void manipulatePdf(String dest) throws Exception {
        PdfDocument pdfDoc = new PdfDocument(
                new PdfReader(SRC),
                new PdfWriter(dest, new WriterProperties().setStandardEncryption(
                        USER_PASSWORD.getBytes(),
                        OWNER_PASSWORD.getBytes(),
                        EncryptionConstants.ALLOW_PRINTING,
                        EncryptionConstants.ENCRYPTION_AES_128 | EncryptionConstants.DO_NOT_ENCRYPT_METADATA))
        );
        pdfDoc.close();
    }
}
