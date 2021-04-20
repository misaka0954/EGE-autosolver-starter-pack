public class zadanie_12{
	static String out="";
	static String dub="";
	static int minVal=100;
	static int outValMin=100;
	public static void main(String[] args){
		int thisX=100;
		while(thisX<1000){
		while(out.length()<=thisX){out+="1";}
			while(true){
		if(!out.contains("111")){break;}
		while(out.contains("111")){
			out=out.replaceFirst("111","22");
		}
		if(!out.contains("222")){break;}
		while(out.contains("222")){
			out=out.replaceFirst("222","11");
		}}
		int output=0;
		for (int i = 0; i < out.length(); i++) {
			if(out.charAt(i)=='1'){output++;}
		}
		if(output<minVal){
			minVal=output;
			outValMin=thisX;
			dub=out;
		}
		thisX++;
	}
		System.out.println(minVal);
		System.out.println(outValMin);
		System.out.println(dub);
	}
}