import java.util.ArrayList;

public class zadanie_4 {
    static ArrayList<String> finded=new ArrayList<>();
    static ArrayList<String> listed=new ArrayList<>();

    public static void main(String[] args){
        String a = args[0];
        String b = args[1];

        System.out.println(a);
        System.out.println(b);

        for(char c : a.toCharArray()){
            listed.add(c+"");
        }
        listed.forEach(d->System.out.println(contains(d,listed)));
        while(listed.size()>0){
        finded.add(find(b, listed.get(0), listed));
        }
        finded.forEach(d->System.out.println(d));
    }

    public static int contains(String a,ArrayList<String> s){
        int rtn =0;
        for(String e:s){
            if(e.equals(a))rtn++;
        }
        return rtn;
    }
    public static String find(String tgt,String letter,ArrayList<String> s){
        int target = contains(letter,s);
        for(String d: finded){
            tgt=tgt.replace(d,"");
        }
        System.out.println("\n"+tgt+"\n");
        String rtn = "";
        int i = 0;
        while(i<tgt.length()){
        String ss = tgt.substring(0,i);
        int d = tgt.split(ss).length;
        if(d-1==target&&ss.length()>rtn.length()){
            rtn=ss;
        }
        i++;
        }
        listed.remove(letter);
        return rtn;
    }
}
