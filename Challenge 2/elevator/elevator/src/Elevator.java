import java.util.Scanner;

public class Elevator {
    int minFloor;
    int maxFloor;
    int currentFloor;
    Scanner scan = new Scanner(System.in);

    public Elevator(int minFloor, int maxFloor){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = minFloor;
    }

    public void start() {
        while (true) {
            System.out.print("Go to floor: ");
            int inputFloor= scan.nextInt();

            if (inputFloor >= minFloor && inputFloor <= maxFloor) {
                while(currentFloor != inputFloor) {
                    System.out.println("Elevator at floor "+(currentFloor));
                    if (currentFloor-inputFloor < 0) {
                        currentFloor++;
                    }
                    else if(currentFloor-inputFloor > 0) {
                        currentFloor--;
                    }
                }
                System.out.println("Elevator stopped at "+currentFloor);
            }
            else if (inputFloor == -1) {
                System.exit(1);
            }
            else {
                System.out.println("Please enter the between " + minFloor +"-"+maxFloor);
            }

        }
    }
}
