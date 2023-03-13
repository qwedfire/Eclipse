package tw.brad.api;

import java.io.BufferedReader;
import java.io.FileReader;

public class BradUtils {
	public static String loadView(String view) throws Exception{
		String viewFile=
			String.format(
					"E:\\Eclipse\\Web58\\src\\main\\webapp\\views\\%s.html", 
					view);
		FileReader reader=new FileReader(viewFile);
		BufferedReader br=new BufferedReader(reader);
		String line=null;StringBuffer sb=new StringBuffer();
		while((line=br.readLine())!=null) {
			sb.append(line);
		}
		return sb.toString();
	}
}
