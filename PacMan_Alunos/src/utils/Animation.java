package utils;

import java.util.ArrayList;
import java.util.Timer;
import java.util.List;
import java.util.TimerTask;
import javax.swing.ImageIcon;

public class Animation {
    private Timer timer;
    private final long animationDelay;
    
    private final List<ImageIcon> images;
    
    private boolean isRunning;
    private int repeat;
    
    private int currFrame;
    private final ImageIcon currImage;
    
    public Animation(long animationDelay, int repeat) {
        this.animationDelay = animationDelay;
        this.isRunning = false;
        this.repeat = repeat;
        
        this.images = new ArrayList<>();

        this.currImage = new ImageIcon();
    }
    
    public Animation(long animationDelay) {
        this(animationDelay, -1);
    }
    
    public void start() {
        if(isRunning == false && repeat != 0) {
            isRunning = true;

            currFrame = -1;
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(++currFrame >= images.size()) {
                    if(repeat > 0) {
                        repeat--;
                    }
                    
                    if(repeat == 0) {
                        currFrame = images.size()-1;
                    } else {
                        currFrame = 0;
                    }

                }

                try {
                    currImage.setImage(images.get(currFrame).getImage());
                } catch(java.lang.IndexOutOfBoundsException err) {
                    System.err.println("Empty animation.\n");
                }
            }
        }, 0, animationDelay);
        }
    }
    
    public void stop() {
        if(isRunning) {
            isRunning = false;

            timer.cancel();
            timer.purge();
        }
    }
    
    public ImageIcon getAnimation() {
        return currImage;
    }
    
    public void addImage(ImageIcon img) {
        images.add(img);
    }
}
