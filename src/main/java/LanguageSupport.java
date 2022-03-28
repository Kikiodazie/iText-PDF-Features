import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.TextAlignment;

import java.io.IOException;


public class LanguageSupport {
    public static void main(String[] args) throws IOException {

    // initial actions
    LicenseKey.loadLicenseFile("/path/to/license.xml");
    com.itextpdf.layout.Document arabicPdf = new Document(new PdfDocument(new PdfWriter("/path/to/output.pdf")));

    // Arabic text starts near the top right corner of the page
    arabicPdf.setTextAlignment(TextAlignment.RIGHT);

    // create a font, and make it the default for the document
    PdfFont f = PdfFontFactory.createFont("/path/to/arabicFont.ttf");
    arabicPdf.setFont(f);

    // add content: (as-salaamu ‘aleykum - peace be upon you)
    arabicPdf.add(new Paragraph("\u0627\u0644\u0633\u0644\u0627\u0645 \u0639\u0644\u064A\u0643\u0645"));

    arabicPdf.close();

    }
}
