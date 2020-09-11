public class Main {
    public static void main (String[] args) {

        class Arithmetic {
            int add(int int1, int int2) {
                return int1 + int2;
            }

        }
        class Adder extends Arithmetic {
            private int result = 0;
            public int Adder(int int1, int int2) {
                result -= result;
                result = add(int1, int2);
                return result;
            }
        }

        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }

}
