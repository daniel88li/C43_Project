import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class UpdateMusic extends JDialog {

  private final JPanel contentPanel = new JPanel();
  static HashMap<String, String> oldMusic = new HashMap<>();
  static HashMap<String, String> oldTracks = new HashMap<>();
  HashMap<String, String> currTracks = new HashMap<>();
  static int producerID = 0;
  static ArrayList<Integer> T1S = new ArrayList<>();
  static HashMap<String, Integer> T1 = new HashMap<>();
  static ArrayList<Integer> T2S = new ArrayList<>();
  static HashMap<String, Integer> T2 = new HashMap<>();
  static ArrayList<Integer> T3S = new ArrayList<>();
  static HashMap<String, Integer> T3 = new HashMap<>();
  static ArrayList<Integer> T4S = new ArrayList<>();
  static HashMap<String, Integer> T4 = new HashMap<>();
  static ArrayList<Integer> T5S = new ArrayList<>();
  static HashMap<String, Integer> T5 = new HashMap<>();
  static ArrayList<Integer> T6S = new ArrayList<>();
  static HashMap<String, Integer> T6 = new HashMap<>();
  static ArrayList<Integer> T7S = new ArrayList<>();
  static HashMap<String, Integer> T7 = new HashMap<>();
  static JTextField txtAlbumName;
  static JTextField txtYear;
  static JTextField txtT1;
  static JTextField txtProducerF;
  static JTextField txtProducerM;
  static JTextField txtProducerL;
  static JTextField txtT1S1F;
  static JTextField txtT1S1M;
  static JTextField txtT1S1L;
  static JTextField txtT1WF;
  static JTextField txtT1WM;
  static JTextField txtT1WL;
  static JTextField txtT1CF;
  static JTextField txtT1CM;
  static JTextField txtT1CL;
  static JTextField txtT1AF;
  static JTextField txtT1AM;
  static JTextField txtT1AL;
  static JRadioButton rbMaleP;
  static JRadioButton rbFemaleP;
  static JRadioButton rbMT1S1;
  static JRadioButton rbFT1S1;
  static JRadioButton rbMT1W;
  static JRadioButton rbFT1W;
  static JRadioButton rbMT1C;
  static JRadioButton rbFT1C;
  static JRadioButton rbMT1A;
  static JRadioButton rbFT1A;
  static JRadioButton rbMT1S2;
  static JRadioButton rbFT1S2;
  static JRadioButton rbMT2S1;
  static JRadioButton rbFT2S1;
  static JRadioButton rbFT2S2;
  static JRadioButton rbMT2S2;
  static JRadioButton rbMT2W;
  static JRadioButton rbFT2W;
  static JRadioButton rbFT2C;
  static JRadioButton rbMT2C;
  static JRadioButton rbMT2A;
  static JRadioButton rbFT2A;
  static JRadioButton rbMT3S1;
  static JRadioButton rbFT3S1;
  static JRadioButton rbFT3S2;
  static JRadioButton rbMT3S2;
  static JRadioButton rbMT3W;
  static JRadioButton rbFT3W;
  static JRadioButton rbFT3C;
  static JRadioButton rbMT3C;
  static JRadioButton rbMT3A;
  static JRadioButton rbFT3A;
  static JRadioButton rbMT4S1;
  static JRadioButton rbFT4S1;
  static JRadioButton rbFT4S2;
  static JRadioButton rbMT4S2;
  static JRadioButton rbMT4W;
  static JRadioButton rbFT4W;
  static JRadioButton rbFT4C;
  static JRadioButton rbMT4C;
  static JRadioButton rbMT4A;
  static JRadioButton rbFT4A;
  static JRadioButton rbMT5S1;
  static JRadioButton rbFT5S1;
  static JRadioButton rbFT5S2;
  static JRadioButton rbMT5S2;
  static JRadioButton rbMT5W;
  static JRadioButton rbFT5W;
  static JRadioButton rbFT5C;
  static JRadioButton rbMT5C;
  static JRadioButton rbMT5A;
  static JRadioButton rbFT5A;
  static JRadioButton rbMT6S1;
  static JRadioButton rbFT6S1;
  static JRadioButton rbFT6S2;
  static JRadioButton rbMT6S2;
  static JRadioButton rbMT6W;
  static JRadioButton rbFT6W;
  static JRadioButton rbFT6C;
  static JRadioButton rbMT6C;
  static JRadioButton rbMT6A;
  static JRadioButton rbFT6A;
  static JRadioButton rbMT7S1;
  static JRadioButton rbFT7S1;
  static JRadioButton rbFT7S2;
  static JRadioButton rbMT7S2;
  static JRadioButton rbMT7W;
  static JRadioButton rbFT7W;
  static JRadioButton rbFT7C;
  static JRadioButton rbMT7C;
  static JRadioButton rbMT7A;
  static JRadioButton rbFT7A;
  static JRadioButton rbC;
  static JRadioButton rbV;
  private static JTextField txtT1S2F;
  private static JTextField txtT1S2M;
  private static JTextField txtT1S2L;
  private static JTextField txtL1;
  private static JTextField txtT2;
  private static JTextField txtL2;
  private static JTextField txtT2S1F;
  private static JTextField txtT2S1M;
  private static JTextField txtT2S1L;
  private static JTextField txtT2AL;
  private static JTextField txtT2CL;
  private static JTextField txtT2WL;
  private static JTextField txtT2S2L;
  private static JTextField txtT2S2M;
  private static JTextField txtT2WM;
  private static JTextField txtT2CM;
  private static JTextField txtT2AM;
  private static JTextField txtT2AF;
  private static JTextField txtT2CF;
  private static JTextField txtT2WF;
  private static JTextField txtT2S2F;
  private static JTextField txtT3;
  private static JTextField txtL3;
  private static JTextField txtT3S1F;
  private static JTextField txtT3S1M;
  private static JTextField txtT3S1L;
  private static JTextField txtT3AL;
  private static JTextField txtT3CL;
  private static JTextField txtT3WL;
  private static JTextField txtT3S2L;
  private static JTextField txtT3S2M;
  private static JTextField txtT3WM;
  private static JTextField txtT3CM;
  private static JTextField txtT3AM;
  private static JTextField txtT3AF;
  private static JTextField txtT3CF;
  private static JTextField txtT3WF;
  private static JTextField txtT3S2F;
  private static JTextField txtT4;
  private static JTextField txtL4;
  private static JTextField txtT4S1F;
  private static JTextField txtT4S1M;
  private static JTextField txtT4S1L;
  private static JTextField txtT4AL;
  private static JTextField txtT4CL;
  private static JTextField txtT4WL;
  private static JTextField txtT4S2L;
  private static JTextField txtT4S2M;
  private static JTextField txtT4WM;
  private static JTextField txtT4CM;
  private static JTextField txtT4AM;
  private static JTextField txtT4AF;
  private static JTextField txtT4CF;
  private static JTextField txtT4WF;
  private static JTextField txtT4S2F;
  private static JTextField txtT5;
  private static JTextField txtL5;
  private static JTextField txtT5S1F;
  private static JTextField txtT5S1M;
  private static JTextField txtT5S1L;
  private static JTextField txtT5AL;
  private static JTextField txtT5CL;
  private static JTextField txtT5WL;
  private static JTextField txtT5S2L;
  private static JTextField txtT5S2M;
  private static JTextField txtT5WM;
  private static JTextField txtT5CM;
  private static JTextField txtT5AM;
  private static JTextField txtT5AF;
  private static JTextField txtT5CF;
  private static JTextField txtT5WF;
  private static JTextField txtT5S2F;
  private static JTextField txtT6;
  private static JTextField txtL6;
  private static JTextField txtT6S1F;
  private static JTextField txtT6S1M;
  private static JTextField txtT6S1L;
  private static JTextField txtT6AL;
  private static JTextField txtT6CL;
  private static JTextField txtT6WL;
  private static JTextField txtT6S2L;
  private static JTextField txtT6S2M;
  private static JTextField txtT6WM;
  private static JTextField txtT6CM;
  private static JTextField txtT6AM;
  private static JTextField txtT6AF;
  private static JTextField txtT6CF;
  private static JTextField txtT6WF;
  private static JTextField txtT6S2F;
  private static JTextField txtT7;
  private static JTextField txtL7;
  private static JTextField txtT7S1F;
  private static JTextField txtT7S1M;
  private static JTextField txtT7S1L;
  private static JTextField txtT7AL;
  private static JTextField txtT7CL;
  private static JTextField txtT7WL;
  private static JTextField txtT7S2L;
  private static JTextField txtT7S2M;
  private static JTextField txtT7WM;
  private static JTextField txtT7CM;
  private static JTextField txtT7AM;
  private static JTextField txtT7AF;
  private static JTextField txtT7CF;
  private static JTextField txtT7WF;
  private static JTextField txtT7S2F;


  /**
   * Create the dialog.
   */
  public UpdateMusic(String albumName) {
    setModal(true);
    setTitle("Update Music");
    setSize(1260, 1000);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(null);

    JLabel lblAlbumName = new JLabel("Album Name:");
    lblAlbumName.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblAlbumName.setBounds(10, 10, 126, 20);
    contentPanel.add(lblAlbumName);

    JLabel lblYear = new JLabel("Year:");
    lblYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblYear.setBounds(10, 40, 126, 20);
    contentPanel.add(lblYear);

    JLabel lblProducer = new JLabel("Producer:");
    lblProducer.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblProducer.setBounds(10, 70, 126, 20);
    contentPanel.add(lblProducer);

    JLabel lbl1 = new JLabel("Track 1 Name:");
    lbl1.setFont(new Font("Tahoma", Font.BOLD, 14));
    lbl1.setBounds(10, 101, 124, 20);
    contentPanel.add(lbl1);
    
    JLabel lblL1 = new JLabel("Language:");
    lblL1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblL1.setBounds(10, 126, 124, 20);
    contentPanel.add(lblL1);
    
    JLabel lblT1S1 = new JLabel("Singer 1:");
    lblT1S1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblT1S1.setBounds(10, 159, 126, 20);
    contentPanel.add(lblT1S1);
    
    JLabel lblT1S2 = new JLabel("Singer 2:");
    lblT1S2.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblT1S2.setBounds(10, 186, 126, 20);
    contentPanel.add(lblT1S2);

    JLabel lbl4 = new JLabel("Song Writer:");
    lbl4.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lbl4.setBounds(10, 215, 126, 20);
    contentPanel.add(lbl4);

    JLabel lbl5 = new JLabel("Composer:");
    lbl5.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lbl5.setBounds(10, 241, 126, 20);
    contentPanel.add(lbl5);

    JLabel lbl6 = new JLabel("Arranger:");
    lbl6.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lbl6.setBounds(10, 271, 126, 20);
    contentPanel.add(lbl6);


    txtAlbumName = new JTextField();
    txtAlbumName.setBounds(160, 10, 400, 20);
    contentPanel.add(txtAlbumName);
    txtAlbumName.setColumns(10);

    txtYear = new JTextField();
    txtYear.setBounds(160, 40, 155, 20);
    contentPanel.add(txtYear);
    txtYear.setColumns(10);

    txtT1 = new JTextField();
    txtT1.setColumns(10);
    txtT1.setBounds(160, 103, 400, 20);
    contentPanel.add(txtT1);
    
    txtProducerF = new JTextField();
    txtProducerF.setColumns(10);
    txtProducerF.setBounds(160, 70, 100, 20);
    contentPanel.add(txtProducerF);

    txtProducerM = new JTextField();
    txtProducerM.setColumns(10);
    txtProducerM.setBounds(272, 70, 84, 20);
    contentPanel.add(txtProducerM);

    txtProducerL = new JTextField();
    txtProducerL.setColumns(10);
    txtProducerL.setBounds(370, 70, 100, 20);
    contentPanel.add(txtProducerL);

    txtL1 = new JTextField();
    txtL1.setColumns(10);
    txtL1.setBounds(160, 128, 208, 20);
    contentPanel.add(txtL1);
    
    txtT1S1F = new JTextField();
    txtT1S1F.setColumns(10);
    txtT1S1F.setBounds(160, 159, 100, 20);
    contentPanel.add(txtT1S1F);

    txtT1S1M = new JTextField();
    txtT1S1M.setColumns(10);
    txtT1S1M.setBounds(272, 159, 84, 20);
    contentPanel.add(txtT1S1M);

    txtT1S1L = new JTextField();
    txtT1S1L.setColumns(10);
    txtT1S1L.setBounds(370, 159, 100, 20);
    contentPanel.add(txtT1S1L);

    txtT1S2F = new JTextField();
    txtT1S2F.setColumns(10);
    txtT1S2F.setBounds(160, 186, 100, 20);
    contentPanel.add(txtT1S2F);
    
    txtT1S2M = new JTextField();
    txtT1S2M.setColumns(10);
    txtT1S2M.setBounds(272, 186, 84, 20);
    contentPanel.add(txtT1S2M);
    
    txtT1S2L = new JTextField();
    txtT1S2L.setColumns(10);
    txtT1S2L.setBounds(370, 186, 100, 20);
    contentPanel.add(txtT1S2L);
    
    txtT1WF = new JTextField();
    txtT1WF.setColumns(10);
    txtT1WF.setBounds(160, 215, 100, 20);
    contentPanel.add(txtT1WF);

    txtT1WM = new JTextField();
    txtT1WM.setColumns(10);
    txtT1WM.setBounds(272, 215, 84, 20);
    contentPanel.add(txtT1WM);

    txtT1WL = new JTextField();
    txtT1WL.setColumns(10);
    txtT1WL.setBounds(370, 215, 100, 20);
    contentPanel.add(txtT1WL);

    txtT1CF = new JTextField();
    txtT1CF.setColumns(10);
    txtT1CF.setBounds(160, 241, 100, 20);
    contentPanel.add(txtT1CF);

    txtT1CM = new JTextField();
    txtT1CM.setColumns(10);
    txtT1CM.setBounds(272, 241, 84, 20);
    contentPanel.add(txtT1CM);

    txtT1CL = new JTextField();
    txtT1CL.setColumns(10);
    txtT1CL.setBounds(370, 241, 100, 20);
    contentPanel.add(txtT1CL);

    txtT1AF = new JTextField();
    txtT1AF.setColumns(10);
    txtT1AF.setBounds(160, 271, 100, 20);
    contentPanel.add(txtT1AF);

    txtT1AM = new JTextField();
    txtT1AM.setColumns(10);
    txtT1AM.setBounds(272, 271, 84, 20);
    contentPanel.add(txtT1AM);

    txtT1AL = new JTextField();
    txtT1AL.setColumns(10);
    txtT1AL.setBounds(370, 271, 100, 20);
    contentPanel.add(txtT1AL);

    rbMaleP = new JRadioButton("Male");
    rbMaleP.setBounds(476, 71, 53, 23);
    contentPanel.add(rbMaleP);

    rbFemaleP = new JRadioButton("Female");
    rbFemaleP.setBounds(531, 71, 71, 23);
    contentPanel.add(rbFemaleP);

    rbMT1S1 = new JRadioButton("Male");
    rbMT1S1.setBounds(476, 159, 53, 23);
    contentPanel.add(rbMT1S1);

    rbFT1S1 = new JRadioButton("Female");
    rbFT1S1.setBounds(531, 159, 71, 23);
    contentPanel.add(rbFT1S1);

    rbMT1W = new JRadioButton("Male");
    rbMT1W.setBounds(476, 212, 53, 23);
    contentPanel.add(rbMT1W);

    rbFT1W = new JRadioButton("Female");
    rbFT1W.setBounds(531, 212, 71, 23);
    contentPanel.add(rbFT1W);

    rbMT1C = new JRadioButton("Male");
    rbMT1C.setBounds(476, 238, 53, 23);
    contentPanel.add(rbMT1C);

    rbFT1C = new JRadioButton("Female");
    rbFT1C.setBounds(531, 238, 71, 23);
    contentPanel.add(rbFT1C);

    rbMT1A = new JRadioButton("Male");
    rbMT1A.setBounds(476, 268, 53, 23);
    contentPanel.add(rbMT1A);

    rbFT1A = new JRadioButton("Female");
    rbFT1A.setBounds(531, 268, 71, 23);
    contentPanel.add(rbFT1A);
    
    rbMT1S2 = new JRadioButton("Male");
    rbMT1S2.setBounds(476, 187, 53, 23);
    contentPanel.add(rbMT1S2);
    
    rbFT1S2 = new JRadioButton("Female");
    rbFT1S2.setBounds(531, 187, 71, 23);
    contentPanel.add(rbFT1S2);
    
    JLabel lblTrackName = new JLabel("Track 2 Name:");
    lblTrackName.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblTrackName.setBounds(10, 302, 124, 20);
    contentPanel.add(lblTrackName);
    
    txtT2 = new JTextField();
    txtT2.setColumns(10);
    txtT2.setBounds(160, 304, 400, 20);
    contentPanel.add(txtT2);
    
    JLabel label_1 = new JLabel("Language:");
    label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_1.setBounds(10, 327, 124, 20);
    contentPanel.add(label_1);
    
    txtL2 = new JTextField();
    txtL2.setColumns(10);
    txtL2.setBounds(160, 329, 208, 20);
    contentPanel.add(txtL2);
    
    JLabel label_2 = new JLabel("Singer 1:");
    label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_2.setBounds(10, 360, 126, 20);
    contentPanel.add(label_2);
    
    txtT2S1F = new JTextField();
    txtT2S1F.setColumns(10);
    txtT2S1F.setBounds(160, 360, 100, 20);
    contentPanel.add(txtT2S1F);
    
    txtT2S1M = new JTextField();
    txtT2S1M.setColumns(10);
    txtT2S1M.setBounds(272, 360, 84, 20);
    contentPanel.add(txtT2S1M);
    
    txtT2S1L = new JTextField();
    txtT2S1L.setColumns(10);
    txtT2S1L.setBounds(370, 360, 100, 20);
    contentPanel.add(txtT2S1L);
    
    rbMT2S1 = new JRadioButton("Male");
    rbMT2S1.setBounds(476, 360, 53, 23);
    contentPanel.add(rbMT2S1);
    
    rbFT2S1 = new JRadioButton("Female");
    rbFT2S1.setBounds(531, 360, 71, 23);
    contentPanel.add(rbFT2S1);
    
    rbFT2S2 = new JRadioButton("Female");
    rbFT2S2.setBounds(531, 388, 71, 23);
    contentPanel.add(rbFT2S2);
    
    rbMT2S2 = new JRadioButton("Male");
    rbMT2S2.setBounds(476, 388, 53, 23);
    contentPanel.add(rbMT2S2);
    
    rbMT2W = new JRadioButton("Male");
    rbMT2W.setBounds(476, 413, 53, 23);
    contentPanel.add(rbMT2W);
    
    rbFT2W = new JRadioButton("Female");
    rbFT2W.setBounds(531, 413, 71, 23);
    contentPanel.add(rbFT2W);
    
    rbFT2C = new JRadioButton("Female");
    rbFT2C.setBounds(531, 439, 71, 23);
    contentPanel.add(rbFT2C);
    
    rbMT2C = new JRadioButton("Male");
    rbMT2C.setBounds(476, 439, 53, 23);
    contentPanel.add(rbMT2C);
    
    rbMT2A = new JRadioButton("Male");
    rbMT2A.setBounds(476, 469, 53, 23);
    contentPanel.add(rbMT2A);
    
    rbFT2A = new JRadioButton("Female");
    rbFT2A.setBounds(531, 469, 71, 23);
    contentPanel.add(rbFT2A);
    
    txtT2AL = new JTextField();
    txtT2AL.setColumns(10);
    txtT2AL.setBounds(370, 472, 100, 20);
    contentPanel.add(txtT2AL);
    
    txtT2CL = new JTextField();
    txtT2CL.setColumns(10);
    txtT2CL.setBounds(370, 442, 100, 20);
    contentPanel.add(txtT2CL);
    
    txtT2WL = new JTextField();
    txtT2WL.setColumns(10);
    txtT2WL.setBounds(370, 416, 100, 20);
    contentPanel.add(txtT2WL);
    
    txtT2S2L = new JTextField();
    txtT2S2L.setColumns(10);
    txtT2S2L.setBounds(370, 387, 100, 20);
    contentPanel.add(txtT2S2L);
    
    txtT2S2M = new JTextField();
    txtT2S2M.setColumns(10);
    txtT2S2M.setBounds(272, 387, 84, 20);
    contentPanel.add(txtT2S2M);
    
    txtT2WM = new JTextField();
    txtT2WM.setColumns(10);
    txtT2WM.setBounds(272, 416, 84, 20);
    contentPanel.add(txtT2WM);
    
    txtT2CM = new JTextField();
    txtT2CM.setColumns(10);
    txtT2CM.setBounds(272, 442, 84, 20);
    contentPanel.add(txtT2CM);
    
    txtT2AM = new JTextField();
    txtT2AM.setColumns(10);
    txtT2AM.setBounds(272, 472, 84, 20);
    contentPanel.add(txtT2AM);
    
    txtT2AF = new JTextField();
    txtT2AF.setColumns(10);
    txtT2AF.setBounds(160, 472, 100, 20);
    contentPanel.add(txtT2AF);
    
    txtT2CF = new JTextField();
    txtT2CF.setColumns(10);
    txtT2CF.setBounds(160, 442, 100, 20);
    contentPanel.add(txtT2CF);
    
    txtT2WF = new JTextField();
    txtT2WF.setColumns(10);
    txtT2WF.setBounds(160, 416, 100, 20);
    contentPanel.add(txtT2WF);
    
    txtT2S2F = new JTextField();
    txtT2S2F.setColumns(10);
    txtT2S2F.setBounds(160, 387, 100, 20);
    contentPanel.add(txtT2S2F);
    
    JLabel label_3 = new JLabel("Singer 2:");
    label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_3.setBounds(10, 387, 126, 20);
    contentPanel.add(label_3);
    
    JLabel label_4 = new JLabel("Song Writer:");
    label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_4.setBounds(10, 416, 126, 20);
    contentPanel.add(label_4);
    
    JLabel label_5 = new JLabel("Composer:");
    label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_5.setBounds(10, 442, 126, 20);
    contentPanel.add(label_5);
    
    JLabel label_6 = new JLabel("Arranger:");
    label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_6.setBounds(10, 472, 126, 20);
    contentPanel.add(label_6);
    
    JLabel lblTrackName_1 = new JLabel("Track 3 Name:");
    lblTrackName_1.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblTrackName_1.setBounds(10, 508, 124, 20);
    contentPanel.add(lblTrackName_1);
    
    txtT3 = new JTextField();
    txtT3.setColumns(10);
    txtT3.setBounds(160, 510, 400, 20);
    contentPanel.add(txtT3);
    
    JLabel label_8 = new JLabel("Language:");
    label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_8.setBounds(10, 533, 124, 20);
    contentPanel.add(label_8);
    
    txtL3 = new JTextField();
    txtL3.setColumns(10);
    txtL3.setBounds(160, 535, 208, 20);
    contentPanel.add(txtL3);
    
    JLabel label_9 = new JLabel("Singer 1:");
    label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_9.setBounds(10, 566, 126, 20);
    contentPanel.add(label_9);
    
    txtT3S1F = new JTextField();
    txtT3S1F.setColumns(10);
    txtT3S1F.setBounds(160, 566, 100, 20);
    contentPanel.add(txtT3S1F);
    
    txtT3S1M = new JTextField();
    txtT3S1M.setColumns(10);
    txtT3S1M.setBounds(272, 566, 84, 20);
    contentPanel.add(txtT3S1M);
    
    txtT3S1L = new JTextField();
    txtT3S1L.setColumns(10);
    txtT3S1L.setBounds(370, 566, 100, 20);
    contentPanel.add(txtT3S1L);
    
    rbMT3S1 = new JRadioButton("Male");
    rbMT3S1.setBounds(476, 566, 53, 23);
    contentPanel.add(rbMT3S1);
    
    rbFT3S1 = new JRadioButton("Female");
    rbFT3S1.setBounds(531, 566, 71, 23);
    contentPanel.add(rbFT3S1);
    
    rbFT3S2 = new JRadioButton("Female");
    rbFT3S2.setBounds(531, 594, 71, 23);
    contentPanel.add(rbFT3S2);
    
    rbMT3S2 = new JRadioButton("Male");
    rbMT3S2.setBounds(476, 594, 53, 23);
    contentPanel.add(rbMT3S2);
    
    rbMT3W = new JRadioButton("Male");
    rbMT3W.setBounds(476, 619, 53, 23);
    contentPanel.add(rbMT3W);
    
    rbFT3W = new JRadioButton("Female");
    rbFT3W.setBounds(531, 619, 71, 23);
    contentPanel.add(rbFT3W);
    
    rbFT3C = new JRadioButton("Female");
    rbFT3C.setBounds(531, 645, 71, 23);
    contentPanel.add(rbFT3C);
    
    rbMT3C = new JRadioButton("Male");
    rbMT3C.setBounds(476, 645, 53, 23);
    contentPanel.add(rbMT3C);
    
    rbMT3A = new JRadioButton("Male");
    rbMT3A.setBounds(476, 675, 53, 23);
    contentPanel.add(rbMT3A);
    
    rbFT3A = new JRadioButton("Female");
    rbFT3A.setBounds(531, 675, 71, 23);
    contentPanel.add(rbFT3A);
    
    txtT3AL = new JTextField();
    txtT3AL.setColumns(10);
    txtT3AL.setBounds(370, 678, 100, 20);
    contentPanel.add(txtT3AL);
    
    txtT3CL = new JTextField();
    txtT3CL.setColumns(10);
    txtT3CL.setBounds(370, 648, 100, 20);
    contentPanel.add(txtT3CL);
    
    txtT3WL = new JTextField();
    txtT3WL.setColumns(10);
    txtT3WL.setBounds(370, 622, 100, 20);
    contentPanel.add(txtT3WL);
    
    txtT3S2L = new JTextField();
    txtT3S2L.setColumns(10);
    txtT3S2L.setBounds(370, 593, 100, 20);
    contentPanel.add(txtT3S2L);
    
    txtT3S2M = new JTextField();
    txtT3S2M.setColumns(10);
    txtT3S2M.setBounds(272, 593, 84, 20);
    contentPanel.add(txtT3S2M);
    
    txtT3WM = new JTextField();
    txtT3WM.setColumns(10);
    txtT3WM.setBounds(272, 622, 84, 20);
    contentPanel.add(txtT3WM);
    
    txtT3CM = new JTextField();
    txtT3CM.setColumns(10);
    txtT3CM.setBounds(272, 648, 84, 20);
    contentPanel.add(txtT3CM);
    
    txtT3AM = new JTextField();
    txtT3AM.setColumns(10);
    txtT3AM.setBounds(272, 678, 84, 20);
    contentPanel.add(txtT3AM);
    
    txtT3AF = new JTextField();
    txtT3AF.setColumns(10);
    txtT3AF.setBounds(160, 678, 100, 20);
    contentPanel.add(txtT3AF);
    
    txtT3CF = new JTextField();
    txtT3CF.setColumns(10);
    txtT3CF.setBounds(160, 648, 100, 20);
    contentPanel.add(txtT3CF);
    
    txtT3WF = new JTextField();
    txtT3WF.setColumns(10);
    txtT3WF.setBounds(160, 622, 100, 20);
    contentPanel.add(txtT3WF);
    
    txtT3S2F = new JTextField();
    txtT3S2F.setColumns(10);
    txtT3S2F.setBounds(160, 593, 100, 20);
    contentPanel.add(txtT3S2F);
    
    JLabel label_10 = new JLabel("Singer 2:");
    label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_10.setBounds(10, 593, 126, 20);
    contentPanel.add(label_10);
    
    JLabel label_11 = new JLabel("Song Writer:");
    label_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_11.setBounds(10, 622, 126, 20);
    contentPanel.add(label_11);
    
    JLabel label_12 = new JLabel("Composer:");
    label_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_12.setBounds(10, 648, 126, 20);
    contentPanel.add(label_12);
    
    JLabel label_13 = new JLabel("Arranger:");
    label_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_13.setBounds(10, 678, 126, 20);
    contentPanel.add(label_13);
    
    JLabel lblTrackName_2 = new JLabel("Track 4 Name:");
    lblTrackName_2.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblTrackName_2.setBounds(10, 719, 124, 20);
    contentPanel.add(lblTrackName_2);
    
    txtT4 = new JTextField();
    txtT4.setColumns(10);
    txtT4.setBounds(160, 721, 400, 20);
    contentPanel.add(txtT4);
    
    JLabel label_15 = new JLabel("Language:");
    label_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_15.setBounds(10, 744, 124, 20);
    contentPanel.add(label_15);
    
    txtL4 = new JTextField();
    txtL4.setColumns(10);
    txtL4.setBounds(160, 746, 208, 20);
    contentPanel.add(txtL4);
    
    JLabel label_16 = new JLabel("Singer 1:");
    label_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_16.setBounds(10, 777, 126, 20);
    contentPanel.add(label_16);
    
    txtT4S1F = new JTextField();
    txtT4S1F.setColumns(10);
    txtT4S1F.setBounds(160, 777, 100, 20);
    contentPanel.add(txtT4S1F);
    
    txtT4S1M = new JTextField();
    txtT4S1M.setColumns(10);
    txtT4S1M.setBounds(272, 777, 84, 20);
    contentPanel.add(txtT4S1M);
    
    txtT4S1L = new JTextField();
    txtT4S1L.setColumns(10);
    txtT4S1L.setBounds(370, 777, 100, 20);
    contentPanel.add(txtT4S1L);
    
    rbMT4S1 = new JRadioButton("Male");
    rbMT4S1.setBounds(476, 777, 53, 23);
    contentPanel.add(rbMT4S1);
    
    rbFT4S1 = new JRadioButton("Female");
    rbFT4S1.setBounds(531, 777, 71, 23);
    contentPanel.add(rbFT4S1);
    
    rbFT4S2 = new JRadioButton("Female");
    rbFT4S2.setBounds(531, 805, 71, 23);
    contentPanel.add(rbFT4S2);
    
    rbMT4S2 = new JRadioButton("Male");
    rbMT4S2.setBounds(476, 805, 53, 23);
    contentPanel.add(rbMT4S2);
    
    rbMT4W = new JRadioButton("Male");
    rbMT4W.setBounds(476, 830, 53, 23);
    contentPanel.add(rbMT4W);
    
    rbFT4W = new JRadioButton("Female");
    rbFT4W.setBounds(531, 830, 71, 23);
    contentPanel.add(rbFT4W);
    
    rbFT4C = new JRadioButton("Female");
    rbFT4C.setBounds(531, 856, 71, 23);
    contentPanel.add(rbFT4C);
    
    rbMT4C = new JRadioButton("Male");
    rbMT4C.setBounds(476, 856, 53, 23);
    contentPanel.add(rbMT4C);
    
    rbMT4A = new JRadioButton("Male");
    rbMT4A.setBounds(476, 886, 53, 23);
    contentPanel.add(rbMT4A);
    
    rbFT4A = new JRadioButton("Female");
    rbFT4A.setBounds(531, 886, 71, 23);
    contentPanel.add(rbFT4A);
    
    txtT4AL = new JTextField();
    txtT4AL.setColumns(10);
    txtT4AL.setBounds(370, 889, 100, 20);
    contentPanel.add(txtT4AL);
    
    txtT4CL = new JTextField();
    txtT4CL.setColumns(10);
    txtT4CL.setBounds(370, 859, 100, 20);
    contentPanel.add(txtT4CL);
    
    txtT4WL = new JTextField();
    txtT4WL.setColumns(10);
    txtT4WL.setBounds(370, 833, 100, 20);
    contentPanel.add(txtT4WL);
    
    txtT4S2L = new JTextField();
    txtT4S2L.setColumns(10);
    txtT4S2L.setBounds(370, 804, 100, 20);
    contentPanel.add(txtT4S2L);
    
    txtT4S2M = new JTextField();
    txtT4S2M.setColumns(10);
    txtT4S2M.setBounds(272, 804, 84, 20);
    contentPanel.add(txtT4S2M);
    
    txtT4WM = new JTextField();
    txtT4WM.setColumns(10);
    txtT4WM.setBounds(272, 833, 84, 20);
    contentPanel.add(txtT4WM);
    
    txtT4CM = new JTextField();
    txtT4CM.setColumns(10);
    txtT4CM.setBounds(272, 859, 84, 20);
    contentPanel.add(txtT4CM);
    
    txtT4AM = new JTextField();
    txtT4AM.setColumns(10);
    txtT4AM.setBounds(272, 889, 84, 20);
    contentPanel.add(txtT4AM);
    
    txtT4AF = new JTextField();
    txtT4AF.setColumns(10);
    txtT4AF.setBounds(160, 889, 100, 20);
    contentPanel.add(txtT4AF);
    
    txtT4CF = new JTextField();
    txtT4CF.setColumns(10);
    txtT4CF.setBounds(160, 859, 100, 20);
    contentPanel.add(txtT4CF);
    
    txtT4WF = new JTextField();
    txtT4WF.setColumns(10);
    txtT4WF.setBounds(160, 833, 100, 20);
    contentPanel.add(txtT4WF);
    
    txtT4S2F = new JTextField();
    txtT4S2F.setColumns(10);
    txtT4S2F.setBounds(160, 804, 100, 20);
    contentPanel.add(txtT4S2F);
    
    JLabel label_17 = new JLabel("Singer 2:");
    label_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_17.setBounds(10, 804, 126, 20);
    contentPanel.add(label_17);
    
    JLabel label_18 = new JLabel("Song Writer:");
    label_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_18.setBounds(10, 833, 126, 20);
    contentPanel.add(label_18);
    
    JLabel label_19 = new JLabel("Composer:");
    label_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_19.setBounds(10, 859, 126, 20);
    contentPanel.add(label_19);
    
    JLabel label_20 = new JLabel("Arranger:");
    label_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_20.setBounds(10, 889, 126, 20);
    contentPanel.add(label_20);
    
    JLabel lblTrackName_5 = new JLabel("Track 5 Name:");
    lblTrackName_5.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblTrackName_5.setBounds(646, 101, 124, 20);
    contentPanel.add(lblTrackName_5);
    
    txtT5 = new JTextField();
    txtT5.setColumns(10);
    txtT5.setBounds(796, 103, 400, 20);
    contentPanel.add(txtT5);
    
    JLabel label_22 = new JLabel("Language:");
    label_22.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_22.setBounds(646, 126, 124, 20);
    contentPanel.add(label_22);
    
    txtL5 = new JTextField();
    txtL5.setColumns(10);
    txtL5.setBounds(796, 128, 208, 20);
    contentPanel.add(txtL5);
    
    JLabel label_23 = new JLabel("Singer 1:");
    label_23.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_23.setBounds(646, 159, 126, 20);
    contentPanel.add(label_23);
    
    txtT5S1F = new JTextField();
    txtT5S1F.setColumns(10);
    txtT5S1F.setBounds(796, 159, 100, 20);
    contentPanel.add(txtT5S1F);
    
    txtT5S1M = new JTextField();
    txtT5S1M.setColumns(10);
    txtT5S1M.setBounds(908, 159, 84, 20);
    contentPanel.add(txtT5S1M);
    
    txtT5S1L = new JTextField();
    txtT5S1L.setColumns(10);
    txtT5S1L.setBounds(1006, 159, 100, 20);
    contentPanel.add(txtT5S1L);
    
    rbMT5S1 = new JRadioButton("Male");
    rbMT5S1.setBounds(1112, 159, 53, 23);
    contentPanel.add(rbMT5S1);
    
    rbFT5S1 = new JRadioButton("Female");
    rbFT5S1.setBounds(1167, 159, 71, 23);
    contentPanel.add(rbFT5S1);
    
    rbFT5S2 = new JRadioButton("Female");
    rbFT5S2.setBounds(1167, 187, 71, 23);
    contentPanel.add(rbFT5S2);
    
    rbMT5S2 = new JRadioButton("Male");
    rbMT5S2.setBounds(1112, 187, 53, 23);
    contentPanel.add(rbMT5S2);
    
    rbMT5W = new JRadioButton("Male");
    rbMT5W.setBounds(1112, 212, 53, 23);
    contentPanel.add(rbMT5W);
    
    rbFT5W = new JRadioButton("Female");
    rbFT5W.setBounds(1167, 212, 71, 23);
    contentPanel.add(rbFT5W);
    
    rbFT5C = new JRadioButton("Female");
    rbFT5C.setBounds(1167, 238, 71, 23);
    contentPanel.add(rbFT5C);
    
    rbMT5C = new JRadioButton("Male");
    rbMT5C.setBounds(1112, 238, 53, 23);
    contentPanel.add(rbMT5C);
    
    rbMT5A = new JRadioButton("Male");
    rbMT5A.setBounds(1112, 268, 53, 23);
    contentPanel.add(rbMT5A);
    
    rbFT5A = new JRadioButton("Female");
    rbFT5A.setBounds(1167, 268, 71, 23);
    contentPanel.add(rbFT5A);
    
    txtT5AL = new JTextField();
    txtT5AL.setColumns(10);
    txtT5AL.setBounds(1006, 271, 100, 20);
    contentPanel.add(txtT5AL);
    
    txtT5CL = new JTextField();
    txtT5CL.setColumns(10);
    txtT5CL.setBounds(1006, 241, 100, 20);
    contentPanel.add(txtT5CL);
    
    txtT5WL = new JTextField();
    txtT5WL.setColumns(10);
    txtT5WL.setBounds(1006, 215, 100, 20);
    contentPanel.add(txtT5WL);
    
    txtT5S2L = new JTextField();
    txtT5S2L.setColumns(10);
    txtT5S2L.setBounds(1006, 186, 100, 20);
    contentPanel.add(txtT5S2L);
    
    txtT5S2M = new JTextField();
    txtT5S2M.setColumns(10);
    txtT5S2M.setBounds(908, 186, 84, 20);
    contentPanel.add(txtT5S2M);
    
    txtT5WM = new JTextField();
    txtT5WM.setColumns(10);
    txtT5WM.setBounds(908, 215, 84, 20);
    contentPanel.add(txtT5WM);
    
    txtT5CM = new JTextField();
    txtT5CM.setColumns(10);
    txtT5CM.setBounds(908, 241, 84, 20);
    contentPanel.add(txtT5CM);
    
    txtT5AM = new JTextField();
    txtT5AM.setColumns(10);
    txtT5AM.setBounds(908, 271, 84, 20);
    contentPanel.add(txtT5AM);
    
    txtT5AF = new JTextField();
    txtT5AF.setColumns(10);
    txtT5AF.setBounds(796, 271, 100, 20);
    contentPanel.add(txtT5AF);
    
    txtT5CF = new JTextField();
    txtT5CF.setColumns(10);
    txtT5CF.setBounds(796, 241, 100, 20);
    contentPanel.add(txtT5CF);
    
    txtT5WF = new JTextField();
    txtT5WF.setColumns(10);
    txtT5WF.setBounds(796, 215, 100, 20);
    contentPanel.add(txtT5WF);
    
    txtT5S2F = new JTextField();
    txtT5S2F.setColumns(10);
    txtT5S2F.setBounds(796, 186, 100, 20);
    contentPanel.add(txtT5S2F);
    
    JLabel label_24 = new JLabel("Singer 2:");
    label_24.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_24.setBounds(646, 186, 126, 20);
    contentPanel.add(label_24);
    
    JLabel label_25 = new JLabel("Song Writer:");
    label_25.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_25.setBounds(646, 215, 126, 20);
    contentPanel.add(label_25);
    
    JLabel label_26 = new JLabel("Composer:");
    label_26.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_26.setBounds(646, 241, 126, 20);
    contentPanel.add(label_26);
    
    JLabel label_27 = new JLabel("Arranger:");
    label_27.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_27.setBounds(646, 271, 126, 20);
    contentPanel.add(label_27);
    
    JLabel lblTrackName_4 = new JLabel("Track 6 Name:");
    lblTrackName_4.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblTrackName_4.setBounds(646, 305, 124, 20);
    contentPanel.add(lblTrackName_4);
    
    txtT6 = new JTextField();
    txtT6.setColumns(10);
    txtT6.setBounds(796, 307, 400, 20);
    contentPanel.add(txtT6);
    
    JLabel label_29 = new JLabel("Language:");
    label_29.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_29.setBounds(646, 330, 124, 20);
    contentPanel.add(label_29);
    
    txtL6 = new JTextField();
    txtL6.setColumns(10);
    txtL6.setBounds(796, 332, 208, 20);
    contentPanel.add(txtL6);
    
    JLabel label_30 = new JLabel("Singer 1:");
    label_30.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_30.setBounds(646, 363, 126, 20);
    contentPanel.add(label_30);
    
    txtT6S1F = new JTextField();
    txtT6S1F.setColumns(10);
    txtT6S1F.setBounds(796, 363, 100, 20);
    contentPanel.add(txtT6S1F);
    
    txtT6S1M = new JTextField();
    txtT6S1M.setColumns(10);
    txtT6S1M.setBounds(908, 363, 84, 20);
    contentPanel.add(txtT6S1M);
    
    txtT6S1L = new JTextField();
    txtT6S1L.setColumns(10);
    txtT6S1L.setBounds(1006, 363, 100, 20);
    contentPanel.add(txtT6S1L);
    
    rbMT6S1 = new JRadioButton("Male");
    rbMT6S1.setBounds(1112, 363, 53, 23);
    contentPanel.add(rbMT6S1);
    
    rbFT6S1 = new JRadioButton("Female");
    rbFT6S1.setBounds(1167, 363, 71, 23);
    contentPanel.add(rbFT6S1);
    
    rbFT6S2 = new JRadioButton("Female");
    rbFT6S2.setBounds(1167, 391, 71, 23);
    contentPanel.add(rbFT6S2);
    
    rbMT6S2 = new JRadioButton("Male");
    rbMT6S2.setBounds(1112, 391, 53, 23);
    contentPanel.add(rbMT6S2);
    
    rbMT6W = new JRadioButton("Male");
    rbMT6W.setBounds(1112, 416, 53, 23);
    contentPanel.add(rbMT6W);
    
    rbFT6W = new JRadioButton("Female");
    rbFT6W.setBounds(1167, 416, 71, 23);
    contentPanel.add(rbFT6W);
    
    rbFT6C = new JRadioButton("Female");
    rbFT6C.setBounds(1167, 442, 71, 23);
    contentPanel.add(rbFT6C);
    
    rbMT6C = new JRadioButton("Male");
    rbMT6C.setBounds(1112, 442, 53, 23);
    contentPanel.add(rbMT6C);
    
    rbMT6A = new JRadioButton("Male");
    rbMT6A.setBounds(1112, 472, 53, 23);
    contentPanel.add(rbMT6A);
    
    rbFT6A = new JRadioButton("Female");
    rbFT6A.setBounds(1167, 472, 71, 23);
    contentPanel.add(rbFT6A);
    
    txtT6AL = new JTextField();
    txtT6AL.setColumns(10);
    txtT6AL.setBounds(1006, 475, 100, 20);
    contentPanel.add(txtT6AL);
    
    txtT6CL = new JTextField();
    txtT6CL.setColumns(10);
    txtT6CL.setBounds(1006, 445, 100, 20);
    contentPanel.add(txtT6CL);
    
    txtT6WL = new JTextField();
    txtT6WL.setColumns(10);
    txtT6WL.setBounds(1006, 419, 100, 20);
    contentPanel.add(txtT6WL);
    
    txtT6S2L = new JTextField();
    txtT6S2L.setColumns(10);
    txtT6S2L.setBounds(1006, 390, 100, 20);
    contentPanel.add(txtT6S2L);
    
    txtT6S2M = new JTextField();
    txtT6S2M.setColumns(10);
    txtT6S2M.setBounds(908, 390, 84, 20);
    contentPanel.add(txtT6S2M);
    
    txtT6WM = new JTextField();
    txtT6WM.setColumns(10);
    txtT6WM.setBounds(908, 419, 84, 20);
    contentPanel.add(txtT6WM);
    
    txtT6CM = new JTextField();
    txtT6CM.setColumns(10);
    txtT6CM.setBounds(908, 445, 84, 20);
    contentPanel.add(txtT6CM);
    
    txtT6AM = new JTextField();
    txtT6AM.setColumns(10);
    txtT6AM.setBounds(908, 475, 84, 20);
    contentPanel.add(txtT6AM);
    
    txtT6AF = new JTextField();
    txtT6AF.setColumns(10);
    txtT6AF.setBounds(796, 475, 100, 20);
    contentPanel.add(txtT6AF);
    
    txtT6CF = new JTextField();
    txtT6CF.setColumns(10);
    txtT6CF.setBounds(796, 445, 100, 20);
    contentPanel.add(txtT6CF);
    
    txtT6WF = new JTextField();
    txtT6WF.setColumns(10);
    txtT6WF.setBounds(796, 419, 100, 20);
    contentPanel.add(txtT6WF);
    
    txtT6S2F = new JTextField();
    txtT6S2F.setColumns(10);
    txtT6S2F.setBounds(796, 390, 100, 20);
    contentPanel.add(txtT6S2F);
    
    JLabel label_31 = new JLabel("Singer 2:");
    label_31.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_31.setBounds(646, 390, 126, 20);
    contentPanel.add(label_31);
    
    JLabel label_32 = new JLabel("Song Writer:");
    label_32.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_32.setBounds(646, 419, 126, 20);
    contentPanel.add(label_32);
    
    JLabel label_33 = new JLabel("Composer:");
    label_33.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_33.setBounds(646, 445, 126, 20);
    contentPanel.add(label_33);
    
    JLabel label_34 = new JLabel("Arranger:");
    label_34.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_34.setBounds(646, 475, 126, 20);
    contentPanel.add(label_34);
    
    JLabel lblTrackName_3 = new JLabel("Track 7 Name:");
    lblTrackName_3.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblTrackName_3.setBounds(646, 508, 124, 20);
    contentPanel.add(lblTrackName_3);
    
    txtT7 = new JTextField();
    txtT7.setColumns(10);
    txtT7.setBounds(796, 510, 400, 20);
    contentPanel.add(txtT7);
    
    JLabel label_36 = new JLabel("Language:");
    label_36.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_36.setBounds(646, 533, 124, 20);
    contentPanel.add(label_36);
    
    txtL7 = new JTextField();
    txtL7.setColumns(10);
    txtL7.setBounds(796, 535, 208, 20);
    contentPanel.add(txtL7);
    
    JLabel label_37 = new JLabel("Singer 1:");
    label_37.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_37.setBounds(646, 566, 126, 20);
    contentPanel.add(label_37);
    
    txtT7S1F = new JTextField();
    txtT7S1F.setColumns(10);
    txtT7S1F.setBounds(796, 566, 100, 20);
    contentPanel.add(txtT7S1F);
    
    txtT7S1M = new JTextField();
    txtT7S1M.setColumns(10);
    txtT7S1M.setBounds(908, 566, 84, 20);
    contentPanel.add(txtT7S1M);
    
    txtT7S1L = new JTextField();
    txtT7S1L.setColumns(10);
    txtT7S1L.setBounds(1006, 566, 100, 20);
    contentPanel.add(txtT7S1L);
    
    rbMT7S1 = new JRadioButton("Male");
    rbMT7S1.setBounds(1112, 566, 53, 23);
    contentPanel.add(rbMT7S1);
    
    rbFT7S1 = new JRadioButton("Female");
    rbFT7S1.setBounds(1167, 566, 71, 23);
    contentPanel.add(rbFT7S1);
    
    rbFT7S2 = new JRadioButton("Female");
    rbFT7S2.setBounds(1167, 594, 71, 23);
    contentPanel.add(rbFT7S2);
    
    rbMT7S2 = new JRadioButton("Male");
    rbMT7S2.setBounds(1112, 594, 53, 23);
    contentPanel.add(rbMT7S2);
    
    rbMT7W = new JRadioButton("Male");
    rbMT7W.setBounds(1112, 619, 53, 23);
    contentPanel.add(rbMT7W);
    
    rbFT7W = new JRadioButton("Female");
    rbFT7W.setBounds(1167, 619, 71, 23);
    contentPanel.add(rbFT7W);
    
    rbFT7C = new JRadioButton("Female");
    rbFT7C.setBounds(1167, 645, 71, 23);
    contentPanel.add(rbFT7C);
    
    rbMT7C = new JRadioButton("Male");
    rbMT7C.setBounds(1112, 645, 53, 23);
    contentPanel.add(rbMT7C);
    
    rbMT7A = new JRadioButton("Male");
    rbMT7A.setBounds(1112, 675, 53, 23);
    contentPanel.add(rbMT7A);
    
    rbFT7A = new JRadioButton("Female");
    rbFT7A.setBounds(1167, 675, 71, 23);
    contentPanel.add(rbFT7A);
    
    txtT7AL = new JTextField();
    txtT7AL.setColumns(10);
    txtT7AL.setBounds(1006, 678, 100, 20);
    contentPanel.add(txtT7AL);
    
    txtT7CL = new JTextField();
    txtT7CL.setColumns(10);
    txtT7CL.setBounds(1006, 648, 100, 20);
    contentPanel.add(txtT7CL);
    
    txtT7WL = new JTextField();
    txtT7WL.setColumns(10);
    txtT7WL.setBounds(1006, 622, 100, 20);
    contentPanel.add(txtT7WL);
    
    txtT7S2L = new JTextField();
    txtT7S2L.setColumns(10);
    txtT7S2L.setBounds(1006, 593, 100, 20);
    contentPanel.add(txtT7S2L);
    
    txtT7S2M = new JTextField();
    txtT7S2M.setColumns(10);
    txtT7S2M.setBounds(908, 593, 84, 20);
    contentPanel.add(txtT7S2M);
    
    txtT7WM = new JTextField();
    txtT7WM.setColumns(10);
    txtT7WM.setBounds(908, 622, 84, 20);
    contentPanel.add(txtT7WM);
    
    txtT7CM = new JTextField();
    txtT7CM.setColumns(10);
    txtT7CM.setBounds(908, 648, 84, 20);
    contentPanel.add(txtT7CM);
    
    txtT7AM = new JTextField();
    txtT7AM.setColumns(10);
    txtT7AM.setBounds(908, 678, 84, 20);
    contentPanel.add(txtT7AM);
    
    txtT7AF = new JTextField();
    txtT7AF.setColumns(10);
    txtT7AF.setBounds(796, 678, 100, 20);
    contentPanel.add(txtT7AF);
    
    txtT7CF = new JTextField();
    txtT7CF.setColumns(10);
    txtT7CF.setBounds(796, 648, 100, 20);
    contentPanel.add(txtT7CF);
    
    txtT7WF = new JTextField();
    txtT7WF.setColumns(10);
    txtT7WF.setBounds(796, 622, 100, 20);
    contentPanel.add(txtT7WF);
    
    txtT7S2F = new JTextField();
    txtT7S2F.setColumns(10);
    txtT7S2F.setBounds(796, 593, 100, 20);
    contentPanel.add(txtT7S2F);
    
    JLabel label_38 = new JLabel("Singer 2:");
    label_38.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_38.setBounds(646, 593, 126, 20);
    contentPanel.add(label_38);
    
    JLabel label_39 = new JLabel("Song Writer:");
    label_39.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_39.setBounds(646, 622, 126, 20);
    contentPanel.add(label_39);
    
    JLabel label_40 = new JLabel("Composer:");
    label_40.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_40.setBounds(646, 648, 126, 20);
    contentPanel.add(label_40);
    
    JLabel label_41 = new JLabel("Arranger:");
    label_41.setFont(new Font("Tahoma", Font.PLAIN, 14));
    label_41.setBounds(646, 678, 126, 20);
    contentPanel.add(label_41);
    
    rbC = new JRadioButton("CD");
    rbC.setBounds(476, 40, 53, 23);
    contentPanel.add(rbC);
    
    rbV = new JRadioButton("Vinyl");
    rbV.setBounds(531, 40, 71, 23);
    contentPanel.add(rbV);
    
    ButtonGroup author1 = new ButtonGroup();
    author1.add(rbMaleP);
    author1.add(rbFemaleP);
    ButtonGroup diskType = new ButtonGroup();
    diskType.add(rbC);
    diskType.add(rbV);
    ButtonGroup author2 = new ButtonGroup();
    author2.add(rbMT1S1);
    author2.add(rbFT1S1);
    ButtonGroup author6 = new ButtonGroup();
    author6.add(rbMT1S2);
    author6.add(rbFT1S2);
    ButtonGroup author3 = new ButtonGroup();
    author3.add(rbMT1W);
    author3.add(rbFT1W);
    ButtonGroup author4 = new ButtonGroup();
    author4.add(rbMT1C);
    author4.add(rbFT1C);
    ButtonGroup author5 = new ButtonGroup();
    author5.add(rbMT1A);
    author5.add(rbFT1A);
    //T2
    ButtonGroup g1 = new ButtonGroup();
    g1.add(rbMT2S1);
    g1.add(rbFT2S1);
    ButtonGroup g2 = new ButtonGroup();
    g2.add(rbMT2S2);
    g2.add(rbFT2S2);
    ButtonGroup g3 = new ButtonGroup();
    g3.add(rbMT2W);
    g3.add(rbFT2W);
    ButtonGroup g4 = new ButtonGroup();
    g4.add(rbMT2C);
    g4.add(rbFT2C);
    ButtonGroup g5 = new ButtonGroup();
    g5.add(rbMT2A);
    g5.add(rbFT2A);
    //T3
    ButtonGroup g6 = new ButtonGroup();
    g6.add(rbMT3S1);
    g6.add(rbFT3S1);
    ButtonGroup g7 = new ButtonGroup();
    g7.add(rbMT3S2);
    g7.add(rbFT3S2);
    ButtonGroup g8 = new ButtonGroup();
    g8.add(rbMT3W);
    g8.add(rbFT3W);
    ButtonGroup g9 = new ButtonGroup();
    g9.add(rbMT3C);
    g9.add(rbFT3C);
    ButtonGroup g10 = new ButtonGroup();
    g10.add(rbMT3A);
    g10.add(rbFT3A);
    //T4
    ButtonGroup g11 = new ButtonGroup();
    g11.add(rbMT4S1);
    g11.add(rbFT4S1);
    ButtonGroup g12 = new ButtonGroup();
    g12.add(rbMT4S2);
    g12.add(rbFT4S2);
    ButtonGroup g13 = new ButtonGroup();
    g13.add(rbMT4W);
    g13.add(rbFT4W);
    ButtonGroup g14 = new ButtonGroup();
    g14.add(rbMT4C);
    g14.add(rbFT4C);
    ButtonGroup g15 = new ButtonGroup();
    g15.add(rbMT4A);
    g15.add(rbFT4A);
    //T5
    ButtonGroup g16 = new ButtonGroup();
    g16.add(rbMT5S1);
    g16.add(rbFT5S1);
    ButtonGroup g17 = new ButtonGroup();
    g17.add(rbMT5S2);
    g17.add(rbFT5S2);
    ButtonGroup g18 = new ButtonGroup();
    g18.add(rbMT5W);
    g18.add(rbFT5W);
    ButtonGroup g19 = new ButtonGroup();
    g19.add(rbMT5C);
    g19.add(rbFT5C);
    ButtonGroup g20 = new ButtonGroup();
    g20.add(rbMT5A);
    g20.add(rbFT5A);
    //T6
    ButtonGroup g21 = new ButtonGroup();
    g21.add(rbMT6S1);
    g21.add(rbFT6S1);
    ButtonGroup g22 = new ButtonGroup();
    g22.add(rbMT6S2);
    g22.add(rbFT6S2);
    ButtonGroup g23 = new ButtonGroup();
    g23.add(rbMT6W);
    g23.add(rbFT6W);
    ButtonGroup g24 = new ButtonGroup();
    g24.add(rbMT6C);
    g24.add(rbFT6C);
    ButtonGroup g25 = new ButtonGroup();
    g25.add(rbMT6A);
    g25.add(rbFT6A);
    //T7
    ButtonGroup g26 = new ButtonGroup();
    g26.add(rbMT7S1);
    g26.add(rbFT7S1);
    ButtonGroup g27 = new ButtonGroup();
    g27.add(rbMT7S2);
    g27.add(rbFT7S2);
    ButtonGroup g28 = new ButtonGroup();
    g28.add(rbMT7W);
    g28.add(rbFT7W);
    ButtonGroup g29 = new ButtonGroup();
    g29.add(rbMT7C);
    g29.add(rbFT7C);
    ButtonGroup g30 = new ButtonGroup();
    g30.add(rbMT7A);
    g30.add(rbFT7A);
    
    /* --- Data->update music --- */
    Connection con = ConnectionDriver.connectToDatabase();
    PreparedStatement preparedStmt = null;
    int year = displayMusic(con, albumName);
    
    displayProducer(con, producerID);
    if (!txtT1.getText().trim().isEmpty()) {
      displaySinger(con, albumName, year, txtT1.getText().trim(), T1S, txtT1S1F, txtT1S1M, txtT1S1L, rbMT1S1, rbFT1S1, txtT1S2F, txtT1S2M, txtT1S2L, rbMT1S2, rbFT1S2);
      displayMusicPeople(con, albumName, year, txtT1.getText().trim(), T1, txtT1WF, txtT1WM, txtT1WL, rbMT1W, rbFT1W, txtT1CF, txtT1CM, txtT1CL, rbMT1C, rbFT1C, 
          txtT1AF, txtT1AM, txtT1AL, rbMT1A, rbFT1A);
    }
    if (!txtT2.getText().trim().isEmpty()) {
      displaySinger(con, albumName, year, txtT2.getText().trim(), T2S, txtT2S1F, txtT2S1M, txtT2S1L, rbMT2S1, rbFT2S1, txtT2S2F, txtT2S2M, txtT2S2L, rbMT2S2, rbFT2S2);
      displayMusicPeople(con, albumName, year, txtT2.getText().trim(), T2, txtT2WF, txtT2WM, txtT2WL, rbMT2W, rbFT2W, txtT2CF, txtT2CM, txtT2CL, rbMT2C, rbFT2C, 
          txtT2AF, txtT2AM, txtT2AL, rbMT2A, rbFT2A);
    }
    if (!txtT3.getText().trim().isEmpty()) {
      displaySinger(con, albumName, year, txtT3.getText().trim(), T3S, txtT3S1F, txtT3S1M, txtT3S1L, rbMT3S1, rbFT3S1, txtT3S2F, txtT3S2M, txtT3S2L, rbMT3S2, rbFT3S2);
      displayMusicPeople(con, albumName, year, txtT3.getText().trim(), T3, txtT3WF, txtT3WM, txtT3WL, rbMT3W, rbFT3W, txtT3CF, txtT3CM, txtT3CL, rbMT3C, rbFT3C, 
          txtT3AF, txtT3AM, txtT3AL, rbMT3A, rbFT3A);
    }
    if (!txtT4.getText().trim().isEmpty()) {
      displaySinger(con, albumName, year, txtT4.getText().trim(), T4S, txtT4S1F, txtT4S1M, txtT4S1L, rbMT4S1, rbFT4S1, txtT4S2F, txtT4S2M, txtT4S2L, rbMT4S2, rbFT4S2);
      displayMusicPeople(con, albumName, year, txtT4.getText().trim(), T4, txtT4WF, txtT4WM, txtT4WL, rbMT4W, rbFT4W, txtT4CF, txtT4CM, txtT4CL, rbMT4C, rbFT4C, 
          txtT4AF, txtT4AM, txtT4AL, rbMT4A, rbFT4A);
    }
    if (!txtT5.getText().trim().isEmpty()) {
      displaySinger(con, albumName, year, txtT5.getText().trim(), T5S, txtT5S1F, txtT5S1M, txtT5S1L, rbMT5S1, rbFT5S1, txtT5S2F, txtT5S2M, txtT5S2L, rbMT5S2, rbFT5S2);
      displayMusicPeople(con, albumName, year, txtT5.getText().trim(), T5, txtT5WF, txtT5WM, txtT5WL, rbMT5W, rbFT5W, txtT5CF, txtT5CM, txtT5CL, rbMT5C, rbFT5C, 
          txtT5AF, txtT5AM, txtT5AL, rbMT5A, rbFT5A);
    }
    if (!txtT6.getText().trim().isEmpty()) {
      displaySinger(con, albumName, year, txtT6.getText().trim(), T6S, txtT6S1F, txtT6S1M, txtT6S1L, rbMT6S1, rbFT6S1, txtT6S2F, txtT6S2M, txtT6S2L, rbMT6S2, rbFT6S2);
      displayMusicPeople(con, albumName, year, txtT6.getText().trim(), T6, txtT6WF, txtT6WM, txtT6WL, rbMT6W, rbFT6W, txtT6CF, txtT6CM, txtT6CL, rbMT6C, rbFT6C, 
          txtT6AF, txtT6AM, txtT6AL, rbMT6A, rbFT6A);
    }
    if (!txtT7.getText().trim().isEmpty()) {
      displaySinger(con, albumName, year, txtT7.getText().trim(), T7S, txtT7S1F, txtT7S1M, txtT7S1L, rbMT7S1, rbFT7S1, txtT7S2F, txtT7S2M, txtT7S2L, rbMT7S2, rbFT7S2);
      displayMusicPeople(con, albumName, year, txtT7.getText().trim(), T7, txtT7WF, txtT7WM, txtT7WL, rbMT7W, rbFT7W, txtT7CF, txtT7CM, txtT7CL, rbMT7C, rbFT7C, 
          txtT7AF, txtT7AM, txtT7AL, rbMT7A, rbFT7A);
    }
    

    {
      JPanel buttonPane = new JPanel();
      buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
      getContentPane().add(buttonPane, BorderLayout.SOUTH);
      {
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
            /* --- Data->update music --- */
            int ID = 0;
            boolean isC = false, isA = false, isA2 = false;
            try {
              con.setAutoCommit(false);
              int i;
              //get producer id
              int currPID = InsertBook.insertPeople(con, txtProducerF.getText().trim(), txtProducerM.getText().trim(), txtProducerL.getText().trim(), rbMaleP, rbFemaleP);
              //add each tracks name and language to hashmap
              if (!txtT1.getText().trim().isEmpty()) {
                currTracks.put("T1", txtT1.getText().trim());
                currTracks.put("L1", txtL1.getText().trim());
              }
              if (!txtT2.getText().trim().isEmpty()) {
                currTracks.put("T2", txtT2.getText().trim());
                currTracks.put("L2", txtL2.getText().trim());
              }
              if (!txtT3.getText().trim().isEmpty()) {
                currTracks.put("T3", txtT3.getText().trim());
                currTracks.put("L3", txtL3.getText().trim());
              }
              if (!txtT4.getText().trim().isEmpty()) {
                currTracks.put("T4", txtT4.getText().trim());
                currTracks.put("L4", txtL4.getText().trim());
              }
              if (!txtT5.getText().trim().isEmpty()) {
                currTracks.put("T5", txtT5.getText().trim());
                currTracks.put("L5", txtL5.getText().trim());
              }
              if (!txtT6.getText().trim().isEmpty()) {
                currTracks.put("T6", txtT6.getText().trim());
                currTracks.put("L6", txtL6.getText().trim());
              }
              if (!txtT7.getText().trim().isEmpty()) {
                currTracks.put("T7", txtT7.getText().trim());
                currTracks.put("L7", txtL7.getText().trim());
              }
              deleteMusicReferences(con);

              int numTracks = (currTracks.size() > oldTracks.size() ? oldTracks.size() : currTracks.size());
              numTracks = numTracks/2;
              String albumName = txtAlbumName.getText().trim();
              String yearStr = txtYear.getText().trim();

              for (i=1; i<numTracks+1; i++) {
                //update each track
                updateMusic(con, albumName, year, currTracks.get("T"+i), currTracks.get("L"+i), rbC, rbV, currPID, i);
              }

              //if theres less current tracks then delete extra old tracks
              if (oldTracks.size() > currTracks.size()) {
                for (i=numTracks+1; i<(oldTracks.size()/2)+1; i++) {
                  deleteTrack(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T"+i));
                }
              } else if (currTracks.size() > oldTracks.size()) {
                for (i=(oldTracks.size()/2)+1; i<(currTracks.size()/2)+1; i++) {
                  //if theres new tracks insert
                  InsertMusic.insertTrack(con, albumName, yearStr, currTracks.get("T"+i), currTracks.get("L"+i), rbC, rbV, currPID);
                }
              }
              //Track 1
              if (!txtT1.getText().isEmpty()) {
                //insert singer 1
                if (!txtT1S1F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT1S1F.getText().trim(), txtT1S1M.getText().trim(), txtT1S1L.getText().trim(), rbMT1S1, rbFT1S1);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT1.getText().trim(), ID);
                }
                //insert singer2
                if (!txtT1S2F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT1S2F.getText().trim(), txtT1S2M.getText().trim(), txtT1S2L.getText().trim(), rbMT1S2, rbFT1S2);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT1.getText().trim(), ID);
                }
                //insert song writer
                ID = InsertBook.insertPeople(con, txtT1WF.getText().trim(), txtT1WM.getText().trim(), txtT1WL.getText().trim(), rbMT1W, rbFT1W);
                
                //check if writer matches composer or arrangement
                if (InsertMusic.isSamePerson(txtT1WF.getText().trim(), txtT1WL.getText().trim(), txtT1CF.getText().trim(), txtT1CL.getText().trim())) {
                  isC = true;
                }
                if (InsertMusic.isSamePerson(txtT1WF.getText().trim(), txtT1WL.getText().trim(), txtT1AF.getText().trim(), txtT1AL.getText().trim())) {
                  isA = true;
                }
                //insert into peoplemusic
                InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT1.getText().trim(), ID, true, isC, isA);
                //check if composer exist
                if (!isC) {
                  ID = InsertBook.insertPeople(con, txtT1CF.getText().trim(), txtT1CM.getText().trim(), txtT1CL.getText().trim(), rbMT1C, rbFT1C);
                  //check if composer match arrangement
                  if (InsertMusic.isSamePerson(txtT1CF.getText().trim(), txtT1CL.getText().trim(), txtT1AF.getText().trim(), txtT1AL.getText().trim())) {
                    isA2 = true;
                  }
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT1.getText().trim(), ID, false, true, isA2);
                }
                
                //check arrangement
                if (!isA && !isA2) {
                  ID = InsertBook.insertPeople(con, txtT1AF.getText().trim(), txtT1AM.getText().trim(), txtT1AL.getText().trim(), rbMT1A, rbFT1A);
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT1.getText().trim(), ID, false, false, true);
                }
                
              }
              
              //Track 2
              isC = isA = isA2 = false;
              if (!txtT2.getText().isEmpty()) {
                //insert singer 1
                if (!txtT2S1F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT2S1F.getText().trim(), txtT2S1M.getText().trim(), txtT2S1L.getText().trim(), rbMT2S1, rbFT2S1);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT2.getText().trim(), ID);
                }
                //insert singer2
                if (!txtT2S2F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT2S2F.getText().trim(), txtT2S2M.getText().trim(), txtT2S2L.getText().trim(), rbMT2S2, rbFT2S2);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT2.getText().trim(), ID);
                }
                //insert song writer
                ID = InsertBook.insertPeople(con, txtT2WF.getText().trim(), txtT2WM.getText().trim(), txtT2WL.getText().trim(), rbMT2W, rbFT2W);
                
                //check if writer matches composer or arrangement
                if (InsertMusic.isSamePerson(txtT2WF.getText().trim(), txtT2WL.getText().trim(), txtT2CF.getText().trim(), txtT2CL.getText().trim())) {
                  isC = true;
                }
                if (InsertMusic.isSamePerson(txtT2WF.getText().trim(), txtT2WL.getText().trim(), txtT2AF.getText().trim(), txtT2AL.getText().trim())) {
                  isA = true;
                }
                //insert into peoplemusic
                InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT2.getText().trim(), ID, true, isC, isA);
                //check if composer exist
                if (!isC) {
                  ID = InsertBook.insertPeople(con, txtT2CF.getText().trim(), txtT2CM.getText().trim(), txtT2CL.getText().trim(), rbMT2C, rbFT2C);
                  //check if composer match arrangement
                  if (InsertMusic.isSamePerson(txtT2CF.getText().trim(), txtT2CL.getText().trim(), txtT2AF.getText().trim(), txtT2AL.getText().trim())) {
                    isA2 = true;
                  }
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT2.getText().trim(), ID, false, true, isA2);
                }
                
                //check arrangement
                if (!isA && !isA2) {
                  ID = InsertBook.insertPeople(con, txtT2AF.getText().trim(), txtT2AM.getText().trim(), txtT2AL.getText().trim(), rbMT2A, rbFT2A);
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT2.getText().trim(), ID, false, false, true);
                }
                
              }
              
              //Track 3
              isC = isA = isA2 = false;
              if (!txtT3.getText().isEmpty()) {
                //insert singer 1
                if (!txtT3S1F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT3S1F.getText().trim(), txtT3S1M.getText().trim(), txtT3S1L.getText().trim(), rbMT3S1, rbFT3S1);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT3.getText().trim(), ID);
                }
                //insert singer2
                if (!txtT3S2F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT3S2F.getText().trim(), txtT3S2M.getText().trim(), txtT3S2L.getText().trim(), rbMT3S2, rbFT3S2);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT3.getText().trim(), ID);
                }
                //insert song writer
                 ID = InsertBook.insertPeople(con, txtT3WF.getText().trim(), txtT3WM.getText().trim(), txtT3WL.getText().trim(), rbMT3W, rbFT3W);
                
                //check if writer matches composer or arrangement
                if (InsertMusic.isSamePerson(txtT3WF.getText().trim(), txtT3WL.getText().trim(), txtT3CF.getText().trim(), txtT3CL.getText().trim())) {
                  isC = true;
                }
                if (InsertMusic.isSamePerson(txtT3WF.getText().trim(), txtT3WL.getText().trim(), txtT3AF.getText().trim(), txtT3AL.getText().trim())) {
                  isA = true;
                }
                //insert into peoplemusic
                InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT3.getText().trim(), ID, true, isC, isA);
                //check if composer exist
                if (!isC) {
                  ID = InsertBook.insertPeople(con, txtT3CF.getText().trim(), txtT3CM.getText().trim(), txtT3CL.getText().trim(), rbMT3C, rbFT3C);
                  //check if composer match arrangement
                  if (InsertMusic.isSamePerson(txtT3CF.getText().trim(), txtT3CL.getText().trim(), txtT3AF.getText().trim(), txtT3AL.getText().trim())) {
                    isA2 = true;
                  }
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT3.getText().trim(), ID, false, true, isA2);
                }
                
                //check arrangement
                if (!isA && !isA2) {
                  ID = InsertBook.insertPeople(con, txtT3AF.getText().trim(), txtT3AM.getText().trim(), txtT3AL.getText().trim(), rbMT3A, rbFT3A);
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT3.getText().trim(), ID, false, false, true);
                }
              }
              
              //Track 4
              isC = isA = isA2 = false;
              if (!txtT4.getText().isEmpty()) {
                //insert singer 1
                if (!txtT4S1F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT4S1F.getText().trim(), txtT4S1M.getText().trim(), txtT4S1L.getText().trim(), rbMT4S1, rbFT4S1);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT4.getText().trim(), ID);
                }
                //insert singer2
                if (!txtT4S2F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT4S2F.getText().trim(), txtT4S2M.getText().trim(), txtT4S2L.getText().trim(), rbMT4S2, rbFT4S2);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT4.getText().trim(), ID);
                }
                //insert song writer
                ID = InsertBook.insertPeople(con, txtT4WF.getText().trim(), txtT4WM.getText().trim(), txtT4WL.getText().trim(), rbMT4W, rbFT4W);
                
                //check if writer matches composer or arrangement
                if (InsertMusic.isSamePerson(txtT4WF.getText().trim(), txtT4WL.getText().trim(), txtT4CF.getText().trim(), txtT4CL.getText().trim())) {
                  isC = true;
                }
                if (InsertMusic.isSamePerson(txtT4WF.getText().trim(), txtT4WL.getText().trim(), txtT4AF.getText().trim(), txtT4AL.getText().trim())) {
                  isA = true;
                }
                //insert into peoplemusic
                InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT4.getText().trim(), ID, true, isC, isA);
                //check if composer exist
                if (!isC) {
                  ID = InsertBook.insertPeople(con, txtT4CF.getText().trim(), txtT4CM.getText().trim(), txtT4CL.getText().trim(), rbMT4C, rbFT4C);
                  //check if composer match arrangement
                  if (InsertMusic.isSamePerson(txtT4CF.getText().trim(), txtT4CL.getText().trim(), txtT4AF.getText().trim(), txtT4AL.getText().trim())) {
                    isA2 = true;
                  }
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT4.getText().trim(), ID, false, true, isA2);
                }
                
                //check arrangement
                if (!isA && !isA2) {
                  ID = InsertBook.insertPeople(con, txtT4AF.getText().trim(), txtT4AM.getText().trim(), txtT4AL.getText().trim(), rbMT4A, rbFT4A);
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT4.getText().trim(), ID, false, false, true);
                }
              }
              
              //Track 5
              isC = isA = isA2 = false;
              if (!txtT5.getText().isEmpty()) {
                //insert singer 1
                if (!txtT5S1F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT5S1F.getText().trim(), txtT5S1M.getText().trim(), txtT5S1L.getText().trim(), rbMT5S1, rbFT5S1);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT5.getText().trim(), ID);
                }
                //insert singer2
                if (!txtT5S2F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT5S2F.getText().trim(), txtT5S2M.getText().trim(), txtT5S2L.getText().trim(), rbMT5S2, rbFT5S2);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT5.getText().trim(), ID);
                }
                //insert song writer
                ID = InsertBook.insertPeople(con, txtT5WF.getText().trim(), txtT5WM.getText().trim(), txtT5WL.getText().trim(), rbMT5W, rbFT5W);
                
                //check if writer matches composer or arrangement
                if (InsertMusic.isSamePerson(txtT5WF.getText().trim(), txtT5WL.getText().trim(), txtT5CF.getText().trim(), txtT5CL.getText().trim())) {
                  isC = true;
                }
                if (InsertMusic.isSamePerson(txtT5WF.getText().trim(), txtT5WL.getText().trim(), txtT5AF.getText().trim(), txtT5AL.getText().trim())) {
                  isA = true;
                }
                //insert into peoplemusic
                InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT5.getText().trim(), ID, true, isC, isA);
                //check if composer exist
                if (!isC) {
                  ID = InsertBook.insertPeople(con, txtT5CF.getText().trim(), txtT5CM.getText().trim(), txtT5CL.getText().trim(), rbMT5C, rbFT5C);
                  //check if composer match arrangement
                  if (InsertMusic.isSamePerson(txtT5CF.getText().trim(), txtT5CL.getText().trim(), txtT5AF.getText().trim(), txtT5AL.getText().trim())) {
                    isA2 = true;
                  }
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT5.getText().trim(), ID, false, true, isA2);
                }
                
                //check arrangement
                if (!isA && !isA2) {
                  ID = InsertBook.insertPeople(con, txtT5AF.getText().trim(), txtT5AM.getText().trim(), txtT5AL.getText().trim(), rbMT5A, rbFT5A);
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT5.getText().trim(), ID, false, false, true);
                }
              }
              
              //Track 6
              isC = isA = isA2 = false;
              if (!txtT6.getText().isEmpty()) {
                //insert singer 1
                if (!txtT6S1F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT6S1F.getText().trim(), txtT6S1M.getText().trim(), txtT6S1L.getText().trim(), rbMT6S1, rbFT6S1);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT6.getText().trim(), ID);
                }
                //insert singer2
                if (!txtT6S2F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT6S2F.getText().trim(), txtT6S2M.getText().trim(), txtT6S2L.getText().trim(), rbMT6S2, rbFT6S2);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT6.getText().trim(), ID);
                }
                //insert song writer
                ID = InsertBook.insertPeople(con, txtT6WF.getText().trim(), txtT6WM.getText().trim(), txtT6WL.getText().trim(), rbMT6W, rbFT6W);
                
                //check if writer matches composer or arrangement
                if (InsertMusic.isSamePerson(txtT6WF.getText().trim(), txtT6WL.getText().trim(), txtT6CF.getText().trim(), txtT6CL.getText().trim())) {
                  isC = true;
                }
                if (InsertMusic.isSamePerson(txtT6WF.getText().trim(), txtT6WL.getText().trim(), txtT6AF.getText().trim(), txtT6AL.getText().trim())) {
                  isA = true;
                }
                //insert into peoplemusic
                InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT6.getText().trim(), ID, true, isC, isA);
                //check if composer exist
                if (!isC) {
                  ID = InsertBook.insertPeople(con, txtT6CF.getText().trim(), txtT6CM.getText().trim(), txtT6CL.getText().trim(), rbMT6C, rbFT6C);
                  //check if composer match arrangement
                  if (InsertMusic.isSamePerson(txtT6CF.getText().trim(), txtT6CL.getText().trim(), txtT6AF.getText().trim(), txtT6AL.getText().trim())) {
                    isA2 = true;
                  }
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT6.getText().trim(), ID, false, true, isA2);
                }
                
                //check arrangement
                if (!isA && !isA2) {
                  ID = InsertBook.insertPeople(con, txtT6AF.getText().trim(), txtT6AM.getText().trim(), txtT6AL.getText().trim(), rbMT6A, rbFT6A);
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT6.getText().trim(), ID, false, false, true);
                }
              }
              
              //Track 7
              isC = isA = isA2 = false;
              if (!txtT7.getText().isEmpty()) {
                //insert singer 1
                if (!txtT7S1F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT7S1F.getText().trim(), txtT7S1M.getText().trim(), txtT7S1L.getText().trim(), rbMT7S1, rbFT7S1);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT7.getText().trim(), ID);
                }
                //insert singer2
                if (!txtT7S2F.getText().isEmpty()) {
                  ID = InsertBook.insertPeople(con, txtT7S2F.getText().trim(), txtT7S2M.getText().trim(), txtT7S2L.getText().trim(), rbMT7S2, rbFT7S2);
                  InsertMusic.insertMusicSinger(con, albumName, yearStr, txtT7.getText().trim(), ID);
                }
                //insert song writer
                ID = InsertBook.insertPeople(con, txtT7WF.getText().trim(), txtT7WM.getText().trim(), txtT7WL.getText().trim(), rbMT7W, rbFT7W);
                
                //check if writer matches composer or arrangement
                if (InsertMusic.isSamePerson(txtT7WF.getText().trim(), txtT7WL.getText().trim(), txtT7CF.getText().trim(), txtT7CL.getText().trim())) {
                  isC = true;
                }
                if (InsertMusic.isSamePerson(txtT7WF.getText().trim(), txtT7WL.getText().trim(), txtT7AF.getText().trim(), txtT7AL.getText().trim())) {
                  isA = true;
                }
                //insert into peoplemusic
                InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT7.getText().trim(), ID, true, isC, isA);
                //check if composer exist
                if (!isC) {
                  ID = InsertBook.insertPeople(con, txtT7CF.getText().trim(), txtT7CM.getText().trim(), txtT7CL.getText().trim(), rbMT7C, rbFT7C);
                  //check if composer match arrangement
                  if (InsertMusic.isSamePerson(txtT7CF.getText().trim(), txtT7CL.getText().trim(), txtT7AF.getText().trim(), txtT7AL.getText().trim())) {
                    isA2 = true;
                  }
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT7.getText().trim(), ID, false, true, isA2);
                }
                
                //check arrangement
                if (!isA && !isA2) {
                  ID = InsertBook.insertPeople(con, txtT7AF.getText().trim(), txtT7AM.getText().trim(), txtT7AL.getText().trim(), rbMT7A, rbFT7A);
                  InsertMusic.insertPeopleMusic(con, albumName, yearStr, txtT7.getText().trim(), ID, false, false, true);
                }
              }
              
              

              con.commit();
              dispose();
            } catch (Exception e) {
              System.out.println(e);
              if (con != null) {
                try {
                  System.err.println("Transaction is being rolled back.");
                  con.rollback();
                  } catch (SQLException e2) {}
              }
            } finally {
              if (preparedStmt != null) {
                try {
                  preparedStmt.close();
                } catch (SQLException e) {
                }
              }
              try {
                con.setAutoCommit(true);
              } catch (SQLException e) {
              }
              try {
                con.close();
              } catch (SQLException e) {
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
  
  private static int displayMusic(Connection con, String title) {
    int year = 0;
    oldMusic.clear();
    PreparedStatement preparedStmt = null;
    String query = "select * from music where AlbumName = ?";
    int i = 1;
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, title.isEmpty() ? null : title);

      ResultSet rs = preparedStmt.executeQuery();
      while (rs.next()) {
        oldTracks.put("T"+i, rs.getString(3));
        oldTracks.put("L"+i, rs.getString(4));
        if (i == 1) {
          oldMusic.put("AlbumName", rs.getString(1));
          oldMusic.put("Year", String.valueOf(rs.getInt(2)));
          
          txtAlbumName.setText(rs.getString(1));
          txtYear.setText(String.valueOf(rs.getInt(2)));
          year = rs.getInt(2);
          txtT1.setText(rs.getString(3));
          txtL1.setText(rs.getString(4));
          if (rs.getByte(5) == 0) {
            rbC.setSelected(true);
            oldMusic.put("DiskType", "0");
          } else if (rs.getByte(5) == 1){
            rbV.setSelected(true);
            oldMusic.put("DiskType", "1");
          }
          producerID = Integer.valueOf(rs.getInt(6));
          
        } else if (i == 2) {
          txtT2.setText(rs.getString(3));
          txtL2.setText(rs.getString(4));
        } else if (i == 3) {
          txtT3.setText(rs.getString(3));
          txtL3.setText(rs.getString(4));
        } else if (i == 4) {
          txtT4.setText(rs.getString(3));
          txtL4.setText(rs.getString(4));
        } else if (i == 5) {
          txtT5.setText(rs.getString(3));
          txtL5.setText(rs.getString(4));
        } else if (i == 6) {
          txtT6.setText(rs.getString(3));
          txtL6.setText(rs.getString(4));
        } else if (i == 7) {
          txtT7.setText(rs.getString(3));
          txtL7.setText(rs.getString(4));
        }
        i++;
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
    }
    return year;
  }
  
  private static void displayProducer(Connection con, int ID) {
    PreparedStatement preparedStmt = null;
    String query = "select FirstName, MiddleName, FamilyName, Gender from peopleinvolved where ID = ?";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      if (ID == 0) {
        preparedStmt.setNull(1, Types.INTEGER);
      } else {
        preparedStmt.setInt(1, ID);
      }

      ResultSet rs = preparedStmt.executeQuery();
      while (rs.next()) {
        txtProducerF.setText(rs.getString(1));
        txtProducerM.setText(rs.getString(2));
        txtProducerL.setText(rs.getString(3));
        if (rs.getByte(4) == 0) {
          rbFemaleP.setSelected(true);
        } else if (rs.getByte(4) == 1) {
          rbMaleP.setSelected(true);
        }
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
    }
  }
  
  private static void displaySinger(Connection con, String album, int year, String title, ArrayList<Integer> singerIDList, JTextField S1F, JTextField S1M, JTextField S1L,
      JRadioButton S1bM, JRadioButton S1bF, JTextField S2F, JTextField S2M, JTextField S2L, JRadioButton S2bM, JRadioButton S2bF) {
    singerIDList.clear();
    PreparedStatement preparedStmt = null;
    String query = "select ID, FirstName, MiddleName, FamilyName, Gender from peopleinvolved, musicsinger, music where musicsinger.Year = music.Year and "
        + "musicsinger.MusicName = music.MusicName and musicsinger.PeopleInvolved_ID = peopleinvolved.ID and music.AlbumName = ? and music.Year = ? and music.MusicName = ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, album.isEmpty() ? null : album);
      if (year == 0) {
        preparedStmt.setNull(2, Types.INTEGER);
      } else {
        preparedStmt.setInt(2, year);
      }
      preparedStmt.setString(3, title.isEmpty() ? null : title);

      ResultSet rs = preparedStmt.executeQuery();
      while (rs.next()) {
        singerIDList.add(Integer.valueOf(rs.getInt(1)));
        if (S1F.getText().trim().isEmpty()) {
          S1F.setText(rs.getString(2));
          S1M.setText(rs.getString(3));
          S1L.setText(rs.getString(4));
          if (rs.getByte(5) == 0) {
            S1bF.setSelected(true);
          } else if (rs.getByte(5) == 1) {
            S1bM.setSelected(true);
          }
        } else {
          S2F.setText(rs.getString(2));
          S2M.setText(rs.getString(3));
          S2L.setText(rs.getString(4));
          if (rs.getByte(5) == 0) {
            S2bF.setSelected(true);
          } else if(rs.getByte(5) == 1){
            S2bM.setSelected(true);
          }
        }
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
    }
  }
  
  private static void displayMusicPeople(Connection con, String album, int year, String title, HashMap<String, Integer> crewID, JTextField WF, JTextField WM, JTextField WL,
      JRadioButton WbM, JRadioButton WbF, JTextField CF, JTextField CM, JTextField CL, JRadioButton CbM, JRadioButton CbF, JTextField AF, JTextField AM,
      JTextField AL, JRadioButton AbM, JRadioButton AbF) {
    PreparedStatement preparedStmt = null;
    String query = "select ID, FirstName, MiddleName, FamilyName, Gender, isSongwriter, isComposer, isArranger from peopleinvolved, peopleinvolvedmusic, music where "
        + "peopleinvolvedmusic.Year = music.Year and peopleinvolvedmusic.MusicName = music.MusicName and peopleinvolvedmusic.PeopleInvolved_ID = peopleinvolved.ID and "
        + "music.AlbumName = ? and music.Year = ? and music.MusicName = ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, album.isEmpty() ? null : album);
      if (year == 0) {
        preparedStmt.setNull(2, Types.INTEGER);
      } else {
        preparedStmt.setInt(2, year);
      }
      preparedStmt.setString(3, title.isEmpty() ? null : title);

      ResultSet rs = preparedStmt.executeQuery();
      while (rs.next()) {
        if (rs.getByte(6) == 1) {
          crewID.put("W", rs.getInt(1));
          WF.setText(rs.getString(2));
          WM.setText(rs.getString(3));
          WL.setText(rs.getString(4));
          if (rs.getByte(5) == 0) {
            WbF.setSelected(true);
          } else if (rs.getByte(5) == 1) {
            WbM.setSelected(true);
          }
        }
        if (rs.getByte(7) == 1) {
          crewID.put("C", rs.getInt(1));
          CF.setText(rs.getString(2));
          CM.setText(rs.getString(3));
          CL.setText(rs.getString(4));
          if (rs.getByte(5) == 0) {
            CbF.setSelected(true);
          } else if (rs.getByte(5) == 1) {
            CbM.setSelected(true);
          }
        }
        if (rs.getByte(8) == 1) {
          crewID.put("A", rs.getInt(1));
          AF.setText(rs.getString(2));
          AM.setText(rs.getString(3));
          AL.setText(rs.getString(4));
          if (rs.getByte(5) == 0) {
            AbF.setSelected(true);
          } else if (rs.getByte(5) == 1){
            AbM.setSelected(true);
          }
        }
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
    }
  }
  
  private void updateMusic(Connection con, String albumName, int year, String title, String language, JRadioButton C, JRadioButton V, 
      int producerID, int trackNum) {
    //update with new input where old input is oldMusic
    PreparedStatement preparedStmt = null;
    String query = "update music set AlbumName = ?, Year = ?, MusicName = ?, Language = ?, DiskType = ?, Producer_ID = ? where "
        + "AlbumName = ? and Year = ? and MusicName = ?";
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, albumName.isEmpty() ? null : albumName);
      if (year == 0) {
        preparedStmt.setNull(2, Types.INTEGER);
      } else {
        preparedStmt.setInt(2, year);
      }
      preparedStmt.setString(3, title.isEmpty() ? null : title);
      preparedStmt.setString(4, language.isEmpty() ? null : language);
      if (C.isSelected()) {
        preparedStmt.setByte(5, (byte) 0);
      } else if (V.isSelected()) {
        preparedStmt.setByte(5, (byte) 1);
      } else {
        preparedStmt.setNull(5, Types.TINYINT);
      }
      if (producerID == 0) {
        preparedStmt.setNull(6, Types.INTEGER);
      } else {
        preparedStmt.setInt(6, producerID);
      }
      
      preparedStmt.setString(7, oldMusic.get("AlbumName").isEmpty() ? null : oldMusic.get("AlbumName"));
      if (oldMusic.get("Year").isEmpty()) {
        preparedStmt.setString(8, null);
      } else {
        preparedStmt.setInt(8, Integer.parseInt(oldMusic.get("Year")));
      }
      preparedStmt.setString(9, oldTracks.get("T"+trackNum).isEmpty() ? null : oldTracks.get("T"+trackNum));
      preparedStmt.executeUpdate();

      preparedStmt.close();
    } catch (SQLException e) {
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
          } catch (SQLException e2) {}
      }
    }
    
  }
  
  private static void deleteMusicSinger(Connection con, String album, int year, String title, int ID) {
    PreparedStatement preparedStmt = null;
    String query = "delete from musicsinger where AlbumName = ? and Year = ? and MusicName = ? and PeopleInvolved_ID = ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, album.isEmpty() ? null : album);
      if (year == 0) {
        preparedStmt.setNull(2, Types.INTEGER);
      } else {
        preparedStmt.setInt(2, year);
      }
      preparedStmt.setString(3, title.isEmpty() ? null : title);
      if (ID == 0) {
        preparedStmt.setNull(4, Types.INTEGER);
      } else {
        preparedStmt.setInt(4, ID);
      }

      preparedStmt.executeUpdate();
      preparedStmt.close();
    } catch (SQLException e) {
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
          } catch (SQLException e2) {}
      }
    }
  }
  
  
  private static void deleteMusicPeople(Connection con, String album, int year, String title, int ID) {
    PreparedStatement preparedStmt = null;
    String query = "delete from peopleinvolvedmusic where AlbumName = ? and Year = ? and MusicName = ? and PeopleInvolved_ID = ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, album.isEmpty() ? null : album);
      if (year == 0) {
        preparedStmt.setNull(2, Types.INTEGER);
      } else {
        preparedStmt.setInt(2, year);
      }
      preparedStmt.setString(3, title.isEmpty() ? null : title);
      if (ID == 0) {
        preparedStmt.setNull(4, Types.INTEGER);
      } else {
        preparedStmt.setInt(4, ID);
      }

      preparedStmt.executeUpdate();
      preparedStmt.close();
    } catch (SQLException e) {
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
          } catch (SQLException e2) {}
      }
    }
  }
  
  private static void deleteTrack(Connection con, String album, int year, String title) {
    PreparedStatement preparedStmt = null;
    String query = "delete from music where AlbumName = ? and Year = ? and MusicName = ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, album.isEmpty() ? null : album);
      if (year == 0) {
        preparedStmt.setNull(2, Types.INTEGER);
      } else {
        preparedStmt.setInt(2, year);
      }
      preparedStmt.setString(3, title.isEmpty() ? null : title);

      preparedStmt.executeUpdate();
      preparedStmt.close();
    } catch (SQLException e) {
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
          } catch (SQLException e2) {}
      }
    }
  }
  
  private static void deleteMusicReferences(Connection con) {
    int i;
    for (i=0; i<T1S.size(); i++) {
      deleteMusicSinger(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T1"), T1S.get(i).intValue());
    }
    for (i=0; i<T2S.size(); i++) {
      deleteMusicSinger(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T2"), T2S.get(i).intValue());
    }
    for (i=0; i<T3S.size(); i++) {
      deleteMusicSinger(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T3"), T3S.get(i).intValue());
    }
    for (i=0; i<T4S.size(); i++) {
      deleteMusicSinger(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T4"), T4S.get(i).intValue());
    }
    for (i=0; i<T5S.size(); i++) {
      deleteMusicSinger(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T5"), T5S.get(i).intValue());
    }
    for (i=0; i<T6S.size(); i++) {
      deleteMusicSinger(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T6"), T6S.get(i).intValue());
    }
    for (i=0; i<T7S.size(); i++) {
      deleteMusicSinger(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T7"), T7S.get(i).intValue());
    }
    
    String[] roles = {"W", "C", "A"};
    if (oldTracks.get("T1") != null) {
      for (String role : roles) {
        if (T1.get(role) != null) {
          deleteMusicPeople(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T1"), T1.get(role).intValue());
        }
      }
    }
    if (oldTracks.get("T2") != null) {
      for (String role : roles) {
        if (T2.get(role) != null) {
          deleteMusicPeople(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T2"), T2.get(role).intValue());
        }
      }
    }
    if (oldTracks.get("T3") != null) {
      for (String role : roles) {
        if (T3.get(role) != null) {
          deleteMusicPeople(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T3"), T3.get(role).intValue());
        }
      }
    }
    if (oldTracks.get("T4") != null) {
      for (String role : roles) {
        if (T4.get(role) != null) {
          deleteMusicPeople(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T4"), T4.get(role).intValue());
        }
      }
    }
    if (oldTracks.get("T5") != null) {
      for (String role : roles) {
        if (T5.get(role) != null) {
          deleteMusicPeople(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T5"), T5.get(role).intValue());
        }
      }
    }
    if (oldTracks.get("T6") != null) {
      for (String role : roles) {
        if (T6.get(role) != null) {
          deleteMusicPeople(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T6"), T6.get(role).intValue());
        }
      }
    }
    if (oldTracks.get("T7") != null) {
      for (String role : roles) {
        if (T7.get(role) != null) {
          deleteMusicPeople(con, oldMusic.get("AlbumName"), Integer.parseInt(oldMusic.get("Year")), oldTracks.get("T7"), T7.get(role).intValue());
        }
      }
    }
  }
  
  /* --- Data->remove --- */
  public static void deleteMusic(Connection con, String album) {
    try {
      con.setAutoCommit(false);
      deleteAllSinger(con, album);
      deleteAllMusicPeople(con, album);
      
      PreparedStatement preparedStmt = null;
      String query = "delete from music where AlbumName = ?";
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, album.isEmpty() ? null : album);

      preparedStmt.executeUpdate();
      preparedStmt.close();
      con.commit();
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
      } catch (SQLException e) { 
      }
    }
  }
  
  /* --- part of Data->remove --- */
  private static void deleteAllSinger(Connection con, String album) {
    PreparedStatement preparedStmt = null;
    String query = "delete from musicsinger where AlbumName = ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, album.isEmpty() ? null : album);

      preparedStmt.executeUpdate();
      preparedStmt.close();
    } catch (SQLException e) {
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
          } catch (SQLException e2) {}
      }
    }
  }
  
  /* --- part of Data->remove --- */
  private static void deleteAllMusicPeople(Connection con, String album) {
    PreparedStatement preparedStmt = null;
    String query = "delete from peopleinvolvedmusic where AlbumName = ?";
    
    try {
      con.setAutoCommit(false);
      preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, album.isEmpty() ? null : album);

      preparedStmt.executeUpdate();
      preparedStmt.close();
    } catch (SQLException e) {
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back.");
          con.rollback();
          } catch (SQLException e2) {}
      }
    }
  }
  
}
