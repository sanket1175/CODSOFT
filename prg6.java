import java.io.*;  
   
public class prg6   
{  
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				
        System.out.print("Enter the string : ");
				
        String line = br.readLine();
				
        System.out.println("\n"+line);
				
        int count = 0;  
				
				String words[] = line.split(" ");  
				
				count = count + words.length;  
       
          
        System.out.println("Number of words present in given string: " + count);  
				 
    }  
}