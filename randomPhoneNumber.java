import java.util.Random;

class randomPhoneNumber {
    public static void main(String[] args) {

        Random rand = new Random(); // rand is an object
        
        int num1, num2, num3;

        for (int i = 0; i < 10; i ++) {
            num2 = rand.nextInt (624) + 100;
            num1 = rand.nextInt (962) + 100;
            num3 = rand.nextInt (9078) + 1000;
            
            System.out.println(num1+"-"+num2+"-"+num3);
        }
    }

}
