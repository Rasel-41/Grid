import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Grid grid = new Grid(3, 3);
        grid.add(0, 0, "Start");
        grid.add(1, 1, "Middle");
        grid.add(2, 2, "End");
        grid.getDescription(2,2);
        String name = grid.getDescription(2,2);
        System.out.println(name);
        System.out.println(grid.getDescribedLocations());


        }
    }




