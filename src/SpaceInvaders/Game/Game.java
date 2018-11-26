package SpaceInvaders.Game;

import SpaceInvaders.Levels.Level;
import SpaceInvaders.Menus.*;
import SpaceInvaders.Objects.Missile;
import SpaceInvaders.Objects.Player;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;

public class Game
{
    private Main.Game mainGame;
    private Player player;
    private BufferedImage missileImage;
    private Handler handler;
    private Level level;
    private KeyInput keyInput;
    private GAMESTATE gamestate;

    //  menus
    private MenuHome menuHome;
    private MenuPlay menuPlay;
    private MenuPlayAgain menuPlayAgain;
    private MenuUpgrade menuUpgrade;
    private MenuCustomize menuCustomize;
    private MenuHelp menuHelp;

    //  levels completed?
    private boolean isLevel1 = false;
    private boolean isLevel2 = false;
    private boolean isLevel3 = false;
    private boolean isLevel4 = false;
    private boolean isLevel5 = false;
    private boolean isLevel6 = false;
    private boolean isLevel7 = false;
    private boolean isLevel8 = false;
    private boolean isLevel9 = false;

    public Game(Main.Game mainGame) throws IOException
    {
        this.mainGame = mainGame;
        this.player = new Player();
        this.handler = new Handler();
        this.keyInput = new KeyInput(this);
        this.missileImage = ImageIO.read(getClass().getResource("/missile01.gif"));
    }

    public void tick() throws IOException
    {
        //  update level
        if (gamestate == GAMESTATE.PLAY)
        {
            level.tick();
        }
    }

    public void render(Graphics g)
    {
        //  draw level
        if (gamestate == GAMESTATE.PLAY)
        {
            level.render(g);
        }
    }


    //  getters and setters
    public Player getPlayer()
    {
        return player;
    }

    public Handler getHandler()
    {
        return handler;
    }

    public void setHandler(Handler handler)
    {
        this.handler = handler;
    }

    public MenuHome getMenuHome()
    {
        return menuHome;
    }

    public void setMenuHome(MenuHome menuHome)
    {
        this.menuHome = menuHome;
    }

    public void setGamestate(GAMESTATE gamestate)
    {
        this.gamestate = gamestate;
    }

    public KeyInput getKeyInput()
    {
        return keyInput;
    }

    public Main.Game getMainGame()
    {
        return mainGame;
    }

    public Level getLevel()
    {
        return level;
    }

    public void setLevel(Level level)
    {
        this.level = level;
    }

    public MenuPlay getMenuPlay()
    {
        return menuPlay;
    }

    public void setMenuPlay(MenuPlay menuPlay)
    {
        this.menuPlay = menuPlay;
    }

    public MenuPlayAgain getMenuPlayAgain()
    {
        return menuPlayAgain;
    }

    public void setMenuPlayAgain(MenuPlayAgain menuPlayAgain)
    {
        this.menuPlayAgain = menuPlayAgain;
    }

    public boolean isLevel1()
    {
        return isLevel1;
    }

    public void setLevel1(boolean level1)
    {
        isLevel1 = level1;
    }

    public boolean isLevel2()
    {
        return isLevel2;
    }

    public void setLevel2(boolean level2)
    {
        isLevel2 = level2;
    }

    public boolean isLevel3()
    {
        return isLevel3;
    }

    public void setLevel3(boolean level3)
    {
        isLevel3 = level3;
    }

    public boolean isLevel4()
    {
        return isLevel4;
    }

    public void setLevel4(boolean level4)
    {
        isLevel4 = level4;
    }

    public boolean isLevel5()
    {
        return isLevel5;
    }

    public void setLevel5(boolean level5)
    {
        isLevel5 = level5;
    }

    public boolean isLevel6()
    {
        return isLevel6;
    }

    public void setLevel6(boolean level6)
    {
        isLevel6 = level6;
    }

    public boolean isLevel7()
    {
        return isLevel7;
    }

    public void setLevel7(boolean level7)
    {
        isLevel7 = level7;
    }

    public boolean isLevel8()
    {
        return isLevel8;
    }

    public void setLevel8(boolean level8)
    {
        isLevel8 = level8;
    }

    public boolean isLevel9()
    {
        return isLevel9;
    }

    public void setLevel9(boolean level9)
    {
        isLevel9 = level9;
    }

    public MenuUpgrade getMenuUpgrade()
    {
        return menuUpgrade;
    }

    public void setMenuUpgrade(MenuUpgrade menuUpgrade)
    {
        this.menuUpgrade = menuUpgrade;
    }

    public MenuCustomize getMenuCustomize()
    {
        return menuCustomize;
    }

    public void setMenuCustomize(MenuCustomize menuCustomize)
    {
        this.menuCustomize = menuCustomize;
    }

    public BufferedImage getMissileImage()
    {
        return missileImage;
    }

    public void setMissileImage(BufferedImage missileimage)
    {
        this.missileImage = missileimage;
    }

    public MenuHelp getMenuHelp()
    {
        return menuHelp;
    }

    public void setMenuHelp(MenuHelp menuHelp)
    {
        this.menuHelp = menuHelp;
    }
}
