import edu.princeton.cs.algs4.WeightedQuickUnionUF;

// USE CLASS FROM COURSE FOR DATA STRUCTURE
public class Percolation {
    private WeightedQuickUnionUF weightedUF;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n < 0) throw new IllegalArgumentException();

        // n-by-n grid + virtual top and bottom node
        weightedUF = new WeightedQuickUnionUF(n * n + 2);

    }

    // // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        // check open neighbors
        System.out.println("Opening " + row + " / " + col);

//        // check top neighbor if not last row
//        if (row > 0) {
//            if (this.isOpen(row - 1, col)) {
//                System.out.println("TOP");
//            }
//            ;
//        }
//
//        // check bottom neighbor of not last row
//        if (row < this.grid[0].length - 1) {
//            if (this.isOpen(row + 1, col)) {
//                System.out.println("BOTTOM");
//            }
//
//            // check left neighbor if not first column
//            if (col > 0) {
//            }
//            if (this.isOpen(row, col - 1)) {
//
//                System.out.println("LEFT");
//            }
//        }
//
//        // check right neighbor if not last column
//        if (col < this.grid[0].length - 1) {
//            if (this.isOpen(row, col + 1)) {
//                System.out.println("RIGHT");
//            }
//        }
//
//
//        // open as unconnected site
//        this.grid[row][col] = row * this.grid[0].length + col + 1;
    }

//    // // is the site (row, col) open?
//    public boolean isOpen(int row, int col) {
//        return this.grid[row][col] != 0;
//    }
//
//    // // is the site (row, col) full?
//    public boolean isFull(int row, int col) {
//        return this.grid[row][col] == 0;
//    }

    // // returns the number of open sites
    // public int numberOfOpenSites();

    // // does the system percolate?
    // public boolean percolates();

    // test client (optional)
    public static void main(String[] args) {
        Percolation perc = new Percolation(5);
        perc.open(2, 2);
        perc.open(2, 3);
        perc.open(2, 4);
        perc.open(0, 0);
        perc.open(0, 4);
        perc.open(4, 0);
        perc.open(4, 4);


        for (int i = 0; i < 5 * 5 + 2; i++) {
            System.out.print(perc.weightedUF + "\t ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
