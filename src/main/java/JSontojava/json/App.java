package JSontojava.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * Hello world!
 *
 */
public class App 
{
	static ArrayList<String> excelcolnames=new ArrayList();
	static ArrayList<String> dtocolnames=new ArrayList();	
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException
    {
        System.out.println( "Hello World!" );
        jsontojava a = new jsontojava();
        excelcollist e =a.change();
        System.out.println(e.getExcelColumns());
        List<excelColumns> l= e.getExcelColumns();
        for(excelColumns ec:l) {
        	if(ec.getIsTrue()) {
        	excelcolnames.add(ec.getExcelcolumn());
        	dtocolnames.add(ec.getDtoexlname());
        }
        }
        App ap = new App();
        ap.x();
    }
    public void x() {
    	System.out.println("These are excel columns : "+excelcolnames.toString());
    	System.out.println("These are dto variable names : "+dtocolnames.toString());
    }
    
}
