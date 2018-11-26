package Main;

import Menus.*;
import SpaceInvaders.Game.KeyInput;
import SpaceInvaders.Menus.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.io.IOException;
import java.io.Serializable;

public class Game extends Canvas implements Runnable
{
    //  window data
    public static final int WIDTH = 1200, HEIGHT = 800;
    private static final String TITLE = "Panda Adventures";

    //  JFrame
    private JFrame frame;

    //  running tools
    private volatile boolean running = false;
    private Thread gameThread;

    //  frames per second
    private int frames;
    private int fps = 0;

    //  listeners
    private KeyListener keyListener;

    //  games
    private SpaceInvaders.Game.Game spaceInvaders;
    //private PacmMan.Game.Game pacMan;
    //private Mario.Game.Game mario
    //private DOnkeyKong.Game.Game donkeyKong

    //  main menu
    private Menus.MenuMain menuMain;

    //  game state
    private GameState gameState;


    public void init()
    {
        //  will initialize the game start

        //  set game state
        gameState = GameState.MENUMAIN;

        //  set main menu to visible
        this.menuMain.setVisible(true);
    }

    public void run()
    {
        init();
        long lastTime = System.nanoTime();
        final double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int updates = 0;
        frames = 0;
        long timer = System.currentTimeMillis();
        while (running)
        {
            // gameLoop
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1)
            {
                try
                {
                    tick();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
                updates++;
                delta--;
            }
            render();
            frames++; // fps

            if (System.currentTimeMillis() - timer > 1000)
            {
                timer += 1000;
                System.out.println(updates + " Ticks, FPS " + frames);
                fps = frames;
                updates = 0;
                frames = 0;
            }
        }
        //  stops the game
        stop();
    }

    private void tick() throws IOException   // everything that updates in the game, fix amount of time, 60 per sec
    {
        //  games-----------------------------------------------------------

        //  spaceinvaders
        if (gameState == GameState.SPACEINVADERS)
        {
            spaceInvaders.tick();
        }

        //

    }

    private void render()  // everything in the game that renders, as fast as the computer can render
    {
        BufferStrategy bs = this.getBufferStrategy(); // is null to begin with

        //  create the buffer only once
        if (bs == null)
        {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        //////////////////////////////////////////////////

        //  games--------------------------
        //  SPACEINVADERS
        if (gameState == GameState.SPACEINVADERS)
        {
            spaceInvaders.render(g);
        }

        //  PACMAN
        //if (gameState == GameState.PACMAN) {/* pacman.render(g)*/;}

        //  MARIO
        //if (gameState == GameState.MARIO) {/*mario.render(g)*/;}

        //  DUNKEYKONG
        //if (gameState == GameState.DONKEYKONG) {/*donkeykong.render(g)*/;}

        //////////drawing field ///////////////////////////////
        g.dispose(); // get rid of everything
        bs.show();  // show the rendered buffered images
    }

    public synchronized void start()
    {
        // dont start if game is already running
        if (running)
        {
            return;
        }

        running = true;
        gameThread = new Thread(this);
        gameThread.start();

    }

    public synchronized void stop()
    {
        // dont play if already stopped
        if (!running)
        {
            return;
        }

        running = false;
        try
        {
            gameThread.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.exit(1);
    }

    public static void main(String args[]) throws IOException
    {
        Game game = new Game();

        game.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        game.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        game.setMaximumSize(new Dimension(WIDTH, HEIGHT));

        //  create new frame
        game.setFrame(new JFrame(getTITLE()));


        //  menus----------------------------
        game.menuMain = new MenuMain(game.getFrame(), game);

        //  spaceinvaders---
        game.spaceInvaders = new SpaceInvaders.Game.Game(game);
        game.spaceInvaders.setMenuHome(new MenuHome(game.getFrame(), game.spaceInvaders));
        game.spaceInvaders.setMenuPlay(new MenuPlay(game.getFrame(), game.spaceInvaders));
        game.spaceInvaders.setMenuPlayAgain(new MenuPlayAgain(game.getFrame(), game.spaceInvaders));
        game.spaceInvaders.setMenuUpgrade(new MenuUpgrade(game.getFrame(), game.spaceInvaders));
        game.spaceInvaders.setMenuCustomize(new MenuCustomize(game.getFrame(), game.spaceInvaders));
        game.spaceInvaders.setMenuHelp(new MenuHelp(game.getFrame(), game.spaceInvaders));
        //  spaceinvaders---

        //  menus-----------------------------


        // add the game to the frame
        game.getFrame().add(game);  // add panel to the frame

        game.getFrame().pack();
        game.getFrame().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // exit by redx
        game.getFrame().setLocationRelativeTo(null); // centers the window
        game.getFrame().setResizable(false); // cannot resize the game window

        game.getFrame().setVisible(true); // show the window

        //start game
        game.start();
    }

    //  getters and setters

    public static int getWIDTH()
    {
        return WIDTH;
    }

    public static int getHEIGHT()
    {
        return HEIGHT;
    }


    public JFrame getFrame()
    {
        return frame;
    }

    public void setFrame(JFrame frame)
    {
        this.frame = frame;
    }

    public void setGameState(GameState gameState)
    {
        this.gameState = gameState;
    }

    public static String getTITLE()
    {
        return TITLE;
    }

    public SpaceInvaders.Game.Game getSpaceInvaders()
    {
        return spaceInvaders;
    }

    public MenuMain getMenuMain()
    {
        return menuMain;
    }

    public int getFps()
    {
        return fps;
    }

    public void setKeyListener(KeyListener keyListener)
    {
        this.keyListener = keyListener;
    }
}
