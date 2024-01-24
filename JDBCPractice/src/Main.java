import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/employee";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;

        try {
            connect = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            st = connect.createStatement();


            String insertQ1 = "INSERT INTO employee (name,position,salary) VALUES ('Ali','Avukat',25000)";
            st.executeUpdate(insertQ1);

            String insertQ2 = "INSERT INTO employee (name,position,salary) VALUES ('Ahmet','Doktor',35000)";
            st.executeUpdate(insertQ2);

            String insertQ3 = "INSERT INTO employee (name,position,salary) VALUES ('Damla','Öğretmen',30000)";
            st.executeUpdate(insertQ3);

            String insertQ4 = "INSERT INTO employee (name,position,salary) VALUES ('Hande','Mühendis',22000)";
            st.executeUpdate(insertQ4);

            String insertQ5 = "INSERT INTO employee (name,position,salary) VALUES ('Deniz','Hemşire',28000)";
            st.executeUpdate(insertQ5);

            String sql = "SELECT * FROM employee";
            ResultSet data = st.executeQuery(sql);
            while (data.next()){
                String name = data.getString("name");
                String position = data.getString("position");
                int salary = data.getInt("salary");

                System.out.println("Name :" + name + ", Position :" + position + ",Salary:" + salary);
            }
            data.close();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}