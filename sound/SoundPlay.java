import java.io.*;
import javax.sound.sampled.*;

public class SoundPlay
{
    private static final String MUSIC_FILE = "./chime.wav";

    public static void main(String[] args) throws Exception
    {
        AudioFormat format = null;
        DataLine.Info info = null;
        Clip line = null;
        File audioFile = null;

        try {
            System.out.println(">>>>> start!");
            audioFile = new File(MUSIC_FILE);
            format = AudioSystem.getAudioFileFormat(audioFile).getFormat();
            info = new DataLine.Info(Clip.class, format);
            line = (Clip)AudioSystem.getLine(info);
            line.open(AudioSystem.getAudioInputStream(audioFile));
            line.start();
            Thread.sleep(3000); 
            System.out.println("<<<<< done!");
        } catch(Exception e){
            e.printStackTrace();
        }
        System.exit(0);
    }
}
