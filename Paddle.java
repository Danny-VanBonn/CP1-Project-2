import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game paddle. It is keyboard controlled (left, right, space). It also 
 * generates a new bullet when it is created itself.
 * 
 * @author 
 * @version 1.0
 */
public class Paddle extends Actor
{
    private Bullet myBullet;  // used before bullet gets released

    /**
     * When the paddle gets created, create a bullet as well.
     */
    public void addedToWorld(World world)
    {
        newBullet();
    }
    
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown ("left")){
            move(-9);
        }
        if (Greenfoot.isKeyDown ("right")){
            move(9);
        }
        if (Greenfoot.isKeyDown ("a")){
            move(-9);
        }
        if (Greenfoot.isKeyDown ("d")){
            move(9);
        }
        if (haveBullet() && Greenfoot.isKeyDown ("space")) {
            releaseBullet();
        }
        
    }
    
    public void move(int dist)
    {
        setLocation (getX() + dist, getY());
        if (myBullet != null) {
            myBullet.move (dist);
        }
    }
    
    public void newBullet()
    {
        myBullet = new Bullet();
        getWorld().addObject (myBullet, getX(), getY()-35);
    }
        
    public boolean haveBullet()
    {
        return myBullet != null;
    }
        
    public void releaseBullet()
    {
        myBullet.release();
        myBullet = null;
    }
        
}
