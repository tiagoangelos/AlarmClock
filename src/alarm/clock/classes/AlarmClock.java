package alarm.clock.classes;

import jaco.mp3.player.MP3Player;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class AlarmClock {
    private String currentDir;
    
    private MP3Player player;
    private FileInputStream fis;
    private BufferedInputStream bis;
    
    private File songFile;
    
    private boolean alarmSet;
    private boolean repeat;
    private int hour;
    private int minutes;
    
    public AlarmClock(){
        currentDir = System.getProperty("user.dir");
        songFile = null;
        alarmSet = false;
        repeat = true;
    }

    public boolean getAlarmSet() {
        return this.alarmSet;
    }

    public void setAlarmSet(boolean alarmSet) {
        this.alarmSet = alarmSet;
    }

    public boolean getRepeat() {
        return this.repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    
    public void PlayPreview(String addressAudio){
        File file = new File(this.currentDir + addressAudio);
        
        setRepeat(false);
        
        if(this.player != null){
            this.player.stop();
            this.player = null;
        }
        
        try {            
            this.songFile = file;        
            this.fis = new FileInputStream(songFile);
            this.bis = new BufferedInputStream(fis);
            this.player = new MP3Player(songFile);
            
            new Thread(){
                public void run(){
                    player.play();
                    player.setRepeat(repeat);
                }
            }.start();
        } catch (IOException ex){
            System.out.println(ex);
        }      
    }
    
    public void stopPreview(){
        if(this.player != null){
            this.player.stop();
            this.player = null;    
        }
    }
    
    public void stopAlarm(){
        if(this.player != null){
            this.player.stop();
            this.player = null;
            
            setAlarmSet(false);
        }     
    }
    
    public void PlayAlarm(String soundAlarm){
        File file = new File(this.currentDir + soundAlarm);
        
        setRepeat(true);
        
        if(this.player != null){
            this.player.stop();
            this.player = null;
        }
        
        try {
            this.songFile = file;        
            this.fis = new FileInputStream(songFile);
            this.bis = new BufferedInputStream(fis);
            this.player = new MP3Player(songFile);
            
            new Thread(){
                public void run(){
                   player.play();
                   player.setRepeat(repeat);
                }
            }.start();
           
        } catch (IOException ex){
            System.out.println(ex);
        }
    }
    
    public void setAlarm(int hourAlarm, int minuteAlarm, String sound){
        this.hour = hourAlarm;
        this.minutes = minuteAlarm;
        
        setAlarmSet(true);
        
        JOptionPane.showMessageDialog(null, 
                "Alarm Clock Set For: " + hourAlarm + ":" + minuteAlarm + " \n\n"
              + "Note: Keep The Program Open Or Minimized, If You Close The \n"
              + "Program the alarm is canceled immediately!"
              , "Alarm Time ", JOptionPane.INFORMATION_MESSAGE
        );
        
        Thread verify = new Thread(){
            public void run(){
                while(getAlarmSet() == true){
                    Calendar date = Calendar.getInstance();
                    int currentHour = date.get(Calendar.HOUR_OF_DAY);
                    int currentMinute = date.get(Calendar.MINUTE);

                    if(hour == currentHour && minutes == currentMinute){
                        PlayAlarm(sound);
                        
                        int stop = JOptionPane.showConfirmDialog(null, 
                            "Alarm Time!!!\n\n"
                          + "Time: " + hourAlarm + ":" + minuteAlarm + "\n"
                          + "Stop Alarm? "
                          , "Alarm Time", JOptionPane.INFORMATION_MESSAGE
                        );
                        
                        if(stop == JOptionPane.YES_OPTION){
                            stopAlarm();
                        }
                    } 
                }
            }
        }; verify.start();
    }
    
}