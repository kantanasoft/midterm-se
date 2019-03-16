import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SelectDetailRoom {
	public String selectOptionRoom(){
		String resultOptionRoom = new String();
		
		try{
			System.out.println("--- Option Room ---");
			System.out.println(" A.) Smoking");
			System.out.println(" B.) No smoking");
			System.out.println(" C.) Big bed ");
			System.out.println(" D.) Pair bed ");
	    	System.out.println("Select Option Room : ");
	    	BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	    	String typeRoom = bufferRead.readLine();
	    	if(typeRoom.equals("A")){
	    		resultOptionRoom = "SMOKING";
	    	}
	    	else if(typeRoom.equals("B")){
	    		resultOptionRoom = "NO_SMOKING";
	    	}
	    	else if(typeRoom.equals("C")){
	    		resultOptionRoom = "BIG_BED";
	    	}
	    	else if(typeRoom.equals("D")){
	    		resultOptionRoom = "PAIR_BED";
	    	}
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
		
		return resultOptionRoom;
	}
}
