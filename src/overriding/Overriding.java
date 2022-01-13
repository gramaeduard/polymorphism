package overriding;

import java.util.ArrayList;


public class Overriding {

	
	public static void main(String[] args) {

       Person person = new Person();
       
       SoftwareDeveloper softwaredeveloper = new SoftwareDeveloper();
       
       Gardener gardener = new Gardener();
       
      ArrayList<Person> workers = new ArrayList();
      
      workers.add(person);
      workers.add(softwaredeveloper);
      workers.add(gardener);
      
      for(int i = 0; i < 3; i++ ) {
    	  workers.get(i).work();
      }
       

	}

}
