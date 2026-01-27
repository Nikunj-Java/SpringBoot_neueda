import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {
    public static void main(String[] args) {
        //download the driver from:  https://repo.maven.apache.org/maven2/com/mysql/mysql-connector-j/8.3.0/
        //create lib folder in your project and add the driver to it
        //driver
        String driver="com.mysql.cj.jdbc.Driver";
        //url
        String url="jdbc:mysql://localhost:3306/pubs"; //here pubs is database;
        //username
        String username="root";
        //password
        String password="n3u3da!";


        try {
            //load the driver
            Class.forName(driver);
            Connection conn= DriverManager.getConnection(url,username,password);
            if(conn !=null){
                System.out.println("Connection Established");
                Statement st=conn.createStatement();
                //SQL QUERY: create table eproduct(id bigint primary key auto_increment,name varchar(100),price decimal(10,2),date_added timestamp default now());
                // execute in mysql and then run the below code
                int x=st.executeUpdate("insert into eproduct(name,price) values ('Lenovo ThinkPad',265000)");
                if(x>0) {
                    System.out.println("Data Inserted Successfully");
                }else{
                    System.out.println("Error While Inserting data");
                }
            }else{
                System.out.println("Error While Connecting With Database");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
