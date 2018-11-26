package SpaceInvaders.Menus;

import Main.GameState;
import SpaceInvaders.Game.GAMESTATE;
import SpaceInvaders.Levels.Level;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;

public class MenuPlayAgain extends JPanel implements ActionListener
{
    private final int WIDTH = 1200, HEIGHT = 800;

    private SpaceInvaders.Game.Game spaceInvaders;

    private JLabel dead, win, skillPoints;

    private JButton homeMenu, playAgain;

    private Font font;

    public MenuPlayAgain(JFrame jFrame, SpaceInvaders.Game.Game spaceInvaders)
    {
        this.spaceInvaders = spaceInvaders;

        //  set size of the panel
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));

        //  create Font
        this.font = new Font("Times New Roman", Font.BOLD, 30);

        //  create labels
        this.dead = new JLabel();
        this.dead.setFont(font);
        this.dead.setForeground(Color.white);
        this.dead.setBackground(Color.BLACK);
        this.dead.setOpaque(true);
        this.dead.setText("DEAD");
        this.dead.setBounds(600, 400, 400, 50);

        this.win = new JLabel();
        this.win.setFont(font);
        this.win.setForeground(Color.white);
        this.win.setBackground(Color.BLACK);
        this.win.setOpaque(true);
        this.win.setText("LEVEL COMPLETED");
        this.win.setBounds(600, 400, 400, 50);

        this.skillPoints = new JLabel();
        this.skillPoints.setFont(font);
        this.skillPoints.setForeground(Color.white);
        this.skillPoints.setBackground(Color.BLACK);
        this.skillPoints.setOpaque(true);
        this.skillPoints.setText("SKILL POINTS +"); //  + level.getSkillPoints();
        this.skillPoints.setBounds(600, 500, 400, 50);

        //  create buttons
        this.playAgain = new JButton();
        this.playAgain.setForeground(Color.white);
        this.playAgain.setBackground(Color.black);
        this.playAgain.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.playAgain.setText("PLAY AGAIN");
        this.playAgain.setBounds(600, 600, 250, 50);

        this.homeMenu = new JButton();
        this.homeMenu.setForeground(Color.white);
        this.homeMenu.setBackground(Color.black);
        this.homeMenu.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.homeMenu.setText("HOME MENU");
        this.homeMenu.setBounds(900, 600, 250, 50);

        //  add buttonlistener
        this.playAgain.addActionListener(this);
        this.homeMenu.addActionListener(this);

        //  add component to the panel
        this.add(this.dead);
        this.add(this.win);
        this.add(this.skillPoints);
        this.add(this.playAgain);
        this.add(this.homeMenu);

        //  set components to not visible
        this.dead.setVisible(false);
        this.win.setVisible(false);
        this.skillPoints.setVisible(false);
        this.playAgain.setVisible(false);
        this.homeMenu.setVisible(false);

        //  add to frame
        jFrame.add(dead);
        jFrame.add(win);
        jFrame.add(skillPoints);
        jFrame.add(playAgain);
        jFrame.add(homeMenu);
    }

    public void setVisible(boolean isVisible)
    {
        if (isVisible)
        {
            this.dead.setVisible(true);
            this.win.setVisible(true);
            this.skillPoints.setVisible(true);
            this.playAgain.setVisible(true);
            this.homeMenu.setVisible(true);
        }
        if (!isVisible)
        {
            this.dead.setVisible(false);
            this.win.setVisible(false);
            this.skillPoints.setVisible(false);
            this.playAgain.setVisible(false);
            this.homeMenu.setVisible(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //  play level again
        if (e.getSource() == this.playAgain)
        {
            //  set not visible
            this.setVisible(false);

            //  if won set player skillpoint
            if (spaceInvaders.getLevel().isLevelCompleted())
            {
                spaceInvaders.getPlayer().setSkillPoints(
                        spaceInvaders.getPlayer().getSkillPoints() + spaceInvaders.getLevel().getSkillPoints());
            }

            //  set level to new level
            Level tempLevel = spaceInvaders.getLevel();

            try
            {
                spaceInvaders.setLevel(new Level(
                        spaceInvaders,
                        tempLevel.getLevelState(),
                        tempLevel.getSkillPoints(),
                        tempLevel.getWavesE(),
                        tempLevel.getWavesB(),
                        tempLevel.getMaxE(),
                        tempLevel.getMaxB(),
                        tempLevel.getDefaultE(),
                        tempLevel.getDefaultB(),
                        tempLevel.getLifeE(),
                        tempLevel.getSpeedE(),
                        tempLevel.getDamageE(),
                        tempLevel.getLifeB(),
                        tempLevel.getSpeedB(),
                        tempLevel.getDamageB()));
            } catch (CloneNotSupportedException | IOException e1)
            {
                e1.printStackTrace();
            }

            //  set not visible
            this.setVisible(false);

            //  change gamestate to space and play
            spaceInvaders.getMainGame().setGameState(GameState.SPACEINVADERS);
            spaceInvaders.setGamestate(GAMESTATE.PLAY);
        }

        //  return to home menu
        else if (e.getSource() == this.homeMenu)
        {
            this.setVisible(false);

            if (spaceInvaders.getLevel().isLevelCompleted())
            {
                spaceInvaders.getPlayer().setSkillPoints(spaceInvaders.getPlayer().getSkillPoints() +
                        spaceInvaders.getLevel().getSkillPoints());
            }
            //  change gamestate to menuhome
            spaceInvaders.setGamestate(GAMESTATE.MENUHOME);
            spaceInvaders.getMenuHome().setVisible(true);
        }
    }

    public JLabel getDead()
    {
        return dead;
    }

    public void setDead(JLabel dead)
    {
        this.dead = dead;
    }

    public JLabel getWin()
    {
        return win;
    }

    public void setWin(JLabel win)
    {
        this.win = win;
    }

    public JButton getHomeMenu()
    {
        return homeMenu;
    }

    public void setHomeMenu(JButton homeMenu)
    {
        this.homeMenu = homeMenu;
    }

    public JButton getPlayAgain()
    {
        return playAgain;
    }

    public void setPlayAgain(JButton playAgain)
    {
        this.playAgain = playAgain;
    }

    public JLabel getSkillPoints()
    {
        return skillPoints;
    }

    public void setSkillPoints(JLabel skillPoints)
    {
        this.skillPoints = skillPoints;
    }
}
