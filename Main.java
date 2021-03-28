import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flipH = false;
    boolean flipV = false;

    Scanner myObj = new Scanner(System.in);


    String sequence = myObj.nextLine(); 

    for (int i = 0; i< sequence.length(); ++i){
      if(sequence.charAt(i) == 'H'){
        flipH = !flipH;
      } else {
        flipV = !flipV;
      }
    }
    int[][] grid = {{1,2},{3,4}};  


    if(flipH){
      flipH(grid);
    }

    if(flipV){
      flipV(grid);
    }

    printGrid(grid);

  }

  public static int[][] flipH(int[][] grid){

    int[] temp = grid[0];
    grid[0] = grid[1];
    grid[1] = temp;

    return grid;
    
  }

  public static int[][] flipV(int[][] grid){

      int temp = grid[0][0];
      grid[0][0] = grid[0][1];
      grid[0][1] = temp;
      int temp2 = grid[1][0];
      grid[1][0] = grid[1][1];
      grid[1][1] = temp2;

      return grid;
  }

  public static void printGrid(int[][] grid){
    System.out.println(grid[0][0] + " " + grid[0][1]);
    System.out.println(grid[1][0] + " " + grid[1][1]);

  }
  
}