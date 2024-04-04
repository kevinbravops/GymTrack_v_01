public class Exercise {
    private String name;
    private int weight;
    private int reps;
    private int sets;
    private String muscleGroup;

    public void setData(String name, String muscleGroup) { // library of exercise
        this.name = name;
        this.muscleGroup = muscleGroup;
    }

    public void setData(String name, String muscleGroup, int weight, int reps, int sets){
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.weight = weight;
        this.reps = reps;
        this.sets = sets;
    }
    public String getName(){
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getReps() {
        return reps;
    }

    public int getSets() {
        return sets;
    }
    public String getMuscleGroup(){
        return muscleGroup;
    }
}
