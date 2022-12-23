package OOP;

public class Game {
    public static void main(String[] args) {
        Robot x = new Robot();
        System.out.println("Now, you are staying on (0;0) position, your goal it is " + "(" + x.getX(8) + ";" + x.getY(8) + ")" + " position");
        x.stepForward();

    }
    public static class Robot {
        private int x;
        private int y;

        public enum Direction {
            UP,
            DOWN,
            LEFT,
            RIGHT
        }

        public int getX(int x) {
            this.x = x;  // текущая координата X
            return this.x;
        }

        public int getY(int y) {
            this.y = y; // текущая координата Y
            return this.y;

        }

        public Direction getDirection() {
            return Direction.UP;
        }

        public void turnLeft() {
            System.out.println("Turn Left"); // повернуться на 90 градусов против часовой стрелки
        }

        public void turnRight() {
            System.out.println("Turn Right"); // повернуться на 90 градусов за часовой стрелки
        }

        //(x != 0; y == 0)
        public void show(int i, Direction e_num){
            System.out.println("Step " + (i + 1) + " Coordinates: " + "(" + (i + 1) + ";" + 0 + ") " + "Direction: " + e_num);
        }

        public void showFinish(int i ){
            System.out.println("Step " + (i + 1) + " Coordinates: " + "(" + (i + 1) + ";" + 0 + ") " + "Direction: " + "Stop");
        }

        public void bodyFunct(int priv_x, Direction e_num){
            int i = 0;
            while (i<priv_x-1){
                show(i,e_num);
                i++;
            }
            showFinish(i );
        }


        ////(x == 0; y != 0)
        public void showY(int i, int priv_x, Direction e_num){
            System.out.println("Step " + (i + 1) + " Coordinates: " + "(" + priv_x + ";" + (i + 1) + ") " + "Direction: " + e_num);
        }

        public void showFinishY(int i, int priv_x){
            System.out.println("Step " + (i + 1) + " Coordinates: " + "(" + priv_x + ";" + (i + 1) + ") " + "Direction: " + "Stop");
        }

        public void bodyFunctY(int priv_x, int priv_y, Direction e_num){
            int i = 0;
            while (i<priv_y-1){
                showY(i, priv_x,e_num);
                i++;
            }
            showFinishY(i, priv_x);
        }


        ////(x != 0; y != 0)
        public void showFinish(int priv_x, int priv_y, Direction e_num){
            int i =0;
            while (i<priv_x-1){
                show(i, e_num);
                i++;
            }
            showFinish(i);
            int k = 0;
            turnLeft();
            while (k<priv_y-1){
                System.out.println("Step " + (i + 2) + " Coordinates: " + "(" + priv_x + ";" + (k + 1) + ") " + "Direction: " + Direction.UP);
                i++;
                k++;
            }
            System.out.println("Step " + (i + 2) + " Coordinates: " + "(" + priv_x + ";" + (k + 1) + ") " + "Direction: " + "Stop");
        }


        public void stepForward() {
            if (this.x == 0 && this.y == 0){
                System.out.println("It is Endpoint");
            } else if (this.x != 0 && this.y == 0){
                turnRight();
                bodyFunct(this.x, Direction.RIGHT);
            } else if (this.x == 0 && this.y != 0){
                System.out.println(Direction.UP);
                bodyFunctY(this.x,this.y, Direction.UP);
            }else {
                turnRight();
                showFinish(this.x, this.y, Direction.RIGHT);
            }
        }
    }
}










