import java.util.ArrayList;
import java.util.Scanner;

public class zadanie_13 {
    public static void main(String[] s){
        Scanner console = new Scanner(System.in);
        System.out.println("Points count");
        int count = console.nextInt();
        ArrayList<Cell> cells = new ArrayList<>();
        for(int x=1;x<count+1;x++){
            cells.add(new Cell(x));
        }
        ArrayList<String> tmp;
        for(int x=1;x<count+1;x++){
            tmp = new ArrayList<>();
            System.out.println("Print vals for "+x);
            Cell c = null;
            for(Cell cell:cells){
                if(cell.id==x){
                    c=cell;
                }
            }
            while(true) {
                String next = console.nextLine();
                if(next.startsWith("done")){
                    break;
                }
                if(next=="")continue;
                tmp.add(next);
            }
            for(String id:tmp){
                for(Cell cell:cells){
                if(cell.id==Integer.parseInt(id)){c.contains.add(cell);}
                }
            }
            c.contains.size();
        }
        for(Cell cell:cells){
            if(cell.id==1){System.out.println(cell.all());
            for(String str:cell.sign()){
                System.out.println(str);
            }
            }
        }
    }
}

class Cell{
    ArrayList<Cell> contains;
    public int id;
    public Cell(int a){
        this.id=a;
        this.contains=new ArrayList<>();
    }
    public int all(){
        int rtn=0;
        if(contains.size()==0){return 0;}
        for(Cell c : contains){
            if(c.all()==0){
                rtn++;
            }else{
                rtn+=c.all();
            }
        }
        return rtn;
    }
    public ArrayList<String> sign(){
        ArrayList<String> rtn=new ArrayList();
        if(contains.size()==0){
            String s = "|"+id+"|";
            rtn.add(s);
            return rtn;
            }
        for(Cell c : contains){
            rtn.addAll(c.sign());
        }
        ArrayList<String> r = new ArrayList<>();
        for (String s:rtn){
            r.add("|"+id+"|"+s);
        }
        return r;
    }
}
