import java.util.*;

public class zadanie_1{
	public static void main(String args[]){
	Scanner console = new Scanner(System.in);
	System.out.println("Points count");
	int count = console.nextInt();
	int[][] cells = new int[count][count];
	int[][] lines = new int[count][count];
	System.out.println("Cell x y = 0/1");
	for(int i=0;i<count;i++){
		for(int j=0;j<count;j++){
			cells[i][j]=-1;
		}
	}
	for(int i=0;i<count;i++){
		for(int j=0;j<count;j++){
			if(i==j){
			System.out.println("Cell "+(i+1)+" "+(j+1)+" = 0");
			cells[i][j]=0;
			}
			else{
			if(cells[i][j]==-1){
			System.out.print("Cell "+(i+1)+" "+(j+1)+" = ");
			cells[i][j]=console.nextInt();
			if(cells[j][i]==-1){
			cells[j][i]=cells[i][j];
			}
			}else{
				System.out.println("Cell "+(i+1)+" "+(j+1)+" = "+cells[i][j]);
			}
			}
		}
	}
	String s = "/ ";
	for(int i=0;i<count;i++){
	s+=(i+1)+" ";
	}
	System.out.println(s);
	
	for(int i=0;i<count;i++){
	 String se = (i+1)+" ";
		for(int j=0;j<count;j++){
			se+=cells[i][j]+ " ";
		}
		System.out.println(se);
	}
	String src="ABCDEFGHIJKLMN";
	for(int i=0;i<count;i++){
		for(int j=0;j<count;j++){
			lines[i][j]=-1;
		}
	}
	for(int i=0;i<count;i++){
		for(int j=0;j<count;j++){
			if(i==j){
			System.out.println("line with "+src.charAt(i)+" and "+src.charAt(j)+" = 0");
			lines[i][j]=0;
			}
			else{
			if(lines[i][j]==-1){
			System.out.print("line with "+src.charAt(i)+" and "+src.charAt(j)+" = ");
			lines[i][j]=console.nextInt();
			if(lines[j][i]==-1){
			lines[j][i]=lines[i][j];
			}
			}
			}
		}
	}

	s = "/ ";
	for(int i=0;i<count;i++){
	s+=src.charAt(i)+" ";
	}
	System.out.println(s);
	
	for(int i=0;i<count;i++){
	 String se = src.charAt(i)+" ";
		for(int j=0;j<count;j++){
			se+=lines[i][j]+ " ";
		}
		System.out.println(se);
	}

	//конец майна. не трогать
  }
}