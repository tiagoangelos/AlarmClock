package classes;

import jaco.mp3.player.MP3Player;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class AlarmPlayer {
    String currentDir = System.getProperty("user.dir");
    
    MP3Player player;
    File songFile = null;
    FileInputStream fis;
    BufferedInputStream bis;
    
    boolean alarmSet = false;
    boolean repeat = true;
    
    public String getPath(String selectedSound){
        String alarmDefault = "./src/audio/Alarm-Default.mp3";
        String alarmAnnoying = "./src/audio/Alarm-Annoying.mp3";
        String alarmSonyXperia = "./src/audio/Alarm-Sony-Xperia.mp3";
        String alarmIphone = "./src/audio/Alarm-Iphone.mp3";
        String alarmIphoneX = "./src/audio/Alarm-Iphone-X.mp3";
        String alarmHuawei = "./src/audio/Alarm-Huawei.mp3";
        
        if(selectedSound == "Alarm (Default)"){
            return alarmDefault;
        }else if(selectedSound == "Alarm - Annoying"){
            return alarmAnnoying;
        }else if(selectedSound == "Alarm - Sony Xperia"){
            return alarmSonyXperia;
        }else if(selectedSound == "Alarm - Iphone"){
            return alarmIphone;
        }else if(selectedSound == "Alarm - Iphone X"){
            return alarmIphoneX;
        }else {
            return alarmHuawei;
        } 
    }
    
    public void play(String addressAudio){
        File file = new File(currentDir + addressAudio);
        
        repeat = false;
        
        if(player != null){
            player.stop();
            player = null;
        }
        
        try {            
            songFile = file;        
            fis = new FileInputStream(songFile);
            bis = new BufferedInputStream(fis);
            player = new MP3Player(songFile);
            
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
    
    public void stop(){
        if(player != null){
            player.stop();
            player = null;    
        }
    }
    
    public void stopAlarm(){
         if(player != null){
            player.stop();
            player = null;
            
            alarmSet = false;
            repeat = false;
        }
    }
    
    public void startAlarm(String soundAlarm){
        File file = new File(currentDir + soundAlarm);
        
        repeat = true;
        
        if(player != null){
            player.stop();
            player = null;
        }
        
        try {
            songFile = file;        
            fis = new FileInputStream(songFile);
            bis = new BufferedInputStream(fis);
            player = new MP3Player(songFile);
            
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
      
    public void setAlarm(int hourAlarm, int minuteAlarm, String soundAlarm){
        alarmSet = true;
        
        JOptionPane.showMessageDialog(null, 
                "Alarm Time: " + hourAlarm + ":" + minuteAlarm + "\n\n"
              + "• Selected Sound: " + soundAlarm + "\n" 
              + "• Note: Keep the Program open or Minimized, if you close the \n"
              + "Program the alarm is canceled immediately!"
              , "Alarm Time ", JOptionPane.INFORMATION_MESSAGE
        );
        
        Thread verify = new Thread(){
            public void run(){
                while(alarmSet == true){
                    Calendar date = Calendar.getInstance();
                    int currentHour = date.get(Calendar.HOUR_OF_DAY);
                    int currentMinute = date.get(Calendar.MINUTE);

                    if(hourAlarm == currentHour && minuteAlarm == currentMinute){
                        startAlarm(getPath(soundAlarm));
                        
                        int stop = JOptionPane.showConfirmDialog(null, 
                            "Alarm Time!!!\n\n"
                          + "• Time: " + hourAlarm + ":" + minuteAlarm + "\n"
                          + "• Stop Alarm? "
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