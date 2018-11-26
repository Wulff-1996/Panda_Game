package SpaceInvaders.Objects;

import SpaceInvaders.Objects.ID;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.Serializable;

public abstract class GameObject
{
    protected float x, y;
    protected float velX, velY;
    protected int width, height;
    protected Rectangle box;
    protected BufferedImage image;
    protected ID id;
    protected int speed;
    protected int life;
    protected int damage;

    //  realPlayer constructor
    public GameObject()
    {
        this.id = null;
        this.image = null;
        this.x = 0;
        this.y = 0;
        this.velX = 0;
        this.velY = 0;
        this.width = 0;
        this.height = 0;
        this.box = null;
        this.speed = 0;
        this.life = 0;
        this.damage = 0;
    }

    //  methods
    public abstract void tick();

    public abstract void render(Graphics g);

    //  getters and setters
    public float getX()
    {
        return x;
    }

    public void setX(float x)
    {
        this.x = x;
    }

    public float getY()
    {
        return y;
    }

    public void setY(float y)
    {
        this.y = y;
    }

    public float getVelX()
    {
        return velX;
    }

    public void setVelX(float velX)
    {
        this.velX = velX;
    }

    public float getVelY()
    {
        return velY;
    }

    public void setVelY(float velY)
    {
        this.velY = velY;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public BufferedImage getImage()
    {
        return image;
    }

    public void setImage(BufferedImage image)
    {
        this.image = image;
    }

    public ID getId()
    {
        return id;
    }

    public void setId(ID id)
    {
        this.id = id;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public int getLife()
    {
        return life;
    }

    public void setLife(int life)
    {
        this.life = life;
    }

    public int getDamage()
    {
        return damage;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    public Rectangle getBox()
    {
        return box;
    }

    public void setBox(Rectangle box)
    {
        this.box = box;
    }

    public Rectangle getBounds()
    {
        return new Rectangle((int) this.x, (int) this.y, this.width, this.height);
    }
}
