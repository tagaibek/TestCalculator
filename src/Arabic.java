
    public class Arabic implements Number {

        /**
         * Parses the string to integer.
         * It throws an exception if it is not a number [0-9]
         * */
        @Override
        public int parse(String numberStr) throws NumberFormatException {
            int a = Integer.parseInt(numberStr);
            if (1 <= a && a <=10){
                return a;
            }
            else throw new   NumberFormatException("This is wrong number : " + a);
        }

        @Override
        public String convert(int number) {
            return number + "";
        }
    }


