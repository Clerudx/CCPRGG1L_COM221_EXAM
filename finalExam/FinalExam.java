public class FinalExam {

    static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) throws Exception {

      // Print the words in their given pattern.

      char[][] array = {
              { 'A', 'S', 'R', 'S', 'S', 'U', 'U', 'I', 'O', 'L', 'M', 'A', 'U', 'Z', 'F' },
              { 'Q', 'B', 'N', 'E', 'H', 'U', 'W', 'E', 'B', 'E', 'S', 'K', 'G', 'I', 'T' },
              { 'B', 'A', 'N', 'A', 'N', 'A', 'Q', 'U', 'E', 'N', 'U', 'R', 'N', 'U', 'H' },
              { 'Q', 'U', 'K', 'N', 'Q', 'L', 'S', 'L', 'X', 'O', 'M', 'A', 'J', 'S', 'G' },
              { 'L', 'T', 'W', 'O', 'C', 'E', 'H', 'I', 'R', 'V', 'L', 'W', 'M', 'L', 'I' },
              { 'M', 'I', 'T', 'U', 'V', 'Z', 'S', 'E', 'O', 'E', 'Y', 'B', 'G', 'E', 'L' },
              { 'Q', 'W', 'K', 'L', 'E', 'C', 'U', 'J', 'X', 'M', 'N', 'F', 'W', 'K', 'G' },
              { 'K', 'L', 'G', 'Y', 'N', 'Q', 'P', 'A', 'L', 'B', 'A', 'U', 'X', 'T', 'I' },
              { 'M', 'O', 'U', 'H', 'E', 'B', 'M', 'T', 'M', 'E', 'J', 'I', 'R', 'F', 'M' },
              { 'Y', 'U', 'T', 'B', 'P', 'U', 'M', 'H', 'Z', 'R', 'D', 'T', 'F', 'Y', 'N' },
              { 'S', 'J', 'R', 'K', 'J', 'S', 'B', 'X', 'I', 'S', 'S', 'D', 'P', 'Y', 'A' },
              { 'P', 'A', 'D', 'Y', 'I', 'N', 'U', 'X', 'D', 'R', 'G', 'Q', 'H', 'L', 'S' },
              { 'B', 'R', 'L', 'P', 'Q', 'T', 'I', 'H', 'O', 'F', 'S', 'U', 'M', 'R', 'Y' },
              { 'K', 'S', 'O', 'N', 'I', 'C', 'C', 'U', 'P', 'P', 'A', 'R', 'F', 'M', 'X' },
              { 'D', 'W', 'O', 'T', 'M', 'M', 'Q', 'B', 'O', 'U', 'H', 'J', 'L', 'G', 'C' }
      };

      // =============================================================
      // BANANAQUE - (10 points)
      System.out.println(" ");
      System.out.println("1. BANANAQUE ");

      for (int i = 0; i < array.length; i++) {
          for (int j = 0; j < array.length; j++) {
              if (j <= 8 && i == 2) {
                  System.out.print(array[i][j]);
              }
              else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }

      System.out.println("--------------------------------------------------------------------------");

      // =============================================================
      // FRAPPUCCINO - (10 points)
      System.out.println(" ");
      System.out.println("2. FRAPPUCCINO ");

      for (int i = 0; i < array.length; i++) {
          for (int j = 0; j < array.length; j++) {
              if ((j <= 12 && j >= 2) && i == 13) {
                  System.out.print(array[i][j]);
              }
              else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }

      System.out.println("--------------------------------------------------------------------------");

      // =============================================================
      // NOVEMBER - (10 points)
      System.out.println(" ");
      System.out.println("3. NOVEMBER ");

      for (int i = 0; i < array.length; i++) {
          for (int j = 0; j < array.length; j++) {
              if ((i <= 9 && i >= 2) && j == 9) {
                  System.out.print(array[i][j]);
              }
              else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }

      System.out.println("--------------------------------------------------------------------------");

      // =============================================================
      // TIKTOK - (10 points)
      System.out.println(" ");
      System.out.println("4. TIKTOK ");

      int irow = 7;
      int icolumn = 0;
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if (i >= 13) {
                continue;
            }
            else if (i == irow && j == icolumn) {
              System.out.print(array[i][j]);
              irow++;
              icolumn++;
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    System.out.println("--------------------------------------------------------------------------");

      // =============================================================
      // BARBEQUE - (10 points)
      System.out.println(" ");
      System.out.println("5. BARBEQUE ");

      int irow1 = 5;
      int icolumn1 = 7;
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if (i >= 13) {
                continue;
            }
            else if (i == irow1 && j == icolumn1) {
              System.out.print(array[i][j]);
              irow1++;
              icolumn1--;
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    System.out.println("--------------------------------------------------------------------------");


      // =============================================================
      // HUWEBES - (10 points)
      System.out.println(" ");
      System.out.println("6. HUWEBES ");

      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if ((j <= 10 && j >= 4) && i == 1) {
                System.out.print(array[i][j]);
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    System.out.println("--------------------------------------------------------------------------");

      // =============================================================
      // SANMIGLIGHT - (10 points)
      System.out.println(" ");
      System.out.println("7. SANMIGLIGHT ");

      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if (i == 0 || i >= 12) {
                continue;
            }
            else if (j == 14) {
                System.out.print(array[i][j]);
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
      }

      System.out.println("--------------------------------------------------------------------------");

      // =============================================================
      // FINALEXAM - (10 points)
      System.out.println(" ");
      System.out.println("8. FINALEXAM ");

      int irow2 = 0;
      int icolumn2 = 14;
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if (j >= 6 && (i == irow2 && j == icolumn2)) {
                System.out.print(array[i][j]);
                irow2++;
                icolumn2--;
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
      }

      System.out.println("--------------------------------------------------------------------------");

      // =============================================================
      // LUNES - (10 points)
      System.out.println(" ");
      System.out.println("9. LUNES ");

      int irow3 = 0;
      int icolumn3 = 4;
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if (i == irow3 && j == icolumn3) {
                System.out.print(array[i][j]);
                irow3++;
                icolumn3--;
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
      }

      System.out.println("--------------------------------------------------------------------------");

      // =============================================================
      // SIOMAI - (10 points)
      System.out.println(" ");
      System.out.println("10. SIOMAI ");

      int irow4 = 3;
      int icolumn4 = 6;
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if (j <= 11 && (i == irow4 && j == icolumn4)) {
                System.out.print(array[i][j]);
                irow4++;
                icolumn4++;
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
      }

      System.out.println("--------------------------------------------------------------------------");
  }
}
