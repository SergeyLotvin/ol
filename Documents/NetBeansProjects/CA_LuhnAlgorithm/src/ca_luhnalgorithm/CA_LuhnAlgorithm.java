package ca_luhnalgorithm;

public class CA_LuhnAlgorithm {

    public static int[] luhnSumSwap(String sn) {
        int a = 0, b = 0, c=0, x=0, y=0, t=0, s=0;
        int[] int_arr=new int[16];
        for(int i=0; i<sn.length(); i++){        int_arr[i]=Integer.valueOf(String.valueOf(sn.charAt(i)));                }              
        for (s=0; s<15; s++){
        for (int i = 15; i>= 0; i --) {
            if (i % 2 == 0) {
                c = int_arr[i] * 2;
                if (c > 9) { c -= 9;}
                b = b + c;
            } else {
                a += int_arr[i];
            }

        }    
            
        if((a+b)%10!=0){   
            if(s>0){t=int_arr[s]; int_arr[s]=int_arr[s-1]; int_arr[s-1]=t;}
            t=int_arr[s+1]; int_arr[s+1]=int_arr[s]; int_arr[s]=t;
            
        } else{return int_arr; }
        a=0; b=0;
        }
        
    return int_arr=null;}
      public static int[] luhnSumChange(String sn) {
         int a = 0, b = 0, c=0, x=0, y=0, t=0, s=0;
         String newStr=null;
        int[] int_arr=new int[16];
        
        //for (int u=0; u<10; u++){newStr=sn.replace('?', Integer.toString(u).charAt(0)); System.out.println(" newStr "+newStr);      
       
        for(int i=0; i<sn.length(); i++){if(sn.charAt(i)!='?'){int_arr[i]=Integer.valueOf(String.valueOf(sn.charAt(i)));} else {int_arr[i]=0; t=i;} }    
     // System.out.print("int_arr[f]"); for(int f=0; f<int_arr.length; f++){ System.out.print(int_arr[f]);}   System.out.println("***");
     while((a+b)%10!=0 || (a==0)){
         a=0; b=0; 
         int_arr[t]=int_arr[t]+1; 
            for (int i = 15; i>= 0; i --) {
            if (i % 2 == 0) {
                c = int_arr[i] * 2;
                if (c > 9) { c -= 9;}
                b = b + c;
            } else {
                a += int_arr[i];
            }   
             
       
            }}
     
              
             

    
      
         return int_arr;
      }
    public static void main(String[] args) {

        String str_input = "";
        String[] str_arr = str_input.split("\\n");
        int[] result=new int[15];
        int pos=0;
        
        
        
        
        

        for (int i = 0; i < str_arr.length; i++) {
            if (str_arr[i].contains("?")) {  result=luhnSumChange(str_arr[i]); for(int w=0; w<result.length; w++){System.out.print(result[w]);}  System.out.println("");}

                       else{result=luhnSumSwap(str_arr[i]); for(int w=0; w<result.length; w++){System.out.print(result[w]);}  System.out.println("");  }

        }

    }

}
