import greenfoot.*;

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    public void act() 
    {
    fall();
    } 
private void fall(){
setLocation(getX(),getY()+1);
}
}
