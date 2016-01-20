import greenfoot.*; 
import java.util.List;

/**
 * I am trying to create a break out game where instead of bricks and a ball its zombies and bullets
 * I keep having problems spawing the zombies in and text saying "Zombies incoming" at the start of every round, "the dead have claimed you" when you lose, and "Zombies killed... again, Ready fow wave 2?" when you win.
 * Code I need help on is cut out in blue.
 */



/**
 * The game board. The board had a paddle that can move.
 * 
 * @author Danny Van Bonn
 * @version 1.0
 */
public class Board extends World
{   
   private int numBullets =0;
   private Message message = null;
   
   private Paddle paddle;
    /**
     * Constructor for objects of class Board.
     * 
     */
    public Board()
    {    
        super(460, 520, 1);
        setPaintOrder ( Bullet.class, Smoke.class, Zombie.class );
        
        paddle = new Paddle();
        addObject ( paddle, getWidth() / 2, getHeight() - 40);
    }
    
    public int getNumBullets() {return numBullets;}
    
    public void newBullet()
    {
        numBullets++;
        if (numBullets > 3)
        {
            message.setText("Game over... The dead have claimed you...");
            Greenfoot.stop();
        }
        else
        {
            message.setText("Bullet " + numBullets);
        }
    }
    public void checkIfWon()
    {
         List zombieList = this.getObjects(Zombie.class);
        if (zombieList.size() == 0)
        {
            message.setText("The Zombies are dead... Again... Ready for round 2?");
            Greenfoot.stop();
        }
    }
        
    public void bulletIsOut()
    {
        paddle.newBullet();
    }
    public void setUpBreakout()
    {
        message = new Message("Zombies incoming!");
        newBullet();
    }
 
}

