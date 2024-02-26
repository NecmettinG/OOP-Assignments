public class Question_8 {

    public static void main(String[] args){

        int rabbits = 1042; //Starter numbers for populations of rabbits and birds.
        int birds = 2272;
        double rabbit_reproduce_rate = 0.038; //Reproduce rates of rabbits and birds.
        double bird_reproduce_rate = 0.012;
        int year_counter = 0; //Year counter for finding how many years later there will be more rabbits than birds.

        while (rabbits <= birds){

            rabbits += (int) (rabbits*rabbit_reproduce_rate); //Increasing population according to reproduce rates.
            birds += (int) (birds*bird_reproduce_rate);
            year_counter++; //Increase year.
        }

        System.out.printf("There will be %d rabbits and %d birds after %d years.",rabbits, birds, year_counter); //Output.
    }
}
