package SpaceInvaders.Game;

import SpaceInvaders.Objects.GameObject;

public class Collision
{

    public static boolean collision(GameObject temp, GameObject temp2)
    {
        boolean isCollision = false;
        //  check for collision
        if (temp.getBounds().intersects(temp2.getBounds()))
        {
            //  collision is true
            isCollision = true;
        }
        return isCollision;
    }
}
