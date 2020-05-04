import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BakedGoodsDatabase {

    private ArrayList<BakedGoods> bgs = new ArrayList<>();

    public BakedGoodsDatabase(){

        BakedGoods bg1 = new BakedGoods("Multi-grain white bread", 5.00, 20);
        bg1.setDietRest("gluten free");
        bg1.setDietRest("vegan");
        bgs.add(bg1);

        BakedGoods bg2 = new BakedGoods("Bread Pudding", 4.50, 15);
        bg2.setDietRest("gluten free");
        bg2.setDietRest("vegan");
        bgs.add(bg2);

        BakedGoods bg3 = new BakedGoods("Cinnamon Raisin Bread", 7.50, 12);
        bg3.setDietRest("gluten free");
        bg3.setDietRest("vegan");
        bgs.add(bg3);

        BakedGoods bg4 = new BakedGoods("Large Hamburger Buns", 5.00, 0);
        bg4.setDietRest("vegan");
        bgs.add(bg4);

        BakedGoods bg5 = new BakedGoods("Plain Croissant", 3.60, 10);
        bgs.add(bg5);


        BakedGoods bg6 = new BakedGoods("Almond Croissant", 4.90, 8);
        bg6.setDietRest("has nuts");
        bgs.add(bg6);

        BakedGoods bg7 = new BakedGoods("Rustic Multi Seeds Loaf", 9.00, 12);
        bg7.setDietRest("vegan");
        bgs.add(bg7);

        BakedGoods bg8 = new BakedGoods("Apple Chauson", 4.60, 0);
        bgs.add(bg8);

        BakedGoods bg9 = new BakedGoods("Briella", 5.10, 10);
        bg9.setDietRest("has nuts");
        bgs.add(bg9);

        BakedGoods bg10 = new BakedGoods("Chocolate Eclair", 7.05, 0);
        bg10.setDietRest("gluten free");
        bgs.add(bg10);

        BakedGoods bg11 = new BakedGoods("Dozen Savory Empanadas", 39.00, 100);
        bg11.setDietRest("gluten free");
        bg11.setDietRest("vegan");
        bgs.add(bg11);

        BakedGoods bg12 = new BakedGoods("Gold Happy Birthday Cake", 35.00, 5);
        bg12.setDietRest("gluten free");
        bgs.add(bg12);

        BakedGoods bg13 = new BakedGoods("Powdered Brownie", 4.50, 25);
        bg13.setDietRest("gluten free");
        bg13.setDietRest("vegan");
        bgs.add(bg13);

        BakedGoods bg14 = new BakedGoods("4\" Gingerbread Cookie", 3.95, 55);
        bg14.setDietRest("gluten free");
        bg14.setDietRest("vegan");
        bgs.add(bg14);

        BakedGoods bg15 = new BakedGoods("Chocolate Chip Cookie", 2.85, 85);
        bg15.setDietRest("gluten free");
        bg15.setDietRest("vegan");
        bgs.add(bg15);


        this.setBGArray(bgs);
    }

    public ArrayList<BakedGoods> getBgs() {
        return bgs;
    }

    public void setBGArray(ArrayList<BakedGoods> bgs) {
        this.bgs = bgs;
    }

    public ArrayList<String> searchBGs (String dietRest){
        ArrayList<String> tempArray = new ArrayList<>();
        dietRest.toLowerCase();
        for (BakedGoods i: getBgs()){
            for (String j: i.getDietRest()){
                if (j.contains(dietRest)){
                    tempArray.add(i.getName());
                    System.out.println(i.getName()+"\nDR: "+i.getDietRest()+"\nPrice: $"+i.getPrice()+"\nStock: "+i.getQtyInStock());

                }
            }

        }
        if (tempArray.size() == 0) {
            System.out.println("no matches");
            return null;
        }
        else{
            return tempArray;
        }
    }
}
