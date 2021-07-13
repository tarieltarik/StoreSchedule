import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class DbWorker {
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "postgres";
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public String showVegetables(){
        String SQL = "SELECT * FROM products where divisionid = 1";
        String result = "";
        try (Connection conn = connect();) {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int numberOfColumns = rsMetaData.getColumnCount();
            for(int i = 1; i <= numberOfColumns; i++)
            {
                result += rsMetaData.getColumnLabel(i) + "\t" + "\t";
            }
            result += "\n";
            while (rs.next())
            {
                for(int e = 1; e <= rsMetaData.getColumnCount(); e++)
                {
                    result += rs.getString(e) + "\t" + "\t";
                }
                result += "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public String showFruits(){
        String SQL = "SELECT * FROM products where divisionid = 2";
        String result = "";
        try (Connection conn = connect();) {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int numberOfColumns = rsMetaData.getColumnCount();
            for(int i = 1; i <= numberOfColumns; i++)
            {
                result += rsMetaData.getColumnLabel(i) + "\t" + "\t";
            }
            result += "\n";
            while (rs.next())
            {
                for(int e = 1; e <= rsMetaData.getColumnCount(); e++)
                {
                    result += rs.getString(e) + "\t" + "\t";
                }
                result += "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public String showDrinks(){
        String SQL = "SELECT * FROM products where divisionid = 3";
        String result = "";
        try (Connection conn = connect();) {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int numberOfColumns = rsMetaData.getColumnCount();
            for(int i = 1; i <= numberOfColumns; i++)
            {
                result += rsMetaData.getColumnLabel(i) + "\t" + "\t";
            }
            result += "\n";
            while (rs.next())
            {
                for(int e = 1; e <= rsMetaData.getColumnCount(); e++)
                {
                    result += rs.getString(e) + "\t" + "\t";
                }
                result += "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public String showToys(){
        String SQL = "SELECT * FROM products where divisionid = 4";
        String result = "";
        try (Connection conn = connect();) {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int numberOfColumns = rsMetaData.getColumnCount();
            for(int i = 1; i <= numberOfColumns; i++)
            {
                result += rsMetaData.getColumnLabel(i) + "\t" + "\t";
            }
            result += "\n";
            while (rs.next())
            {
                for(int e = 1; e <= rsMetaData.getColumnCount(); e++)
                {
                    result += rs.getString(e) + "\t" + "\t";
                }
                result += "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public String showElectronic(){
        String SQL = "SELECT * FROM products where divisionid = 5";
        String result = "";
        try (Connection conn = connect();) {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int numberOfColumns = rsMetaData.getColumnCount();
            for(int i = 1; i <= numberOfColumns; i++)
            {
                result += rsMetaData.getColumnLabel(i) + "\t" + "\t";
            }
            result += "\n";
            while (rs.next())
            {
                for(int e = 1; e <= rsMetaData.getColumnCount(); e++)
                {
                    result += rs.getString(e) + "\t" + "\t";
                }
                result += "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public String showDiscount(){
        String SQL = "SELECT * FROM products where discount >= 50";
        String result = "";
        try (Connection conn = connect();) {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int numberOfColumns = rsMetaData.getColumnCount();
            for(int i = 1; i <= numberOfColumns; i++)
            {
                result += rsMetaData.getColumnLabel(i) + "\t" + "\t";
            }
            result += "\n";
            while (rs.next())
            {
                for(int e = 1; e <= rsMetaData.getColumnCount(); e++)
                {
                    result += rs.getString(e) + "\t" + "\t";
                }
                result += "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public String showAll(){
        String SQL = "SELECT name, price FROM products";
        String result = "";
        try (Connection conn = connect();) {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int numberOfColumns = rsMetaData.getColumnCount();
            for(int i = 1; i <= numberOfColumns; i++)
            {
                result += rsMetaData.getColumnLabel(i) + "\t" + "\t";
            }
            result += "\n";
            while (rs.next())
            {
                for(int e = 1; e <= rsMetaData.getColumnCount(); e++)
                {
                    result += rs.getString(e) + "\t" + "\t";
                }
                result += "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
