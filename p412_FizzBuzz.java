
/**
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. 
 * Grid cells are connected horizontally/vertically (not diagonally). 
 * The grid is completely surrounded by water, and there is exactly one island 
 * (i.e., one or more connected land cells). 
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island). 
 * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. 
 * Determine the perimeter of the island.
 * 
 * @author Suanlafen
 *
 */

public class IslandPremiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] grid = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		//int[][] grid = new int[][]{{1}};
		int[][] grid = new int[][]{{0,1,0},{0,0,0}};
		System.out.println(islandPerimeter(grid));
	}
	
    public static int islandPerimeter(int[][] grid) {
    	int per=0;
    	int endi=grid.length-1;
    	int endj=grid[0].length-1;
    	if(grid.length==1){
    		for(int j=0; j<=endj; j++){
    			if(grid[0][j]==1)
    				per+=2;
    		}
    		return per+2;
    	}
    	if(grid[0].length==1){
    		for(int i=0; i<=endi; i++){
    			if(grid[i][0]==1)
    				per+=2;
    		}
    		return per+2;
    	}
        for(int i=0; i<=endi; i++){
        	for(int j=0; j<=endj; j++){
        		if(grid[i][j]==1){
        			if(i==0||i==endi){
        				if(j==0||j==endj){
        					per+=2;
        					if(i==0&&grid[i+1][j]==0 || i==endi&&grid[i-1][j]==0)
        						per++;
        					if(j==0&&grid[i][j+1]==0 || j==endj&&grid[i][j-1]==0)
        						per++;
        				}
        				else{
        					per++;
        					if(i==0&&grid[i+1][j]==0 || i==endi&&grid[i-1][j]==0)
        						per++;
        					if(grid[i][j-1]==0)
        						per++;
        					if(grid[i][j+1]==0)
        						per++;
        				}
        			}
        			else if(j==0||j==endj){
        				per++;
        				if(grid[i-1][j]==0)
        					per++;
        				if(grid[i+1][j]==0)
        					per++;
        				if(j==0&&grid[i][j+1]==0 || j==endj&&grid[i][j-1]==0)
        					per++;
        			}
        			else{
        				if(grid[i-1][j]==0)
        					per++;
        				if(grid[i+1][j]==0)
        					per++;
        				if(grid[i][j-1]==0)
        					per++;
        				if(grid[i][j+1]==0)
        					per++;
        			}
        		}
        	}
        }
        return per;
    }
}
