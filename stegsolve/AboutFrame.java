/*
 * aboutFrame.java
 *
 * Created on 18-Apr-2011, 09:12:05
 */

package stegsolve;

/**
 * Just a small about box with some details of the
 * application
 * @author Caesum
 */
public class AboutFrame extends javax.swing.JFrame {

    /** Creates new form aboutFrame */
    public AboutFrame() {
        initComponents();
        jEditorPane1.setCaretPosition(0);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        aboutPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        okButton.setText("OK");
        okButton.setAlignmentX(0.5F);
        okButton.addActionListener(this::okButtonActionPerformed);

        aboutPanel.setPreferredSize(new java.awt.Dimension(450, 300));

        jEditorPane1.setContentType("text/html");
        jEditorPane1.setEditable(false);
        jEditorPane1.setText("<html>\n<center><b>Stegsolve Legacy</b></center>\n<br>\nStegsolve is a stegano solver for challenges. It provides these main functions:\n<ul>\n<li>A quick view of different bit planes and some simple transformations.</li>\n<li>Data extraction from planes. This can be row order or column order, with bits treated as a bitstream and converted into bytes.</li>\n<li>Some simple checking of file formats and reporting on the filesize, additional bytes, file holes, etc. This is highly dependent upon the type of image.</li>\n<li>Stereogram solver - simply change the offset until the image becomes visible.</li>\n<li>Frame browser for animated images. This should also work for viewing layers in multi-layered PNG files.</li>\n<li>Image combiner to combine two images in a variety of ways and browse through the different combinations.</li>\n</ul>\n<p>Copy/Cut and paste is available from most text using CTRL-C to copy, CTRL-V to paste and CTRL-X for cut.\n<p>If an image fails to load, for example because it is corrupt, then file analysis will still open the file that you just tried to view. It may, however, crash out before reporting the information that you want to know. This will work though on images where the PNG has corrupted CRC values for example.\n</html>\n");
        jEditorPane1.setMinimumSize(new java.awt.Dimension(150, 150));
        jEditorPane1.setPreferredSize(new java.awt.Dimension(150, 150));
        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout aboutPanelLayout = new javax.swing.GroupLayout(aboutPanel);
        aboutPanel.setLayout(aboutPanelLayout);
        aboutPanelLayout.setHorizontalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );
        aboutPanelLayout.setVerticalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(okButton)
                .addContainerGap(227, Short.MAX_VALUE))
            .addComponent(aboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(aboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Disposes of the form when the ok button is pressed
     * @param evt Button event
     */
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

}
