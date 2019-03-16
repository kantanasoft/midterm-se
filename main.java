import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
	public static void main(){
		System.out.println("Nitaya Hotel Bangkok");
		
        try{
        	System.out.println("Select Type Room : ");
        	BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        	String typeRoom = bufferRead.readLine();
        	
        	System.out.println("Select Range Date : ");
        	bufferRead = new BufferedReader(new InputStreamReader(System.in));
        	String rangeDate = bufferRead.readLine();
        	
        	System.out.println("Select Type Amount Customer : ");
        	bufferRead = new BufferedReader(new InputStreamReader(System.in));
        	String amountCustomer = bufferRead.readLine();
        	
        	SelectDetailRoom myObject = new SelectDetailRoom();
        	String resultOptionRoom =  myObject.selectOptionRoom();
        	
        	System.out.println("Option Room Hotel = " + resultOptionRoom);
        	
        }catch(Exception e){
        	System.out.println(e);
        }
		
	}
}
