import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class HL {

  private JFrame frmHL;
  private JTable table;
  static DefaultTableModel tableModel;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          HL window = new HL();
          window.frmHL.setVisible(true);
        } catch (Exception e) {
          
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public HL() {
    initialize();
    /*
     * gender: 0->female, 1-> male award: 0->no award 1-> received an award diskType: 0->CD
     * 1->vinyle
     */
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmHL = new JFrame();
    frmHL.setTitle("Home Library");
    frmHL.setSize(717, 457);
    centerWindow(frmHL);
    frmHL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menuBar = new JMenuBar();
    JMenu menu, submenu;
    JMenuItem menuItem;
    frmHL.setJMenuBar(menuBar);


    JScrollPane scrollPane = new JScrollPane();
    frmHL.getContentPane().add(scrollPane, BorderLayout.CENTER);

    String[] col = {};
    tableModel = new DefaultTableModel(col, 0);

    table = new JTable();
    table.setFont(new Font("Tahoma", Font.PLAIN, 12));
    table.setEnabled(false);
    scrollPane.setViewportView(table);
    table.setModel(tableModel);

    // first menu Data
    menu = new JMenu("Data");
    menu.setMnemonic(KeyEvent.VK_D);
    menuBar.add(menu);

    // data > insert menu
    submenu = new JMenu("Insert");
    submenu.setMnemonic(KeyEvent.VK_I);
    // data > insert sub menu
    menuItem = new JMenuItem("Book");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        /* --- Data->insert->book (All in InsertBook.java)--- */
        InsertBook bookdialog = new InsertBook();
        bookdialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        centerDialog(bookdialog);
        bookdialog.setVisible(true);
      }
    });
    submenu.add(menuItem);

    menuItem = new JMenuItem("Music");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        try {
          /* --- Data->insert->Music (All in InsertMusic.java)--- */
          InsertMusic musicDialog = new InsertMusic();
          musicDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
          centerDialog(musicDialog);
          musicDialog.setVisible(true);
        } catch (Exception e) {
          
        }
      }
    });
    submenu.add(menuItem);

    menuItem = new JMenuItem("Movie");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        /* --- Data->insert->Movie (All in InsertMovie.java)--- */
        InsertMovie movieDialog = new InsertMovie();
        movieDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        centerDialog(movieDialog);
        movieDialog.setVisible(true);
      }
    });
    submenu.add(menuItem);
    menu.add(submenu);

    menuItem = new JMenuItem("Update", KeyEvent.VK_U);
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String title = JOptionPane.showInputDialog(null,
            "Enter name of book/music/movie to update:", "Update", JOptionPane.PLAIN_MESSAGE);
        if (title != null) {
          if (isBook(title.trim())) {
            /* --- Data->update book (in UpdateBook.java) --- */
            UpdateBook updateBookDialog = new UpdateBook(title.trim());
            updateBookDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            centerDialog(updateBookDialog);
            updateBookDialog.setVisible(true);
          } else if (isMusic(title.trim())) {
            /* --- Data->update music (in UpdateMusic.java) --- */
            UpdateMusic updateMusicDialog = new UpdateMusic(title.trim());
            updateMusicDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            centerDialog(updateMusicDialog);
            updateMusicDialog.setVisible(true);
          } else if (isMovie(title.trim())) {
            /* --- Data->update movie (in UpdateMovie.java) --- */
            UpdateMovie updateMovieDialog = new UpdateMovie(title.trim());
            updateMovieDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            centerDialog(updateMovieDialog);
            updateMovieDialog.setVisible(true);
          } else {
            JOptionPane.showMessageDialog(null, "No item with that name.", "Error",
                JOptionPane.OK_OPTION);
          }
        }

      }
    });
    menu.add(menuItem);
    menuItem = new JMenuItem("Remove", KeyEvent.VK_R);
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String title = JOptionPane.showInputDialog(null,
            "Enter name of book/music/movie to remove:", "Remove", JOptionPane.PLAIN_MESSAGE);
        Connection con = ConnectionDriver.connectToDatabase();

        if (title != null) {
          if (isBook(title.trim())) {
            /* --- Data->remove book (in UpdateBook.java)--- */
            UpdateBook.deleteBook(con, title.trim());
          } else if (isMusic(title.trim())) {
            /* --- Data->remove music (in UpdateMusic.java)--- */
            UpdateMusic.deleteMusic(con, title.trim());
          } else if (isMovie(title.trim())) {
            /* --- Data->remove movie (in UpdateMovie.java)--- */
            UpdateMovie.deleteMovie(con, title.trim());
          } else {
            JOptionPane.showMessageDialog(null, "No item with that name.", "Error",
                JOptionPane.OK_OPTION);
          }

          if (con != null) {
            try {
              con.close();
            } catch (SQLException e1) {
            }
          }
        }
      }
    });
    menu.add(menuItem);

    // second menu View
    JButton viewBtn = new JButton("View");
    viewBtn.setOpaque(true);
    viewBtn.setContentAreaFilled(false);
    viewBtn.setBorderPainted(false);
    viewBtn.setFocusable(false);
    viewBtn.setMnemonic(KeyEvent.VK_V);
    viewBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        /* --- View (in QueryPage.java)--- */
        QueryPage queryPage = new QueryPage();
        queryPage.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        centerDialog(queryPage);
        queryPage.setVisible(true);
      }
    });
    menuBar.add(viewBtn);
    // third menu Report
    menu = new JMenu("Report");
    menu.setMnemonic(KeyEvent.VK_R);
    menuBar.add(menu);

    Connection con = ConnectionDriver.connectToDatabase();

    menuItem = new JMenuItem("Authors’ Publications");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String fName = null;
        String lName = null;
        String mName = null;
        String authorName = JOptionPane.showInputDialog(null, "Enter name of author:", "R1", JOptionPane.PLAIN_MESSAGE);
        String[] col = {"ISBN", "Book's Name", "Published Year"};
        tableModel = new DefaultTableModel(col, 0);
        table.setModel(tableModel);
        
        if(authorName != null) {
          String[] nameList = authorName.trim().split(" ");
          if (nameList.length == 3) {
            fName = nameList[0];
            mName = nameList[1];
            lName = nameList[2];
          } else {
            fName = nameList[0];
            lName = nameList[1];
          }
          getR1(con, fName, lName);
        }
      }
    });
    menu.add(menuItem);
    menuItem = new JMenuItem("Publications in one Year");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String year = JOptionPane.showInputDialog(null, "Enter year to search:", "R2",
            JOptionPane.PLAIN_MESSAGE);
        String[] col =
            {"ISBN", "Book's Name", "Published Year", "Author Family Name", "First Name Initial"};
        tableModel = new DefaultTableModel(col, 0);
        table.setModel(tableModel);
        if (year != null) {
          getR2(con, Integer.parseInt(year));
        }
      }
    });
    menu.add(menuItem);
    menuItem = new JMenuItem("Books with Similar Topic");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String subject = JOptionPane.showInputDialog(null, "Enter year to search:", "R3",
            JOptionPane.PLAIN_MESSAGE);
        String[] col = {"ISBN", "Book's Name", "Published Year"};
        tableModel = new DefaultTableModel(col, 0);
        table.setModel(tableModel);
        if (subject != null) {
          getR3(con, subject);
        }
      }
    });
    menu.add(menuItem);
    menuItem = new JMenuItem("Frequent Publishers");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String[] col = {"ISBN", "Book's Name", "Author's Name", "Published Year"};
        tableModel = new DefaultTableModel(col, 0);
        table.setModel(tableModel);
        getR4(con);
      }
    });
    menu.add(menuItem);
    menuItem = new JMenuItem("Most Popular Subjects");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String[] col = {"Tag", "Frequency"};
        tableModel = new DefaultTableModel(col, 0);
        table.setModel(tableModel);
        getR5(con);
      }
    });
    menu.add(menuItem);
    menuItem = new JMenuItem("Multi Skills Movie Crew");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String[] col = {"Family Name", "Role", "Movie Name"};
        tableModel = new DefaultTableModel(col, 0);
        table.setModel(tableModel);
        getR6(con);
      }
    });
    menu.add(menuItem);
    menuItem = new JMenuItem("Award Winning Movies");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String[] col = {"Movie Name", "Director Name", "# of Awards"};
        tableModel = new DefaultTableModel(col, 0);
        table.setModel(tableModel);
        getR7(con);
      }
    });
    menu.add(menuItem);
    menuItem = new JMenuItem("Music with Similar Name");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String[] col = {"Album Name", "Music Name", "Singers", "Year"};
        tableModel = new DefaultTableModel(col, 0);
        table.setModel(tableModel);
        getR8(con);
      }
    });
    menu.add(menuItem);
    menuItem = new JMenuItem("Multi Skills Music Crew");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String[] col = {"Family Name", "First Name Initial", "Music Name", "Album Name", "Year"};
        tableModel = new DefaultTableModel(col, 0);
        table.setModel(tableModel);
        getR9(con);
      }
    });
    menu.add(menuItem);
    menuItem = new JMenuItem("Similar Names");
    menuItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String[] col = {"Family Name", "Roles"};
        tableModel = new DefaultTableModel(col, 0);
        table.setModel(tableModel);
        getR10(con);
      }
    });
    menu.add(menuItem);

  }

  private static void centerWindow(JFrame frm) {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) ((dimension.getWidth() - frm.getWidth()) / 2);
    int y = (int) ((dimension.getHeight() - frm.getHeight()) / 2);
    frm.setLocation(x, y);
  }

  private static void centerDialog(JDialog dialog) {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) ((dimension.getWidth() - dialog.getWidth()) / 2);
    int y = (int) ((dimension.getHeight() - dialog.getHeight()) / 2);
    dialog.setLocation(x, y);
  }

  private static boolean isBook(String title) {
    Connection con = ConnectionDriver.connectToDatabase();
    PreparedStatement preparedStmt = null;
    String query = "select ISBN from book where Title = ?";
    boolean isBook = false;
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, title.isEmpty() ? null : title);

      ResultSet rs = preparedStmt.executeQuery();
      if (rs.next()) {
        isBook = true;
      }
      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e) {
          
        }
      }
    }
    return isBook;
  }

  private static boolean isMusic(String title) {
    Connection con = ConnectionDriver.connectToDatabase();
    PreparedStatement preparedStmt = null;
    String query = "select AlbumName, Year, MusicName from Music where AlbumName = ?";
    boolean isMusic = false;
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, title.isEmpty() ? null : title);

      ResultSet rs = preparedStmt.executeQuery();
      if (rs.next()) {
        isMusic = true;
      }
      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e) {
          
        }
      }
    }
    return isMusic;
  }

  private static boolean isMovie(String title) {
    Connection con = ConnectionDriver.connectToDatabase();
    PreparedStatement preparedStmt = null;
    String query = "select Moviename, Year from Movie where MovieName = ?";
    boolean isMovie = false;
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, title.isEmpty() ? null : title);

      ResultSet rs = preparedStmt.executeQuery();
      if (rs.next()) {
        isMovie = true;
      }
      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e) {
          
        }
      }
    }
    return isMovie;
  }

  /* --- report 1: Authors’ Publications --- */
  private static void getR1(Connection con, String fName, String lName) {
    String ISBN = null;
    String bookName = null;
    int year = 0;

    PreparedStatement preparedStmt = null;
    String query =
        "select book.ISBN, Title, YearOfPublication from book, bookauthor, peopleinvolved where book.ISBN = bookauthor.ISBN and "
            + "bookauthor.Author_ID = peopleinvolved.ID and peopleinvolved.FirstName = ? and peopleinvolved.FamilyName = ? order by ISBN asc";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, fName.isEmpty() ? null : fName);
      preparedStmt.setString(2, lName.isEmpty() ? null : lName);

      ResultSet rs = preparedStmt.executeQuery();

      while (rs.next()) {
        ISBN = rs.getString(1);
        bookName = rs.getString(2);
        year = rs.getInt(3);

        tableModel.addRow(new Object[] {ISBN, bookName, year});
      }

      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException e) {
      }
    }
  }

  /* --- report 2: Publications in one Year --- */
  private static void getR2(Connection con, int year) {
    String ISBN = null;
    String bookName = null;
    String lName = null;
    String fName = null;
    // display all the authors of each book
    PreparedStatement preparedStmt = null;
    String query =
        "select book.ISBN, Title, FamilyName, FirstName from book, bookauthor, peopleinvolved where book.ISBN = bookauthor.ISBN and "
            + "bookauthor.Author_ID = peopleinvolved.ID and book.YearOfPublication = ? order by Title asc";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      if (year == 0) {
        preparedStmt.setNull(1, Types.INTEGER);
      } else {
        preparedStmt.setInt(1, year);
      }

      ResultSet rs = preparedStmt.executeQuery();

      while (rs.next()) {
        ISBN = rs.getString(1);
        bookName = rs.getString(2);
        lName = rs.getString(3);
        fName = rs.getString(4);

        tableModel.addRow(new Object[] {ISBN, bookName, year, lName, fName.substring(0, 1)});
      }

      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException e) {
      }
    }
  }

  /* --- report 3: Books with Similar Topic --- */
  private static void getR3(Connection con, String subject) {
    String ISBN = null;
    String bookName = null;
    int year = 0;

    PreparedStatement preparedStmt = null;
    String query =
        "select book.ISBN, Title, YearOfPublication from book, bookkeyword, keyword where book.ISBN = bookkeyword.ISBN and "
            + "bookkeyword.Keyword_ID = keyword.ID and (book.Abstract like ? or keyword.Tag like ? or book.Title like ?) group by Title order by book.ISBN";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, subject.isEmpty() ? null : "%" + subject + "%");
      preparedStmt.setString(2, subject.isEmpty() ? null : "%" + subject + "%");
      preparedStmt.setString(3, subject.isEmpty() ? null : "%" + subject + "%");

      ResultSet rs = preparedStmt.executeQuery();

      while (rs.next()) {
        ISBN = rs.getString(1);
        bookName = rs.getString(2);
        year = rs.getInt(3);

        tableModel.addRow(new Object[] {ISBN, bookName, year});
      }

      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException e) {
      }
    }
  }

  /* --- report 4: Frequent Publishers --- */
  private static void getR4(Connection con) {
    String mName = null;

    PreparedStatement preparedStmt = null;
    String query =
        "select A.ISBN, A.Title, A.YearOfPublication, peopleinvolved.FirstName, peopleinvolved.MiddleName, peopleinvolved.FamilyName, B.ISBN, B.Title, B.YearOfPublication from "
            + "(select book.ISBN, book.Title, book.YearOfPublication, bookauthor.Author_ID from book,bookauthor where book.ISBN = bookauthor.ISBN) as A, "
            + "(select book.ISBN, book.Title, book.YearOfPublication, bookauthor.Author_ID from book,bookauthor where book.ISBN = bookauthor.ISBN) as B, "
            + "peopleinvolved where A.Author_ID = peopleinvolved.ID and A.Author_ID = B.Author_ID and A.YearOfPublication +1 = B.YearOfPublication "
            + "order by peopleinvolved.FamilyName, A.YearOfPublication asc;";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);

      ResultSet rs = preparedStmt.executeQuery();

      while (rs.next()) {
        mName = (rs.getString(5) == null ? "" : rs.getString(5) + " ");
        tableModel.addRow(new Object[] {rs.getString(1), rs.getString(2), rs.getString(4) + " " + mName + rs.getString(6), rs.getInt(3)});
        tableModel.addRow(new Object[] {rs.getString(7), rs.getString(8), rs.getString(4) + " " + mName + rs.getString(6), rs.getInt(9)});
      }

      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException e) {
      }
    }
  }

  /* --- report 5: Most Popular Subjects --- */
  private static void getR5(Connection con) {
    String tag = null;
    int frequency = 0;

    PreparedStatement preparedStmt = null;
    String query =
        "select Tag, count(Keyword_ID) as frequency from keyword,bookkeyword where keyword.ID = bookkeyword.Keyword_ID group by Keyword_ID "
        + "having frequency = (select MAX(TagCount) from (select count(Keyword_ID) as TagCount from bookkeyword group by Keyword_ID) as A) order by Tag";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();

      while (rs.next()) {
        tag = rs.getString(1);
        frequency = rs.getInt(2);

        tableModel.addRow(new Object[] {tag, frequency});
      }

      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException e) {
      }
    }
  }

  /* --- report 6: Multi Skills Movie Crew --- */
  private static void getR6(Connection con) {
    String lName = null;
    String role = null;
    String movieName = null;

    PreparedStatement preparedStmt = null;
    String query =
        "select FamilyName, role.Description, MovieName from peopleinvolved, crewmember, role where peopleinvolved.ID = crewmember.PeopleInvolved_ID "
            + "and crewmember.Role_ID = role.ID and peopleinvolved.id in "
            + "(select PeopleInvolved_ID from crewmember group by PeopleInvolved_ID having count(distinct Role_ID) > 1) order by FamilyName asc;";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();

      while (rs.next()) {
        lName = rs.getString(1);
        role = rs.getString(2);
        movieName = rs.getString(3);

        tableModel.addRow(new Object[] {lName, role, movieName});
      }

      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException e) {
      }
    }
  }

  /* --- report 7: Award Winning Movies --- */
  private static void getR7(Connection con) {
    String mName = null;

    PreparedStatement preparedStmt = null;
    String query =
        "select Firstname, MiddleName, FamilyName, A.MovieName, A.awards from (select MovieName, count(Award) as awards from award where award.Award = 1 group by MovieName) as A, "
            + "(select ID from role where Description = 'Director') as dirRole, peopleinvolved, crewmember where peopleinvolved.ID = crewmember.PeopleInvolved_ID and "
            + "crewmember.MovieName = A.MovieName and crewmember.Role_ID = dirRole.ID order by FamilyName asc, MovieName asc";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();

      while (rs.next()) {
        mName = (rs.getString(2) == null ? "" : rs.getString(2) + " ");
        tableModel.addRow(new Object[] {rs.getString(4), rs.getString(1) + " " + mName + rs.getString(3), rs.getInt(5)});
      }

      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException e) {
      }
    }
  }

  /* --- report 8: Music with Similar Name --- */
  private static void getR8(Connection con) {
    String mName = null;

    PreparedStatement preparedStmt = null;
    String query =
        "select A.*, B.* from (select FirstName, MiddleName, FamilyName, AlbumName, Year, MusicName from musicsinger, peopleinvolved where "
            + "musicsinger.PeopleInvolved_ID = peopleinvolved.ID) as A, "
            + "(select FirstName, MiddleName, FamilyName, AlbumName, Year, MusicName from musicsinger, peopleinvolved where musicsinger.PeopleInvolved_ID = peopleinvolved.ID) as B "
            + "where A.MusicName = B.MusicName and A.AlbumName != B.AlbumName group by A.MusicName order by A.MusicName asc, A.Year asc";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();

      while (rs.next()) {
        mName = (rs.getString(2) == null ? "" : rs.getString(2) + " ");
        tableModel.addRow(new Object[] {rs.getString(4), rs.getString(6), rs.getString(1) + " " + mName + rs.getString(3), rs.getInt(5)});
        mName = (rs.getString(8) == null ? "" : rs.getString(8) + " ");
        tableModel.addRow(new Object[] {rs.getString(10), rs.getString(12), rs.getString(7) + " " + mName + rs.getString(9), rs.getInt(11)});
      }

      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException e) {
      }
    }
  }

  /* --- report 9: Multi Skills Music Crew --- */
  private static void getR9(Connection con) {
    PreparedStatement preparedStmt = null;
    String query =
        "select FamilyName, FirstName, AlbumName, MusicName, Year from peopleinvolvedmusic join peopleinvolved on "
            + "peopleinvolvedmusic.PeopleInvolved_ID = peopleinvolved.ID where IsSongwriter = 1 and IsComposer = 1 and isArranger = 0 order by Year asc, MusicName desc";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();

      while (rs.next()) {
        tableModel.addRow(new Object[] {rs.getString(1), rs.getString(2).substring(0, 1), rs.getString(4), rs.getString(3), rs.getInt(5)});
      }

      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException e) {
      }
    }
  }

  /* --- report 10: Similar Names --- */
  private static void getR10(Connection con) {
    PreparedStatement preparedStmt = null;
    String query = "create or replace view r10 as " + 
        "(select ID, FamilyName from peopleinvolved where FamilyName in (select FamilyName from peopleinvolved group by FamilyName having count(FamilyName) > 1))";
    try {
      con.setAutoCommit(false);
      //make view first
      preparedStmt = con.prepareStatement(query);
      preparedStmt.executeUpdate();
      query = "select FamilyName, 'Music people' from peopleinvolvedmusic join r10 on peopleinvolvedmusic.PeopleInvolved_ID = r10.ID " + 
          "union all select FamilyName, 'Author' from bookauthor join r10 on bookauthor.Author_ID = r10.ID " + 
          "union all select FamilyName, 'Music producer' from music join r10 on music.Producer_ID = r10.ID " + 
          "union all select FamilyName, 'Singer' from musicsinger join r10 on musicsinger.PeopleInvolved_ID = r10.ID " + 
          "union all select FamilyName, 'Movie crew' from crewmember join r10 on crewmember.PeopleInvolved_ID = r10.ID " + 
          "order by Familyname;";
      preparedStmt = con.prepareStatement(query);
      ResultSet rs = preparedStmt.executeQuery();

      while (rs.next()) {
        tableModel.addRow(new Object[] {rs.getString(1), rs.getString(2)});
      }

      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException e) {
      }
    }
  }

}
