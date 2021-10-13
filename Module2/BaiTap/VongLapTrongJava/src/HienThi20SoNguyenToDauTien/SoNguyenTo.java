package HienThi20SoNguyenToDauTien;



import java.util.Scanner;
 
/**
 * Chương trình liệt kê n số nguyên tố đầu tiên.
 * 
 * @author viettuts.vn
 */
public class SoNguyenTo {
    private static Scanner scanner = new Scanner(System.in);
 
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (dem < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
 

    public static boolean isPrimeNumber(int n) {
   
        if (n < 2) {
            return false;
        }
  
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}