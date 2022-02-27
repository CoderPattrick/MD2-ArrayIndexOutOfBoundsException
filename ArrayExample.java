import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = createRandom();
        boolean check = true;
        while (check){
            Scanner input = new Scanner(System.in);
            System.out.println("\n Nhập index của số muốn tìm:");
            int index = input.nextInt();
            try{
                System.out.printf("Giá trị phần tử thứ %d là: %d",index,arr[index]);
            }
            catch (IndexOutOfBoundsException e){
                System.err.println("Index vượt quá số lượng phần tử.");
            }
            System.out.println("\nBạn có muốn tiếp tục tìm? Nhập 0 để kết thúc.");
            int checkNumb = input.nextInt();
            if(checkNumb==0){
                check=false;
            }
        }
    }
}
