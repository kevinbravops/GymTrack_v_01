public class ExerciseService{
    private final JdbcDbManager jdbcDbManager = new JdbcDbManager();
    public void addExercise(Exercise exercise){
        jdbcDbManager.addExercise(exercise);
    }
    public void showExercises(){
        jdbcDbManager.showExercises();
    }
}
