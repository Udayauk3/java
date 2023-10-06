import java.sql.*;
import java.io.*;
class DatabaseDemo
{
public static void main(String args[])throws Exception
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","whisky");
System.out.println("Database connection is created");
Statement st=con.createStatement();
int rowcount=st.executeUpdate("delete from empdb where username='akshay'");
System.out.println(rowcount);
ResultSet rs=st.executeQuery("select * from empdb");
ResultSetMetaData rsmd=rs.getMetaData();
int noc=rsmd.getColumnCount();
for(int i=1;i<=noc;i++)
{
System.out.println("Column"+i+"="+rsmd.getColumnName(i));
System.out.println("ColumnType"+"="+rsmd.getColumnType(i));
System.out.println("Column type name"+"="+rsmd.getColumnTypeName(i));
}
while(rs.next())
{
System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
}
}
}