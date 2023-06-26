package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                int middle = (int) Math.ceil(sideLength / 2.0);
                if (i == middle || j == middle){
                    System.out.print("8");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cross cross = new Cross();
        cross.printCross(3);
    }
}
