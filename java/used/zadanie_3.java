import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class zadanie_3 {
    static ArrayList<people> p;
    public static void main(String[] args) throws ParseException {
        Scanner c = new Scanner(System.in);
        p = new ArrayList<>();
        ArrayList<String> n =new ArrayList<>();
        for(int i = 0;i<14;i++){
            p.add(new people(c.nextInt(),(c.next()+" "+c.next()),c.next(),c.next()));
            n.add(c.next()+" "+c.next());
        }
        for(String s:n){
            int a=Integer.parseInt(s.split("\s")[0]);
            int b=Integer.parseInt(s.split("\s")[1]);
            for(people f:p){
                if(f.id==a){
                    for(people e:p){
                        if(e.id==b){
                            f.child.add(e);
                        }
                    }
                }
            }
        }
        for(people a:p){
            if(a.child.size()<1)continue;
            System.out.println(a.name);
            a.child.forEach(s->System.out.println("        "+s.name));
        }
        System.out.println();
        System.out.println();
        System.out.println();
        int maxCS=0;
        people s = p.get(0);
        p.sort((s1,s2)->{if(s.date.before(s2.date)){return 1;}else return -1;});
        s.print(0);
    }
    public static class people{
        int id;
        String name;
        String gender;
        Date date;
        ArrayList<people> child = new ArrayList<>();
        public people(int i,String n, String g, String d) throws ParseException {
            this.id=i;
            this.name=n;
            gender=g;
            date=new SimpleDateFormat("dd.MM.yyyy").parse(d);
        }
        public void print(int lvl){
            String out = "";
            if(lvl>0){
                for(int x=0;x<lvl;x++){
                    out+="      ";
                }
            }
            String s=" ";
            for(people pe:p){
                if(pe==this){
                    continue;
                }
                if(pe.child.containsAll(this.child)){
                    s+=pe.name;
                    break;
                }
            }
            System.out.println(out+name+s);
            if(child.size()<1)return;
            for(people p:child){
                p.print(lvl+1);
            }
        }
    }
}