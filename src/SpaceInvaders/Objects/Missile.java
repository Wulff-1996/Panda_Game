package SpaceInvaders.Objects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;

public class Missile extends GameObject
{
    public Missile(float x, float y, int damage, int speed, BufferedImage image) throws IOException
    {
        this.id = ID.MISSILE;
        this.image = image;

        this.x = x;
        this.y = y;
        this.velX = 0;
        this.velY = 0;
        this.width = 10;
        this.height = 20;
        this.box = new Rectangle((int) this.x + 2, (int) this.y + 3, this.width - 4, this.height - 6);

        this.box = new Rectangle((int) this.x, (int) this.y, this.width, this.height);
        this.speed = speed;
        this.life = 1;
        this.damage = damage;
    }

    @Override
    public void tick()
    {
        this.y -= this.speed;
    }

    @Override
    public void render(Graphics g)
    {
        //g.setColor(Color.orange);
        //g.fillRect((int) this.x, (int) this.y, this.width, this.height);
        g.drawImage(this.image, (int) this.x, (int) this.y, null);
    }
}
