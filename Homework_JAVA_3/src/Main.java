public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //0. Перевести число 333 из шестнадцатиричной в десятичную
        // 333 = 3*6^2 + 3*6^1 + 3*6^0 = 108 + 18 + 3 = 129

        //1. Разложить число 200345 на разряды в десятичной системе
        // 200 000 + 300 + 40 + 5

        //2. Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)
        // 637 = 27D				27D = 2*16^2 + 7*16^1 + D*16^0 = 512 + 112 + 13 = 637
        // 637/16 = 39
        // 637%16 = 13 = D
        // 39/16 = 2
        // 39%16 =7
        // 2/16 = 0
        // 2%16 = 2

        //3. Перевести 637 из десятичной в двоичную
        // 637 = 1001111100
        // 637/2 = 318
        // 637%2 = 1
        // 318/2 = 159
        // 318%2 = 0
        // 159/2 = 79
        // 159%2 = 1
        // 79/2 = 39
        // 79%2 = 1
        // 39/2 = 19
        // 39%2 = 1
        // 19/2 = 9
        // 19%2 = 1
        // 9/2 = 4
        // 9%2 = 1
        // 4/2 = 2
        // 4%2 = 0
        // 2/2 = 0
        // 2%2 =0

        //4. 11100111 перевести в десятичную
        // 1*2^7 + 1*2^6 + 1*2^5 + 0*2^4 + 0*2^3 + 1*2^2 + 1*2^1 + 1*2^0 = 128 + 64 + 32 + 0 + 0 + 4 + 2 + 1 = 231

        //5. Перевести 637 из десятичной в троичную
        // 637 = 212121
        // 637/3 = 212
        // 637%3 = 1
        // 212/3 = 70
        // 212%3 = 2
        // 70/3 = 23
        // 70%3 = 1
        // 23/3 = 7
        // 23%3 = 2
        // 7/3 = 2
        // 7%3 = 1
        // 2/3 = 0
        // 2%3 = 2
    }
}