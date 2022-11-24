/*

  Given a roman numeral, convert it to an integer.
  
  Answer by Mohammad Pasha Khoshkebari. 

*/

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanToInteger = new HashMap<Character, Integer>();

        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);


        int size = s.length();

        int characters[] = new int[size];

        for (int i = 0; i < size; i++) {
            characters[i] = romanToInteger.get(s.charAt(i));
        }
        
        int total = 0;

        for (int i = 0; i < size; i++) {
            if (i == (size-1)) {
                total += characters[i];
            } else {
                int one = characters[i];
                int two = characters[i+1];

                if (two > one) {
                    total += (two - one);
                    i++;
                } else {
                    total += one;
                }
            }
        }


        return total;
    }
}
