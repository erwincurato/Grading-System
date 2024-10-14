


public class Nestedloop {
    public static void main (String[] args){

        String[][] names = {
                {"erwin", "curato"},
                {"jay", "jay123"},
                {"bro", "bro123","deymn"}
        };

        for (int row = 0;row < names.length; row++){

            for (int col = 0;col < names[row].length; col++) {
                System.out.println(names [row][col]);
            }
            System.out.println();
        }

    }
}
