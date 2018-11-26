package SpaceInvaders.Objects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;

public class Enemy extends GameObject
{
    private int r;

    public Enemy(float x, float y, int speed, int life, int damage) throws IOException
    {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.life = life;
        this.damage = damage;

        this.id = ID.ENEMY;
        this.velX = 0;
        this.velY = 0;
        this.width = 50;
        this.height = 50;
        this.box = new Rectangle((int) this.x + 10, (int) this.y + 10, this.width - 20, this.height - 20);

        //  random skin for enemy
        r = (int) (Math.random() * 5 + 1);

        if (r == 1)
        {
            this.image = ImageIO.read(getClass().getResource("/spaceshipenemy.png"));
        } else if (r == 2)
        {
            this.image = ImageIO.read(getClass().getResource("/enemyblue.png"));
        } else if (r == 3)
        {
            this.image = ImageIO.read(getClass().getResource("/enemygrey.png"));
        } else if (r == 4)
        {
            this.image = ImageIO.read(getClass().getResource("/enemyred.png"));
        } else if (r == 5)
        {
            this.image = ImageIO.read(getClass().getResource("/enemyyellow.png"));
        }
    }

    @Override
    public void tick()
    {
        this.y += speed;
    }

    @Override
    public void render(Graphics g)
    {
        //g.setColor(Color.red);
        //g.fillRect((int) this.x, (int) this.y, this.width, this.height);
        g.drawImage(this.image, (int) this.x, (int) this.y, null);
    }

}
