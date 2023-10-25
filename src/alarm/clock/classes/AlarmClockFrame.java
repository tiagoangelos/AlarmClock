package alarm.clock.classes;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AlarmClockFrame extends javax.swing.JFrame implements Runnable{
    
    String appName = "Alarm Clock v 2.0";
   
    int xMouse, yMouse;
   
    Cursor modelCursor = new Cursor(Cursor.HAND_CURSOR);
    
    boolean menu = false;
    ImageIcon imageMenu = new ImageIcon(getClass().getResource("/alarm/clock/images/menu.png"));
    ImageIcon imageXMenu = new ImageIcon(getClass().getResource("/alarm/clock/images/xMenu.png"));
    
    String hour;
    String minutes;
    String seconds;
    String fullDate;
    
    AlarmClock alarmClock = new AlarmClock();
    
    public AlarmClockFrame() {
        initComponents();
        appNameLbl.setText(appName);
        
        Thread thread = new Thread(this);
        thread.start();
        
        comboBoxCurrrentTime();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        menuBar = new javax.swing.JLabel();
        iconAbout = new javax.swing.JLabel();
        aboutLbl = new javax.swing.JLabel();
        iconToUse = new javax.swing.JLabel();
        howToUseLbl = new javax.swing.JLabel();
        iconGitHub = new javax.swing.JLabel();
        gitHubLbl = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        appNameLbl = new javax.swing.JLabel();
        minimizeLbl = new javax.swing.JLabel();
        exitLbl = new javax.swing.JLabel();
        logoAlarmClock = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        hourLbl = new javax.swing.JLabel();
        twoPointHour = new javax.swing.JLabel();
        minutesLbl = new javax.swing.JLabel();
        twoPointsMinutes = new javax.swing.JLabel();
        secondsLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        setAlarmInstruction = new javax.swing.JLabel();
        hourComboBox = new javax.swing.JComboBox<>();
        twoPointComboBox = new javax.swing.JLabel();
        minuteComboBox = new javax.swing.JComboBox<>();
        chooseAlarmSoundInstruction = new javax.swing.JLabel();
        soundComboBox = new javax.swing.JComboBox<>();
        playSound = new javax.swing.JLabel();
        stopSound = new javax.swing.JLabel();
        setAlarmClock = new javax.swing.JLabel();
        schedulesAlarmClock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alarm Clock 2.0");
        setIconImage(new ImageIcon(getClass().getResource("/alarm/clock/images/logo.png")).getImage());
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(39, 39, 39));

        menuPanel.setBackground(new java.awt.Color(30, 30, 30));

        menuBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alarm/clock/images/menu.png"))); // NOI18N
        menuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuBarMouseEntered(evt);
            }
        });

        iconAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alarm/clock/images/about.png"))); // NOI18N

        aboutLbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        aboutLbl.setForeground(new java.awt.Color(255, 255, 255));
        aboutLbl.setText("About");
        aboutLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutLblMouseEntered(evt);
            }
        });

        iconToUse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconToUse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alarm/clock/images/help.png"))); // NOI18N

        howToUseLbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        howToUseLbl.setForeground(new java.awt.Color(255, 255, 255));
        howToUseLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        howToUseLbl.setText("How to Use");
        howToUseLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                howToUseLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                howToUseLblMouseEntered(evt);
            }
        });

        iconGitHub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alarm/clock/images/github.png"))); // NOI18N

        gitHubLbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        gitHubLbl.setForeground(new java.awt.Color(255, 255, 255));
        gitHubLbl.setText("Visit Us");
        gitHubLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gitHubLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gitHubLblMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconGitHub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(iconAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconToUse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aboutLbl)
                    .addComponent(howToUseLbl)
                    .addComponent(gitHubLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(menuBar)
                .addGap(87, 87, 87)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aboutLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconAbout))
                .addGap(48, 48, 48)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(howToUseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconToUse))
                .addGap(54, 54, 54)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconGitHub)
                    .addComponent(gitHubLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        headerPanel.setBackground(new java.awt.Color(39, 39, 39));
        headerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerPanelMouseDragged(evt);
            }
        });
        headerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerPanelMousePressed(evt);
            }
        });

        appNameLbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        appNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        appNameLbl.setText("App Name");

        minimizeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alarm/clock/images/minimize.png"))); // NOI18N
        minimizeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeLblMouseEntered(evt);
            }
        });

        exitLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alarm/clock/images/exit.png"))); // NOI18N
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLblMouseEntered(evt);
            }
        });

        logoAlarmClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoAlarmClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alarm/clock/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(logoAlarmClock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minimizeLbl)
                .addGap(26, 26, 26)
                .addComponent(exitLbl)
                .addGap(21, 21, 21))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoAlarmClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minimizeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bodyPanel.setBackground(new java.awt.Color(39, 39, 39));

        hourLbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 58)); // NOI18N
        hourLbl.setForeground(new java.awt.Color(253, 253, 199));
        hourLbl.setText("00");

        twoPointHour.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 58)); // NOI18N
        twoPointHour.setForeground(new java.awt.Color(253, 253, 199));
        twoPointHour.setText(":");

        minutesLbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 58)); // NOI18N
        minutesLbl.setForeground(new java.awt.Color(253, 253, 199));
        minutesLbl.setText("00");

        twoPointsMinutes.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 58)); // NOI18N
        twoPointsMinutes.setForeground(new java.awt.Color(253, 253, 199));
        twoPointsMinutes.setText(":");

        secondsLbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 58)); // NOI18N
        secondsLbl.setForeground(new java.awt.Color(253, 253, 199));
        secondsLbl.setText("00");

        dateLbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 38)); // NOI18N
        dateLbl.setForeground(new java.awt.Color(255, 255, 255));
        dateLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLbl.setText("00/00/0000, tz");

        setAlarmInstruction.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        setAlarmInstruction.setForeground(new java.awt.Color(255, 255, 255));
        setAlarmInstruction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setAlarmInstruction.setText("Set an Alarm Time");

        hourComboBox.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        hourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        twoPointComboBox.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        twoPointComboBox.setForeground(new java.awt.Color(255, 255, 255));
        twoPointComboBox.setText(":");

        minuteComboBox.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        minuteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        chooseAlarmSoundInstruction.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        chooseAlarmSoundInstruction.setForeground(new java.awt.Color(255, 255, 255));
        chooseAlarmSoundInstruction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseAlarmSoundInstruction.setText("Choose Alarm Sound");

        soundComboBox.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        soundComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boring", "Iphone", "Sansung", "Sony-Xperia" }));

        playSound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alarm/clock/images/play.png"))); // NOI18N
        playSound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playSoundMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playSoundMouseEntered(evt);
            }
        });

        stopSound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alarm/clock/images/stop.png"))); // NOI18N
        stopSound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopSoundMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stopSoundMouseEntered(evt);
            }
        });

        setAlarmClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setAlarmClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alarm/clock/images/setAlarm.png"))); // NOI18N
        setAlarmClock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setAlarmClockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setAlarmClockMouseEntered(evt);
            }
        });

        schedulesAlarmClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schedulesAlarmClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alarm/clock/images/scheduled.png"))); // NOI18N
        schedulesAlarmClock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schedulesAlarmClockMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setAlarmInstruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooseAlarmSoundInstruction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(hourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twoPointComboBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minuteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(soundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(hourLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twoPointHour)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minutesLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twoPointsMinutes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secondsLbl))
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(playSound)
                                .addGap(18, 18, 18)
                                .addComponent(stopSound)
                                .addGap(26, 26, 26)
                                .addComponent(schedulesAlarmClock)
                                .addGap(36, 36, 36)
                                .addComponent(setAlarmClock)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourLbl)
                    .addComponent(twoPointHour)
                    .addComponent(minutesLbl)
                    .addComponent(twoPointsMinutes)
                    .addComponent(secondsLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateLbl)
                .addGap(27, 27, 27)
                .addComponent(setAlarmInstruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoPointComboBox)
                    .addComponent(minuteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(chooseAlarmSoundInstruction)
                .addGap(18, 18, 18)
                .addComponent(soundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playSound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stopSound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setAlarmClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(schedulesAlarmClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menuPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void headerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerPanelMousePressed

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerPanelMouseDragged

    private void minimizeLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblMouseEntered
        minimizeLbl.setCursor(modelCursor);
    }//GEN-LAST:event_minimizeLblMouseEntered

    private void exitLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseEntered
        exitLbl.setCursor(modelCursor);
    }//GEN-LAST:event_exitLblMouseEntered

    private void aboutLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLblMouseEntered
        aboutLbl.setCursor(modelCursor);
    }//GEN-LAST:event_aboutLblMouseEntered

    private void howToUseLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_howToUseLblMouseEntered
        howToUseLbl.setCursor(modelCursor);
    }//GEN-LAST:event_howToUseLblMouseEntered

    private void gitHubLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitHubLblMouseEntered
        gitHubLbl.setCursor(modelCursor);
    }//GEN-LAST:event_gitHubLblMouseEntered

    private void playSoundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playSoundMouseEntered
        playSound.setCursor(modelCursor);
    }//GEN-LAST:event_playSoundMouseEntered

    private void stopSoundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopSoundMouseEntered
        stopSound.setCursor(modelCursor);
    }//GEN-LAST:event_stopSoundMouseEntered

    private void setAlarmClockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setAlarmClockMouseEntered
        setAlarmClock.setCursor(modelCursor);
    }//GEN-LAST:event_setAlarmClockMouseEntered

    private void minimizeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeLblMouseClicked

    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        if(alarmClock.getAlarmSet()){
            int response = JOptionPane.showConfirmDialog(null, 
                  "Exit Program \n\n"
                + "Do Are you Sure You Want To Leave? \n\n"
                + "Note: The Alarm Will Be Canceled! \n"
                , "Exit Program", JOptionPane.INFORMATION_MESSAGE
            );
        
            if(response == JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }else{
            System.exit(0);
        }
    }//GEN-LAST:event_exitLblMouseClicked

    private void aboutLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLblMouseClicked
        JOptionPane.showMessageDialog(null,
                "Alarm Clock © Version 2.0 \n\n"
              + "24-Hour Alarm Clock Developed For \n"
              + "Operating Systems. Version 2.0 Java \n"
              + "Application."
              , "About", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_aboutLblMouseClicked

    private void howToUseLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_howToUseLblMouseClicked
        JOptionPane.showMessageDialog(null, 
                "How To Use? \n\n"   
              + "1° Pass Set In 'Set An Alarm Time' The Hour And Minute \n"
              + "You Want The Alarm To Ring. \n\n"
              + "2° Pass In 'Choose Alarm Sound', Choose The Desired Sound\n"
              + "To Play, Or Choose An Mp3 File From Your Computer If You\n"
              + "Wish, Click Play/Stop To Hear The Sound You Want To Play. \n\n"
              + "3° Pass And Finally, Just Click On The Alarm Symbol And Wait.\n\n"
              + "Note: Keep The Program Open Or Minimized, If You Close The\n"
              + "Program The Alarm Is Canceled Immediately!"
              , "How To Use", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_howToUseLblMouseClicked

    private void gitHubLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitHubLblMouseClicked
         try {
            Runtime.getRuntime().exec("cmd.exe /C start " + "https://github.com/jtas20/alarmClock");
            JOptionPane.showMessageDialog(null, 
                    "Openening The Page... Please Wait!"
                  , "Opening The Page...", JOptionPane.INFORMATION_MESSAGE
            );
         } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                "Visit Error! \n\n"
              + "• An Error Occurred When Trying To Open The Page Address In\n"
              + "Your Browser.\n"
              + "Try It Yourself: 'https://github.com/jtas20/alarmClock'."
               ,"Visit", JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_gitHubLblMouseClicked

    private void menuBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMouseEntered
        menuBar.setCursor(modelCursor);
    }//GEN-LAST:event_menuBarMouseEntered
    
    private void menuOpen(){
        menu = true;
        menuBar.setIcon(imageXMenu);
        menuPanel.setSize(new Dimension(200, menuPanel.getHeight()));
    }
    
    private void menuClose(){
        menu = false;
        menuBar.setIcon(imageMenu);
        menuPanel.setSize(new Dimension(100, menuPanel.getHeight()));
    }
    
    private void menuBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMouseClicked
        if(!menu){
            menuOpen();
        }else{
            menuClose();
        }
    }//GEN-LAST:event_menuBarMouseClicked
    
    private String getPath(String selectedSound){
        String alarmBoring = "./src/alarm/clock/sound/Boring.mp3";
        String alarmIphone = "./src/alarm/clock/sound/Iphone.mp3";
        String alarmSamsung = "./src/alarm/clock/sound/Samsung.mp3";
        String alarmSonyXperia = "./src/alarm/clock/sound/Sony-Xperia.mp3";
        
        if(selectedSound.equals("0")){
            return alarmBoring;
        }else if(selectedSound.equals("1")){
            return alarmIphone;
        }else if(selectedSound.equals("2")){
            return alarmSamsung;
        }else if(selectedSound.equals("3")){
            return alarmSonyXperia;
        }else {
            return null;
        } 
    }
    
    private void playSoundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playSoundMouseClicked
        String addressAudio = getPath(Integer.toString(soundComboBox.getSelectedIndex()));
        alarmClock.PlayPreview(addressAudio);
    }//GEN-LAST:event_playSoundMouseClicked

    private void stopSoundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopSoundMouseClicked
        alarmClock.stopPreview();
    }//GEN-LAST:event_stopSoundMouseClicked

    private void setAlarmClockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setAlarmClockMouseClicked
        int hour = Integer.parseInt(hourComboBox.getSelectedItem().toString());
        int minutes = Integer.parseInt(minuteComboBox.getSelectedItem().toString());
        String soundSelected = Integer.toString(soundComboBox.getSelectedIndex());
        
        String sound = getPath(soundSelected);
        
        alarmClock.setAlarm(hour, minutes, sound);
    }//GEN-LAST:event_setAlarmClockMouseClicked

    private void schedulesAlarmClockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schedulesAlarmClockMouseClicked
        if(alarmClock.getAlarmSet()){
            JOptionPane.showMessageDialog(null,
                "Alarm Set \n\n"
              + "• Alarm Set For: " + alarmClock.getHour() + ":" + alarmClock.getMinutes()
              , "Alarm Set", JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog(null,
                "Alarm No Set \n\n"
              + "• No Alarm Set:!"
              , "Alarm No Set", JOptionPane.INFORMATION_MESSAGE
            );
        }
    }//GEN-LAST:event_schedulesAlarmClockMouseClicked
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlarmClockFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLbl;
    private javax.swing.JLabel appNameLbl;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel chooseAlarmSoundInstruction;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel gitHubLbl;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JComboBox<String> hourComboBox;
    private javax.swing.JLabel hourLbl;
    private javax.swing.JLabel howToUseLbl;
    private javax.swing.JLabel iconAbout;
    private javax.swing.JLabel iconGitHub;
    private javax.swing.JLabel iconToUse;
    private javax.swing.JLabel logoAlarmClock;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel menuBar;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JComboBox<String> minuteComboBox;
    private javax.swing.JLabel minutesLbl;
    private javax.swing.JLabel playSound;
    private javax.swing.JLabel schedulesAlarmClock;
    private javax.swing.JLabel secondsLbl;
    private javax.swing.JLabel setAlarmClock;
    private javax.swing.JLabel setAlarmInstruction;
    private javax.swing.JComboBox<String> soundComboBox;
    private javax.swing.JLabel stopSound;
    private javax.swing.JLabel twoPointComboBox;
    private javax.swing.JLabel twoPointHour;
    private javax.swing.JLabel twoPointsMinutes;
    // End of variables declaration//GEN-END:variables
    
    public void run(){                
        while(true){
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();

            SimpleDateFormat formatHour = new SimpleDateFormat("HH");
            SimpleDateFormat formatMinutes = new SimpleDateFormat("mm");
            SimpleDateFormat formatSeconds = new SimpleDateFormat("ss");
            SimpleDateFormat formatDate = new SimpleDateFormat("LL/dd/yyyy, z");

            hour = formatHour.format(date);
            minutes = formatMinutes.format(date);
            seconds = formatSeconds.format(date);
            fullDate = formatDate.format(date);

            hourLbl.setText(hour);
            minutesLbl.setText(minutes);
            secondsLbl.setText(seconds);

            dateLbl.setText(fullDate);
                    
            if(menu){
                menuOpen();
            }
        }
    }
    
    private void comboBoxCurrrentTime() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        
        SimpleDateFormat formatHour = new SimpleDateFormat("HH");
        SimpleDateFormat formatMinute = new SimpleDateFormat("mm");
        
        String comboBoxHour = formatHour.format(date);
        String comboBoxMinute = formatMinute.format(date);
        
        hourComboBox.setSelectedItem(comboBoxHour);
        minuteComboBox.setSelectedItem(comboBoxMinute);
    }
}