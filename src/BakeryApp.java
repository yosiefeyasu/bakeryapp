import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args) {
        BakedGoodsDatabase bg1 = new BakedGoodsDatabase();

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter dietary restriction to filter: ");
        String userDRInput = scn.nextLine();
        bg1.searchBGs(userDRInput);
    }
}
