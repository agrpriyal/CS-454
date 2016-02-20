package cs454.webCrawler;

import java.io.File;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

public class demo {
	public static void main( String[] args ) throws IOException, SAXException, TikaException
    {
		File file = new File("C:/Users/Volfurious/Desktop/test.html");//file path
		WordCounter word = new WordCounter(file);
		System.out.println(word.getWords());
    }
}
