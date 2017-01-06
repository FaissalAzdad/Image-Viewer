package imageviewer;

import imageviewer.control.NextImageCommand;
import imageviewer.control.PrevImageCommand;
import imageviewer.model.Image;
import imageviewer.persistence.ImageLoader;
import imageviewer.persistence.files.FileImageLoader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        ImageLoader imageLoader = new FileImageLoader("images");
        MainFrame mainFrame = new MainFrame();
        mainFrame.add(new NextImageCommand(mainFrame.getImageDisplay()));
        mainFrame.add(new PrevImageCommand(mainFrame.getImageDisplay()));
        mainFrame.getImageDisplay().display(imageLoader.load());
    }
    
}
