
package stickymemories.frames;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import stickymemories.core.*;
/**
 *
 * @author andre
 */
public class EditNotePanel extends javax.swing.JPanel {
    MainFrame mainFrame;
    String imagePath = "";
    private Image image;
    private boolean reminderState;
    private List<ReminderPanel> remindersList;

    public EditNotePanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        
        setupButtons();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        createNoteButton = new javax.swing.JButton();
        chosenImagePanel = new ImagePanel();
        createNoteTextLabel = new javax.swing.JLabel();
        remindersTextLabel = new javax.swing.JLabel();
        reminderSwitcher = new javax.swing.JToggleButton();
        button_add_reminders = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        remindersPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setToolTipText("Back to Main Page");
        backButton.setBorderPainted(false);
        backButton.setFocusable(false);
        backButton.setOpaque(false);
        backButton.setPreferredSize(new java.awt.Dimension(30, 30));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonOnBackButtonClicked(evt);
            }
        });

        createNoteButton.setBackground(new java.awt.Color(255, 255, 255));
        createNoteButton.setText("Save");
        createNoteButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        createNoteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnSaveButtonClicked(evt);
            }
        });

        chosenImagePanel.setBackground(new java.awt.Color(255, 255, 255));
        chosenImagePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        chosenImagePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout chosenImagePanelLayout = new javax.swing.GroupLayout(chosenImagePanel);
        chosenImagePanel.setLayout(chosenImagePanelLayout);
        chosenImagePanelLayout.setHorizontalGroup(
            chosenImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );
        chosenImagePanelLayout.setVerticalGroup(
            chosenImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );

        createNoteTextLabel.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        createNoteTextLabel.setText("Edit Note");

        remindersTextLabel.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        remindersTextLabel.setText("Reminders:");

        reminderSwitcher.setBackground(new java.awt.Color(255, 255, 255));
        reminderSwitcher.setText("Off");
        reminderSwitcher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reminderSwitcherOnReminderStateClick(evt);
            }
        });

        button_add_reminders.setText("Add new reminder");
        button_add_reminders.setEnabled(false);
        button_add_reminders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_remindersActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBar(null);

        remindersPanel.setAutoscrolls(true);
        remindersPanel.setMaximumSize(new java.awt.Dimension(210, 185));
        remindersPanel.setMinimumSize(new java.awt.Dimension(210, 185));
        remindersPanel.setPreferredSize(new java.awt.Dimension(210, 185));
        remindersPanel.setLayout(new java.awt.BorderLayout());
        jScrollPane1.setViewportView(remindersPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(createNoteButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(createNoteTextLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(chosenImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(remindersTextLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(reminderSwitcher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(button_add_reminders, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(createNoteTextLabel)
                    .addGap(5, 5, 5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(reminderSwitcher)
                                .addComponent(remindersTextLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(button_add_reminders)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(createNoteButton))
                        .addComponent(chosenImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void setupComponents(){
        Note note = DataNotes.getNote(MainFrame.LastSelectedEdit);
        if(note == null){ 
            System.out.println("ERRO");
            return;
        }
        imagePath = note.getImagePath();
        if(imagePath != null){
            System.out.println("ImagePath: " + imagePath);
            image = Constants.getSelectedImageIcon(1, imagePath).getImage();
            chosenImagePanel.repaint();
        }
        if(note.getReminders() == null){
            reminderState = false;
            System.out.println("Nota sem reminders!");
        } else {
            reminderState = true;
            System.out.println("Esta nota tem "+note.getReminders().size()
                    +" reminders!");
            remindersList = new ArrayList<>();
            for(Reminder rm : note.getReminders()) {
                ReminderPanel rp = new ReminderPanel(this, remindersList.size());
                rp.setTime(rm.getAno(), rm.getMes(), rm.getMinuto(), rm.getHora(), rm.getMinuto());
                remindersPanel.add(rp);
                remindersList.add(rp);
            }
            remindersPanel.invalidate();
            remindersPanel.validate();
            remindersPanel.repaint();
        }           
        
        updateReminderState();
    }
    
    private void backButtonOnBackButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonOnBackButtonClicked
        mainFrame.setContentPane(MainFrame.mainPanel);
        invalidate();
        validate();
    }//GEN-LAST:event_backButtonOnBackButtonClicked

    private void OnSaveButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnSaveButtonClicked
        if(imagePath == null)
            return;
        String newPath = Constants.copyImage(imagePath);
        DataNotes.getNote(MainFrame.LastSelectedEdit).setImagePath("images/"+newPath);
        try{
            Controller.saveData();
        } catch (IOException ex) {
            System.out.println("Erro ao criar nota!");
        }
        MainFrame.reloadPanel();
        backButtonOnBackButtonClicked(evt);
    }//GEN-LAST:event_OnSaveButtonClicked

    private void updateReminderState(){
        if(!reminderState){
            reminderSwitcher.setText(Constants.OFF_TEXT);
            reminderSwitcher.setSelected(false);
            reminderState = false;
            remindersPanel.setVisible(false);
            button_add_reminders.setEnabled(false);
        }else{
            reminderSwitcher.setText(Constants.ON_TEXT);
            reminderSwitcher.setSelected(true);
            reminderState = true;
            remindersPanel.setVisible(true);
            button_add_reminders.setEnabled(true);
        }
    }
    
    private void reminderSwitcherOnReminderStateClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reminderSwitcherOnReminderStateClick
        updateReminderState();
        this.repaint();
    }//GEN-LAST:event_reminderSwitcherOnReminderStateClick

    private void button_add_remindersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_remindersActionPerformed
        ReminderPanel rp = new ReminderPanel(this, remindersList.size());
        remindersPanel.add(rp);
        remindersList.add(rp);
        remindersPanel.invalidate();
        remindersPanel.validate();
    }//GEN-LAST:event_button_add_remindersActionPerformed

    private void OnImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnImageMouseClicked
        imagePath = Controller.selectImageFromDisk();
        if(imagePath != null){
            image = Constants.getSelectedImageIcon(1, imagePath).getImage();
            chosenImagePanel.repaint();
        }
    }//GEN-LAST:event_OnImageMouseClicked

    private void setupButtons() {
        backButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_BACK_SIGN));
    }
    
    class ImagePanel extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(image != null){
                g.drawImage(image, 0, 0, this);
            }
        }
    }
    
    class DateLabelFormatter extends JFormattedTextField.AbstractFormatter {
        private String datePattern = "yyyy-MM-dd";
        private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

        @Override
        public Object stringToValue(String text) throws ParseException {
            return dateFormatter.parseObject(text);
        }

        @Override
        public String valueToString(Object value) throws ParseException {
            if (value != null) {
                Calendar cal = (Calendar) value;
                return dateFormatter.format(cal.getTime());
            }

            return "";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton button_add_reminders;
    private javax.swing.JPanel chosenImagePanel;
    private javax.swing.JButton createNoteButton;
    private javax.swing.JLabel createNoteTextLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton reminderSwitcher;
    private javax.swing.JPanel remindersPanel;
    private javax.swing.JLabel remindersTextLabel;
    // End of variables declaration//GEN-END:variables

}
