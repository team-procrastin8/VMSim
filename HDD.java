import java.util.Scanner;
import java.io.File;
public class HDD {
	static Page[] hdd;
	int size = 256;
	
	public HDD()throws Exception{
		hdd = new Page[256];
		HDD.run();
	}
	
	public static void run() throws Exception{
		File dir = new File("page_files");
		int count = 0;
		for (File file : dir.listFiles()){
			
			Scanner reader = new Scanner(file);
			String name = file.getName().substring(0, 2);
			
			String data = "";
			while(reader.hasNextLine()){
				data += reader.nextLine();
			}
			hdd[count] = new Page(name,data);
			
			count++;
		}
	}
	
	public Page[] getPages(){
		return hdd;
	}
	
	public Page getPageData(String address){
		address = address.substring(0, 2);
		for (int i = 0; i < hdd.length; i++){
			if (hdd[i].getPageNum().equals(address)){
				return hdd[i];
			}
		}
		
		return new Page();
	}
	
	public void writePageData(String address, String data){
		address = address.substring(0, 2);
		for (int i = 0; i < hdd.length; i++){
			if (hdd[i].getPageNum().equals(address)){
				hdd[i].setData(data);
			}
		}
	}
}
