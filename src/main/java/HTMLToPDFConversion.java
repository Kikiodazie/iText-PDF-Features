import com.itextpdf.html2pdf.HtmlConverter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HTMLToPDFConversion {
    private static final String ORIG = "src/main/resources/input.html";
    private static final String OUTPUT_FOLDER = "GeneratedPDFs/";

    public static void main(String[] args) throws IOException {
        File htmlSource = new File(ORIG);
        File pdfDest = new File(OUTPUT_FOLDER + "html_to_pdf_output.pdf");
        HtmlConverter.convertToPdf(new FileInputStream(htmlSource), new FileOutputStream(pdfDest));
    }
}
