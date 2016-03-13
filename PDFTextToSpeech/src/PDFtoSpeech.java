import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;


public class PDFtoSpeech {

	public static void main(String[] args) {
		PDDocument inputDocument = null;
		try{
			File file = new File("CrackCodeInterviews.pdf");
			inputDocument = PDDocument.load(file);
			
			PDDocumentInformation inputDocInfo = inputDocument.getDocumentInformation();
			System.out.println(inputDocument.getNumberOfPages());
			System.out.println(inputDocInfo.getAuthor());
		}
		catch(Exception e){
			
		}

	}

}
