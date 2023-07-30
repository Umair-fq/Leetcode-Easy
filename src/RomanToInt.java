    //Roman to Integer


//public class RomanToInt {


//    public int romanToInt(String s) {
//        int value = 0;
//        if(s.equals("I")){
//            value += 1;
//        }
////        System.out.println("s length: "+s.length());
//        for (int i = 0; i < s.length(); i++) {
////            System.out.println(i + " and i + 2 = " + (i+2));
//            //III
//            if ((s.length() >= i + 2) && s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
//                value += 4;
//                i += 1;
////                System.out.println("value += 4");
//            } else if ((s.length() >= i + 2) && s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
//                value += 9;
//                i += 1;
////                System.out.println("value += 9");
//            } else if ((s.length() >= i + 2) && s.charAt(i) == 'X' && s.charAt(i+1) == 'L') {
//                value += 40;
//                i += 1;
////                System.out.println("value += 40");
//            } else if ((s.length() >= i + 2) && s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
//                value += 90;
//                i += 1;
////                System.out.println("value += 90");
//            } else if ((s.length() >= i + 2) && s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
//                value += 400;
//                i += 1;
////                System.out.println("value += 400");
//            } else if ((s.length() >= i + 2) && s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
//                value += 900;
//                i += 1;
////                System.out.println("value += 900");
//            } else if (s.charAt(i) == 'I') {
//                value += 1;
////                System.out.println("value += 1");
//            } else if (s.charAt(i) == 'V') {
//                value += 5;
////                System.out.println("value += 5");
//            } else if (s.charAt(i) == 'X') {
//                value += 10;
////                System.out.println("value += 10");
//            } else if (s.charAt(i) == 'L') {
//                value += 50;
////                System.out.println("value += 50");
//            } else if (s.charAt(i) == 'C') {
//                value += 100;
////                System.out.println("value += 100");
//            } else if (s.charAt(i) == 'D') {
//                value += 500;
////                System.out.println("value += 500");
//            } else if (s.charAt(i) == 'M') {
//                value += 1000;
////                System.out.println("value += 1000");
//            }
//        }
//        return value;
//    }


import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

        public int romanToInt(String s) {
            Map<Character, Integer> romanNum = new HashMap<>();
            int ans = 0;
            romanNum.put('I', 1);
            romanNum.put('V', 5);
            romanNum.put('X', 10);
            romanNum.put('L', 50);
            romanNum.put('C', 100);
            romanNum.put('D', 500);
            romanNum.put('M', 1000);

            for (int i = 0; i < s.length(); i++) {
                //now we are checking that if the current character is not the last character and the value of current character
                //is less than the value of next character
                //for handling cases like IV = -1+5 = 4, IX = -1+10 = 9
                if ((i < s.length() - 1) && (romanNum.get(s.charAt(i)) < romanNum.get(s.charAt(i+1)))) {
                    ans -= romanNum.get(s.charAt(i));
                }
                else {
                    ans += romanNum.get(s.charAt(i));
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            RomanToInt obj = new RomanToInt();

//            System.out.println(obj.romanToInt("I"));
//            System.out.println(obj.romanToInt("LVIII"));
            System.out.println(obj.romanToInt("MCMXCIV"));
        }
    }


//}
