import java.util.ArrayList;

public class Digits {
    /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * Precondition: num >= 0
     */
    public Digits (int num) {
        digitList = new ArrayList<Integer>();
        String temp = String.valueOf(num);
        for (int i = 0; i < temp.length(); i++) {
            digitList.add(Integer.parseInt(String.valueOf(temp.charAt(i))));
        }
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     *         false otherwise
     */
    public boolean isStrictlyIncreasing(){
        boolean is = true;
        int temp = digitList.get(0);
        for (int i = 1; i < digitList.size(); i++) {
            if (temp > digitList.get(i)) {
                is = false;
            }
            temp = digitList.get(i);
        }
        return is;
    }
}
