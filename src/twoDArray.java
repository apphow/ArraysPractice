public class twoDArray {

    public static void main(String[] args) {

        int[][] twoD = {{25, 18, 4},
                         {3, 7, 3},
                         {5, 45, 99}
        };

        int[][] twoDs = new int[3][3];
        //           [row][column]
        twoDs[0][0] = 25;
        twoDs[0][1] = 18;
        twoDs[0][2] = 4;
        twoDs[1][0] = 3;
        twoDs[1][1] = 7;
        twoDs[1][2] = 3;
        twoDs[2][0] = 5;
        twoDs[2][1] = 45;
        twoDs[2][2] = 99;
        System.out.println("______________________________________");

        for (int i = 0; i < twoDs.length; i++) {
            for (int j = 0; j < twoDs.length; j++) {
                    System.out.println(twoDs[i][j]);
                }
            }
        }
    }
