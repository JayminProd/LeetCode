package Solutions;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length < 2) return 0;
        int maxFlaeche = 0;
        int pointerStart = 0;
        int pointerEnd = height.length - 1;
        while (pointerStart < pointerEnd) {
            int fleache = (pointerEnd - pointerStart) * Math.min(height[pointerStart], height[pointerEnd]);
            maxFlaeche = Math.max(maxFlaeche, fleache);
            if (height[pointerStart] < height[pointerEnd]) {
                pointerStart++;
            } else {
                pointerEnd--;
            }
        }
        return maxFlaeche;
    }

    //position n2-n1 * höhe n2 oder n1 was kleiner ist

    public static void main(String[] args) throws Exception {
        int[] input = {1,8,6,2,5,4,8,3,7};
        int output = new ContainerWithMostWater().maxArea(input);
        System.out.println(output);
    }
}
