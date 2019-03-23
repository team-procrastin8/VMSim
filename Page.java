
public class Page {
	String pageNum;
	String frameNum;
	String offset;
	String data;
	
	public Page(){
		
	}
	
	public Page(String pageNum, String data){
		this.pageNum = pageNum;
		this.data = data;
	}
	
	public String getPageNum(){
		return pageNum;
	}
	
	public String getFrameNum(){
		return frameNum;
	}
	
	public String getOffset(){
		return offset;
	}
	
	public String getData(){
		return data;
	}
	
	public void setData(String input){
		data = input;
	}
}
