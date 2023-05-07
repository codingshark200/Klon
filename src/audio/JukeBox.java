package audio;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class JukeBox {

	Clip musik;
	
	public void play(String fileName) {
		AudioInputStream audioIn;
		try {
			System.out.println(new File(fileName).toURI().toURL());
			audioIn = AudioSystem.getAudioInputStream(new File(fileName).toURI().toURL());
			
			musik = AudioSystem.getClip();
			musik.open(audioIn);
			musik.start();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

