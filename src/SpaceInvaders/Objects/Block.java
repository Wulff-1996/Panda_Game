package SpaceInvaders.Objects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;

public class Block extends GameObject
{
    private int r;

    public Block(float x, float y, int life, int speed, int damage) throws IOException
    {
        this.id = ID.BLOCK;
        this.image = ImageIO.read(getClass().getResource("/rock.png"));
        this.x = x;
        this.y = y;
        this.velX = 0;
        this.velY = 0;
        this.width = 50;
        this.height = 50;
        this.box = new Rectangle((int) this.x + 10, (int) this.y + 10, this.width - 20, this.height - 20);
        this.speed = speed;
        this.life = life;
        this.damage = damage;

    }

    @Override
    public void tick()
    {
        this.y += this.speed;
    }

    @Override
    public void render(Graphics g)
    {
        g.drawImage(this.image, (int) this.x, (int) this.y, null);
    }
}
