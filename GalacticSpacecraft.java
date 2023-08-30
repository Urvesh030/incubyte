import java.util.*;
public class GalacticSpacecraft {
    private int x, y, z;
    private char direction;

    public GalacticSpacecraft(int x, int y, int z, char direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void moveForward() {
        switch (direction) {
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'U':
                z++;
                break;
            case 'D':
                z--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case 'N':
                y--;
                break;
            case 'S':
                y++;
                break;
            case 'E':
                x--;
                break;
            case 'W':
                x++;
                break;
            case 'U':
                z--;
                break;
            case 'D':
                z++;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }

    public void turnUp() {
        if (direction == 'N' || direction == 'S'|| direction == 'W' || direction == 'E') {
            direction = 'U';
        }
    }

    public void turnDown() {
        if (direction == 'N' || direction == 'S'|| direction == 'W' || direction == 'E') {
            direction = 'D';
        }
    }

    public void executeCommands(char[] commands) {
        {
            for(int i=0 ;i <commands.length;i++){
                switch (commands[i]) {
                    case 'f':
                        moveForward();
                        break;
                    case 'b':
                        moveBackward();
                        break;
                    case 'l':
                        turnLeft();
                        break;
                    case 'r':
                        turnRight();
                        break;
                    case 'u':
                        turnUp();
                        break;
                    case 'd':
                        turnDown();
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
     
       
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the intial value of x :");
        int x=sc.nextInt();
        System.out.println("Enter the intial value of y:");
        int y=sc.nextInt();
        System.out.println("Enter the intial value of z:");
        int z=sc.nextInt();
        System.out.println("Enter the intial value of direction:");
        char direction =sc.next().charAt(0);
       
        System.out.println("Enter the commands");
        
        char[] commands=new char[20];
        char i=sc.next().charAt(0);
        int n=0;
       while(i=='f'||i=='b'||i=='r'||i=='l'||i=='u'||i=='d') {
            commands[n]=i;
            i=sc.next().charAt(0);
            n++;
        }
        GalacticSpacecraft Chandrayaan_3 = new GalacticSpacecraft(x,y,z,direction);
        Chandrayaan_3.executeCommands(commands);

        System.out.println("Final Position: (" + Chandrayaan_3.x + ", " + Chandrayaan_3.y + ", " + Chandrayaan_3.z + ")");
        System.out.println("Final Direction: " + Chandrayaan_3.direction);
    }
}

