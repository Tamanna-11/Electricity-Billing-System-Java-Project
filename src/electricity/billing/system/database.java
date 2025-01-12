package electricity.billing.system;

import java.sql.*;

public class database {
    Connection connection;
    Statement statement;
    database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_system","root","Kamal@16");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

