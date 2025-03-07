public class FindGrade{

    public static void main(String[] args){
        if (args.length==1) {
            int score = Integer.parseInt(args[0]);
            //Get the score from the user as a file parameter
            //Calculate the grade based on the score
            //Print the grade to the console
            // 90 - 100 -> A
            // 80 - 89 -> B
            // 70 - 79 -> C
            // 60 - 69 -> D
            // 0 - 59 -> F

            if (score <= 59 && score > 0) {
                System.out.println("F");
            } else if (score <= 69 && score >= 60) {
                System.out.println("D");
            } else if (score <= 79 && score >= 70) {
                System.out.println("C");
            } else if (score <= 89 && score >= 80) {
                System.out.println("B");
            } else if (score <= 100 && score >= 90) {
                System.out.println("A");
            } else {
                System.out.println("invalid grade");
            }

        }
        else{
            System.out.println("please provide score");
        }



    }



}