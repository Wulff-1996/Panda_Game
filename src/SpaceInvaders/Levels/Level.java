package SpaceInvaders.Levels;

import SpaceInvaders.Game.Game;
import SpaceInvaders.Game.Handler;
import SpaceInvaders.Objects.Block;
import SpaceInvaders.Objects.Enemy;
import SpaceInvaders.Objects.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import java.util.Random;

public class Level
{
    //  spaceinvaders games object
    private Game spaceinvaders;
    private Player subPlayer;
    private Random r;

    //  level states
    private boolean isDead;
    private boolean isLevelCompleted;

    //  level background
    private BufferedImage backGround;

    //  skillpoints bonus
    private int skillPoints;

    //  id level
    private LevelState levelState;

    //  waves
    private int wavesE;
    private int wavesB;
    private int waveECount;
    private int waveBCount;

    //  enemies and blocks count
    private int maxE;
    private int maxB;
    private int defaultE;
    private int defaultB;

    //  enemy level (life, speed, damage)
    private int lifeE;
    private int speedE;
    private int damageE;

    //  Blocks level (life, speed, damage)
    private int lifeB;
    private int speedB;
    private int damageB;


    public Level(Game spaceInvaders, LevelState levelstate,
                 int skillPoints, int wavesE, int wavesB,
                 int maxE, int maxB,
                 int defaultE,
                 int defaultB,
                 int lifeE, int speedE, int damageE, int lifeB, int speedB, int damageB) throws CloneNotSupportedException, IOException
    {
        this.isDead = false;
        this.isLevelCompleted = false;

        //  game values
        this.spaceinvaders = spaceInvaders;
        this.spaceinvaders.setHandler(new Handler());
        this.levelState = levelstate;

        //  set sub player = game.getPlayer
        this.subPlayer = (Player) spaceInvaders.getPlayer().clone();


        this.r = new Random();
        this.backGround = ImageIO.read(getClass().getResource("/spacebackground.png"));
        this.skillPoints = skillPoints;
        this.wavesE = wavesE;
        this.waveECount = 1;
        this.waveBCount = 1;
        this.wavesB = wavesB;
        this.maxE = maxE;
        this.maxB = maxB;
        this.defaultE = defaultE;
        this.defaultB = defaultB;

        //  enemy level
        this.lifeE = lifeE;
        this.speedE = speedE;
        this.damageE = damageE;

        //  block level
        this.lifeB = lifeB;
        this.speedB = speedB;
        this.damageB = damageB;


        //  add objects to the handler-----------------

        //  add subplayer
        this.spaceinvaders.getHandler().add(this.subPlayer);

        //  create default enemies
        createEnemies(this.defaultE, this.lifeE, this.speedE, this.damageE);

        //  create default blocks
        createBlocks(this.defaultB, this.lifeB, this.speedB, this.damageB);
    }

    public void createEnemies(int defaultE, int lifeE, int speedE, int damageE) throws IOException
    {
        for (int i = 0; i < defaultE; i++)
        {
            this.spaceinvaders.getHandler().add(new Enemy((this.r.nextInt(1200 - 50) + 1),
                    r.nextInt(600) - 1000,
                    speedE, lifeE, damageE));
        }
    }

    public void createBlocks(int defaultB, int lifeB, int speedB, int damageB) throws IOException
    {
        for (int i = 0; i < defaultB; i++)
        {
            this.spaceinvaders.getHandler().add(new Block((this.r.nextInt(1200 - 50) + 1),
                    r.nextInt(200) - 1000,
                    lifeB, speedB, damageB));
        }
    }

    public void tick() throws IOException
    {
        //  play game while level is not completed and realPlayer is not dead
        if (!this.isLevelCompleted && !this.isDead)
        {
            spaceinvaders.getHandler().tick();

            //  if no enemies -> next wave
            if (!this.spaceinvaders.getHandler().containsE() &&
                    this.wavesE > this.waveECount)
            {
                //  update
                this.waveECount++;
                this.defaultE++;

                //  default can not be more than max
                if (defaultE >= maxE)
                {
                    defaultE = maxE;
                }

                //  create new wave of enemies
                createEnemies(defaultE, this.lifeE, this.speedE, this.damageE);
            }

            //  if no blocks -> next wave
            if (!this.spaceinvaders.getHandler().containsB() &&
                    this.wavesB > this.waveBCount)
            {
                //  update
                this.waveBCount++;
                this.defaultB++;

                //  default can not be more than max
                if (defaultB >= maxB)
                {
                    defaultB = maxB;
                }

                //  create new wave of enemies
                createBlocks(defaultB, this.lifeB, this.speedB, this.damageB);
            }
        }

        //  check for dead player
        if (this.subPlayer.getLife() <= 0)
        {
            this.isDead = true;
        }

        //  check for level completed
        //  else if players life is over 0 then player won the level
        if (this.wavesE == this.waveECount &&
                !this.spaceinvaders.getHandler().containsE() &&
                this.subPlayer.getLife() > 0)
        {
            this.isLevelCompleted = true;
        }


        //  dead/level complete -> show play again buttons
        if (this.isDead || this.isLevelCompleted)
        {
            //  show play again buttons
            spaceinvaders.getMenuPlayAgain().getHomeMenu().setVisible(true);
            spaceinvaders.getMenuPlayAgain().getPlayAgain().setVisible(true);

            if (isDead)
            {
                //  show dead label
                spaceinvaders.getMenuPlayAgain().getDead().setVisible(true);
            }

            //  update mainPlayer skillPoints
            if (this.isLevelCompleted)
            {
                //  show win label
                spaceinvaders.getMenuPlayAgain().getWin().setVisible(true);
                spaceinvaders.getMenuPlayAgain().getSkillPoints().setText("SKILL POINTS +" + this.skillPoints);
                spaceinvaders.getMenuPlayAgain().getSkillPoints().setVisible(true);

                //  update the level is completed
                if (this.levelState == LevelState.LEVEL1)
                {
                    spaceinvaders.setLevel1(true);
                }
                if (this.levelState == LevelState.LEVEL2)
                {
                    spaceinvaders.setLevel2(true);
                }
                if (this.levelState == LevelState.LEVEL3)
                {
                    spaceinvaders.setLevel3(true);
                }
                if (this.levelState == LevelState.LEVEL4)
                {
                    spaceinvaders.setLevel4(true);
                }
                if (this.levelState == LevelState.LEVEL5)
                {
                    spaceinvaders.setLevel5(true);
                }
                if (this.levelState == LevelState.LEVEL6)
                {
                    spaceinvaders.setLevel6(true);
                }
                if (this.levelState == LevelState.LEVEL7)
                {
                    spaceinvaders.setLevel7(true);
                }
                if (this.levelState == LevelState.LEVEL8)
                {
                    spaceinvaders.setLevel8(true);
                }
                if (this.levelState == LevelState.LEVEL9)
                {
                    spaceinvaders.setLevel9(true);
                }
            }
        }
    }

    public void render(Graphics g)
    {
        if (!this.isLevelCompleted && !this.isDead)
        {
            g.drawImage(this.backGround, 0, 0, null);

            //  draw fps
            g.setColor(Color.white);
            g.drawString("FPS: " + String.valueOf(spaceinvaders.getMainGame().getFps()), 30, 30);

            //  level stats
            g.drawString("E LIFE: " + this.lifeE, 30, 100);
            g.drawString("E SPEED: " + this.speedE, 30, 120);
            g.drawString("E DAMAGE: " + this.damageE, 30, 140);
            g.drawString("R LIFE: " + this.lifeB, 30, 160);
            g.drawString("R SPEED: " + this.speedB, 30, 180);
            g.drawString("R DAMAGE: KO", 30, 200);

            //  draw wave count
            g.setColor(Color.WHITE);
            g.setFont(new Font("Times New Roman", Font.BOLD, 30));
            g.drawString("WAVE: " + this.waveECount + "/" + this.wavesE, 30, 700);
            g.drawString("P LIFES: " + this.subPlayer.getLife(), 30, 750);

            //  render all objects
            this.spaceinvaders.getHandler().render(g);
        }
    }

    public int getSkillPoints()
    {
        return skillPoints;
    }

    public int getWavesE()
    {
        return wavesE;
    }

    public int getWavesB()
    {
        return wavesB;
    }

    public int getMaxE()
    {
        return maxE;
    }

    public int getMaxB()
    {
        return maxB;
    }

    public int getDefaultE()
    {
        return defaultE;
    }

    public int getDefaultB()
    {
        return defaultB;
    }

    public int getLifeE()
    {
        return lifeE;
    }

    public int getSpeedE()
    {
        return speedE;
    }

    public int getDamageE()
    {
        return damageE;
    }

    public Random getR()
    {
        return r;
    }

    public int getWaveECount()
    {
        return waveECount;
    }

    public int getWaveBCount()
    {
        return waveBCount;
    }

    public int getLifeB()
    {
        return lifeB;
    }

    public int getSpeedB()
    {
        return speedB;
    }

    public int getDamageB()
    {
        return damageB;
    }

    public Player getSubPlayer()
    {
        return subPlayer;
    }

    public void setSubPlayer(Player subPlayer)
    {
        this.subPlayer = subPlayer;
    }

    public LevelState getLevelState()
    {
        return levelState;
    }

    public void setLevelState(LevelState levelState)
    {
        this.levelState = levelState;
    }

    public boolean isLevelCompleted()
    {
        return isLevelCompleted;
    }
}
