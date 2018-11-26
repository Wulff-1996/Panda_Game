package SpaceInvaders.Game;

import SpaceInvaders.Objects.GameObject;
import SpaceInvaders.Objects.ID;

import java.awt.*;
import java.util.LinkedList;

import static SpaceInvaders.Game.Collision.collision;

public class Handler
{
    private LinkedList<GameObject> objects = new LinkedList<>();
    private int r;  //  to generate random numbers

    public void tick()
    {
        GameObject temp;
        GameObject temp2;

        for (int i = 0; i < objects.size(); i++)
        {
            temp = objects.get(i);
            temp.tick();

            //  remove missile when out of the frame
            if (temp.getId() == ID.MISSILE && temp.getY() <= -20)
            {
                this.objects.remove(temp);
            }

            //  if enemy or block reach the button of the frame
            if (temp.getId() == ID.ENEMY && temp.getY() > 800 ||
                    temp.getId() == ID.BLOCK && temp.getY() > 800)
            {
                temp.setY(-500);
                r = (int) (Math.random() * 1200 - 50 + 1);
                temp.setX(r);
            }


            //  check if temp is colliding with temp2
            for (int j = 0; j < objects.size(); j++)
            {
                temp2 = objects.get(j);

                if (collision(temp, temp2))
                {
                    //  if missile hit enemy
                    if (temp.getId() == ID.MISSILE &&
                            temp2.getId() == ID.ENEMY)
                    {
                        //  calculate enemys life from missiles damage
                        temp2.setLife(temp2.getLife() - temp.getDamage());

                        //  remove missile when colliding
                        this.objects.remove(temp);
                    }

                    //  if missile hits block
                    if (temp.getId() == ID.MISSILE &&
                            temp2.getId() == ID.BLOCK)
                    {
                        //  remove block
                        temp2.setLife(temp2.getLife() - temp.getDamage());

                        //  remove missile when colliding
                        this.objects.remove(temp);
                    }

                    //  if realPlayer hits enemy
                    if (temp.getId() == ID.PLAYER &&
                            temp2.getId() == ID.ENEMY)
                    {
                        //  update realPlayer life
                        temp.setLife(temp.getLife() - temp2.getDamage());

                        //  remove enemy when hit
                        objects.remove(temp2);
                    }

                    //  if realPlayer hits block
                    if (temp.getId() == ID.PLAYER &&
                            temp2.getId() == ID.BLOCK)
                    {
                        //  update players life
                        temp.setLife(0);
                    }

                    //  blocks and enemies change direction if they collide
                    if (temp.getId() == ID.BLOCK && temp2.getId() == ID.BLOCK ||
                            temp.getId() == ID.BLOCK && temp2.getId() == ID.ENEMY ||
                            temp.getId() == ID.ENEMY && temp2.getId() == ID.ENEMY)
                    {

                    }
                }

                //  if enemys life is 0
                if (temp2.getId() == ID.ENEMY && temp2.getLife() <= 0)
                {
                    this.objects.remove(temp2);
                }

                //  if blocks life is 0
                if (temp2.getId() == ID.BLOCK && temp2.getLife() <= 0)
                {
                    this.objects.remove(temp2);
                }
            }
        }
    }

    public void render(Graphics g)
    {
        GameObject temp;

        for (int i = 0; i < objects.size(); i++)
        {
            temp = objects.get(i);
            temp.render(g);
        }
    }

    //  methods
    public boolean containsE()
    {
        boolean containsE = false;

        for (int i = 0; i < this.objects.size(); i++)
        {
            GameObject temp = this.objects.get(i);

            if (temp.getId() == ID.ENEMY)
            {
                containsE = true;
                return containsE;
            }
        }
        return containsE;
    }

    public boolean containsB()
    {
        boolean containsB = true;

        for (int i = 0; i < this.objects.size(); i++)
        {
            GameObject temp = this.objects.get(i);

            if (temp.getId() == ID.BLOCK)
            {
                containsB = false;
            }
        }
        return containsB;
    }

    public void add(GameObject object)
    {
        this.objects.add(object);
    }

}


    /*
    //  methods not in use  (afraid to delete them)
    public void remove(GameObject object)
    {
        this.objects.remove(object);
    }
    public int getSize()
    {
        return this.objects.size();
    }
    public Player getPlayer()
    {
        Player player = null;
        for (int i = 0; i <this.objects.size() ; i++)
        {
            GameObject temp = this.objects.get(i);
            if (temp.getId() == ID.PLAYER)
            {
                player = (Player) this.objects.get(i);
            }
        }
        return player;
    }
}

*/
