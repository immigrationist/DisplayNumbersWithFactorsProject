public class DisplayNumbersWithFactors {
        public static int readNumber()throws Exception{
            int number = 0;
            char digitAsciiCode = '0';
            int value = 0;

            digitAsciiCode = (char)System.in.read();
            while(digitAsciiCode != '\n'){
                value = digitAsciiCode - '0';
                number = number * 10 + value;
                digitAsciiCode = (char)System.in.read();
            }
            return number;
        }

        public static int getNumbersOfFactors(int number){
            int factorCount = 0;
            int numbersBelow = 1;

            while(numbersBelow < number){
                if(number % numbersBelow == 0)
                    factorCount += 1;
                numbersBelow += 1;
            }

            return factorCount;
        }

    public static void main(String[] args) throws Exception {
            int number = 0;
            int numbersBelow = 1;
            int numFactors = 0;
            char answer = 'y';

            while(answer == 'y'){
                try{
                    System.out.println("Enter number");
                    number = readNumber();

                    while(numbersBelow < number){
                        numFactors = getNumbersOfFactors(numbersBelow);

                        if(numFactors <= 3)
                            System.out.println(numbersBelow);
                        numbersBelow++;
                    }
                    System.out.println("Try again, y/n?");
                    answer = (char)System.in.read();
                    System.in.read();

                }
                catch(Exception e){
                    System.out.println("Keyboard malfunctioned");
                }
            }

    }
}
