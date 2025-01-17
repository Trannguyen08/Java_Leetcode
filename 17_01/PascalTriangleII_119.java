import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for( int i = 0 ; i < rowIndex ; i++ ) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for( int j = 1 ; j < row.size() ; j++ ) {
                newRow.add(row.get(j-1) + row.get(j));
            }
            newRow.add(1);
            row = newRow;
        }
        return row;

        /* Best Solution
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for (int k = 1; k <= rowIndex; k++) {
            long next_val = prev * (rowIndex - k + 1) / k;
            res.add((int) next_val);
            prev = next_val;
        }
        return res;
        */
    }
}
