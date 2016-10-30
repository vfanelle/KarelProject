package Karel;

public class TESTStoneMasonKarel extends UrRobot{

	


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
	

			
