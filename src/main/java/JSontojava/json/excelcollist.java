package JSontojava.json;

import java.util.List;

public class excelcollist {
	
	private List<excelColumns> excelColumns;

    public void setExcelColumns(List<excelColumns> excelColumns){
        this.excelColumns = excelColumns;
    }
    @Override
	public String toString() {
		return "excelcollist [excelColumns=" + excelColumns + "]";
	}
	public List<excelColumns> getExcelColumns(){
        return this.excelColumns;
    }

}
