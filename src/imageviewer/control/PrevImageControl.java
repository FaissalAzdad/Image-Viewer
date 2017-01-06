package imageviewer.control;

import imageviewer.ui.ImageDisplay;

public class PrevImageControl implements Command{

    private final ImageDisplay imageDisplay;
    
    public PrevImageControl(ImageDisplay imageDisplay){
        this.imageDisplay = imageDisplay;
    }

    @Override
    public String name() {
        return "prev";
    }

    @Override
    public void execute() {
        imageDisplay.display(imageDisplay.currentImage().prev());
    }
    
}
