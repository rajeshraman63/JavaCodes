import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

class Check{

	static{
		System.out.println("static Block");
	}

}

class Test{
    public static void main(String[] args) {
       Check c = new Check();
       Check c2 = new Check();
    }
}