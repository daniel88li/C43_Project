import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class InsertBook extends JDialog {

  private final JPanel contentPanel = new JPanel();


  /**
   * Create the dialog.
   */
  public InsertBook() {
    setModal(true);
    setTitle("Insert Book");
    setSize(624, 690);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(null);

    JLabel lblIsbn = new JLabel("ISBN:");
    lblIsbn.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblIsbn.setBounds(10, 10, 126, 20);
    contentPanel.add(lblIsbn);

    JLabel lblTitle = new JLabel("Title:");
    lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblTitle.setBounds(10, 40, 126, 20);
    contentPanel.add(lblTitle);

    JLabel lblAuthor = new JLabel("Author 1:");
    lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblAuthor.setBounds(10, 70, 126, 20);
    contentPanel.add(lblAuthor);

    JLabel lblAuthor_1 = new JLabel("Author 2:");
    lblAuthor_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblAuthor_1.setBounds(10, 100, 126, 20);
    contentPanel.add(lblAuthor_1);

    JLabel lblAuthor_2 = new JLabel("Author 3:");
    lblAuthor_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblAuthor_2.setBounds(10, 130, 126, 20);
    contentPanel.add(lblAuthor_2);

    JLabel lblAuthor_3 = new JLabel("Author 4:");
    lblAuthor_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblAuthor_3.setBounds(10, 160, 126, 20);
    contentPanel.add(lblAuthor_3);

    JLabel lblAuthor_4 = new JLabel("Author 5:");
    lblAuthor_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblAuthor_4.setBounds(10, 190, 126, 20);
    contentPanel.add(lblAuthor_4);

    JLabel lblPublisher = new JLabel("Publisher:");
    lblPublisher.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblPublisher.setBounds(12, 220, 124, 20);
    contentPanel.add(lblPublisher);

    JLabel lblNumberOfPages = new JLabel("Number of Pages:");
    lblNumberOfPages.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblNumberOfPages.setBounds(12, 250, 124, 20);
    contentPanel.add(lblNumberOfPages);

    JLabel lblPublicationYear = new JLabel("Publication Year:");
    lblPublicationYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblPublicationYear.setBounds(12, 280, 124, 20);
    contentPanel.add(lblPublicationYear);

    JLabel lblEdition = new JLabel("Edition:");
    lblEdition.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblEdition.setBounds(12, 310, 124, 20);
    contentPanel.add(lblEdition);

    JLabel lblDescription = new JLabel("Description:");
    lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblDescription.setBounds(12, 340, 124, 20);
    contentPanel.add(lblDescription);

    JLabel lblKeyword = new JLabel("Keywords:");
    lblKeyword.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblKeyword.setBounds(12, 483, 124, 20);
    contentPanel.add(lblKeyword);

    JTextField txtISBN = new JTextField();
    txtISBN.setBounds(160, 10, 400, 20);
    contentPanel.add(txtISBN);
    txtISBN.setColumns(10);

    JTextField txtTitle = new JTextField();
    txtTitle.setBounds(160, 40, 400, 20);
    contentPanel.add(txtTitle);
    txtTitle.setColumns(10);

    JTextField txtPublisher = new JTextField();
    txtPublisher.setColumns(10);
    txtPublisher.setBounds(162, 226, 208, 20);
    contentPanel.add(txtPublisher);

    JTextField txtNumPages = new JTextField();
    txtNumPages.setColumns(10);
    txtNumPages.setBounds(162, 256, 208, 20);
    contentPanel.add(txtNumPages);

    JTextField txtPubYear = new JTextField();
    txtPubYear.setColumns(10);
    txtPubYear.setBounds(162, 286, 208, 20);
    contentPanel.add(txtPubYear);

    JTextField txtEdition = new JTextField();
    txtEdition.setColumns(10);
    txtEdition.setBounds(162, 316, 208, 20);
    contentPanel.add(txtEdition);

    JTextArea txtDescription = new JTextArea();
    txtDescription.setLineWrap(true);
    txtDescription.setColumns(10);
    txtDescription.setBounds(162, 346, 400, 106);
    Border border = BorderFactory.createLineBorder(Color.BLACK);
    txtDescription.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    contentPanel.add(txtDescription);

    JTextArea txtKeyword = new JTextArea();
    txtKeyword.setLineWrap(true);
    txtKeyword.setBounds(162, 480, 400, 106);
    txtKeyword.setColumns(10);
    txtKeyword.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    contentPanel.add(txtKeyword);
    

    JTextField txtAuthor1First = new JTextField();
    txtAuthor1First.setColumns(10);
    txtAuthor1First.setBounds(160, 70, 100, 20);
    contentPanel.add(txtAuthor1First);

    JTextField txtAuthor1Mid = new JTextField();
    txtAuthor1Mid.setColumns(10);
    txtAuthor1Mid.setBounds(272, 70, 84, 20);
    contentPanel.add(txtAuthor1Mid);

    JTextField txtAuthor1Last = new JTextField();
    txtAuthor1Last.setColumns(10);
    txtAuthor1Last.setBounds(370, 70, 100, 20);
    contentPanel.add(txtAuthor1Last);

    JTextField txtAuthor2First = new JTextField();
    txtAuthor2First.setColumns(10);
    txtAuthor2First.setBounds(160, 100, 100, 20);
    contentPanel.add(txtAuthor2First);

    JTextField txtAuthor2Mid = new JTextField();
    txtAuthor2Mid.setColumns(10);
    txtAuthor2Mid.setBounds(272, 100, 84, 20);
    contentPanel.add(txtAuthor2Mid);

    JTextField txtAuthor2Last = new JTextField();
    txtAuthor2Last.setColumns(10);
    txtAuthor2Last.setBounds(370, 100, 100, 20);
    contentPanel.add(txtAuthor2Last);

    JTextField txtAuthor3First = new JTextField();
    txtAuthor3First.setColumns(10);
    txtAuthor3First.setBounds(160, 130, 100, 20);
    contentPanel.add(txtAuthor3First);

    JTextField txtAuthor3Mid = new JTextField();
    txtAuthor3Mid.setColumns(10);
    txtAuthor3Mid.setBounds(272, 130, 84, 20);
    contentPanel.add(txtAuthor3Mid);

    JTextField txtAuthor3Last = new JTextField();
    txtAuthor3Last.setColumns(10);
    txtAuthor3Last.setBounds(370, 130, 100, 20);
    contentPanel.add(txtAuthor3Last);

    JTextField txtAuthor4First = new JTextField();
    txtAuthor4First.setColumns(10);
    txtAuthor4First.setBounds(160, 160, 100, 20);
    contentPanel.add(txtAuthor4First);

    JTextField txtAuthor4Mid = new JTextField();
    txtAuthor4Mid.setColumns(10);
    txtAuthor4Mid.setBounds(272, 160, 84, 20);
    contentPanel.add(txtAuthor4Mid);

    JTextField txtAuthor4Last = new JTextField();
    txtAuthor4Last.setColumns(10);
    txtAuthor4Last.setBounds(370, 160, 100, 20);
    contentPanel.add(txtAuthor4Last);

    JTextField txtAuthor5First = new JTextField();
    txtAuthor5First.setColumns(10);
    txtAuthor5First.setBounds(160, 190, 100, 20);
    contentPanel.add(txtAuthor5First);

    JTextField txtAuthor5Mid = new JTextField();
    txtAuthor5Mid.setColumns(10);
    txtAuthor5Mid.setBounds(272, 190, 84, 20);
    contentPanel.add(txtAuthor5Mid);

    JTextField txtAuthor5Last = new JTextField();
    txtAuthor5Last.setColumns(10);
    txtAuthor5Last.setBounds(370, 190, 100, 20);
    contentPanel.add(txtAuthor5Last);

    JRadioButton rbMale1 = new JRadioButton("Male");
    rbMale1.setBounds(476, 71, 53, 23);
    contentPanel.add(rbMale1);

    JRadioButton rbFemale1 = new JRadioButton("Female");
    rbFemale1.setBounds(531, 71, 71, 23);
    contentPanel.add(rbFemale1);

    JRadioButton rbMale2 = new JRadioButton("Male");
    rbMale2.setBounds(476, 100, 53, 23);
    contentPanel.add(rbMale2);

    JRadioButton rbFemale2 = new JRadioButton("Female");
    rbFemale2.setBounds(531, 100, 71, 23);
    contentPanel.add(rbFemale2);

    JRadioButton rbMale3 = new JRadioButton("Male");
    rbMale3.setBounds(476, 127, 53, 23);
    contentPanel.add(rbMale3);

    JRadioButton rbFemale3 = new JRadioButton("Female");
    rbFemale3.setBounds(531, 127, 71, 23);
    contentPanel.add(rbFemale3);

    JRadioButton rbMale4 = new JRadioButton("Male");
    rbMale4.setBounds(476, 157, 53, 23);
    contentPanel.add(rbMale4);

    JRadioButton rbFemale4 = new JRadioButton("Female");
    rbFemale4.setBounds(531, 157, 71, 23);
    contentPanel.add(rbFemale4);

    JRadioButton rbMale5 = new JRadioButton("Male");
    rbMale5.setBounds(476, 187, 53, 23);
    contentPanel.add(rbMale5);

    JRadioButton rbFemale5 = new JRadioButton("Female");
    rbFemale5.setBounds(531, 187, 71, 23);
    contentPanel.add(rbFemale5);

    ButtonGroup author1 = new ButtonGroup();
    author1.add(rbMale1);
    author1.add(rbFemale1);
    ButtonGroup author2 = new ButtonGroup();
    author2.add(rbMale2);
    author2.add(rbFemale2);
    ButtonGroup author3 = new ButtonGroup();
    author3.add(rbMale3);
    author3.add(rbFemale3);
    ButtonGroup author4 = new ButtonGroup();
    author4.add(rbMale4);
    author4.add(rbFemale4);
    ButtonGroup author5 = new ButtonGroup();
    author5.add(rbMale5);
    author5.add(rbFemale5);
    
    JLabel lblSeparateByCommas = new JLabel("(Separate by commas)");
    lblSeparateByCommas.setFont(new Font("Tahoma", Font.PLAIN, 12));
    lblSeparateByCommas.setBounds(10, 502, 126, 20);
    contentPanel.add(lblSeparateByCommas);

    {
      JPanel buttonPane = new JPanel();
      buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
      getContentPane().add(buttonPane, BorderLayout.SOUTH);
      {
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
            /* --- Data->insert->book --- */
            Connection con = ConnectionDriver.connectToDatabase();
            PreparedStatement preparedStmt = null;
            try {
              con.setAutoCommit(false);
              insertBook(con, txtISBN.getText().trim(), txtTitle.getText().trim(), txtPublisher.getText().trim(), txtNumPages.getText().trim(), txtPubYear.getText().trim(), txtEdition.getText().trim(), txtDescription.getText().trim());
              
              int ID = 0;
              int keyID = 0;
              //insert into peopleinvolved and bookauthor
              if (!txtAuthor1First.getText().isEmpty()) {
                ID = insertPeople(con, txtAuthor1First.getText().trim(), txtAuthor1Mid.getText().trim(), txtAuthor1Last.getText().trim(), rbMale1, rbFemale1);
                insertBookAuthor(con, txtISBN.getText().trim(), ID);
              }
              if (!txtAuthor2First.getText().isEmpty()) {
                ID = insertPeople(con, txtAuthor2First.getText().trim(), txtAuthor2Mid.getText().trim(), txtAuthor2Last.getText().trim(), rbMale2, rbFemale2);
                insertBookAuthor(con, txtISBN.getText().trim(), ID);
              }
              if (!txtAuthor3First.getText().isEmpty()) {
                ID = insertPeople(con, txtAuthor3First.getText().trim(), txtAuthor3Mid.getText().trim(), txtAuthor3Last.getText().trim(), rbMale3, rbFemale3);
                insertBookAuthor(con, txtISBN.getText().trim(), ID);
              }
              if (!txtAuthor4First.getText().isEmpty()) {
                ID = insertPeople(con, txtAuthor4First.getText().trim(), txtAuthor4Mid.getText().trim(), txtAuthor4Last.getText().trim(), rbMale4, rbFemale4);
                insertBookAuthor(con, txtISBN.getText().trim(), ID);
              }
              if (!txtAuthor5First.getText().isEmpty()) {
                ID = insertPeople(con, txtAuthor5First.getText().trim(), txtAuthor5Mid.getText().trim(), txtAuthor5Last.getText().trim(), rbMale5, rbFemale5);
                insertBookAuthor(con, txtISBN.getText().trim(), ID);
              }
              //insert keyword and bookkeyword
              String keywordList[] = txtKeyword.getText().trim().split(",");
              for (String eachKeyword : keywordList) {
                // insert keywords if not empty
                if (!eachKeyword.trim().equals("")) {
                  //insert keyword if its new otherwise get the existing keyword id
                  keyID = insertKeyword(con, eachKeyword.trim());
                  insertBookKeyword(con, txtISBN.getText().trim(), keyID);
                }
              }
              
              con.commit();
              dispose();
            } catch (SQLException e) {
              System.out.println(e);
              if (con != null) {
                try {
                  System.err.print("Transaction is being rolled back.");
                  con.rollback();
                  } catch (SQLException e2) {}
              }
            } finally {
              if (preparedStmt != null) {
                try {
                  preparedStmt.close();
                } catch (SQLException e) {
                  // TODO Auto-generated catch block
                  
                }
              }
              try {
                con.setAutoCommit(true);
              } catch (SQLException e) {
                // TODO Auto-generated catch block
                
              }
              try {
                con.close();
              } catch (SQLException e) {
                // TODO Auto-generated catch block
                
              }
            }
          }
        });
        submitButton.setActionCommand("Submit");
        buttonPane.add(submitButton);
        getRootPane().setDefaultButton(submitButton);
      }
      {
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
            dispose();
          }
        });
        cancelButton.setActionCommand("Cancel");
        buttonPane.add(cancelButton);
      }
    }
  }

  public static void insertBook(Connection con, String ISBN, String title, String publisher, String numPages, String year, String edition, String description) {

    PreparedStatement preparedStmt = null;
    String query = "insert into book (ISBN, Title, Publisher, NumberOfPages, YearOfPublication, EditionNumber, Abstract) values (?, ?, ?, ?, ?, ?, ?)";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, ISBN.isEmpty() ? null : ISBN);
      preparedStmt.setString(2, title.isEmpty() ? null : title);
      preparedStmt.setString(3, publisher.isEmpty() ? null : publisher);
      if (!numPages.isEmpty()) {
        preparedStmt.setInt(4, Integer.parseInt(numPages));
      } else {
        preparedStmt.setNull(4, Types.INTEGER);
      }
      if (!year.isEmpty()) {
        preparedStmt.setInt(5, Integer.parseInt(year.trim()));
      } else {
        preparedStmt.setNull(5, Types.INTEGER);
      }
      if (!edition.isEmpty()) {
        preparedStmt.setInt(6, Integer.parseInt(edition.trim()));
      } else {
        preparedStmt.setNull(6, Types.INTEGER);
      }
      preparedStmt.setString(7, description.isEmpty() ? null : description.trim());
      preparedStmt.executeUpdate();
      preparedStmt.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
          } catch (SQLException e2) {}
      }
    }
  }
  public static int insertPeople(Connection con, String first, String mid, String last, JRadioButton M, JRadioButton F) {
    int ID = 0;
    
    // check if person already exist
    ID = getExistingPeopleID(con, first, mid, last, M, F);

    if (ID == 0 ) {
      PreparedStatement preparedStmt = null;
      String query = "insert into peopleinvolved (FirstName, MiddleName, FamilyName, gender) values (?, ?, ?, ?)";
      try {
        con.setAutoCommit(false);
        preparedStmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStmt.setString(1, first.isEmpty() ? null : first);
        preparedStmt.setString(2, mid.isEmpty() ? null : mid);
        preparedStmt.setString(3, last.isEmpty() ? null : last);
        if (M.isSelected()) {
          preparedStmt.setByte(4, (byte) 1);
        } else if (F.isSelected()) {
          preparedStmt.setByte(4, (byte) 0);
        } else {
          preparedStmt.setNull(4, Types.TINYINT);
        }
        preparedStmt.executeUpdate();
        ResultSet rs = preparedStmt.getGeneratedKeys();
        if (rs.next()) {
          ID = rs.getInt(1);
        }
        if(rs != null) {
          rs.close();
        }
        preparedStmt.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        
        if (con != null) {
          try {
            System.err.print("Transaction is being rolled back.");
            con.rollback();
            } catch (SQLException e2) {}
        }
      }
    }
    return ID;
  }
  
  public static void insertBookAuthor(Connection con, String ISBN, int ID) {
    PreparedStatement preparedStmt = null;
    String query = "insert into bookauthor (ISBN, Author_ID) values (?, ?)";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, ISBN.isEmpty() ? null : ISBN);
      if (ID == 0) {
        preparedStmt.setNull(2, Types.INTEGER);
      } else {
        preparedStmt.setInt(2, ID);
      }
      preparedStmt.executeUpdate();
      preparedStmt.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
          } catch (SQLException e2) {}
      }
    }
  }
  
  public static int insertKeyword(Connection con, String keyword) {
    PreparedStatement preparedStmt = null;
    int keyID = 0;
    keyID = getExistingKeyword(con, keyword);
    if (keyID == 0) {
      String query = "insert into keyword (Tag) values (?)";
      try {
        con.setAutoCommit(false);
        preparedStmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStmt.setString(1, keyword.isEmpty() ? null : keyword);
        preparedStmt.executeUpdate();
        ResultSet rs = preparedStmt.getGeneratedKeys();
        if (rs.next()) {
          keyID = rs.getInt(1);
        }
        if (rs != null) {
          rs.close();
        }
        preparedStmt.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        
        if (con != null) {
          try {
            System.err.print("Transaction is being rolled back.");
            con.rollback();
            } catch (SQLException e2) {}
        }
      }
    }
    return keyID;
  }
  
  public static void insertBookKeyword(Connection con, String ISBN, int keyID) {
    PreparedStatement preparedStmt = null;
    String query = "insert into bookkeyword (ISBN, Keyword_ID) values (?, ?)";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, ISBN.isEmpty() ? null : ISBN);

      if (keyID == 0) {
        preparedStmt.setNull(2, Types.INTEGER);
      } else {
        preparedStmt.setInt(2, keyID);
      }
      preparedStmt.executeUpdate();
      preparedStmt.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
          } catch (SQLException e2) {}
      }
    }
  }
  
  public static int getExistingPeopleID(Connection con, String first, String mid, String last, JRadioButton M, JRadioButton F) {
    int ID = 0;
    PreparedStatement preparedStmt = null;
    String query = "select ID from peopleinvolved where FirstName = ? and MiddleName ";
    boolean genderNull = false;
    if (!M.isSelected() && !F.isSelected()) {
      genderNull = true;
    }
    query += (mid.equals("") ? "is" : "=");
    query += " ? and FamilyName = ? and gender ";
    query += (genderNull ? "is" : "=");
    query += " ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, first.isEmpty() ? null : first);
      preparedStmt.setString(2, mid.isEmpty() ? null : mid);
      preparedStmt.setString(3, last.isEmpty() ? null : last);
      if (M.isSelected()) {
        preparedStmt.setByte(4, (byte) 1);
      } else if (F.isSelected()) {
        preparedStmt.setByte(4, (byte) 0);
      } else {
        preparedStmt.setNull(4, Types.TINYINT);
      }

      ResultSet rs = preparedStmt.executeQuery();
      if (rs.next()) {
        ID = rs.getInt(1);
      }
      if (rs != null) {
        rs.close();
      }
      preparedStmt.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
          } catch (SQLException e2) {}
      }
    }
    return ID;
  }
  
  public static int getExistingKeyword(Connection con, String keyword) {
    PreparedStatement preparedStmt = null;
    int keyID = 0;
    String query = "select ID from keyword where Tag = ?";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, keyword.isEmpty() ? null : keyword);
      
      ResultSet rs = preparedStmt.executeQuery();
      if (rs.next()) {
        keyID = rs.getInt(1);
      }
      if (rs != null) {
        rs.close();
      }

      preparedStmt.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
          } catch (SQLException e2) {}
      }
    }
    return keyID;
  }
}
