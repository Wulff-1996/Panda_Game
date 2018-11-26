package SpaceInvaders.Objects;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import static javax.imageio.ImageIO.read;

public class Player extends GameObject implements Cloneable
{
    private int skillPoints;
    private int missileSpeed;
    private int missileDamage;

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }


    public Player() throws IOException
    {
        //  only realPlayer fields
        this.skillPoints = 0;
        this.missileSpeed = 20;
        this.missileDamage = 1;

        //  default entity fields
        this.x = 600;
        this.y = 700;
        this.velX = 0;
        this.velY = 0;
        this.image = ImageIO.read(getClass().getResource("/spaceship02.png"));
        this.id = ID.PLAYER;
        this.speed = 5;
        this.life = 1;
        this.damage = 1;
        this.width = 50;
        this.height = 75;
        this.box = new Rectangle((int) this.x + 10, (int) this.y + 10, this.width - 20, this.height - 20);
    }


    @Override
    public void tick()
    {
        //  movement
        this.x += velX;
        this.y += velY;

        //  limit Player to the frame
        if (this.x <= 0)
        {
            this.x = 0;
        } else if (this.x > 1200 - this.width)
        {
            this.x = 1200 - this.width;
        }
        if (this.y <= 0)
        {
            this.y = 0;
        } else if (this.y > 800 - this.width)
        {
            this.y = 800 - this.width;
        }
    }

    @Override
    public void render(Graphics g)
    {
        g.drawImage(this.image, (int) this.x, (int) this.y, null);
    }

    //  getters and setters
    public int getSkillPoints()
    {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints)
    {
        this.skillPoints = skillPoints;
    }

    public int getMissileSpeed()
    {
        return missileSpeed;
    }

    public void setMissileSpeed(int missileSpeed)
    {
        this.missileSpeed = missileSpeed;
    }

    public int getMissileDamage()
    {
        return missileDamage;
    }

    public void setMissileDamage(int missileDamage)
    {
        this.missileDamage = missileDamage;
    }
}
