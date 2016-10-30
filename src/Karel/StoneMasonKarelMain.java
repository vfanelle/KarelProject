package Karel;

import kareltherobot.Directions;
import kareltherobot.World;


public class StoneMasonKarelMain implements Directions {
	public StoneMasonKarelMain(int i, int j, Direction east, int k) {
		// TODO Auto-generated constructor stub
	}
public class TESTStoneMasonKarelMain {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		World.readWorld("sample_column_world.kwld");
		World.setVisible(true);
		World.setDelay(25);
				
		StoneMasonKarelMain karel1 = new StoneMasonKarelMain(1, 1, East, 0);
		karel1.fixTheWall();
		
		
		
	}
	public TESTStoneMasonKarel(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
		}

		public void fixTheWall(){
		turnLeft();
		if(noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			move();
			if (noBeepersPresent()) {
				putBeeper();
			}
		moveDownColumn();
		moveToNextColumn();
		}

		private void moveDownColumn(){
		turnAround();
		while(frontIsClear()) move();
		}

		private void turnAround(){
		turnLeft();
		turnLeft();
		}

		private void moveToNextColumn(){
			for (int i=0; i<4; i++) move();
		}


		

}

