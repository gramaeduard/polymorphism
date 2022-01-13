package polymorhism.overloading;

public class Playground {

	public static void letsplaybasketball(String oneplayer ) {
		System.out.println(oneplayer+" play basketball");
	}
	
	public static void letsplaybasketball(String firstplayer, String secondplayer ) {
		System.out.println(firstplayer+" and "+secondplayer+" plays basketball");
	}
	public static void main(String[] args) {

       String Edward = "Edward";
       String Alex   = "Alex";
       letsplaybasketball(Edward);
       letsplaybasketball(Edward,Alex);
       
	}

}
