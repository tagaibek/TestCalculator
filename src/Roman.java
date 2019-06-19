import java.util.HashMap;
import java.util.Map;

public class Roman implements Number {

    private Map<String,Integer> romanToArabic;
    private  Map<Integer, String> arabicToRoman;
    Roman(){
        arabicToRoman = new HashMap<>();

        arabicToRoman.put(1, "I");
        arabicToRoman.put(2, "II");
        arabicToRoman.put(3, "III");
        arabicToRoman.put(4, "IV");
        arabicToRoman.put(5, "V");
        arabicToRoman.put(6, "VI");
        arabicToRoman.put(7, "VII");
        arabicToRoman.put(8, "VIII");
        arabicToRoman.put(9, "IX");
        arabicToRoman.put(10, "X");
        arabicToRoman.put(11, "XI");
        arabicToRoman.put(12, "XII");
        arabicToRoman.put(13, "XIII");
        arabicToRoman.put(14, "XIV");
        arabicToRoman.put(15, "XV");
        arabicToRoman.put(16, "XVI");
        arabicToRoman.put(17, "XVII");
        arabicToRoman.put(18, "XVIII");
        arabicToRoman.put(19, "XIX");
        arabicToRoman.put(20, "XX");
        arabicToRoman.put(21, "XXI");
        arabicToRoman.put(22, "XXII");
        arabicToRoman.put(23, "XXIII");
        arabicToRoman.put(24, "XXIV");
        arabicToRoman.put(25, "XXV");
        arabicToRoman.put(26, "XXVI");
        arabicToRoman.put(27, "XXVII");
        arabicToRoman.put(28, "XXVIII");
        arabicToRoman.put(29, "XXIX");
        arabicToRoman.put(30, "XXX");
        arabicToRoman.put(31, "XXXI");
        arabicToRoman.put(32, "XXXII");
        arabicToRoman.put(33, "XXXIII");
        arabicToRoman.put(34, "XXXIV");
        arabicToRoman.put(35, "XXXV");
        arabicToRoman.put(36, "XXXVI");
        arabicToRoman.put(37, "XXXVII");
        arabicToRoman.put(38, "XXXVIII");
        arabicToRoman.put(39, "XXXIX");
        arabicToRoman.put(40, "XL");
        arabicToRoman.put(41, "XLI");
        arabicToRoman.put(42, "XLII");
        arabicToRoman.put(43, "XLII");
        arabicToRoman.put(44, "XLIV");
        arabicToRoman.put(45, "XLV");
        arabicToRoman.put(46, "XLVI");
        arabicToRoman.put(47, "XLVII");
        arabicToRoman.put(48, "XLVIII");
        arabicToRoman.put(49, "XLIX");
        arabicToRoman.put(50, "L");
        arabicToRoman.put(51, "LI");
        arabicToRoman.put(52, "LII");
        arabicToRoman.put(53, "LIII");
        arabicToRoman.put(54, "LIV");
        arabicToRoman.put(55, "LV");
        arabicToRoman.put(56, "LVI");
        arabicToRoman.put(57, "LVII");
        arabicToRoman.put(58, "LVIII");
        arabicToRoman.put(59, "LIX");
        arabicToRoman.put(60, "LX");
        arabicToRoman.put(61, "LXI");
        arabicToRoman.put(62, "LXII");
        arabicToRoman.put(63, "LXIII");
        arabicToRoman.put(64, "LXIV");
        arabicToRoman.put(65, "LXV");
        arabicToRoman.put(66, "LXVI");
        arabicToRoman.put(67, "LXVII");
        arabicToRoman.put(68, "LXVIII");
        arabicToRoman.put(69, "LXIX");
        arabicToRoman.put(70, "LXX");
        arabicToRoman.put(71, "LXXI");
        arabicToRoman.put(72, "LXXII");
        arabicToRoman.put(73, "LXXIII");
        arabicToRoman.put(74, "LXXIV");
        arabicToRoman.put(75, "LXXV");
        arabicToRoman.put(76, "LXXVI");
        arabicToRoman.put(77, "LXXVII");
        arabicToRoman.put(78, "LXXVIII");
        arabicToRoman.put(79, "LXXIX");
        arabicToRoman.put(80, "LXXX");
        arabicToRoman.put(81, "LXXXI");
        arabicToRoman.put(82, "LXXXII");
        arabicToRoman.put(83, "LXXXIII");
        arabicToRoman.put(84, "LXXXIV");
        arabicToRoman.put(85, "LXXXV");
        arabicToRoman.put(86, "LXXXVI");
        arabicToRoman.put(87, "LXXXVII");
        arabicToRoman.put(88, "LXXXVIII");
        arabicToRoman.put(89, "LXXXIX");
        arabicToRoman.put(90, "XC");
        arabicToRoman.put(91, "XCI");
        arabicToRoman.put(92, "XCII");
        arabicToRoman.put(93, "XCIII");
        arabicToRoman.put(94, "XCIV");
        arabicToRoman.put(95, "XCV");
        arabicToRoman.put(96, "XCVI");
        arabicToRoman.put(97, "XCVII");
        arabicToRoman.put(98, "XCVIII");
        arabicToRoman.put(99, "XCIX");
        arabicToRoman.put(100, "C");
        romanToArabic = new HashMap<>();

        romanToArabic.put("I",1);
        romanToArabic.put("II",2);
        romanToArabic.put("III",3);
        romanToArabic.put("IV",4);
        romanToArabic.put("V",5);
        romanToArabic.put("VI",6);
        romanToArabic.put("VII",7);
        romanToArabic.put("VIII",8);
        romanToArabic.put("IX",9);
        romanToArabic.put("X",10);

    }
    /**
     * Parses the string to integer.
     * It throws an exception if it is not a roman numeral: I, V, X
     */
    @Override
    public int parse(String romanNumber) throws NumberFormatException {
        Integer arabicNumber = romanToArabic.get(romanNumber);
        if (arabicNumber == null){
            throw new NumberFormatException("This is wrong number : " + romanNumber);
        }
        else return arabicNumber;

    }

    @Override
    public String convert(int number) {
        return arabicToRoman.get(number);
    }

}
