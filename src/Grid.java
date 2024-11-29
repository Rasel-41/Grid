import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Grid {

    private String [][] grid;
    public Grid(int numRows,int numColumns){

        grid =new String[numRows][numColumns];
    }
    public void add(int Rows,int Columns,String description){
        grid[Rows][Columns]=description;
    }
    public String getDescription(int Row,int Columns){
        return grid[Row][Columns];
    }
    public ArrayList<Location>getDescribedLocations(){
        ArrayList<Location>DescribedLocations= new ArrayList<>();
        for(int Row = 0;Row<grid.length;Row++){
            for(int Column = 0; Column<grid[Row].length;Column++){

                if (grid[Row][Column]!=null){
                    DescribedLocations.add(new Location(Row,Column));
                }
                }
        }
        return DescribedLocations;


}
public class Location{
        private int Row;
        private  int Column;
        public Location(int Row,int Column){
            this.Row = Row;
            this.Column = Column;
        }

    public int getRow() {
        return Row;
    }

    public int getColumn() {
        return Column;
    }

    @Override
    public String toString() {
        return "Location{" +
                "Row=" + Row +
                ", Column=" + Column +
                '}';
    }
}
}

