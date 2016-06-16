package ca_matchespicking;

public class CA_MatchesPicking {

    public static void main(String[] args) {

        String str_input = "94 5 i\n"
                + "182 13 n\n"
                + "618 19 i\n"
                + "84 4 i\n"
                + "180 8 i\n"
                + "112 9 n\n"
                + "68 4 n\n"
                + "162 16 n\n"
                + "172 5 i\n"
                + "440 16 n\n"
                + "244 8 i\n"
                + "179 15 n\n"
                + "48 3 i\n"
                + "49 2 n\n"
                + "110 10 n\n"
                + "417 13 n\n"
                + "364 16 i\n"
                + "65 11 n\n"
                + "112 6 i\n"
                + "430 14 n\n"
                + "32 3 i\n"
                + "225 14 n\n"
                + "266 18 n\n"
                + "570 18 n\n"
                + "342 12 n";
        String[] str_arr = str_input.split("\\s");
        for (int i = 0; i < str_arr.length; i += 3) {
            //System.out.println(" " + str_arr[0 + i] + " " + str_arr[1 + i] + " " + str_arr[2 + i] + "\n ");
            if (str_arr[2 + i].equals("n")) {
                if (Integer.valueOf(str_arr[0 + i]) % Integer.valueOf(str_arr[1 + i]) == 0) {
                    if (Integer.valueOf(str_arr[0 + i]) / Integer.valueOf(str_arr[1 + i]) == Integer.valueOf(str_arr[1 + i])+1) {
                        System.out.println(0);
                    } else {
                        System.out.println((Integer.valueOf(str_arr[1 + i]) - 1));
                    }
                } else{System.out.println(Integer.valueOf(str_arr[0 + i]) % (Integer.valueOf(str_arr[1 + i])+1));}
            }else { 
            //i
             if (Integer.valueOf(str_arr[0 + i]) % Integer.valueOf(str_arr[1 + i]) != 0) {
                 if(Integer.valueOf(str_arr[1 + i])%2 != 0){System.out.println((Integer.valueOf(str_arr[1 + i])-2));}else{System.out.println((Integer.valueOf(str_arr[1 + i])));}
             } else{if(Integer.valueOf(str_arr[1 + i])%2 != 0){System.out.println((Integer.valueOf(str_arr[1 + i])));}else{System.out.println((Integer.valueOf(str_arr[1 + i]))-1);}}
                
            }

        }
    }

}
