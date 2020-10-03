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
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class UpdateBook extends JDialog {

  private final JPanel contentPanel = new JPanel();
  ArrayList<String> oldKeyList = new ArrayList<>();
  ArrayList<Integer> authorIDList = new ArrayList<>();
  JTextField txtISBN;
  JTextField txtTitle;
  JTextField txtPublisher;
  JTextField txtNumPages;
  JTextField txtPubYear;
  JTextField txtEdition;
  JTextArea txtDescription;
  JTextArea txtKeyword;
  JTextField txtAuthor1First;
  JTextField txtAuthor1Mid;
  JTextField txtAuthor1Last;
  JTextField txtAuthor2First;
  JTextField txtAuthor2Mid;
  JTextField txtAuthor2Last;
  JTextField txtAuthor3First;
  JTextField txtAuthor3Mid;
  JTextField txtAuthor3Last;
  JTextField txtAuthor4First;
  JTextField txtAuthor4Mid;
  JTextField txtAuthor4Last;
  JTextField txtAuthor5First;
  JTextField txtAuthor5Mid;
  JTextField txtAuthor5Last;
  JRadioButton rbMale1;
  JRadioButton rbFemale1;
  JRadioButton rbMale2;
  JRadioButton rbFemale2;
  JRadioButton rbMale3;
  JRadioButton rbFemale3;
  JRadioButton rbMale4;
  JRadioButton rbFemale4;
  JRadioButton rbMale5;
  JRadioButton rbFemale5;

  /**
   * Create the dialog.
   */
  public UpdateBook(String title) {
    setModal(true);
    setTitle("Update Book");
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

    txtISBN = new JTextField();
    txtISBN.setBounds(160, 10, 400, 20);
    contentPanel.add(txtISBN);
    txtISBN.setColumns(10);

    txtTitle = new JTextField();
    txtTitle.setBounds(160, 40, 400, 20);
    contentPanel.add(txtTitle);
    txtTitle.setColumns(10);

    txtPublisher = new JTextField();
    txtPublisher.setColumns(10);
    txtPublisher.setBounds(162, 226, 208, 20);
    contentPanel.add(txtPublisher);

    txtNumPages = new JTextField();
    txtNumPages.setColumns(10);
    txtNumPages.setBounds(162, 256, 208, 20);
    contentPanel.add(txtNumPages);

    txtPubYear = new JTextField();
    txtPubYear.setColumns(10);
    txtPubYear.setBounds(162, 286, 208, 20);
    contentPanel.add(txtPubYear);

    txtEdition = new JTextField();
    txtEdition.setColumns(10);
    txtEdition.setBounds(162, 316, 208, 20);
    contentPanel.add(txtEdition);

    txtDescription = new JTextArea();
    txtDescription.setLineWrap(true);
    txtDescription.setColumns(10);
    txtDescription.setBounds(162, 346, 400, 106);
    Border border = BorderFactory.createLineBorder(Color.BLACK);
    txtDescription.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    contentPanel.add(txtDescription);

    txtKeyword = new JTextArea();
    txtKeyword.setLineWrap(true);
    txtKeyword.setBounds(162, 480, 400, 106);
    txtKeyword.setColumns(10);
    txtKeyword.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    contentPanel.add(txtKeyword);
    

    txtAuthor1First = new JTextField();
    txtAuthor1First.setColumns(10);
    txtAuthor1First.setBounds(160, 70, 100, 20);
    contentPanel.add(txtAuthor1First);

    txtAuthor1Mid = new JTextField();
    txtAuthor1Mid.setColumns(10);
    txtAuthor1Mid.setBounds(272, 70, 84, 20);
    contentPanel.add(txtAuthor1Mid);

    txtAuthor1Last = new JTextField();
    txtAuthor1Last.setColumns(10);
    txtAuthor1Last.setBounds(370, 70, 100, 20);
    contentPanel.add(txtAuthor1Last);

    txtAuthor2First = new JTextField();
    txtAuthor2First.setColumns(10);
    txtAuthor2First.setBounds(160, 100, 100, 20);
    contentPanel.add(txtAuthor2First);

    txtAuthor2Mid = new JTextField();
    txtAuthor2Mid.setColumns(10);
    txtAuthor2Mid.setBounds(272, 100, 84, 20);
    contentPanel.add(txtAuthor2Mid);

    txtAuthor2Last = new JTextField();
    txtAuthor2Last.setColumns(10);
    txtAuthor2Last.setBounds(370, 100, 100, 20);
    contentPanel.add(txtAuthor2Last);

    txtAuthor3First = new JTextField();
    txtAuthor3First.setColumns(10);
    txtAuthor3First.setBounds(160, 130, 100, 20);
    contentPanel.add(txtAuthor3First);

    txtAuthor3Mid = new JTextField();
    txtAuthor3Mid.setColumns(10);
    txtAuthor3Mid.setBounds(272, 130, 84, 20);
    contentPanel.add(txtAuthor3Mid);

    txtAuthor3Last = new JTextField();
    txtAuthor3Last.setColumns(10);
    txtAuthor3Last.setBounds(370, 130, 100, 20);
    contentPanel.add(txtAuthor3Last);

    txtAuthor4First = new JTextField();
    txtAuthor4First.setColumns(10);
    txtAuthor4First.setBounds(160, 160, 100, 20);
    contentPanel.add(txtAuthor4First);

    txtAuthor4Mid = new JTextField();
    txtAuthor4Mid.setColumns(10);
    txtAuthor4Mid.setBounds(272, 160, 84, 20);
    contentPanel.add(txtAuthor4Mid);

    txtAuthor4Last = new JTextField();
    txtAuthor4Last.setColumns(10);
    txtAuthor4Last.setBounds(370, 160, 100, 20);
    contentPanel.add(txtAuthor4Last);

    txtAuthor5First = new JTextField();
    txtAuthor5First.setColumns(10);
    txtAuthor5First.setBounds(160, 190, 100, 20);
    contentPanel.add(txtAuthor5First);

    txtAuthor5Mid = new JTextField();
    txtAuthor5Mid.setColumns(10);
    txtAuthor5Mid.setBounds(272, 190, 84, 20);
    contentPanel.add(txtAuthor5Mid);

    txtAuthor5Last = new JTextField();
    txtAuthor5Last.setColumns(10);
    txtAuthor5Last.setBounds(370, 190, 100, 20);
    contentPanel.add(txtAuthor5Last);

    rbMale1 = new JRadioButton("Male");
    rbMale1.setBounds(476, 71, 53, 23);
    contentPanel.add(rbMale1);

    rbFemale1 = new JRadioButton("Female");
    rbFemale1.setBounds(531, 71, 71, 23);
    contentPanel.add(rbFemale1);

    rbMale2 = new JRadioButton("Male");
    rbMale2.setBounds(476, 100, 53, 23);
    contentPanel.add(rbMale2);

    rbFemale2 = new JRadioButton("Female");
    rbFemale2.setBounds(531, 100, 71, 23);
    contentPanel.add(rbFemale2);

    rbMale3 = new JRadioButton("Male");
    rbMale3.setBounds(476, 127, 53, 23);
    contentPanel.add(rbMale3);

    rbFemale3 = new JRadioButton("Female");
    rbFemale3.setBounds(531, 127, 71, 23);
    contentPanel.add(rbFemale3);

    rbMale4 = new JRadioButton("Male");
    rbMale4.setBounds(476, 157, 53, 23);
    contentPanel.add(rbMale4);

    rbFemale4 = new JRadioButton("Female");
    rbFemale4.setBounds(531, 157, 71, 23);
    contentPanel.add(rbFemale4);

    rbMale5 = new JRadioButton("Male");
    rbMale5.setBounds(476, 187, 53, 23);
    contentPanel.add(rbMale5);

    rbFemale5 = new JRadioButton("Female");
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

    /* --- Data->update book --- */
    Connection con = ConnectionDriver.connectToDatabase();
    PreparedStatement preparedStmt = null;
    String ISBN = displayBook(con, title);
    displayKeyword(con, ISBN);
    displayAuthors(con, ISBN);
    
    {
      JPanel buttonPane = new JPanel();
      buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
      getContentPane().add(buttonPane, BorderLayout.SOUTH);
      {
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
            /* --- Data->update book --- */
            try {
              con.setAutoCommit(false);
              
              updateBook(con, ISBN, txtTitle.getText().trim(), txtPublisher.getText().trim(), txtNumPages.getText().trim(), txtPubYear.getText().trim(), txtEdition.getText().trim(), txtDescription.getText().trim());
              Iterator<Integer> authorIDIter = authorIDList.iterator();
              int ID = 0;
              int inputID = 0;
              if (authorIDIter.hasNext()) {
                ID = authorIDIter.next().intValue();
                inputID = InsertBook.getExistingPeopleID(con, txtAuthor1First.getText().trim(), txtAuthor1Mid.getText().trim(), txtAuthor1Last.getText().trim(), rbMale1, rbFemale1);
                if ((ID != inputID) && (inputID == 0)) {
                  updatePeople(con, ID, txtAuthor1First.getText().trim(), txtAuthor1Mid.getText().trim(), txtAuthor1Last.getText().trim(), rbMale1, rbFemale1);
                }
              }
              //author 2
              if (authorIDIter.hasNext()) {
                ID = authorIDIter.next().intValue();
                if(!txtAuthor2First.getText().trim().isEmpty()) {
                  inputID = InsertBook.getExistingPeopleID(con, txtAuthor2First.getText().trim(), txtAuthor2Mid.getText().trim(), txtAuthor2Last.getText().trim(), rbMale2, rbFemale2);
                  if ((ID != inputID) && (inputID == 0)) {
                    updatePeople(con, ID, txtAuthor2First.getText().trim(), txtAuthor2Mid.getText().trim(), txtAuthor2Last.getText().trim(), rbMale2, rbFemale2);
                  }
                } else {
                  //if previously there was an author but now removed
                  deleteBookAuthor(con, ISBN, ID);
                }
              } else {
                // if there is a new author
                if(!txtAuthor2First.getText().trim().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtAuthor2First.getText().trim(), txtAuthor2Mid.getText().trim(), txtAuthor2Last.getText().trim(), rbMale2, rbFemale2);
                  InsertBook.insertBookAuthor(con, ISBN, ID);
                }
              }
              //author 3
              if (authorIDIter.hasNext()) {
                ID = authorIDIter.next().intValue();
                if(!txtAuthor3First.getText().trim().isEmpty()) {
                  inputID = InsertBook.getExistingPeopleID(con, txtAuthor3First.getText().trim(), txtAuthor3Mid.getText().trim(), txtAuthor3Last.getText().trim(), rbMale3, rbFemale3);
                  if ((ID != inputID) && (inputID == 0)) {
                    updatePeople(con, ID, txtAuthor3First.getText().trim(), txtAuthor3Mid.getText().trim(), txtAuthor3Last.getText().trim(), rbMale3, rbFemale3);
                  }
                } else {
                  //if previously there was an author but now removed
                  deleteBookAuthor(con, ISBN, ID);
                }
              } else {
                // if there is a new author
                if(!txtAuthor3First.getText().trim().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtAuthor3First.getText().trim(), txtAuthor3Mid.getText().trim(), txtAuthor3Last.getText().trim(), rbMale3, rbFemale3);
                  InsertBook.insertBookAuthor(con, ISBN, ID);
                }
              }
              //author 4
              if (authorIDIter.hasNext()) {
                ID = authorIDIter.next().intValue();
                if(!txtAuthor4First.getText().trim().isEmpty()) {
                  inputID = InsertBook.getExistingPeopleID(con, txtAuthor4First.getText().trim(), txtAuthor4Mid.getText().trim(), txtAuthor4Last.getText().trim(), rbMale4, rbFemale4);
                  if ((ID != inputID) && (inputID == 0)) {
                    updatePeople(con, ID, txtAuthor4First.getText().trim(), txtAuthor4Mid.getText().trim(), txtAuthor4Last.getText().trim(), rbMale4, rbFemale4);
                  }
                } else {
                  //if previously there was an author but now removed
                  deleteBookAuthor(con, ISBN, ID);
                }
              } else {
                // if there is a new author
                if(!txtAuthor4First.getText().trim().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtAuthor4First.getText().trim(), txtAuthor4Mid.getText().trim(), txtAuthor4Last.getText().trim(), rbMale4, rbFemale4);
                  InsertBook.insertBookAuthor(con, ISBN, ID);
                }
              }
              //author 5
              if (authorIDIter.hasNext()) {
                ID = authorIDIter.next().intValue();
                if(!txtAuthor5First.getText().trim().isEmpty()) {
                  inputID = InsertBook.getExistingPeopleID(con, txtAuthor5First.getText().trim(), txtAuthor5Mid.getText().trim(), txtAuthor5Last.getText().trim(), rbMale5, rbFemale5);
                  if ((ID != inputID) && (inputID == 0)) {
                    updatePeople(con, ID, txtAuthor5First.getText().trim(), txtAuthor5Mid.getText().trim(), txtAuthor5Last.getText().trim(), rbMale5, rbFemale5);
                  }
                } else {
                  //if previously there was an author but now removed
                  deleteBookAuthor(con, ISBN, ID);
                }
              } else {
                // if there is a new author
                if(!txtAuthor5First.getText().trim().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtAuthor5First.getText().trim(), txtAuthor5Mid.getText().trim(), txtAuthor5Last.getText().trim(), rbMale5, rbFemale5);
                  InsertBook.insertBookAuthor(con, ISBN, ID);
                }
              }
              
              
              //clear unchanged keys
              String[] keywordList = txtKeyword.getText().trim().split(",");
              ArrayList<String> newKeyList = new ArrayList<>();
              for (String key : keywordList) {
                newKeyList.add(key.trim());
              }
              ArrayList<String> sameKeyList = new ArrayList<>();
              //separate new keys from old keys
              for (String eachKey : newKeyList) {
                if (oldKeyList.contains(eachKey)) {
                  sameKeyList.add(eachKey);
                }
              }

              for (String sameKey : sameKeyList) {
                oldKeyList.remove(sameKey);
                newKeyList.remove(sameKey);
              }
              updateKeyword(con, ISBN, oldKeyList, newKeyList);
              
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

  private String displayBook(Connection con, String title) {
    String ISBN = null;
    PreparedStatement preparedStmt = null;
    String query = "select * from book where Title = ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, title.isEmpty() ? null : title);

      ResultSet rs = preparedStmt.executeQuery();
      while (rs.next()) {
        ISBN = rs.getString(1);
        txtISBN.setText(ISBN);
        txtTitle.setText(rs.getString(2));
        txtPublisher.setText(rs.getString(3));
        txtNumPages.setText(String.valueOf(rs.getInt(4)));
        txtPubYear.setText(String.valueOf(rs.getInt(5)));
        txtEdition.setText(rs.getString(6));
        txtDescription.setText(rs.getString(7));
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
    return ISBN;
  }
  
  private void displayKeyword(Connection con, String ISBN) {
    String keywords = "";
    oldKeyList.clear();
    PreparedStatement preparedStmt = null;
    String query = "select Tag from keyword, bookkeyword, book where book.ISBN = bookkeyword.ISBN and bookkeyword.Keyword_ID = keyword.ID and book.ISBN = ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, ISBN.isEmpty() ? null : ISBN);

      ResultSet rs = preparedStmt.executeQuery();
      while (rs.next()) {
        keywords += rs.getString(1) + ", ";
        oldKeyList.add(rs.getString(1));
      }
      int endIndex = (keywords.trim().isEmpty() ? 0 : keywords.length() - 2);
      txtKeyword.setText(keywords.substring(0, endIndex));
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
  
  private void displayAuthors(Connection con, String ISBN) {
    int i = 1;
    authorIDList.clear();
    PreparedStatement preparedStmt = null;
    String query = "select ID, FirstName, MiddleName, FamilyName, Gender from peopleinvolved, bookauthor, book where book.ISBN = bookauthor.ISBN and "
        + "bookauthor.Author_ID = peopleinvolved.ID and book.ISBN = ?";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, ISBN.isEmpty() ? null : ISBN);

      ResultSet rs = preparedStmt.executeQuery();
      while (rs.next()) {
        authorIDList.add(Integer.valueOf(rs.getInt(1)));
        if (i == 1) {
          txtAuthor1First.setText(rs.getString(2));
          txtAuthor1Mid.setText(rs.getString(3));
          txtAuthor1Last.setText(rs.getString(4));
          if (rs.getByte(5) == 0) {
            rbFemale1.setSelected(true);
          } else if (rs.getByte(5) == 1) {
            rbMale1.setSelected(true);
          }
        } else if (i == 2) {
          txtAuthor2First.setText(rs.getString(2));
          txtAuthor2Mid.setText(rs.getString(3));
          txtAuthor2Last.setText(rs.getString(4));
          if (rs.getByte(5) == 0) {
            rbFemale2.setSelected(true);
          } else if (rs.getByte(5) == 1) {
            rbMale2.setSelected(true);
          }
        } else if (i == 3) {
          txtAuthor3First.setText(rs.getString(2));
          txtAuthor3Mid.setText(rs.getString(3));
          txtAuthor3Last.setText(rs.getString(4));
          if (rs.getByte(5) == 0) {
            rbFemale3.setSelected(true);
          } else if (rs.getByte(5) == 1) {
            rbMale3.setSelected(true);
          }
        } else if (i == 4) {
          txtAuthor4First.setText(rs.getString(2));
          txtAuthor4Mid.setText(rs.getString(3));
          txtAuthor4Last.setText(rs.getString(4));
          if (rs.getByte(5) == 0) {
            rbFemale4.setSelected(true);
          } else if (rs.getByte(5) == 1) {
            rbMale4.setSelected(true);
          }
        } else if (i == 5) {
          txtAuthor5First.setText(rs.getString(2));
          txtAuthor5Mid.setText(rs.getString(3));
          txtAuthor5Last.setText(rs.getString(4));
          if (rs.getByte(5) == 0) {
            rbFemale5.setSelected(true);
          } else if (rs.getByte(5) == 1) {
            rbMale5.setSelected(true);
          }
        }
        i++;
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
  
  private static void updateBook(Connection con, String ISBN, String title, String publisher, String numPages, String year, String edition, String description) {
    PreparedStatement preparedStmt = null;
    String query = "update book set Title = ?, Publisher = ?, NumberOfPages = ?, YearOfPublication = ?, EditionNumber = ?, Abstract = ? where ISBN = ?";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      
      preparedStmt.setString(1, title.isEmpty() ? null : title);
      preparedStmt.setString(2, publisher.isEmpty() ? null : publisher);
      if (!numPages.isEmpty()) {
        preparedStmt.setInt(3, Integer.parseInt(numPages));
      } else {
        preparedStmt.setNull(3, Types.INTEGER);
      }
      if (!year.isEmpty()) {
        preparedStmt.setInt(4, Integer.parseInt(year));
      } else {
        preparedStmt.setNull(4, Types.INTEGER);
      }
      if (!edition.isEmpty()) {
        preparedStmt.setInt(5, Integer.parseInt(edition));
      } else {
        preparedStmt.setNull(5, Types.INTEGER);
      }
      preparedStmt.setString(6, description.isEmpty() ? null : description);
      preparedStmt.setString(7, ISBN.isEmpty() ? null : ISBN);
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
  
  private static void updatePeople(Connection con, int ID, String fname, String mName, String lName, JRadioButton M, JRadioButton F) {
    PreparedStatement preparedStmt = null;
    String query = "update peopleinvolved set FirstName = ?, MiddleName = ?, FamilyName = ?, Gender = ? where ID = ?";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      
      preparedStmt.setString(1, fname.isEmpty() ? null : fname);
      preparedStmt.setString(2, mName.isEmpty() ? null : mName);
      preparedStmt.setString(3, lName.isEmpty() ? null : lName);
      if (M.isSelected()) {
        preparedStmt.setByte(4, (byte) 1);
      } else if (F.isSelected()) {
        preparedStmt.setByte(4, (byte) 0);
      } else {
        preparedStmt.setNull(4, Types.TINYINT);
      }
      if (ID == 0) {
        preparedStmt.setNull(5, Types.INTEGER);
      } else {
        preparedStmt.setInt(5, ID);
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
  
  private static void updateKeyword(Connection con, String ISBN, ArrayList<String> oldKeyList, ArrayList<String> newKeyList) {
    //delete rows in bookkeyword that use old keywords but keep keywords in db
    int keyID = 0;
    for (String oldKey : oldKeyList) {
      keyID = InsertBook.getExistingKeyword(con, oldKey.trim());
      deleteBookKeyword(con, ISBN, keyID);
    }
    //insert new keywords into keyword and bookkeyword
    for (String newKey : newKeyList) {
      if (!newKey.isEmpty()) {
        keyID = InsertBook.insertKeyword(con, newKey.trim());
        InsertBook.insertBookKeyword(con, ISBN, keyID);
      }
    }
  }
  
  private static void deleteBookKeyword(Connection con, String ISBN, int keyID) {
    PreparedStatement preparedStmt = null;
    String query = "delete from bookkeyword where ISBN = ? and Keyword_ID = ?";
    
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
  
  private static void deleteBookAuthor(Connection con, String ISBN, int ID) {
    PreparedStatement preparedStmt = null;
    String query = "delete from bookauthor where ISBN = ? and Author_ID = ?";
    
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
  
  /* --- Data->remove --- */
  public static void deleteBook(Connection con, String title) {
    PreparedStatement preparedStmt = null;
    String ISBN = getISBN(con, title);
    if (ISBN != null) {
      deleteAllBookKeyword(con, ISBN);
      deleteAllBookAuthor(con, ISBN);
      
      String query = "delete from book where ISBN = ?";
      try {
        con.setAutoCommit(false);
        preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1, ISBN.isEmpty() ? null : ISBN);
  
        preparedStmt.executeUpdate();
        preparedStmt.close();
        con.commit();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        
        if (con != null) {
          try {
            System.err.print("Transaction is being rolled back.");
            con.rollback();
            } catch (SQLException e2) {}
        }
      } finally {
        try {
          con.setAutoCommit(true);
        } catch (SQLException e) {
          // TODO Auto-generated catch block
          
        }
      }
    }
  }
  
  private static String getISBN(Connection con, String title) {
    PreparedStatement preparedStmt = null;
    String query = "select ISBN from book where Title = ?";
    String ISBN = null;
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, title.isEmpty() ? null : title);

      ResultSet rs = preparedStmt.executeQuery();
      while (rs.next()) {
        ISBN = rs.getString(1);
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
    return ISBN;
  }
  
  /* --- part of Data->remove --- */
  private static void deleteAllBookKeyword(Connection con, String ISBN) {
    PreparedStatement preparedStmt = null;
    String query = "delete from bookkeyword where ISBN = ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, ISBN.isEmpty() ? null : ISBN);

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
  
  /* --- part of Data->remove --- */
  private static void deleteAllBookAuthor(Connection con, String ISBN) {
    PreparedStatement preparedStmt = null;
    String query = "delete from bookauthor where ISBN = ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, ISBN.isEmpty() ? null : ISBN);

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
  
  
}
