public class robot_v1 {

    //robot starts at (0,0), can move up, down, left, right within a 5x5 grid.
    static int[] robot_position = {0, 0};
    
    //simple 5x5 grid.
    static int grid_size = 5;
    
   //loop, taking user input for movement commands.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        //loop, taking user input for movement commands.
        while (true) {
            System.out.print("enter command (up/down/left/right/quit): ");
            String command = scanner.nextLine();

            if (command.equals("quit")) {
                break;
            }

            switch (command) {
                case "up":
                    if (robot_position[1] < grid_size - 1) {
                        robot_position[1]++;
                    }
                    break;
                case "down":
                    if (robot_position[1] > 0) {
                        robot_position[1]--;
                    }
                    break;
                case "left":
                    if (robot_position[0] > 0) {
                        robot_position[0]--;
                    }
                    break;
                case "right":
                    if (robot_position[0] < grid_size - 1) {
                        robot_position[0]++;
                    }
                    break;
                default:
                    System.out.println("Invalid command.");
            }

            System.out.println("Robot position: (" + robot_position[0] + ", " + robot_position[1] + ")");
        }
        scanner.close();
    }
    
}
