package lms.resources.adminController;

//import awt.event.*;
import java.sql.*;
import javax.swing.*;
//import net.proteanit.sql.DbUtils;

public class CrudOperations {

    //Creating the connection to the Database
    public static Connection connect(){
        try{
            Class.forName("Enter the name of the Database");
            System.out.print("Loaded driver");
            Connection con = DriverManager.getConnection("Where the database is loaded");
            System.out.print("Connected to MySQL");
            return con;
        }
        catch (Exception e){
            ex.printStackTrace();
        }
        return null;
    }

    //Create function to create databases and to add into the table
    public static void create(){
        try{
            Connection connection = connect();
            ResultSet resultset = connection.getMetaData().getCatalogs(); //Getting the catalog in the result set

            //Iterating through each catalog in the resultset
            while(resultSet.next()){
                //Getting the database name, which is at poisiton 1
                String databaseName = resultSet.getString(1);
                if (databaseName.equals("library")){
                    System.out.print("Yes");
                    Statement state = connection.createStatement();

                    //Resets the database if it pre-exists
                    String sql = "DROP DATABASE library";
                    state.executeUpdate(sql);
                }
            }
            Statement state = connection.createStatement();

            String sql = "CREATE DATABASE LIBRARY"; //Create databases
            state.executeUpdate(sql);
            state.executeUpdate("USE LIBRARY"); //Using the databases

            //Creating the users table
            String sql1 = "CREATE TABLE USERS(UID INT NOT NULL AUTO_INCREMENT PRIMARY KEY, USERNAME VARCHAR(30), PASSWORD VARCHAR(30), ADMIN BOOLEAN)";
            state.executeUpdate(sql1);

            //Inserting into the users library
            state.executeUpdate("INSERT INTO USERS(USERNAME, PASSWORD, ADMIN) VALUES('admin','admin', TRUE)");

            //Creating books into the database table
            state.executeUpdate("CREATE TABLE BOOKS(BID INT NOT NULL AUTO_INCREMENT PRIMARY KEY, BNAME VARCHAR(50), GENRE VARCHAR(20), PRICE INT)");

            //Create issued books database table
            state.executeUpdate("CREATE TABLE ISSUED(IID INT NOT NULL AUTO_INCREMENT PRIMARY KEY, UID INT, BID INT, ISSUED_DATE VARCHAR(20), RETURN_DATE VARCHAR(20), PERIOD INT, FINE INT)");

            //Insert into the books database table
            state.executeUpdate("INSERT INTO BOOKS(BNAME, GENRE, PRICE) VALUES('War and Peace', 'Mystery', 200),  ('The Guest Book', 'Fiction', 300), ('The Perfect Murder','Mystery', 150), ('Accidental Presidents', 'Biography', 250), ('The Wicked King','Fiction', 350)");

            resultSet.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    //Creating the admin menu
    public static void adminMenu(){
        JFrame window = new JFrame("Admin Menu"); //Creating the admin menu
        JButton createButton = new Jbutton("Create Database"); // Creating a new database button
        createButton.setBounds(450,60,120,25); //x axis, y axis, width, height

        //Performing an action by pressing the button
        createButton.addActionListener(new addActionListener(){
            public void actionPerformed(ActionEvent e){
                create(); //Create function
                JOptionPane.showMessageDialog(null, "Datebase has been created/reset!"); //Display the message that the database has been created
            }
        });

        //Viewing all the book button
        JButton viewButton = new JButton("View All Books"); //Creating a view books button
        viewButton.setBounds(20,20,120,25); //x axis, y axis, width, height

        //Performing an action by pressing the button
        viewButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame window = new JFrame("Available Books");

                Connection connection = connect(); //Function used to connection to Database
                String sql = "Select * from BOOKS"; //MySQL code to view all the books in the Database
                try{
                    Statement state = connection.createStatement();
                    state.executeUpdate("USE LIBRARY"); //MySQL to use Database
                    state = connection.createStatement();
                    ResultSet result = state.executeQuery(sql); //Execute the statement and update the Database
                    JTable booklist = new JTable(); //Viewing the updated Database
                    booklist.setModel(DbUtils.resultSetToTableModel(result));

                    //Creating a scoll bar in the books database
                    JScrollPane scrollPane = new JScrollPane(booklist);

                    window.add(scrollPane); //add scrollpane
                    window.setSize(800,400); //set size for frame
                    window.setVisible(true); //making the scroll bar visible
                    window.setLocationRelativeTo(null); //setting the scrollbar on the left
                }
                catch (SQLException e1){
                    //Creating an auto-generated catch block
                    JOptionPane.showMessageDialog(null, e1);
                }
            }
        });

        JButton usersbutton = new JButton("View all users"); //Creating a view all the users button
        usersbutton.setBounds(150,20,120,25); //x axis, y axis, width, height
        usersbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame window = new JFrame("Users List");

                Connection connection = connect();
                String sql = "select * from users"; //Getting all the users from the database table

                try{
                    Statement state = connection.createStatement();
                    state.executeUpdate("USE LIBRARY");
                    state = connection.createStatement();
                    ResultSet result = state.executeQuery(sql);
                    JTable booklist = new JTable();
                    booklist.setModel(DbUtils.resultSetToTableModel(result));

                    JScrollPane scrollPane = new JScrollPane(booklist);
                    window.add(scrollPane);
                    window.setSize(800,400);
                    window.setVisible(true);
                    window.setLocationRelativeTo(null);
                }
                catch (SQLException e1){
                    JOptionPane.showMessageDialog(null, e1);
                }
            }
        });

        JButton addBook = new JButton("Add Book"); //Creates a Add Books button
        addBooks.setBounds(150,60,120,25);
        addBooks.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Entering the book details
                JFrame input = new JFrame("Enter Book Details");
                JLabel l1,l2,l3;
                l1 = new JLabel("Book Name"); //Label 1 for book Name
                l1.setBounds(30,15,100,30);

                l2 = new JLabel("Genre"); //Label 2 for book Genre
                l2.setBounds(30,53,100,30);

                l3 = new JLabel("Price"); //Label 3 for book Price
                l3.setBounds(30,90,100,30);

                JTextField FirstBName = new JTextField(); //Text field for book name
                FirstBName.setBounds(110,15,200,30);

                JTextField FirstGenre = new JTextField(); //Text field for book genre
                FirstGenre.setBounds(110,53,200,30);

                JTextField FirstPrice = new JTextField(); //Text field for book price
                FirstPrice.setBounds(110,90,200,30);

                JButton createButton = new JButton("Submit");
                createButton.setBounds(130,130,80,25);//x axis, yaxis, width, height
                createButton.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        //Assigning the book name, genre, price
                        String BookName = FirstBName.getText();
                        String BookGenre = FirstGenre.getText();
                        String BookPrice = FirstPrice.getText();

                        int integerprice = Integer.parseInt(BookPrice);

                        Connection connection = connect();
                        try{
                            Statement state = connection.createStatement();
                            state.executeUpdate("USE LIBRARY");
                            state.executeUpdate("INSERT INTO BOOKS(BOOKNAME, BOOKGENRE, BOOKPRICE) VALUES('" + BookName + "','" + BookGenre + "','" + integerprice + "')");
                            JOptionPane.showMessageDialog(null, "Book added!");
                            input.dispose();
                        }
                        catch (SQLException e1){
                            JOptionPane.showMessageDialog(null, e1);
                        }
                    }
                });
                input.add(l3);
                input.add(createButton);
                input.add(l1);
                input.add(l2);
                input.add(FirstBName);
                input.add(FirstGenre);
                input.add(FirstPrice);
                input.setSize(350,200); //400 width and 500 height
                input.setLayout(null); //using no layout mangers
                input.setVisible(true); //making the frame visible
                input.setLocationRelativeTo(null);
            }
        });


    }
}
