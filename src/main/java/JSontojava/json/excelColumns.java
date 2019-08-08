package JSontojava.json;

public class excelColumns {
	private String excelcolumn;

    private String dtoexlname;
    
    private Boolean isTrue;

    public Boolean getIsTrue() {
		return isTrue;
	}
	public void setIsTrue(Boolean isTrue) {
		this.isTrue = isTrue;
	}
	public void setExcelcolumn(String excelcolumn){
        this.excelcolumn = excelcolumn;
    }
    public String getExcelcolumn(){
        return this.excelcolumn;
    }
    public void setDtoexlname(String dtoexlname){
        this.dtoexlname = dtoexlname;
    }
    public String getDtoexlname(){
        return this.dtoexlname;
    }
}
