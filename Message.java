import greenfoot.*;
import java.awt.Font;
import java.awt.Color;
/**
 * The message class holds a text message 
 * 
 * @author 
 * @version 
 */
public class Message extends Actor
{
   /** holds the text of the message */
    private String text;
    
    /** the width of the message area */
    private int width = 408;
    
    /** the height of the message area */
    private int height = 70;
    /** 
     * Constructor that takes the text to display
     */
    public Message(String theText)
    {
        text = theText;
        updateImage();
    }
    
    /**
     * Constructor that takes the text to display, the width,
     * and the height
     */
    public Message(String theText, int theWidth, int theHeight)
    {
        text = theText;
        width = theWidth;
        height = theHeight;
        updateImage();
    }
    
    /**
     * Method to change the text in this message
     */
    public void setText(String theText)
    { 
        text = theText;
        updateImage();
    }
    
    /** 
     * Messages don't do anything when asked to act
     */
    public void act() 
    {}

    /**
     * Method to create and set the image for this message
     * Invoke this method when the text changes, the width changes, and/or
     * the height changes
     */
    private void updateImage()
    {
        Font font = new Font("Helvetica",Font.BOLD,20);
        GreenfootImage image = new GreenfootImage(width,height);
        image.setFont(font);
        image.clear();
        image.setColor(Color.BLACK);
        image.drawString(text, 5, height / 2);
        setImage(image);
    }  
}