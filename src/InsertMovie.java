import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class InsertMovie extends JDialog {

  private final JPanel contentPanel = new JPanel();
  private JTextField txtS2F;
  private JTextField txtS2M;
  private JTextField txtS2L;
  private JTextField txtC2F;
  private JTextField txtC2M;
  private JTextField txtC2L;
  private JTextField txtE3L;
  private JTextField txtE2L;
  private JTextField txtE1L;
  private JTextField txtC3L;
  private JTextField txtC3M;
  private JTextField txtE1M;
  private JTextField txtE2M;
  private JTextField txtE3M;
  private JTextField txtE3F;
  private JTextField txtE2F;
  private JTextField txtE1F;
  private JTextField txtC3F;
  private JTextField txtCD1F;
  private JTextField txtCD1M;
  private JTextField txtCD1L;
  private JTextField txtCast2L;
  private JTextField txtCast1L;
  private JTextField txtCD3L;
  private JTextField txtCD2L;
  private JTextField txtCD2M;
  private JTextField txtCD3M;
  private JTextField txtCast1M;
  private JTextField txtCast2M;
  private JTextField txtCast2F;
  private JTextField txtCast1F;
  private JTextField txtCD3F;
  private JTextField txtCD2F;
  private JTextField txtCast3F;
  private JTextField txtCast3M;
  private JTextField txtCast3L;
  private JTextField txtCast7L;
  private JTextField txtCast6L;
  private JTextField txtCast5L;
  private JTextField txtCast4L;
  private JTextField txtCast4M;
  private JTextField txtCast5M;
  private JTextField txtCast6M;
  private JTextField txtCast7M;
  private JTextField txtCast7F;
  private JTextField txtCast6F;
  private JTextField txtCast5F;
  private JTextField txtCast4F;
  private JTextField txtCast8F;
  private JTextField txtCast8M;
  private JTextField txtCast8L;
  private JTextField txtCast10L;
  private JTextField txtCast9L;
  private JTextField txtCast9M;
  private JTextField txtCast10M;
  private JTextField txtCast10F;
  private JTextField txtCast9F;
  private JTextField txtD2F;
  private JTextField txtD2M;
  private JTextField txtD2L;
  private JTextField txtD3F;
  private JTextField txtD3M;
  private JTextField txtD3L;
  private JTextField txtP3F;
  private JTextField txtP3M;
  private JTextField txtP3L;
  private JTextField txtC1F;
  private JTextField txtC1M;
  private JTextField txtC1L;


  /**
   * Create the dialog.
   */
  public InsertMovie() {
    setModal(true);
    setTitle("Insert Music");
    setSize(1541, 661);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(null);

    JLabel lblMovieName = new JLabel("Movie Name:");
    lblMovieName.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblMovieName.setBounds(10, 10, 126, 20);
    contentPanel.add(lblMovieName);

    JLabel lblYear = new JLabel("Year:");
    lblYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblYear.setBounds(10, 40, 126, 20);
    contentPanel.add(lblYear);

    JLabel lblD1 = new JLabel("Director 1:");
    lblD1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblD1.setBounds(10, 70, 126, 20);
    contentPanel.add(lblD1);

    JLabel lblT1S1 = new JLabel("Script Writer 1:");
    lblT1S1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblT1S1.setBounds(10, 159, 126, 20);
    contentPanel.add(lblT1S1);

    JLabel lblT1S2 = new JLabel("Script Writer 2:");
    lblT1S2.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblT1S2.setBounds(10, 186, 126, 20);
    contentPanel.add(lblT1S2);

    JLabel lbl4 = new JLabel("Script Writer 3:");
    lbl4.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lbl4.setBounds(10, 215, 126, 20);
    contentPanel.add(lbl4);

    JLabel lbl5 = new JLabel("Producer 1:");
    lbl5.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lbl5.setBounds(10, 241, 126, 20);
    contentPanel.add(lbl5);

    JLabel lbl6 = new JLabel("Producer 2:");
    lbl6.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lbl6.setBounds(10, 271, 126, 20);
    contentPanel.add(lbl6);


    JTextField txtMovieName = new JTextField();
    txtMovieName.setBounds(160, 10, 400, 20);
    contentPanel.add(txtMovieName);
    txtMovieName.setColumns(10);

    JTextField txtYear = new JTextField();
    txtYear.setBounds(160, 40, 155, 20);
    contentPanel.add(txtYear);
    txtYear.setColumns(10);

    JTextField txtD1F = new JTextField();
    txtD1F.setColumns(10);
    txtD1F.setBounds(160, 70, 100, 20);
    contentPanel.add(txtD1F);

    JTextField txtD1M = new JTextField();
    txtD1M.setColumns(10);
    txtD1M.setBounds(272, 70, 84, 20);
    contentPanel.add(txtD1M);

    JTextField txtD1L = new JTextField();
    txtD1L.setColumns(10);
    txtD1L.setBounds(370, 70, 100, 20);
    contentPanel.add(txtD1L);

    JTextField txtS1F = new JTextField();
    txtS1F.setColumns(10);
    txtS1F.setBounds(160, 159, 100, 20);
    contentPanel.add(txtS1F);

    JTextField txtS1M = new JTextField();
    txtS1M.setColumns(10);
    txtS1M.setBounds(272, 159, 84, 20);
    contentPanel.add(txtS1M);

    JTextField txtS1L = new JTextField();
    txtS1L.setColumns(10);
    txtS1L.setBounds(370, 159, 100, 20);
    contentPanel.add(txtS1L);

    txtS2F = new JTextField();
    txtS2F.setColumns(10);
    txtS2F.setBounds(160, 186, 100, 20);
    contentPanel.add(txtS2F);

    txtS2M = new JTextField();
    txtS2M.setColumns(10);
    txtS2M.setBounds(272, 186, 84, 20);
    contentPanel.add(txtS2M);

    txtS2L = new JTextField();
    txtS2L.setColumns(10);
    txtS2L.setBounds(370, 186, 100, 20);
    contentPanel.add(txtS2L);

    JTextField txtS3F = new JTextField();
    txtS3F.setColumns(10);
    txtS3F.setBounds(160, 215, 100, 20);
    contentPanel.add(txtS3F);

    JTextField txtS3M = new JTextField();
    txtS3M.setColumns(10);
    txtS3M.setBounds(272, 215, 84, 20);
    contentPanel.add(txtS3M);

    JTextField txtS3L = new JTextField();
    txtS3L.setColumns(10);
    txtS3L.setBounds(370, 215, 100, 20);
    contentPanel.add(txtS3L);

    JTextField txtP1F = new JTextField();
    txtP1F.setColumns(10);
    txtP1F.setBounds(160, 241, 100, 20);
    contentPanel.add(txtP1F);

    JTextField txtP1M = new JTextField();
    txtP1M.setColumns(10);
    txtP1M.setBounds(272, 241, 84, 20);
    contentPanel.add(txtP1M);

    JTextField txtP1L = new JTextField();
    txtP1L.setColumns(10);
    txtP1L.setBounds(370, 241, 100, 20);
    contentPanel.add(txtP1L);

    JTextField txtP2F = new JTextField();
    txtP2F.setColumns(10);
    txtP2F.setBounds(160, 271, 100, 20);
    contentPanel.add(txtP2F);

    JTextField txtP2M = new JTextField();
    txtP2M.setColumns(10);
    txtP2M.setBounds(272, 271, 84, 20);
    contentPanel.add(txtP2M);

    JTextField txtP2L = new JTextField();
    txtP2L.setColumns(10);
    txtP2L.setBounds(370, 271, 100, 20);
    contentPanel.add(txtP2L);

    JRadioButton rbMD1 = new JRadioButton("Male");
    rbMD1.setBounds(476, 71, 53, 23);
    contentPanel.add(rbMD1);

    JRadioButton rbFD1 = new JRadioButton("Female");
    rbFD1.setBounds(531, 71, 71, 23);
    contentPanel.add(rbFD1);

    JRadioButton rbMS1 = new JRadioButton("Male");
    rbMS1.setBounds(476, 159, 53, 23);
    contentPanel.add(rbMS1);

    JRadioButton rbFS1 = new JRadioButton("Female");
    rbFS1.setBounds(531, 159, 71, 23);
    contentPanel.add(rbFS1);

    JRadioButton rbMS3 = new JRadioButton("Male");
    rbMS3.setBounds(476, 212, 53, 23);
    contentPanel.add(rbMS3);

    JRadioButton rbFS3 = new JRadioButton("Female");
    rbFS3.setBounds(531, 212, 71, 23);
    contentPanel.add(rbFS3);

    JRadioButton rbMP1 = new JRadioButton("Male");
    rbMP1.setBounds(476, 238, 53, 23);
    contentPanel.add(rbMP1);

    JRadioButton rbFP1 = new JRadioButton("Female");
    rbFP1.setBounds(531, 238, 71, 23);
    contentPanel.add(rbFP1);

    JRadioButton rbMP2 = new JRadioButton("Male");
    rbMP2.setBounds(476, 268, 53, 23);
    contentPanel.add(rbMP2);

    JRadioButton rbFP2 = new JRadioButton("Female");
    rbFP2.setBounds(531, 268, 71, 23);
    contentPanel.add(rbFP2);

    JRadioButton rbMS2 = new JRadioButton("Male");
    rbMS2.setBounds(476, 187, 53, 23);
    contentPanel.add(rbMS2);

    JRadioButton rbFS2 = new JRadioButton("Female");
    rbFS2.setBounds(531, 187, 71, 23);
    contentPanel.add(rbFS2);

    JLabel lblComposer_1 = new JLabel("Composer 2:");
    lblComposer_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblComposer_1.setBounds(10, 360, 126, 20);
    contentPanel.add(lblComposer_1);

    txtC2F = new JTextField();
    txtC2F.setColumns(10);
    txtC2F.setBounds(160, 360, 100, 20);
    contentPanel.add(txtC2F);

    txtC2M = new JTextField();
    txtC2M.setColumns(10);
    txtC2M.setBounds(272, 360, 84, 20);
    contentPanel.add(txtC2M);

    txtC2L = new JTextField();
    txtC2L.setColumns(10);
    txtC2L.setBounds(370, 360, 100, 20);
    contentPanel.add(txtC2L);

    JRadioButton rbMC2 = new JRadioButton("Male");
    rbMC2.setBounds(476, 360, 53, 23);
    contentPanel.add(rbMC2);

    JRadioButton rbFC2 = new JRadioButton("Female");
    rbFC2.setBounds(531, 360, 71, 23);
    contentPanel.add(rbFC2);

    JRadioButton rbFC3 = new JRadioButton("Female");
    rbFC3.setBounds(531, 388, 71, 23);
    contentPanel.add(rbFC3);

    JRadioButton rbMC3 = new JRadioButton("Male");
    rbMC3.setBounds(476, 388, 53, 23);
    contentPanel.add(rbMC3);

    JRadioButton rbME1 = new JRadioButton("Male");
    rbME1.setBounds(476, 413, 53, 23);
    contentPanel.add(rbME1);

    JRadioButton rbFE1 = new JRadioButton("Female");
    rbFE1.setBounds(531, 413, 71, 23);
    contentPanel.add(rbFE1);

    JRadioButton rbFE2 = new JRadioButton("Female");
    rbFE2.setBounds(531, 439, 71, 23);
    contentPanel.add(rbFE2);

    JRadioButton rbME2 = new JRadioButton("Male");
    rbME2.setBounds(476, 439, 53, 23);
    contentPanel.add(rbME2);

    JRadioButton rbME3 = new JRadioButton("Male");
    rbME3.setBounds(476, 469, 53, 23);
    contentPanel.add(rbME3);

    JRadioButton rbFE3 = new JRadioButton("Female");
    rbFE3.setBounds(531, 469, 71, 23);
    contentPanel.add(rbFE3);

    txtE3L = new JTextField();
    txtE3L.setColumns(10);
    txtE3L.setBounds(370, 472, 100, 20);
    contentPanel.add(txtE3L);

    txtE2L = new JTextField();
    txtE2L.setColumns(10);
    txtE2L.setBounds(370, 442, 100, 20);
    contentPanel.add(txtE2L);

    txtE1L = new JTextField();
    txtE1L.setColumns(10);
    txtE1L.setBounds(370, 416, 100, 20);
    contentPanel.add(txtE1L);

    txtC3L = new JTextField();
    txtC3L.setColumns(10);
    txtC3L.setBounds(370, 387, 100, 20);
    contentPanel.add(txtC3L);

    txtC3M = new JTextField();
    txtC3M.setColumns(10);
    txtC3M.setBounds(272, 387, 84, 20);
    contentPanel.add(txtC3M);

    txtE1M = new JTextField();
    txtE1M.setColumns(10);
    txtE1M.setBounds(272, 416, 84, 20);
    contentPanel.add(txtE1M);

    txtE2M = new JTextField();
    txtE2M.setColumns(10);
    txtE2M.setBounds(272, 442, 84, 20);
    contentPanel.add(txtE2M);

    txtE3M = new JTextField();
    txtE3M.setColumns(10);
    txtE3M.setBounds(272, 472, 84, 20);
    contentPanel.add(txtE3M);

    txtE3F = new JTextField();
    txtE3F.setColumns(10);
    txtE3F.setBounds(160, 472, 100, 20);
    contentPanel.add(txtE3F);

    txtE2F = new JTextField();
    txtE2F.setColumns(10);
    txtE2F.setBounds(160, 442, 100, 20);
    contentPanel.add(txtE2F);

    txtE1F = new JTextField();
    txtE1F.setColumns(10);
    txtE1F.setBounds(160, 416, 100, 20);
    contentPanel.add(txtE1F);

    txtC3F = new JTextField();
    txtC3F.setColumns(10);
    txtC3F.setBounds(160, 387, 100, 20);
    contentPanel.add(txtC3F);

    JLabel lblComposer_2 = new JLabel("Composer 3:");
    lblComposer_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblComposer_2.setBounds(10, 387, 126, 20);
    contentPanel.add(lblComposer_2);

    JLabel lblEditor = new JLabel("Editor 1:");
    lblEditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblEditor.setBounds(10, 416, 126, 20);
    contentPanel.add(lblEditor);

    JLabel lblEditor_1 = new JLabel("Editor 2:");
    lblEditor_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblEditor_1.setBounds(10, 442, 126, 20);
    contentPanel.add(lblEditor_1);

    JLabel lblEditor_2 = new JLabel("Editor 3:");
    lblEditor_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblEditor_2.setBounds(10, 472, 126, 20);
    contentPanel.add(lblEditor_2);

    JLabel lblCostumeDesigner = new JLabel("Costume Designer 1:");
    lblCostumeDesigner.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCostumeDesigner.setBounds(10, 499, 140, 20);
    contentPanel.add(lblCostumeDesigner);

    txtCD1F = new JTextField();
    txtCD1F.setColumns(10);
    txtCD1F.setBounds(160, 499, 100, 20);
    contentPanel.add(txtCD1F);

    txtCD1M = new JTextField();
    txtCD1M.setColumns(10);
    txtCD1M.setBounds(272, 499, 84, 20);
    contentPanel.add(txtCD1M);

    txtCD1L = new JTextField();
    txtCD1L.setColumns(10);
    txtCD1L.setBounds(370, 499, 100, 20);
    contentPanel.add(txtCD1L);

    JRadioButton rbMCD1 = new JRadioButton("Male");
    rbMCD1.setBounds(476, 499, 53, 23);
    contentPanel.add(rbMCD1);

    JRadioButton rbFCD1 = new JRadioButton("Female");
    rbFCD1.setBounds(531, 499, 71, 23);
    contentPanel.add(rbFCD1);

    JRadioButton rbFCD2 = new JRadioButton("Female");
    rbFCD2.setBounds(531, 527, 71, 23);
    contentPanel.add(rbFCD2);

    JRadioButton rbMCD2 = new JRadioButton("Male");
    rbMCD2.setBounds(476, 527, 53, 23);
    contentPanel.add(rbMCD2);

    JRadioButton rbMCD3 = new JRadioButton("Male");
    rbMCD3.setBounds(476, 552, 53, 23);
    contentPanel.add(rbMCD3);

    JRadioButton rbFCD3 = new JRadioButton("Female");
    rbFCD3.setBounds(531, 552, 71, 23);
    contentPanel.add(rbFCD3);

    JRadioButton rbFCast1 = new JRadioButton("Female");
    rbFCast1.setBounds(1271, 70, 71, 23);
    contentPanel.add(rbFCast1);

    JRadioButton rbMCast1 = new JRadioButton("Male");
    rbMCast1.setBounds(1216, 70, 53, 23);
    contentPanel.add(rbMCast1);

    JRadioButton rbMCast2 = new JRadioButton("Male");
    rbMCast2.setBounds(1216, 99, 53, 23);
    contentPanel.add(rbMCast2);

    JRadioButton rbFCast2 = new JRadioButton("Female");
    rbFCast2.setBounds(1271, 99, 71, 23);
    contentPanel.add(rbFCast2);

    txtCast2L = new JTextField();
    txtCast2L.setColumns(10);
    txtCast2L.setBounds(1110, 102, 100, 20);
    contentPanel.add(txtCast2L);

    txtCast1L = new JTextField();
    txtCast1L.setColumns(10);
    txtCast1L.setBounds(1110, 73, 100, 20);
    contentPanel.add(txtCast1L);

    txtCD3L = new JTextField();
    txtCD3L.setColumns(10);
    txtCD3L.setBounds(370, 555, 100, 20);
    contentPanel.add(txtCD3L);

    txtCD2L = new JTextField();
    txtCD2L.setColumns(10);
    txtCD2L.setBounds(370, 526, 100, 20);
    contentPanel.add(txtCD2L);

    txtCD2M = new JTextField();
    txtCD2M.setColumns(10);
    txtCD2M.setBounds(272, 526, 84, 20);
    contentPanel.add(txtCD2M);

    txtCD3M = new JTextField();
    txtCD3M.setColumns(10);
    txtCD3M.setBounds(272, 555, 84, 20);
    contentPanel.add(txtCD3M);

    txtCast1M = new JTextField();
    txtCast1M.setColumns(10);
    txtCast1M.setBounds(1012, 73, 84, 20);
    contentPanel.add(txtCast1M);

    txtCast2M = new JTextField();
    txtCast2M.setColumns(10);
    txtCast2M.setBounds(1012, 102, 84, 20);
    contentPanel.add(txtCast2M);

    txtCast2F = new JTextField();
    txtCast2F.setColumns(10);
    txtCast2F.setBounds(900, 102, 100, 20);
    contentPanel.add(txtCast2F);

    txtCast1F = new JTextField();
    txtCast1F.setColumns(10);
    txtCast1F.setBounds(900, 73, 100, 20);
    contentPanel.add(txtCast1F);

    txtCD3F = new JTextField();
    txtCD3F.setColumns(10);
    txtCD3F.setBounds(160, 555, 100, 20);
    contentPanel.add(txtCD3F);

    txtCD2F = new JTextField();
    txtCD2F.setColumns(10);
    txtCD2F.setBounds(160, 526, 100, 20);
    contentPanel.add(txtCD2F);

    JLabel lblCostumeDesigner_1 = new JLabel("Costume Designer 2:");
    lblCostumeDesigner_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCostumeDesigner_1.setBounds(10, 526, 140, 20);
    contentPanel.add(lblCostumeDesigner_1);

    JLabel lblCostumeDesigner_2 = new JLabel("Costume Designer 3:");
    lblCostumeDesigner_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCostumeDesigner_2.setBounds(10, 555, 140, 20);
    contentPanel.add(lblCostumeDesigner_2);

    JLabel lblCast = new JLabel("Cast 1:");
    lblCast.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCast.setBounds(819, 70, 71, 20);
    contentPanel.add(lblCast);

    JLabel lblCast_1 = new JLabel("Cast 2:");
    lblCast_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCast_1.setBounds(819, 99, 71, 20);
    contentPanel.add(lblCast_1);

    JLabel lblCast_2 = new JLabel("Cast 3:");
    lblCast_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCast_2.setBounds(819, 126, 71, 20);
    contentPanel.add(lblCast_2);

    txtCast3F = new JTextField();
    txtCast3F.setColumns(10);
    txtCast3F.setBounds(900, 129, 100, 20);
    contentPanel.add(txtCast3F);

    txtCast3M = new JTextField();
    txtCast3M.setColumns(10);
    txtCast3M.setBounds(1012, 129, 84, 20);
    contentPanel.add(txtCast3M);

    txtCast3L = new JTextField();
    txtCast3L.setColumns(10);
    txtCast3L.setBounds(1110, 129, 100, 20);
    contentPanel.add(txtCast3L);

    JRadioButton rbMCast3 = new JRadioButton("Male");
    rbMCast3.setBounds(1216, 129, 53, 23);
    contentPanel.add(rbMCast3);

    JRadioButton rbFCast3 = new JRadioButton("Female");
    rbFCast3.setBounds(1271, 129, 71, 23);
    contentPanel.add(rbFCast3);

    JRadioButton rbFCast4 = new JRadioButton("Female");
    rbFCast4.setBounds(1271, 157, 71, 23);
    contentPanel.add(rbFCast4);

    JRadioButton rbMCast4 = new JRadioButton("Male");
    rbMCast4.setBounds(1216, 157, 53, 23);
    contentPanel.add(rbMCast4);

    JRadioButton rbMCast5 = new JRadioButton("Male");
    rbMCast5.setBounds(1216, 182, 53, 23);
    contentPanel.add(rbMCast5);

    JRadioButton rbFCast5 = new JRadioButton("Female");
    rbFCast5.setBounds(1271, 182, 71, 23);
    contentPanel.add(rbFCast5);

    JRadioButton rbFCast6 = new JRadioButton("Female");
    rbFCast6.setBounds(1271, 208, 71, 23);
    contentPanel.add(rbFCast6);

    JRadioButton rbMCast6 = new JRadioButton("Male");
    rbMCast6.setBounds(1216, 208, 53, 23);
    contentPanel.add(rbMCast6);

    JRadioButton rbMCast7 = new JRadioButton("Male");
    rbMCast7.setBounds(1216, 238, 53, 23);
    contentPanel.add(rbMCast7);

    JRadioButton rbFCast7 = new JRadioButton("Female");
    rbFCast7.setBounds(1271, 238, 71, 23);
    contentPanel.add(rbFCast7);

    txtCast7L = new JTextField();
    txtCast7L.setColumns(10);
    txtCast7L.setBounds(1110, 241, 100, 20);
    contentPanel.add(txtCast7L);

    txtCast6L = new JTextField();
    txtCast6L.setColumns(10);
    txtCast6L.setBounds(1110, 211, 100, 20);
    contentPanel.add(txtCast6L);

    txtCast5L = new JTextField();
    txtCast5L.setColumns(10);
    txtCast5L.setBounds(1110, 185, 100, 20);
    contentPanel.add(txtCast5L);

    txtCast4L = new JTextField();
    txtCast4L.setColumns(10);
    txtCast4L.setBounds(1110, 156, 100, 20);
    contentPanel.add(txtCast4L);

    txtCast4M = new JTextField();
    txtCast4M.setColumns(10);
    txtCast4M.setBounds(1012, 156, 84, 20);
    contentPanel.add(txtCast4M);

    txtCast5M = new JTextField();
    txtCast5M.setColumns(10);
    txtCast5M.setBounds(1012, 185, 84, 20);
    contentPanel.add(txtCast5M);

    txtCast6M = new JTextField();
    txtCast6M.setColumns(10);
    txtCast6M.setBounds(1012, 211, 84, 20);
    contentPanel.add(txtCast6M);

    txtCast7M = new JTextField();
    txtCast7M.setColumns(10);
    txtCast7M.setBounds(1012, 241, 84, 20);
    contentPanel.add(txtCast7M);

    txtCast7F = new JTextField();
    txtCast7F.setColumns(10);
    txtCast7F.setBounds(900, 241, 100, 20);
    contentPanel.add(txtCast7F);

    txtCast6F = new JTextField();
    txtCast6F.setColumns(10);
    txtCast6F.setBounds(900, 211, 100, 20);
    contentPanel.add(txtCast6F);

    txtCast5F = new JTextField();
    txtCast5F.setColumns(10);
    txtCast5F.setBounds(900, 185, 100, 20);
    contentPanel.add(txtCast5F);

    txtCast4F = new JTextField();
    txtCast4F.setColumns(10);
    txtCast4F.setBounds(900, 156, 100, 20);
    contentPanel.add(txtCast4F);

    JLabel lblCast_3 = new JLabel("Cast 4:");
    lblCast_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCast_3.setBounds(819, 153, 71, 20);
    contentPanel.add(lblCast_3);

    JLabel lblCast_4 = new JLabel("Cast 5:");
    lblCast_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCast_4.setBounds(819, 182, 71, 20);
    contentPanel.add(lblCast_4);

    JLabel lblCast_5 = new JLabel("Cast 6:");
    lblCast_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCast_5.setBounds(819, 208, 71, 20);
    contentPanel.add(lblCast_5);

    JLabel lblCast_6 = new JLabel("Cast 7:");
    lblCast_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCast_6.setBounds(819, 238, 71, 20);
    contentPanel.add(lblCast_6);

    JLabel lblCast_9 = new JLabel("Cast 8:");
    lblCast_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCast_9.setBounds(819, 268, 71, 20);
    contentPanel.add(lblCast_9);

    txtCast8F = new JTextField();
    txtCast8F.setColumns(10);
    txtCast8F.setBounds(900, 271, 100, 20);
    contentPanel.add(txtCast8F);

    txtCast8M = new JTextField();
    txtCast8M.setColumns(10);
    txtCast8M.setBounds(1012, 271, 84, 20);
    contentPanel.add(txtCast8M);

    txtCast8L = new JTextField();
    txtCast8L.setColumns(10);
    txtCast8L.setBounds(1110, 271, 100, 20);
    contentPanel.add(txtCast8L);

    JRadioButton rbMCast8 = new JRadioButton("Male");
    rbMCast8.setBounds(1216, 271, 53, 23);
    contentPanel.add(rbMCast8);

    JRadioButton rbFCast8 = new JRadioButton("Female");
    rbFCast8.setBounds(1271, 271, 71, 23);
    contentPanel.add(rbFCast8);

    JRadioButton rbFCast9 = new JRadioButton("Female");
    rbFCast9.setBounds(1271, 299, 71, 23);
    contentPanel.add(rbFCast9);

    JRadioButton rbMCast9 = new JRadioButton("Male");
    rbMCast9.setBounds(1216, 299, 53, 23);
    contentPanel.add(rbMCast9);

    JRadioButton rbMCast10 = new JRadioButton("Male");
    rbMCast10.setBounds(1216, 324, 53, 23);
    contentPanel.add(rbMCast10);

    JRadioButton rbFCast10 = new JRadioButton("Female");
    rbFCast10.setBounds(1271, 324, 71, 23);
    contentPanel.add(rbFCast10);

    txtCast10L = new JTextField();
    txtCast10L.setColumns(10);
    txtCast10L.setBounds(1110, 327, 100, 20);
    contentPanel.add(txtCast10L);

    txtCast9L = new JTextField();
    txtCast9L.setColumns(10);
    txtCast9L.setBounds(1110, 298, 100, 20);
    contentPanel.add(txtCast9L);

    txtCast9M = new JTextField();
    txtCast9M.setColumns(10);
    txtCast9M.setBounds(1012, 298, 84, 20);
    contentPanel.add(txtCast9M);

    txtCast10M = new JTextField();
    txtCast10M.setColumns(10);
    txtCast10M.setBounds(1012, 327, 84, 20);
    contentPanel.add(txtCast10M);

    txtCast10F = new JTextField();
    txtCast10F.setColumns(10);
    txtCast10F.setBounds(900, 327, 100, 20);
    contentPanel.add(txtCast10F);

    txtCast9F = new JTextField();
    txtCast9F.setColumns(10);
    txtCast9F.setBounds(900, 298, 100, 20);
    contentPanel.add(txtCast9F);

    JLabel lblCast_8 = new JLabel("Cast 9:");
    lblCast_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCast_8.setBounds(819, 295, 71, 20);
    contentPanel.add(lblCast_8);

    JLabel lblCast_7 = new JLabel("Cast 10:");
    lblCast_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblCast_7.setBounds(819, 324, 71, 20);
    contentPanel.add(lblCast_7);

    JLabel lblDirector = new JLabel("Director 2:");
    lblDirector.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblDirector.setBounds(10, 98, 126, 20);
    contentPanel.add(lblDirector);

    txtD2F = new JTextField();
    txtD2F.setColumns(10);
    txtD2F.setBounds(160, 98, 100, 20);
    contentPanel.add(txtD2F);

    txtD2M = new JTextField();
    txtD2M.setColumns(10);
    txtD2M.setBounds(272, 98, 84, 20);
    contentPanel.add(txtD2M);

    txtD2L = new JTextField();
    txtD2L.setColumns(10);
    txtD2L.setBounds(370, 98, 100, 20);
    contentPanel.add(txtD2L);

    JRadioButton rbMD2 = new JRadioButton("Male");
    rbMD2.setBounds(476, 98, 53, 23);
    contentPanel.add(rbMD2);

    JRadioButton rbFD2 = new JRadioButton("Female");
    rbFD2.setBounds(531, 98, 71, 23);
    contentPanel.add(rbFD2);

    JLabel lblDirector_1 = new JLabel("Director 3:");
    lblDirector_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblDirector_1.setBounds(10, 126, 126, 20);
    contentPanel.add(lblDirector_1);

    txtD3F = new JTextField();
    txtD3F.setColumns(10);
    txtD3F.setBounds(160, 126, 100, 20);
    contentPanel.add(txtD3F);

    txtD3M = new JTextField();
    txtD3M.setColumns(10);
    txtD3M.setBounds(272, 126, 84, 20);
    contentPanel.add(txtD3M);

    txtD3L = new JTextField();
    txtD3L.setColumns(10);
    txtD3L.setBounds(370, 126, 100, 20);
    contentPanel.add(txtD3L);

    JRadioButton rbMD3 = new JRadioButton("Male");
    rbMD3.setBounds(476, 126, 53, 23);
    contentPanel.add(rbMD3);

    JRadioButton rbFD3 = new JRadioButton("Female");
    rbFD3.setBounds(531, 126, 71, 23);
    contentPanel.add(rbFD3);

    JLabel lblProducer = new JLabel("Producer 3:");
    lblProducer.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblProducer.setBounds(10, 301, 126, 20);
    contentPanel.add(lblProducer);

    txtP3F = new JTextField();
    txtP3F.setColumns(10);
    txtP3F.setBounds(160, 301, 100, 20);
    contentPanel.add(txtP3F);

    txtP3M = new JTextField();
    txtP3M.setColumns(10);
    txtP3M.setBounds(272, 301, 84, 20);
    contentPanel.add(txtP3M);

    txtP3L = new JTextField();
    txtP3L.setColumns(10);
    txtP3L.setBounds(370, 301, 100, 20);
    contentPanel.add(txtP3L);

    JRadioButton rbMP3 = new JRadioButton("Male");
    rbMP3.setBounds(476, 298, 53, 23);
    contentPanel.add(rbMP3);

    JRadioButton rbFP3 = new JRadioButton("Female");
    rbFP3.setBounds(531, 298, 71, 23);
    contentPanel.add(rbFP3);

    JLabel lblComposer = new JLabel("Composer 1:");
    lblComposer.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblComposer.setBounds(10, 331, 126, 20);
    contentPanel.add(lblComposer);

    txtC1F = new JTextField();
    txtC1F.setColumns(10);
    txtC1F.setBounds(160, 331, 100, 20);
    contentPanel.add(txtC1F);

    txtC1M = new JTextField();
    txtC1M.setColumns(10);
    txtC1M.setBounds(272, 331, 84, 20);
    contentPanel.add(txtC1M);

    txtC1L = new JTextField();
    txtC1L.setColumns(10);
    txtC1L.setBounds(370, 331, 100, 20);
    contentPanel.add(txtC1L);

    JRadioButton rbMC1 = new JRadioButton("Male");
    rbMC1.setBounds(476, 328, 53, 23);
    contentPanel.add(rbMC1);

    JRadioButton rbFC1 = new JRadioButton("Female");
    rbFC1.setBounds(531, 328, 71, 23);
    contentPanel.add(rbFC1);

    JLabel lblAward = new JLabel("Award:");
    lblAward.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblAward.setBounds(618, 70, 53, 20);
    contentPanel.add(lblAward);

    JRadioButton rbYD1 = new JRadioButton("Yes");
    rbYD1.setBounds(674, 70, 53, 23);
    contentPanel.add(rbYD1);

    JRadioButton rbND1 = new JRadioButton("No");
    rbND1.setBounds(729, 70, 53, 23);
    contentPanel.add(rbND1);

    JLabel label = new JLabel("Award:");
    label.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label.setBounds(618, 99, 53, 20);
    contentPanel.add(label);

    JRadioButton rbYD2 = new JRadioButton("Yes");
    rbYD2.setBounds(674, 99, 53, 23);
    contentPanel.add(rbYD2);

    JRadioButton rbND2 = new JRadioButton("No");
    rbND2.setBounds(729, 99, 53, 23);
    contentPanel.add(rbND2);

    JLabel label_1 = new JLabel("Award:");
    label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_1.setBounds(1362, 70, 53, 20);
    contentPanel.add(label_1);

    JRadioButton rbYCast1 = new JRadioButton("Yes");
    rbYCast1.setBounds(1418, 70, 53, 23);
    contentPanel.add(rbYCast1);

    JRadioButton rbNCast1 = new JRadioButton("No");
    rbNCast1.setBounds(1473, 70, 53, 23);
    contentPanel.add(rbNCast1);

    JLabel label_2 = new JLabel("Award:");
    label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_2.setBounds(1362, 99, 53, 20);
    contentPanel.add(label_2);

    JRadioButton rbYCast2 = new JRadioButton("Yes");
    rbYCast2.setBounds(1418, 99, 53, 23);
    contentPanel.add(rbYCast2);

    JRadioButton rbNCast2 = new JRadioButton("No");
    rbNCast2.setBounds(1473, 99, 53, 23);
    contentPanel.add(rbNCast2);

    JLabel label_3 = new JLabel("Award:");
    label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_3.setBounds(1362, 129, 53, 20);
    contentPanel.add(label_3);

    JRadioButton rbYCast3 = new JRadioButton("Yes");
    rbYCast3.setBounds(1418, 129, 53, 23);
    contentPanel.add(rbYCast3);

    JRadioButton rbNCast3 = new JRadioButton("No");
    rbNCast3.setBounds(1473, 129, 53, 23);
    contentPanel.add(rbNCast3);

    JLabel label_4 = new JLabel("Award:");
    label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_4.setBounds(1362, 159, 53, 20);
    contentPanel.add(label_4);

    JRadioButton rbYCast4 = new JRadioButton("Yes");
    rbYCast4.setBounds(1418, 159, 53, 23);
    contentPanel.add(rbYCast4);

    JRadioButton rbNCast4 = new JRadioButton("No");
    rbNCast4.setBounds(1473, 159, 53, 23);
    contentPanel.add(rbNCast4);

    JLabel label_5 = new JLabel("Award:");
    label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_5.setBounds(1362, 186, 53, 20);
    contentPanel.add(label_5);

    JRadioButton rbYCast5 = new JRadioButton("Yes");
    rbYCast5.setBounds(1418, 186, 53, 23);
    contentPanel.add(rbYCast5);

    JRadioButton rbNCast5 = new JRadioButton("No");
    rbNCast5.setBounds(1473, 186, 53, 23);
    contentPanel.add(rbNCast5);

    JLabel label_6 = new JLabel("Award:");
    label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_6.setBounds(1362, 208, 53, 20);
    contentPanel.add(label_6);

    JRadioButton rbYCast6 = new JRadioButton("Yes");
    rbYCast6.setBounds(1418, 208, 53, 23);
    contentPanel.add(rbYCast6);

    JRadioButton rbNCast6 = new JRadioButton("No");
    rbNCast6.setBounds(1473, 208, 53, 23);
    contentPanel.add(rbNCast6);

    JLabel label_7 = new JLabel("Award:");
    label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_7.setBounds(1362, 241, 53, 20);
    contentPanel.add(label_7);

    JRadioButton rbYCast7 = new JRadioButton("Yes");
    rbYCast7.setBounds(1418, 241, 53, 23);
    contentPanel.add(rbYCast7);

    JRadioButton rbNCast7 = new JRadioButton("No");
    rbNCast7.setBounds(1473, 241, 53, 23);
    contentPanel.add(rbNCast7);

    JLabel label_8 = new JLabel("Award:");
    label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_8.setBounds(1362, 271, 53, 20);
    contentPanel.add(label_8);

    JRadioButton rbYCast8 = new JRadioButton("Yes");
    rbYCast8.setBounds(1418, 271, 53, 23);
    contentPanel.add(rbYCast8);

    JRadioButton rbNCast8 = new JRadioButton("No");
    rbNCast8.setBounds(1473, 271, 53, 23);
    contentPanel.add(rbNCast8);

    JLabel label_9 = new JLabel("Award:");
    label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_9.setBounds(1362, 299, 53, 20);
    contentPanel.add(label_9);

    JRadioButton rbYCast9 = new JRadioButton("Yes");
    rbYCast9.setBounds(1418, 299, 53, 23);
    contentPanel.add(rbYCast9);

    JRadioButton rbNCast9 = new JRadioButton("No");
    rbNCast9.setBounds(1473, 299, 53, 23);
    contentPanel.add(rbNCast9);

    JLabel label_10 = new JLabel("Award:");
    label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_10.setBounds(1362, 324, 53, 20);
    contentPanel.add(label_10);

    JRadioButton rbYCast10 = new JRadioButton("Yes");
    rbYCast10.setBounds(1418, 324, 53, 23);
    contentPanel.add(rbYCast10);

    JRadioButton rbNCast10 = new JRadioButton("No");
    rbNCast10.setBounds(1473, 324, 53, 23);
    contentPanel.add(rbNCast10);

    JLabel label_11 = new JLabel("Award:");
    label_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_11.setBounds(618, 126, 53, 20);
    contentPanel.add(label_11);

    JRadioButton rbYD3 = new JRadioButton("Yes");
    rbYD3.setBounds(674, 126, 53, 23);
    contentPanel.add(rbYD3);

    JRadioButton rbND3 = new JRadioButton("No");
    rbND3.setBounds(729, 126, 53, 23);
    contentPanel.add(rbND3);

    JLabel label_14 = new JLabel("Award:");
    label_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_14.setBounds(618, 159, 53, 20);
    contentPanel.add(label_14);

    JRadioButton rbYS1 = new JRadioButton("Yes");
    rbYS1.setBounds(674, 159, 53, 23);
    contentPanel.add(rbYS1);

    JRadioButton rbNS1 = new JRadioButton("No");
    rbNS1.setBounds(729, 159, 53, 23);
    contentPanel.add(rbNS1);

    JLabel label_15 = new JLabel("Award:");
    label_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_15.setBounds(618, 186, 53, 20);
    contentPanel.add(label_15);

    JRadioButton rbYS2 = new JRadioButton("Yes");
    rbYS2.setBounds(674, 186, 53, 23);
    contentPanel.add(rbYS2);

    JRadioButton rbNS2 = new JRadioButton("No");
    rbNS2.setBounds(729, 186, 53, 23);
    contentPanel.add(rbNS2);

    JLabel label_16 = new JLabel("Award:");
    label_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_16.setBounds(618, 215, 53, 20);
    contentPanel.add(label_16);

    JRadioButton rbYS3 = new JRadioButton("Yes");
    rbYS3.setBounds(674, 215, 53, 23);
    contentPanel.add(rbYS3);

    JRadioButton rbNS3 = new JRadioButton("No");
    rbNS3.setBounds(729, 215, 53, 23);
    contentPanel.add(rbNS3);

    JLabel label_17 = new JLabel("Award:");
    label_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_17.setBounds(618, 241, 53, 20);
    contentPanel.add(label_17);

    JRadioButton rbYP1 = new JRadioButton("Yes");
    rbYP1.setBounds(674, 241, 53, 23);
    contentPanel.add(rbYP1);

    JRadioButton rbNP1 = new JRadioButton("No");
    rbNP1.setBounds(729, 241, 53, 23);
    contentPanel.add(rbNP1);

    JLabel label_18 = new JLabel("Award:");
    label_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_18.setBounds(618, 271, 53, 20);
    contentPanel.add(label_18);

    JRadioButton rbYP2 = new JRadioButton("Yes");
    rbYP2.setBounds(674, 271, 53, 23);
    contentPanel.add(rbYP2);

    JRadioButton rbNP2 = new JRadioButton("No");
    rbNP2.setBounds(729, 271, 53, 23);
    contentPanel.add(rbNP2);

    JLabel label_19 = new JLabel("Award:");
    label_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_19.setBounds(618, 299, 53, 20);
    contentPanel.add(label_19);

    JRadioButton rbYP3 = new JRadioButton("Yes");
    rbYP3.setBounds(674, 299, 53, 23);
    contentPanel.add(rbYP3);

    JRadioButton rbNP3 = new JRadioButton("No");
    rbNP3.setBounds(729, 299, 53, 23);
    contentPanel.add(rbNP3);

    JLabel label_20 = new JLabel("Award:");
    label_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_20.setBounds(618, 331, 53, 20);
    contentPanel.add(label_20);

    JRadioButton rbYC1 = new JRadioButton("Yes");
    rbYC1.setBounds(674, 331, 53, 23);
    contentPanel.add(rbYC1);

    JRadioButton rbNC1 = new JRadioButton("No");
    rbNC1.setBounds(729, 331, 53, 23);
    contentPanel.add(rbNC1);

    JLabel label_21 = new JLabel("Award:");
    label_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_21.setBounds(618, 360, 53, 20);
    contentPanel.add(label_21);

    JRadioButton rbYC2 = new JRadioButton("Yes");
    rbYC2.setBounds(674, 360, 53, 23);
    contentPanel.add(rbYC2);

    JRadioButton rbNC2 = new JRadioButton("No");
    rbNC2.setBounds(729, 360, 53, 23);
    contentPanel.add(rbNC2);

    JLabel label_22 = new JLabel("Award:");
    label_22.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_22.setBounds(618, 388, 53, 20);
    contentPanel.add(label_22);

    JRadioButton rbYC3 = new JRadioButton("Yes");
    rbYC3.setBounds(674, 388, 53, 23);
    contentPanel.add(rbYC3);

    JRadioButton rbNC3 = new JRadioButton("No");
    rbNC3.setBounds(729, 388, 53, 23);
    contentPanel.add(rbNC3);

    JLabel label_28 = new JLabel("Award:");
    label_28.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_28.setBounds(618, 413, 53, 20);
    contentPanel.add(label_28);

    JRadioButton rbYE1 = new JRadioButton("Yes");
    rbYE1.setBounds(674, 413, 53, 23);
    contentPanel.add(rbYE1);

    JRadioButton rbNE1 = new JRadioButton("No");
    rbNE1.setBounds(729, 413, 53, 23);
    contentPanel.add(rbNE1);

    JLabel label_29 = new JLabel("Award:");
    label_29.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_29.setBounds(618, 439, 53, 20);
    contentPanel.add(label_29);

    JRadioButton rbYE2 = new JRadioButton("Yes");
    rbYE2.setBounds(674, 439, 53, 23);
    contentPanel.add(rbYE2);

    JRadioButton rbNE2 = new JRadioButton("No");
    rbNE2.setBounds(729, 439, 53, 23);
    contentPanel.add(rbNE2);

    JLabel label_33 = new JLabel("Award:");
    label_33.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_33.setBounds(618, 469, 53, 20);
    contentPanel.add(label_33);

    JRadioButton rbYE3 = new JRadioButton("Yes");
    rbYE3.setBounds(674, 469, 53, 23);
    contentPanel.add(rbYE3);

    JRadioButton rbNE3 = new JRadioButton("No");
    rbNE3.setBounds(729, 469, 53, 23);
    contentPanel.add(rbNE3);

    JLabel label_34 = new JLabel("Award:");
    label_34.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_34.setBounds(618, 499, 53, 20);
    contentPanel.add(label_34);

    JRadioButton rbYCD1 = new JRadioButton("Yes");
    rbYCD1.setBounds(674, 499, 53, 23);
    contentPanel.add(rbYCD1);

    JRadioButton rbNCD1 = new JRadioButton("No");
    rbNCD1.setBounds(729, 499, 53, 23);
    contentPanel.add(rbNCD1);

    JLabel label_35 = new JLabel("Award:");
    label_35.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_35.setBounds(618, 527, 53, 20);
    contentPanel.add(label_35);

    JRadioButton rbYCD2 = new JRadioButton("Yes");
    rbYCD2.setBounds(674, 527, 53, 23);
    contentPanel.add(rbYCD2);

    JRadioButton rbNCD2 = new JRadioButton("No");
    rbNCD2.setBounds(729, 527, 53, 23);
    contentPanel.add(rbNCD2);

    JLabel label_36 = new JLabel("Award:");
    label_36.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_36.setBounds(618, 552, 53, 20);
    contentPanel.add(label_36);

    JRadioButton rbYCD3 = new JRadioButton("Yes");
    rbYCD3.setBounds(674, 552, 53, 23);
    contentPanel.add(rbYCD3);

    JRadioButton rbNCD3 = new JRadioButton("No");
    rbNCD3.setBounds(729, 552, 53, 23);
    contentPanel.add(rbNCD3);

    // gender radio button
    ButtonGroup g1 = new ButtonGroup();
    g1.add(rbMD1);
    g1.add(rbFD1);
    ButtonGroup g2 = new ButtonGroup();
    g2.add(rbMD2);
    g2.add(rbFD2);
    ButtonGroup g3 = new ButtonGroup();
    g3.add(rbMD3);
    g3.add(rbFD3);
    ButtonGroup g4 = new ButtonGroup();
    g4.add(rbMS1);
    g4.add(rbFS1);
    ButtonGroup g5 = new ButtonGroup();
    g5.add(rbMS2);
    g5.add(rbFS2);
    ButtonGroup g6 = new ButtonGroup();
    g6.add(rbMS3);
    g6.add(rbFS3);
    ButtonGroup g7 = new ButtonGroup();
    g7.add(rbMP1);
    g7.add(rbFP1);
    ButtonGroup g8 = new ButtonGroup();
    g8.add(rbMP2);
    g8.add(rbFP2);
    ButtonGroup g9 = new ButtonGroup();
    g9.add(rbMP3);
    g9.add(rbFP3);
    ButtonGroup g10 = new ButtonGroup();
    g10.add(rbMC1);
    g10.add(rbFC1);
    ButtonGroup g11 = new ButtonGroup();
    g11.add(rbMC2);
    g11.add(rbFC2);
    ButtonGroup g12 = new ButtonGroup();
    g12.add(rbMC3);
    g12.add(rbFC3);
    ButtonGroup g13 = new ButtonGroup();
    g13.add(rbME1);
    g13.add(rbFE1);
    ButtonGroup g14 = new ButtonGroup();
    g14.add(rbME2);
    g14.add(rbFE2);
    ButtonGroup g15 = new ButtonGroup();
    g15.add(rbME3);
    g15.add(rbFE3);
    ButtonGroup g16 = new ButtonGroup();
    g16.add(rbMCD1);
    g16.add(rbFCD1);
    ButtonGroup g17 = new ButtonGroup();
    g17.add(rbMCD2);
    g17.add(rbFCD2);
    ButtonGroup g18 = new ButtonGroup();
    g18.add(rbMCD3);
    g18.add(rbFCD3);
    ButtonGroup g19 = new ButtonGroup();
    g19.add(rbMCast1);
    g19.add(rbFCast1);
    ButtonGroup g20 = new ButtonGroup();
    g20.add(rbMCast2);
    g20.add(rbFCast2);
    ButtonGroup g21 = new ButtonGroup();
    g21.add(rbMCast3);
    g21.add(rbFCast3);
    ButtonGroup g22 = new ButtonGroup();
    g22.add(rbMCast4);
    g22.add(rbFCast4);
    ButtonGroup g23 = new ButtonGroup();
    g23.add(rbMCast5);
    g23.add(rbFCast5);
    ButtonGroup g24 = new ButtonGroup();
    g24.add(rbMCast6);
    g24.add(rbFCast6);
    ButtonGroup g25 = new ButtonGroup();
    g25.add(rbMCast7);
    g25.add(rbFCast7);
    ButtonGroup g26 = new ButtonGroup();
    g26.add(rbMCast8);
    g26.add(rbFCast8);
    ButtonGroup g27 = new ButtonGroup();
    g27.add(rbMCast9);
    g27.add(rbFCast9);
    ButtonGroup g28 = new ButtonGroup();
    g28.add(rbMCast10);
    g28.add(rbFCast10);

    // award radio button
    ButtonGroup a1 = new ButtonGroup();
    a1.add(rbYD1);
    a1.add(rbND1);
    ButtonGroup a2 = new ButtonGroup();
    a2.add(rbYD2);
    a2.add(rbND2);
    ButtonGroup a3 = new ButtonGroup();
    a3.add(rbYD3);
    a3.add(rbND3);
    ButtonGroup a4 = new ButtonGroup();
    a4.add(rbYS1);
    a4.add(rbNS1);
    ButtonGroup a5 = new ButtonGroup();
    a5.add(rbYS2);
    a5.add(rbNS2);
    ButtonGroup a6 = new ButtonGroup();
    a6.add(rbYS3);
    a6.add(rbNS3);
    ButtonGroup a7 = new ButtonGroup();
    a7.add(rbYP1);
    a7.add(rbNP1);
    ButtonGroup a8 = new ButtonGroup();
    a8.add(rbYP2);
    a8.add(rbNP2);
    ButtonGroup a9 = new ButtonGroup();
    a9.add(rbYP3);
    a9.add(rbNP3);
    ButtonGroup a10 = new ButtonGroup();
    a10.add(rbYC1);
    a10.add(rbNC1);
    ButtonGroup a11 = new ButtonGroup();
    a11.add(rbYC2);
    a11.add(rbNC2);
    ButtonGroup a12 = new ButtonGroup();
    a12.add(rbYC3);
    a12.add(rbNC3);
    ButtonGroup a13 = new ButtonGroup();
    a13.add(rbYE1);
    a13.add(rbNE1);
    ButtonGroup a14 = new ButtonGroup();
    a14.add(rbYE2);
    a14.add(rbNE2);
    ButtonGroup a15 = new ButtonGroup();
    a15.add(rbYE3);
    a15.add(rbNE3);
    ButtonGroup a16 = new ButtonGroup();
    a16.add(rbYCD1);
    a16.add(rbNCD1);
    ButtonGroup a17 = new ButtonGroup();
    a17.add(rbYCD2);
    a17.add(rbNCD2);
    ButtonGroup a18 = new ButtonGroup();
    a18.add(rbYCD3);
    a18.add(rbNCD3);
    ButtonGroup a19 = new ButtonGroup();
    a19.add(rbYCast1);
    a19.add(rbNCast1);
    ButtonGroup a20 = new ButtonGroup();
    a20.add(rbYCast2);
    a20.add(rbNCast2);
    ButtonGroup a21 = new ButtonGroup();
    a21.add(rbYCast3);
    a21.add(rbNCast3);
    ButtonGroup a22 = new ButtonGroup();
    a22.add(rbYCast4);
    a22.add(rbNCast4);
    ButtonGroup a23 = new ButtonGroup();
    a23.add(rbYCast5);
    a23.add(rbNCast5);
    ButtonGroup a24 = new ButtonGroup();
    a24.add(rbYCast6);
    a24.add(rbNCast6);
    ButtonGroup a25 = new ButtonGroup();
    a25.add(rbYCast7);
    a25.add(rbNCast7);
    ButtonGroup a26 = new ButtonGroup();
    a26.add(rbYCast8);
    a26.add(rbNCast8);
    ButtonGroup a27 = new ButtonGroup();
    a27.add(rbYCast9);
    a27.add(rbNCast9);
    ButtonGroup a28 = new ButtonGroup();
    a28.add(rbYCast10);
    a28.add(rbNCast10);


    {
      JPanel buttonPane = new JPanel();
      buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
      getContentPane().add(buttonPane, BorderLayout.SOUTH);
      {
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
            /* --- Data->insert->Movie --- */
            Connection con = ConnectionDriver.connectToDatabase();
            PreparedStatement preparedStmt = null;
            int ID = 0;
            int roleID = 0;
            final String D = "Director", S = "Script Writer", P = "Movie Producer", C = "Composer", E = "Movie Editor", CD = "Costume Designer", Cast = "Cast";
            
            try {
              con.setAutoCommit(false);
              String movieName = txtMovieName.getText().trim();
              String year = txtYear.getText().trim();

              insertMovie(con, movieName, year);
              //directors
              if (!txtD1F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtD1F.getText().trim(), txtD1M.getText().trim(), txtD1L.getText().trim(), rbMD1, rbFD1);
                roleID = insertRole(con, D);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYD1, rbND1);
              }
              if (!txtD2F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtD2F.getText().trim(), txtD2M.getText().trim(), txtD2L.getText().trim(), rbMD2, rbFD2);
                roleID = insertRole(con, D);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYD2, rbND2);
              }
              if (!txtD3F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtD3F.getText().trim(), txtD3M.getText().trim(), txtD3L.getText().trim(), rbMD3, rbFD3);
                roleID = insertRole(con, D);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYD3, rbND3);
              }
              //script writers
              if (!txtS1F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtS1F.getText().trim(), txtS1M.getText().trim(), txtS1L.getText().trim(), rbMS1, rbFS1);
                roleID = insertRole(con, S);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYS1, rbNS1);
              }
              if (!txtS2F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtS2F.getText().trim(), txtS2M.getText().trim(), txtS2L.getText().trim(), rbMS2, rbFS2);
                roleID = insertRole(con, S);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYS2, rbNS2);
              }
              if (!txtS3F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtS3F.getText().trim(), txtS3M.getText().trim(), txtS3L.getText().trim(), rbMS3, rbFS3);
                roleID = insertRole(con, S);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYS3, rbNS3);
              }
              //producers
              if (!txtP1F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtP1F.getText().trim(), txtP1M.getText().trim(), txtP1L.getText().trim(), rbMP1, rbFP1);
                roleID = insertRole(con, P);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYP1, rbNP1);
              }
              if (!txtP2F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtP2F.getText().trim(), txtP2M.getText().trim(), txtP2L.getText().trim(), rbMP2, rbFP2);
                roleID = insertRole(con, P);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYP2, rbNP2);
              }
              if (!txtP3F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtP3F.getText().trim(), txtP3M.getText().trim(), txtP3L.getText().trim(), rbMP3, rbFP3);
                roleID = insertRole(con, P);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYP3, rbNP3);
              }
              //composers
              if (!txtC1F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtC1F.getText().trim(), txtC1M.getText().trim(), txtC1L.getText().trim(), rbMC1, rbFC1);
                roleID = insertRole(con, C);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYC1, rbNC1);
              }
              if (!txtC2F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtC2F.getText().trim(), txtC2M.getText().trim(), txtC2L.getText().trim(), rbMC2, rbFC2);
                roleID = insertRole(con, C);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYC2, rbNC2);
              }
              if (!txtC3F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtC3F.getText().trim(), txtC3M.getText().trim(), txtC3L.getText().trim(), rbMC3, rbFC3);
                roleID = insertRole(con, C);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYC3, rbNC3);
              }
              //editors
              if (!txtE1F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtE1F.getText().trim(), txtE1M.getText().trim(), txtE1L.getText().trim(), rbME1, rbFE1);
                roleID = insertRole(con, E);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYE1, rbNE1);
              }
              if (!txtE2F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtE2F.getText().trim(), txtE2M.getText().trim(), txtE2L.getText().trim(), rbME2, rbFE2);
                roleID = insertRole(con, E);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYE2, rbNE2);
              }
              if (!txtE3F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtE3F.getText().trim(), txtE3M.getText().trim(), txtE3L.getText().trim(), rbME3, rbFE3);
                roleID = insertRole(con, E);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYE3, rbNE3);
              }
              //costume designers
              if (!txtCD1F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCD1F.getText().trim(), txtCD1M.getText().trim(), txtCD1L.getText().trim(), rbMCD1, rbFCD1);
                roleID = insertRole(con, CD);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCD1, rbNCD1);
              }
              if (!txtCD2F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCD2F.getText().trim(), txtCD2M.getText().trim(), txtCD2L.getText().trim(), rbMCD2, rbFCD2);
                roleID = insertRole(con, CD);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCD2, rbNCD2);
              }
              if (!txtCD3F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCD3F.getText().trim(), txtCD3M.getText().trim(), txtCD3L.getText().trim(), rbMCD3, rbFCD3);
                roleID = insertRole(con, CD);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCD3, rbNCD3);
              }
              //casts
              if (!txtCast1F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCast1F.getText().trim(), txtCast1M.getText().trim(), txtCast1L.getText().trim(), rbMCast1, rbFCast1);
                roleID = insertRole(con, Cast);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCast1, rbNCast1);
              }
              if (!txtCast2F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCast2F.getText().trim(), txtCast2M.getText().trim(), txtCast2L.getText().trim(), rbMCast2, rbFCast2);
                roleID = insertRole(con, Cast);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCast2, rbNCast2);
              }
              if (!txtCast3F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCast3F.getText().trim(), txtCast3M.getText().trim(), txtCast3L.getText().trim(), rbMCast3, rbFCast3);
                roleID = insertRole(con, Cast);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCast3, rbNCast3);
              }
              if (!txtCast4F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCast4F.getText().trim(), txtCast4M.getText().trim(), txtCast4L.getText().trim(), rbMCast4, rbFCast4);
                roleID = insertRole(con, Cast);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCast4, rbNCast4);
              }
              if (!txtCast5F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCast5F.getText().trim(), txtCast5M.getText().trim(), txtCast5L.getText().trim(), rbMCast5, rbFCast5);
                roleID = insertRole(con, Cast);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCast5, rbNCast5);
              }
              if (!txtCast6F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCast6F.getText().trim(), txtCast6M.getText().trim(), txtCast6L.getText().trim(), rbMCast6, rbFCast6);
                roleID = insertRole(con, Cast);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCast6, rbNCast6);
              }
              if (!txtCast7F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCast7F.getText().trim(), txtCast7M.getText().trim(), txtCast7L.getText().trim(), rbMCast7, rbFCast7);
                roleID = insertRole(con, Cast);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCast7, rbNCast7);
              }
              if (!txtCast8F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCast8F.getText().trim(), txtCast8M.getText().trim(), txtCast8L.getText().trim(), rbMCast8, rbFCast8);
                roleID = insertRole(con, Cast);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCast8, rbNCast8);
              }
              if (!txtCast9F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCast9F.getText().trim(), txtCast9M.getText().trim(), txtCast9L.getText().trim(), rbMCast9, rbFCast9);
                roleID = insertRole(con, Cast);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCast9, rbNCast9);
              }
              if (!txtCast10F.getText().trim().isEmpty()) {
                ID = InsertBook.insertPeople(con, txtCast10F.getText().trim(), txtCast10M.getText().trim(), txtCast10L.getText().trim(), rbMCast10, rbFCast10);
                roleID = insertRole(con, Cast);
                insertCrewMember(con, ID, movieName, year, roleID);
                insertAward(con, ID, movieName, year, rbYCast10, rbNCast10);
              }
              
              
              con.commit();
              dispose();
            } catch (SQLException e) {
              System.out.println(e);
              if (con != null) {
                try {
                  System.err.print("Transaction is being rolled back.");
                  con.rollback();
                } catch (SQLException e2) {
                }
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

  public static void insertMovie(Connection con, String movieName, String year) {

    PreparedStatement preparedStmt = null;
    String query = "insert into Movie (MovieName, Year) values (?, ?)";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, movieName.isEmpty() ? null : movieName);
      if (year.isEmpty()) {
        preparedStmt.setString(2, null);
      } else {
        preparedStmt.setInt(2, Integer.parseInt(year));
      }

      preparedStmt.executeUpdate();

      preparedStmt.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    }
  }

  public static int insertRole(Connection con, String role) {
    int roleID = 0;
    roleID = getExistingRole(con, role);

    if (roleID == 0)  {
      PreparedStatement preparedStmt = null;
      String query = "insert into Role (Description) values (?)";
      try {
        con.setAutoCommit(false);
        preparedStmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStmt.setString(1, role.isEmpty() ? null : role);
        preparedStmt.executeUpdate();
        ResultSet rs = preparedStmt.getGeneratedKeys();
        if (rs.next()) {
          roleID = rs.getInt(1);
        } ;
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
          } catch (SQLException e2) {
          }
        }
      }
    }
    return roleID;
  }

  public static int getExistingRole(Connection con, String role) {
    PreparedStatement preparedStmt = null;
    int roleID = 0;
    String query = "select ID from Role where Description = ?";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, role.isEmpty() ? null : role);
      
      ResultSet rs = preparedStmt.executeQuery();
      if (rs.next()) {
        roleID = rs.getInt(1);
      } ;
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
    return roleID;
  }
  
  public static void insertCrewMember(Connection con, int ID, String movieName, String year, int roleID) {

    PreparedStatement preparedStmt = null;
    String query = "insert into CrewMember (PeopleInvolved_ID, MovieName, ReleaseYear, Role_ID) values (?, ?, ?, ?)";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      if (ID == 0) {
        preparedStmt.setNull(1, Types.INTEGER);
      } else {
        preparedStmt.setInt(1, ID);
      }
      preparedStmt.setString(2, movieName.isEmpty() ? null : movieName);
      if (year.isEmpty()) {
        preparedStmt.setString(3, null);
      } else {
        preparedStmt.setInt(3, Integer.parseInt(year));
      }
      if (roleID == 0) {
        preparedStmt.setNull(4, Types.INTEGER);
      } else {
        preparedStmt.setInt(4, roleID);
      }
      preparedStmt.executeUpdate();

      preparedStmt.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    }
  }

  public static void insertAward(Connection con, int ID, String movieName, String year, JRadioButton Y, JRadioButton N) {

    PreparedStatement preparedStmt = null;
    String query = "insert into Award (PeopleInvolved_ID, MovieName, Year, Award) values (?, ?, ?, ?)";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      if (ID == 0) {
        preparedStmt.setNull(1, Types.INTEGER);
      } else {
        preparedStmt.setInt(1, ID);
      }
      preparedStmt.setString(2, movieName.isEmpty() ? null : movieName);
      if (year.isEmpty()) {
        preparedStmt.setString(3, null);
      } else {
        preparedStmt.setInt(3, Integer.parseInt(year));
      }
      if (Y.isSelected()) {
        preparedStmt.setByte(4, (byte) 1);
      } else if (N.isSelected()) {
        preparedStmt.setByte(4, (byte) 0);
      } else {
        preparedStmt.setNull(4, Types.TINYINT);
      }
      preparedStmt.executeUpdate();

      preparedStmt.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
        } catch (SQLException e2) {
        }
      }
    }
  }
}
