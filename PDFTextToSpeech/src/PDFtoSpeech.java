import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.sun.speech.freetts.*;
import java.io.*;



public class PDFtoSpeech {

	public static void main(String[] args) {
		PDDocument pdDocument;
		Voice voice;
		VoiceManager voiceManager;
		try{
			File file = new File("CrackCodeInterviews.pdf");
			pdDocument = PDDocument.load(file);
			
			PDFTextStripper pdfTextStripper = new PDFTextStripper();
			String inputText = pdfTextStripper.getText(pdDocument);
			
			voiceManager = VoiceManager.getInstance();
			voice = voiceManager.getVoice("kevin16");
			
			voice.allocate();
			voice.speak(inputText);
					
			pdDocument.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
