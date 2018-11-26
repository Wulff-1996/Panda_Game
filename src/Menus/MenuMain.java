package Menus;

import Main.Game;
import Main.GameState;
import SpaceInvaders.Game.GAMESTATE;
import SpaceInvaders.Game.KeyInput;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import static Main.GameState.*;

public class MenuMain extends MenuObject
{
    public MenuMain(JFrame frame, Game game) throws IOException
    {
        super(frame, game);

        //  set text for headline and underline
        this.headLine.setText("MAIN MENU");
        this.underLine.setText("-SELECT GAME MODE");

        //  set pictures
        this.getB1().setBackground(Color.BLACK);
        this.getB2().setBackground(Color.BLACK);
        this.getB3().setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/spaceinvadersPic.png"))));
        this.getB4().setBackground(Color.BLACK);

        //  set foreground white
        this.getB1().setForeground(Color.white);
        this.getB2().setForeground(Color.white);
        this.getB4().setForeground(Color.white);

        //  set text
        this.getB1().setText("UNDER CONSTRUCTION");
        this.getB2().setText("UNDER CONSTRUCTION");
        this.getB4().setText("UNDER CONSTRUCTION");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //if (e.getSource() == this.b1 ||  e.getSource() == this.b2 || e.getSource() == this.b3 || e.getSource() == this.b4) { this.setVisible(false); }

        //  select game-----------------------

        //  if pacman is selected
        //if (e.getSource() == this.b1) { game.setGameState(GameState.PACMAN); }
        // if (e.getSource() == this.b2) { game.setGameState(GameState.MARIO); }

        if (e.getSource() == this.b3)
        {
            //  set main menu not visible
            this.setVisible(false);

            //  set up game
            game.setGameState(GameState.SPACEINVADERS);
            game.getSpaceInvaders().getMenuHome().setVisible(true);
            game.addKeyListener(game.getSpaceInvaders().getKeyInput());


            //if (e.getSource() == this.b4) { game.setGameState(GameState.DONKEYKONG); }

        }
    }
}
