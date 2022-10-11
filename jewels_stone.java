import java.util.Scanner;

class jewels_stones{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jewels = sc.nextLine();
        String stones = sc.nextLine();
        int count=0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }
            }
                
        }
        System.out.println(count);
    }
}
