package cs454.webCrawler;

import java.io.File;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.json.simple.JSONArray;
import org.xml.sax.SAXException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class demo {
	static JSONArray jsonArray = new JSONArray();
	
	public static void main( String[] args ) throws IOException, SAXException, TikaException
    {
		File file = new File("C:/Users/Volfurious/Desktop/test.html");//file path
		WordCounter word = new WordCounter(file);
		//System.out.println(word.getJson());
		
		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		String pretJson = prettyGson.toJson(word.getJson());
		System.out.println(pretJson);
    }
}
