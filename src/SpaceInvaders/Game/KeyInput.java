package SpaceInvaders.Game;

import SpaceInvaders.Objects.Missile;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.Serializable;

public class KeyInput implements KeyListener
{
    private boolean isShooting = false;
    private Game game;

    public KeyInput(Game game)
    {
        //  space panda game object
        this.game = game;
    }


    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            this.game.getLevel().getSubPlayer().setVelX(this.game.getPlayer().getSpeed());
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            this.game.getLevel().getSubPlayer().setVelX(-(this.game.getPlayer().getSpeed()));
        }

        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
            this.game.getLevel().getSubPlayer().setVelY(-(this.game.getPlayer().getSpeed()));
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            this.game.getLevel().getSubPlayer().setVelY((this.game.getPlayer().getSpeed()));
        }

        if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            if (!this.isShooting())
            {
                try
                {
                    this.game.getHandler().add(new Missile((
                            this.game.getLevel().getSubPlayer().getX()) +
                            (this.game.getLevel().getSubPlayer().getWidth() / 2) - 5,
                            (this.game.getLevel().getSubPlayer().getY() - 20),
                            this.game.getLevel().getSubPlayer().getMissileDamage(),
                            this.game.getLevel().getSubPlayer().getMissileSpeed(), this.game.getMissileImage()));
                } catch (IOException e1)
                {
                    e1.printStackTrace();
                }
                this.isShooting = true;
            }
        }
    }

    public void keyReleased(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            this.game.getLevel().getSubPlayer().setVelX(0);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            this.game.getLevel().getSubPlayer().setVelX(0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP)
        {
            this.game.getLevel().getSubPlayer().setVelY(0);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            this.game.getLevel().getSubPlayer().setVelY(0);
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            this.isShooting = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    public boolean isShooting()
    {
        return isShooting;
    }
}
