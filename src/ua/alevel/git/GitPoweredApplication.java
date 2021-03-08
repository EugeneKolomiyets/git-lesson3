package ua.alevel.git;

public class GitPoweredApplication {
    public static void main(String[] args) {
        System.out.println("Hello git");

        for (int i = 0; i < 100; i++) {
            System.out.println("1");
        }
        int z = 22, y = 33;
        if (z > 500 && y < 980) {
            System.out.println("w");
        } else if (z < 33 || y > 33) {
            System.out.println("3");
        }

        switch (z) {//int,byte,char,string
            case 1000: {
                System.out.println("Give me red pill");
                System.out.println("1");
                System.out.println("2");
            }
            break;
            case -899:
                System.out.println("Morpheous I know kung-fu");
                break;
            case 7666:
                System.out.println("7668");
                break;
        }
        String neo = "Thomas Anderson";
        System.out.println(neo.length());
        for (int i = 0; i < neo.length(); i++) {
            System.out.println(neo.charAt(i));
        }
        System.out.println(neo.isEmpty());
        System.out.println("".isEmpty());
        //System.out.println(neo.concat("!"));
        //String newNeo=neo;
        String newNeo = "Thomas Anderson";
        if (newNeo == neo) {
            System.out.println("The same");
        } else {
            System.out.println("The different");
        }
        String matrix = new String("Matrix");
        String anotherMatrix = new String("Matrix");
        if (matrix.equals(anotherMatrix)) {
            System.out.println("The same");
        } else {
            System.out.println("The different");
        }

        System.out.println(matrix.substring(3, 5));
        //Ctrl+Alt+L формат
        //Ctrl+/ комментировать,,mm/
    }
}
