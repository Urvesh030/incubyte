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
        if (direction == 'N' || direction == 'S'|| direction=='W'|| direction=='E') {
            direction = 'U';
        }
    }

    public void turnDown() {
        if (direction == 'N' || direction == 'S' ||direction=='W'|| direction=='E') {
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
       int  x =0, y = 0, z = 0;
       char  direction = 'N';
        char[] commands = {'f', 'r', 'u','b','l' };

        GalacticSpacecraft Chandrayaan_3 = new GalacticSpacecraft(x,y,z,direction);
        Chandrayaan_3 .executeCommands(commands);

        System.out.println("Final Position: (" + Chandrayaan_3 .x + ", " + Chandrayaan_3 .y + ", " + Chandrayaan_3 .z + ")");
        System.out.println("Final Direction: " + Chandrayaan_3 .direction);
    }
}


