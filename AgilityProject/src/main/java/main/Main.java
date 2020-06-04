package main;

import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		
		Cheval cheval1 = new Cheval(323, 7);
        ArrayList<Cheval> horses = new ArrayList<Cheval>();
        horses.add(cheval1); 
        //Box box1 = new Box (horses,3);
        Box box1 = new Box();
        Box.user_wants_to_empty_the_box(box1);
	}
}
