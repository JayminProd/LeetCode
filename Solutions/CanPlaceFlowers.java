package Solutions;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int planted = 0;
        boolean lastSpotWasEmpty = true;

        for (int i = 0; i < flowerbed.length; i++) {
            if (planted == n) return true;
            if (lastSpotWasEmpty && i == flowerbed.length - 1 && flowerbed[i] == 0) {
                planted++;
                flowerbed[i] = 1;
                lastSpotWasEmpty = false;
            } else if (lastSpotWasEmpty && i < flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                planted++;
                flowerbed[i] = 1;
                lastSpotWasEmpty = false;
            } else lastSpotWasEmpty = flowerbed[i] == 0;
        }
        return planted == n;
    }

    public static void main(String[] args) {
        CanPlaceFlowers s = new CanPlaceFlowers();
        int[] flowerbed = {0,0,1,0,0};
        boolean rs = s.canPlaceFlowers(flowerbed, 1);
        System.out.println(rs);
    }
}
