import java.sql.*;

public class JdbcDbManager implements DbManager {
    @Override
    public void addExercise(Exercise exercise) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root", "root");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO exercise(name, muscle_group) values (?, ?);");
            preparedStatement.setString(1, exercise.getName());
            preparedStatement.setString(2, exercise.getMuscleGroup());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0)
                System.out.println("Exercise was added.");
            else
                System.out.println("Error.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void showExercises(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root", "root");
            String sql = "select * from exercise;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("Exercise: " + resultSet.getString("name"));
                System.out.println("Muscle group: " + resultSet.getString("muscle_group"));
                System.out.println();
            }
        }
            catch(SQLException e){
                e.printStackTrace();
            }
    }
}
