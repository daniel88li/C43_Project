import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;

public class QueryPage extends JDialog {

  private final JPanel contentPanel = new JPanel();
  private JTextField txtName;
  private JTextField txtYear;
  JRadioButton rbBook;
  JRadioButton rbAlbum;
  JRadioButton rbMovie;
  private JTable tbResult;
  static DefaultTableModel tableModel;

  /**
   * Create the dialog.
   */
  public QueryPage() {
    setModal(true);
    setTitle("Dynamic Query");
    setBounds(100, 100, 714, 524);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(null);
    
    rbBook = new JRadioButton("Book");
    rbBook.setFont(new Font("Tahoma", Font.PLAIN, 18));
    rbBook.setBounds(63, 120, 113, 23);
    contentPanel.add(rbBook);
    
    rbAlbum = new JRadioButton("Music Album");
    rbAlbum.setFont(new Font("Tahoma", Font.PLAIN, 18));
    rbAlbum.setBounds(199, 120, 148, 23);
    contentPanel.add(rbAlbum);
    
    rbMovie = new JRadioButton("Movie");
    rbMovie.setFont(new Font("Tahoma", Font.PLAIN, 18));
    rbMovie.setBounds(392, 120, 113, 23);
    contentPanel.add(rbMovie);
    
    ButtonGroup viewGroup = new ButtonGroup();
    viewGroup.add(rbBook);
    viewGroup.add(rbAlbum);
    viewGroup.add(rbMovie);
    
    txtName = new JTextField();
    txtName.setFont(new Font("Tahoma", Font.PLAIN, 14));
    txtName.setBounds(147, 11, 541, 33);
    contentPanel.add(txtName);
    txtName.setColumns(10);
    
    txtYear = new JTextField();
    txtYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
    txtYear.setColumns(10);
    txtYear.setBounds(147, 64, 168, 33);
    contentPanel.add(txtYear);
    
    JLabel lblNewLabel = new JLabel("Name: ");
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblNewLabel.setBounds(42, 11, 101, 33);
    contentPanel.add(lblNewLabel);
    
    JLabel lblYear = new JLabel("Year:");
    lblYear.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblYear.setBounds(42, 64, 101, 33);
    contentPanel.add(lblYear);
    
    
    String[] col = {"Product's Name", "Year", "Type", "Director/Singer/Author"};
    tableModel = new DefaultTableModel(col, 0);
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(0, 175, 698, 275);
    contentPanel.add(scrollPane);
    
    tbResult = new JTable();
    tbResult.setFont(new Font("Tahoma", Font.PLAIN, 12));
    tbResult.setEnabled(false);
    tbResult.setRowSelectionAllowed(false);
    scrollPane.setViewportView(tbResult);
    tbResult.setModel(tableModel);

    Connection con = ConnectionDriver.connectToDatabase();

    {
      JPanel buttonPane = new JPanel();
      buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
      getContentPane().add(buttonPane, BorderLayout.SOUTH);
      {
        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        submitButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
            tableModel.setRowCount(0);
            String name = txtName.getText().trim();
            String year = txtYear.getText().trim();
            String nameYear = null;
            String subQuery = null;
            String IDCol = null;
            String type = null;

            /* --- View --- */
            if (rbBook.isSelected()) {
              nameYear = "Title, YearOfPublication, ";
              subQuery = "select Author_ID, Title, YearOfPublication from book, bookauthor where book.ISBN = bookauthor.ISBN and Title like ? and YearOfPublication = ?";
              IDCol = "Author_ID ";
              type = "B";
            } else if (rbAlbum.isSelected()) {
              nameYear = "AlbumName, Year, ";
              subQuery = "select PeopleInvolved_ID, AlbumName, Year from musicsinger where AlbumName like ? and Year = ?";
              IDCol = "PeopleInvolved_ID ";
              type = "M";
            } else if (rbMovie.isSelected()) {
              nameYear = "MovieName, ReleaseYear, ";
              subQuery = "select PeopleInvolved_ID, MovieName, ReleaseYear from crewmember join role on crewmember.Role_ID = role.ID and MovieName like ? and ReleaseYear = ? and role.Description = 'Director'";
              IDCol = "PeopleInvolved_ID ";
              type = "F";
            }
            
            if (rbBook.isSelected() || rbAlbum.isSelected() || rbMovie.isSelected()) {
              viewQuery(con, nameYear, subQuery, IDCol, name, year, type);
            }
          }
        });
        submitButton.setActionCommand("Submit");
        buttonPane.add(submitButton);
        getRootPane().setDefaultButton(submitButton);
      }
      {
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cancelButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            dispose();
          }
        });
        cancelButton.setActionCommand("Cancel");
        buttonPane.add(cancelButton);
      }
    }
  }
  
  /* --- View --- */
  private static void viewQuery(Connection con, String nameYear, String subQuery, String IDCol, String name, String year, String type) {
    String productName = null;
    int releaseYear = 0;
    String firstName = null;
    String middleName = null;
    String lastName = null;
    String fullName = "";
    
    PreparedStatement preparedStmt = null;
    String query = "select " + nameYear + "FirstName, MiddleName, FamilyName from (" + subQuery + ") as A "
        + "join (select ID, FirstName, MiddleName, FamilyName from peopleinvolved) as P on A." + IDCol + "= P.ID order by Familyname asc limit 1";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, name.isEmpty() ? null : "%"+name+"%");
      if (year.isEmpty()) {
        preparedStmt.setNull(2, Types.INTEGER);
      } else {
        preparedStmt.setInt(2, Integer.valueOf(year));
      }

      ResultSet rs = preparedStmt.executeQuery();

      while (rs.next()) {
        productName = rs.getString(1);
        releaseYear = rs.getInt(2);
        firstName = rs.getString(3);
        middleName = rs.getString(4);
        lastName = rs.getString(5);

        if (middleName == null) {
          fullName = firstName + " " + lastName;
        } else {
          fullName = firstName + " " + middleName + " " + lastName;
        }
        tableModel.addRow(new Object[] {productName, releaseYear, type, fullName});
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
          } catch (SQLException e2) {}
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException e) {}
    }
  }
}
