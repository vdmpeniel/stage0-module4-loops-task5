package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int middle = (int) Math.ceil(height / 2.0);
        int size = height;
        int isOdd = (height % 2 == 0) ? 0 : 1;
        int increment = 2;

        for (int i = 0; i < height; i++){
            int whiteSpace = (height - size) / 2;
            for (int j = 0; j < height; j++){
                if (j < whiteSpace || j >= whiteSpace + size) System.out.print(" ");
                else System.out.print("8");
            }
            System.out.println();
            size += (i+1 < middle)?  -increment : (i+1+isOdd > middle)? increment : 0;
        }
    }

    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(3);
    }
}
//88888
// 888
//  8
// 888
//88888
//
//888888
//8888
//88
//88
//8888
//888888

//888
// 8
//888

//8888
// 88
// 88
//8888
//
//8888888
// 88888
//  888
