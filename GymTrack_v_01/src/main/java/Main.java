import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Exercise exercise = new Exercise();
        ExerciseService exerciseService = new ExerciseService();

        int number = 0; // number of command
        while(true) {
            System.out.println("Input the command you want to: \n1 - add Exercise\n2 - add Exercise to your library\n3 - show all exercises\n4 - show your statistic\n5 - show your profile\n 0 - exit");
            number = in.nextInt();
            in.nextLine(); // collecting a trash from the remaining parts of past line
            switch (number) {
                case 1:
                    System.out.println("Input name of exercise and muscle group: ");
                    String name = in.nextLine();
                    String muscleGroup = in.nextLine();
                    exercise.setData(name, muscleGroup);
                    exerciseService.addExercise(exercise);
                    break;
                case 2:
                    break;
                case 3:
                    exerciseService.showExercises();
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
            if(number == 0){
                System.out.println("See you later");
                break;
            }
        }
    }
}
