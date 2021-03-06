package stickymemories.frames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import stickymemories.core.Constants;

public class NotificationPopUp extends javax.swing.JFrame {

    private Image img = null;
    public NotificationPopUp(String imagePath) {
        initComponents();
        img = Constants.getSelectedImage(1, imagePath);
        setFrameComponents();
    }
    
    public void setFrameComponents(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        this.setUndecorated(true);
        this.setVisible(true);
        pack();
        this.setBackground(new Color(0,0,0,128));
        this.setMinimumSize(screenSize);
        this.setMaximumSize(screenSize);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        imagePanel = new ImagePanel();
        dismissButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        imagePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 650;
        gridBagConstraints.ipady = 639;
        gridBagConstraints.insets = new java.awt.Insets(70, 70, 0, 70);
        getContentPane().add(imagePanel, gridBagConstraints);

        dismissButton.setText("Dismiss Reminder");
        dismissButton.setToolTipText("");
        dismissButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dismissButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 0);
        getContentPane().add(dismissButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void dismissButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dismissButtonMouseClicked
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_dismissButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dismissButton;
    private javax.swing.JPanel imagePanel;
    // End of variables declaration//GEN-END:variables

    class ImagePanel extends JPanel{               
        
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            
            if(img != null)
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            else
                System.err.println("Image == null");
        }
    }

}

