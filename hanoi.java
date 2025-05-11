import java.util.Scanner;

class TOWER {
    public static void towerofhanoi (int n, String s, String h, String d) {
        if(n==1) {
            System.out.println("transfer disks "+n+" from "+s+" to "+d);
            return;
        }
        towerofhanoi(n-1, s, d, h);
        System.out.println("transfer disks "+n+" from "+s+" to "+d);
        towerofhanoi(n-1, h, s, d);
        System.out.println("transfer disks "+n+" from "+s+" to "+d);
    }
    public static void main(String[] args) {
        int n = 5;
        towerofhanoi(n, "S", "H", "D");
    }
}

/**
 * Tower of Hanoi

public class Tower of Hanoi {

    
}
public class TowerOfHanoi {

    public static void main(String[] args) {
        int n = 4; // Number of disks
        solveTowerOfHanoi(n, 'A', 'B', 'C');
    }

    public static void solveTowerOfHanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveTowerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveTowerOfHanoi(n - 1, helper, source, destination);
    }
}  */
