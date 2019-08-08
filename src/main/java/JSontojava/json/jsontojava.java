package JSontojava.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsontojava {
	public excelcollist change() throws JsonParseException, JsonMappingException, IOException {
//		JSONParser parser = new JSONParser();

		/*
		 * try {
		 * 
		 * Object obj = parser.parse(new FileReader(
		 * "G:\\Spring_WorkSpace\\json\\src\\main\\java\\resources\\excelcolumns.json"))
		 * ;
		 * 
		 * JSONObject jo = (JSONObject) obj; System.out.println("this"+jo);
		 * 
		 * 
		 * JSONArray a = (JSONArray) parser.parse(new FileReader(
		 * "G:\\Spring_WorkSpace\\json\\src\\main\\java\\resources\\excelcolumns.json"))
		 * ; System.out.println("this is array"+a.toString()); for (Object o : a) {
		 * JSONObject person = (JSONObject) o; }
		 * 
		 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } catch (ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		/*
		 * System.out.println("a"); ObjectMapper mapper = new ObjectMapper();
		 * System.out.println("b"); InputStream is =
		 * Object.class.getResourceAsStream("excelcolumns.json");
		 * System.out.println("c"+is); excelcollist ex = mapper.readValue(is,
		 * excelcollist.class); System.out.println("d"); System.out.println("this is me"
		 * + ex);
		 */
		 
		ObjectMapper objectMapper = new ObjectMapper();
		excelcollist excel = objectMapper.readValue(new File("G:\\Spring_WorkSpace\\json\\src\\main\\java\\resources\\excelcolumns.json"), excelcollist.class);
		//excelcollist excel1 = objectMapper.readValue(new File(getClass().getClassLoader().getResource("excelcolumns.json").getFile()), excelcollist.class);
		System.out.println(excel.toString());
		System.out.println(excel);
		return excel;

	}
	
	
}
