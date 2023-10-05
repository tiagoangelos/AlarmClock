package classes;

import java.awt.Cursor;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrameAlarmClock extends javax.swing.JFrame implements Runnable{
    
    AlarmPlayer alarmPlayer = new AlarmPlayer();
    
    Cursor modelCursor = new Cursor(Cursor.HAND_CURSOR);
    String hours;
    String minutes;
    String seconds;
    String fullDate;
    String comboBoxHour;
    String comboBoxMinute;

    public FrameAlarmClock() {
        initComponents();
        Thread thread = new Thread(this);
        thread.start();
        comboBoxCurrrentTime();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePanel = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        lblTextSetAlarm = new javax.swing.JLabel();
        cBoxHour = new javax.swing.JComboBox<>();
        cBoxMinute = new javax.swing.JComboBox<>();
        lblTwoPoint = new javax.swing.JLabel();
        lblTextChooseSound = new javax.swing.JLabel();
        cBoxSound = new javax.swing.JComboBox<>();
        iconStopSound = new javax.swing.JLabel();
        iconListenSound = new javax.swing.JLabel();
        iconSetAlarm = new javax.swing.JLabel();
        lblHour = new javax.swing.JLabel();
        lblMinute = new javax.swing.JLabel();
        lblSecond = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuAbout = new javax.swing.JMenu();
        menuHowToUse = new javax.swing.JMenu();
        menuMore = new javax.swing.JMenu();
        menuVisitUs = new javax.swing.JMenu();
        menuExitAndCancel = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alarm Clock ");
        setResizable(false);

        HomePanel.setBackground(new java.awt.Color(33, 33, 33));
        HomePanel.setForeground(new java.awt.Color(255, 255, 255));

        lblDate.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        lblDate.setForeground(new java.awt.Color(237, 255, 198));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("Date");

        lblTextSetAlarm.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        lblTextSetAlarm.setForeground(new java.awt.Color(255, 255, 255));
        lblTextSetAlarm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextSetAlarm.setText("Set An Alarm Time");

        cBoxHour.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        cBoxMinute.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cBoxMinute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        lblTwoPoint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTwoPoint.setForeground(new java.awt.Color(255, 255, 255));
        lblTwoPoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTwoPoint.setText(":");

        lblTextChooseSound.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        lblTextChooseSound.setForeground(new java.awt.Color(255, 255, 255));
        lblTextChooseSound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextChooseSound.setText("Choose Alarm Sound");

        cBoxSound.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cBoxSound.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alarm (Default)", "Alarm - Annoying", "Alarm - Sony Xperia", "Alarm - Iphone", "Alarm - Iphone X", "Alarm - Huawei" }));

        iconStopSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Stop-Icon-(50x50).png"))); // NOI18N
        iconStopSound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconStopSoundMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconStopSoundMouseEntered(evt);
            }
        });

        iconListenSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Play-Icon-(50x50).png"))); // NOI18N
        iconListenSound.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconListenSound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconListenSoundMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconListenSoundMouseEntered(evt);
            }
        });

        iconSetAlarm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Alarm-Set-Icon(50x50).png"))); // NOI18N
        iconSetAlarm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconSetAlarmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconSetAlarmMouseEntered(evt);
            }
        });

        lblHour.setFont(new java.awt.Font("Tahoma", 3, 40)); // NOI18N
        lblHour.setForeground(new java.awt.Color(237, 255, 198));
        lblHour.setText("00");

        lblMinute.setFont(new java.awt.Font("Tahoma", 3, 40)); // NOI18N
        lblMinute.setForeground(new java.awt.Color(237, 255, 198));
        lblMinute.setText("00");

        lblSecond.setFont(new java.awt.Font("Tahoma", 3, 40)); // NOI18N
        lblSecond.setForeground(new java.awt.Color(237, 255, 198));
        lblSecond.setText("00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 255, 198));
        jLabel1.setText(":");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 255, 198));
        jLabel2.setText(":");

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTextSetAlarm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTextChooseSound, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                        .addComponent(lblHour, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                        .addComponent(cBoxSound, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(iconListenSound)
                        .addGap(18, 18, 18)
                        .addComponent(iconStopSound)
                        .addGap(18, 18, 18)
                        .addComponent(iconSetAlarm))
                    .addGroup(HomePanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(cBoxHour, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTwoPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinute)
                    .addComponent(lblSecond)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblHour))
                .addGap(18, 18, 18)
                .addComponent(lblDate)
                .addGap(32, 32, 32)
                .addComponent(lblTextSetAlarm)
                .addGap(18, 18, 18)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTwoPoint))
                .addGap(34, 34, 34)
                .addComponent(lblTextChooseSound)
                .addGap(18, 18, 18)
                .addComponent(cBoxSound, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconStopSound)
                    .addComponent(iconSetAlarm)
                    .addComponent(iconListenSound))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(33, 33, 33));

        menuAbout.setForeground(new java.awt.Color(255, 255, 255));
        menuAbout.setText("About");
        menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAboutMouseClicked(evt);
            }
        });
        menuBar.add(menuAbout);

        menuHowToUse.setForeground(new java.awt.Color(255, 255, 255));
        menuHowToUse.setText("How To Use");
        menuHowToUse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHowToUseMouseClicked(evt);
            }
        });
        menuBar.add(menuHowToUse);

        menuMore.setBackground(new java.awt.Color(33, 33, 33));
        menuMore.setForeground(new java.awt.Color(255, 255, 255));
        menuMore.setText("More");

        menuVisitUs.setBackground(new java.awt.Color(33, 33, 33));
        menuVisitUs.setForeground(new java.awt.Color(33, 33, 33));
        menuVisitUs.setText("Visit Us");
        menuVisitUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVisitUsMouseClicked(evt);
            }
        });
        menuMore.add(menuVisitUs);

        menuExitAndCancel.setText("Exit and Cancel");
        menuExitAndCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitAndCancelMouseClicked(evt);
            }
        });
        menuMore.add(menuExitAndCancel);

        menuBar.add(menuMore);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAboutMouseClicked
        JOptionPane.showMessageDialog(null, 
                "Alarm Clock © Version 1.0 \n\n"
              + "• This Software Aims to Use Be Alarm Clock for Computer,\n"
              + "Software Developed in Java Language."
              , "About", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_menuAboutMouseClicked

    private void menuHowToUseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHowToUseMouseClicked
        JOptionPane.showMessageDialog(null, 
                "Using this software is very simple! \n\n"   
              + "•  Set in 'Set An Alarm Time' the hour and minute \n"
              + "you want the alarm to ring. \n"
              + "•  In 'Choose Alarm Sound', choose a sound for your \n"
              + "alarm, if you want to hear it first, click play/stop. \n"
              + "•  And finally, just click on the alarm symbol and wait. \n\n"
              + "• Note: Keep the Program open or Minimized, if you close the \n"
              + "Program the alarm is canceled immediately!"
              , "How To Use", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_menuHowToUseMouseClicked

    private void menuVisitUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVisitUsMouseClicked
        try {
            Runtime.getRuntime().exec("cmd.exe /C start " + "https://github.com/jtas20/alarmClock");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                "Error! \n\n"
              + "• An error occurred when trying to open the page address in your browser.\n"
              + "Try it yourself: 'https://github.com/jtas20/alarmClock'."
               ,"Visit", JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_menuVisitUsMouseClicked

    private void menuExitAndCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitAndCancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuExitAndCancelMouseClicked
    
    private void iconListenSoundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconListenSoundMouseEntered
        iconListenSound.setCursor(modelCursor);
    }//GEN-LAST:event_iconListenSoundMouseEntered

    private void iconStopSoundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconStopSoundMouseEntered
        iconStopSound.setCursor(modelCursor);
    }//GEN-LAST:event_iconStopSoundMouseEntered
    
    private void iconSetAlarmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconSetAlarmMouseEntered
        iconSetAlarm.setCursor(modelCursor);
    }//GEN-LAST:event_iconSetAlarmMouseEntered
        
    private void iconListenSoundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconListenSoundMouseClicked
        String addressAudio = alarmPlayer.getPath(cBoxSound.getSelectedItem().toString());
        alarmPlayer.play(addressAudio);
    }//GEN-LAST:event_iconListenSoundMouseClicked

    private void iconStopSoundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconStopSoundMouseClicked
        alarmPlayer.stop();
    }//GEN-LAST:event_iconStopSoundMouseClicked
  
    private void iconSetAlarmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconSetAlarmMouseClicked
        int hourAlarm = Integer.parseInt(cBoxHour.getSelectedItem().toString());
        int minuteAlarm = Integer.parseInt(cBoxMinute.getSelectedItem().toString());
        String soundAlarm  = cBoxSound.getSelectedItem().toString();
        
        alarmPlayer.setAlarm(hourAlarm, minuteAlarm, soundAlarm);
    }//GEN-LAST:event_iconSetAlarmMouseClicked
      
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAlarmClock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePanel;
    private javax.swing.JComboBox<String> cBoxHour;
    private javax.swing.JComboBox<String> cBoxMinute;
    private javax.swing.JComboBox<String> cBoxSound;
    private javax.swing.JLabel iconListenSound;
    private javax.swing.JLabel iconSetAlarm;
    private javax.swing.JLabel iconStopSound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblMinute;
    private javax.swing.JLabel lblSecond;
    private javax.swing.JLabel lblTextChooseSound;
    private javax.swing.JLabel lblTextSetAlarm;
    private javax.swing.JLabel lblTwoPoint;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuExitAndCancel;
    private javax.swing.JMenu menuHowToUse;
    private javax.swing.JMenu menuMore;
    private javax.swing.JMenu menuVisitUs;
    // End of variables declaration//GEN-END:variables
    
    public void run(){
        while (true) {
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            
            SimpleDateFormat formatHour = new SimpleDateFormat("HH");
            SimpleDateFormat formatMinute = new SimpleDateFormat("mm");
            SimpleDateFormat formatSecond = new SimpleDateFormat("ss");
            SimpleDateFormat formatDate = new SimpleDateFormat("LL/dd/yyyy, z");
            
            hours = formatHour.format(date);
            minutes = formatMinute.format(date);
            seconds = formatSecond.format(date);
            
            fullDate = formatDate.format(date);
            
            lblHour.setText(hours);
            lblMinute.setText(minutes);
            lblSecond.setText(seconds);
            
            lblDate.setText(fullDate);
        }
    }

    private void comboBoxCurrrentTime() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        
        SimpleDateFormat formatHour = new SimpleDateFormat("HH");
        SimpleDateFormat formatMinute = new SimpleDateFormat("mm");
        
        comboBoxHour = formatHour.format(date);
        comboBoxMinute = formatMinute.format(date);
        
        cBoxHour.setSelectedItem(comboBoxHour);
        cBoxMinute.setSelectedItem(comboBoxMinute);
    }
}