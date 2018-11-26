package SpaceInvaders.Menus;

import Main.Game;
import SpaceInvaders.Game.GAMESTATE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;

import static javax.imageio.ImageIO.*;

public class MenuHome extends JPanel implements ActionListener
{
    //  game object
    private SpaceInvaders.Game.Game gameSpaceInvaders;

    public static final int width = Game.WIDTH, height = Game.HEIGHT;

    //  labels
    private JLabel headLine, underLine;

    //  buttons
    private JButton bplay, bUpgrade, bCustomize, bLoad, bSave, bHelp, bMainMenu;

    //  pictures
    private JLabel gameLabel;

    //
    private JLabel background;
    private ImageIcon backPic;

    //  image for gamelabel
    private ImageIcon gamePic;

    public MenuHome(JFrame frame, SpaceInvaders.Game.Game gameSpaceInvaders) throws IOException
    {
        //  use for button actions
        this.gameSpaceInvaders = gameSpaceInvaders;

        //  set size of the panel
        this.setPreferredSize(new Dimension(width, height));
        this.setMaximumSize(new Dimension(width, height));
        this.setMinimumSize(new Dimension(width, height));

        //  background picture
        this.backPic = new ImageIcon(read(getClass().getResource("/spacebackground.png")));

        //  background image
        this.background = new JLabel();
        this.background.setBounds(0, 0, 1300, 900);
        this.background.setIcon(backPic);

        //  set headLine
        this.headLine = new JLabel();
        this.headLine.setBounds(100, 30, 750, 60);
        this.headLine.setForeground(Color.WHITE);
        this.headLine.setFont(new Font("Times New Roman", Font.BOLD, 60));
        this.headLine.setText("SPACE PANDA");

        //  set underLine
        this.underLine = new JLabel();
        this.underLine.setBounds(100, 90, 300, 40);
        this.underLine.setForeground(Color.WHITE);
        this.underLine.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.underLine.setText("-ALIEN INVASION");

        //  create imageicon to the gameLabem
        this.gamePic = new ImageIcon(read(getClass().getResource("/spaceGamePic.png")));

        //  set gameLabel
        this.gameLabel = new JLabel();
        this.gameLabel.setBounds(100, 200, 500, 500);
        this.gameLabel.setIcon(gamePic);

        //  set buttons
        //         bplay (900, 200, 200, 100);
        //         bupgrade(900, 400, 200, 100);
        //         bhelp(900, 600, 200, 100);
        //         bmainmenu(900, 30, 200, 50);

        this.bplay = new JButton();
        this.bplay.setForeground(Color.white);
        this.bplay.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.bplay.setText("PLAY");
        this.bplay.setBackground(Color.BLACK);
        this.bplay.setOpaque(false);
        this.bplay.setContentAreaFilled(false);
        this.bplay.setBounds(700, 200, 400, 50);

        this.bUpgrade = new JButton();
        this.bUpgrade.setForeground(Color.white);
        this.bUpgrade.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.bUpgrade.setText("UPGRADE");
        this.bUpgrade.setBackground(Color.white);
        this.bUpgrade.setOpaque(false);
        this.bUpgrade.setContentAreaFilled(false);
        //this.bUpgrade.setBorderPainted(false);
        this.bUpgrade.setBounds(700, 283, 400, 50);

        this.bCustomize = new JButton();
        this.bCustomize.setForeground(Color.white);
        this.bCustomize.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.bCustomize.setText("CUSTOMIZE");
        this.bCustomize.setBackground(Color.white);
        this.bCustomize.setOpaque(false);
        this.bCustomize.setContentAreaFilled(false);
        this.bCustomize.setBounds(700, 366, 400, 50);

        this.bSave = new JButton();
        this.bSave.setForeground(Color.white);
        this.bSave.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.bSave.setText("SAVE");
        this.bSave.setBackground(Color.white);
        this.bSave.setOpaque(false);
        this.bSave.setContentAreaFilled(false);
        this.bSave.setBounds(700, 449, 400, 50);

        this.bLoad = new JButton();
        this.bLoad.setForeground(Color.white);
        this.bLoad.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.bLoad.setText("LOAD");
        this.bLoad.setBackground(Color.white);
        this.bLoad.setOpaque(false);
        this.bLoad.setContentAreaFilled(false);
        this.bLoad.setBounds(700, 532, 400, 50);

        this.bHelp = new JButton();
        this.bHelp.setForeground(Color.white);
        this.bHelp.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.bHelp.setText("HELP");
        this.bHelp.setBackground(Color.white);
        this.bHelp.setOpaque(false);
        this.bHelp.setContentAreaFilled(false);
        this.bHelp.setBounds(700, 615, 400, 50);

        this.bMainMenu = new JButton();
        this.bMainMenu.setForeground(Color.white);
        this.bMainMenu.setFont(new Font(("Times New Roman"), Font.BOLD, 20));
        this.bMainMenu.setText("MAIN MENU");
        this.bMainMenu.setBackground(Color.white);
        this.bMainMenu.setOpaque(false);
        this.bMainMenu.setContentAreaFilled(false);
        this.bMainMenu.setBounds(900, 30, 200, 50);

        //  set actionlisteners to the buttons
        this.bplay.addActionListener(this);
        this.bUpgrade.addActionListener(this);
        this.bHelp.addActionListener(this);
        this.bMainMenu.addActionListener(this);
        this.bCustomize.addActionListener(this);
        this.bSave.addActionListener(this);
        this.bLoad.addActionListener(this);


        //  add components to the panel
        this.add(headLine);
        this.add(underLine);
        this.add(bplay);
        this.add(bUpgrade);
        this.add(bHelp);
        this.add(bMainMenu);
        this.add(gameLabel);
        this.add(bCustomize);
        this.add(bSave);
        this.add(bLoad);
        this.add(background);

        //  set components to not visible
        this.bplay.setVisible(false);
        this.bUpgrade.setVisible(false);
        this.bHelp.setVisible(false);
        this.bMainMenu.setVisible(false);
        this.headLine.setVisible(false);
        this.underLine.setVisible(false);
        this.gameLabel.setVisible(false);
        this.bCustomize.setVisible(false);
        this.bLoad.setVisible(false);
        this.bSave.setVisible(false);
        this.background.setVisible(false);


        //  add to frame
        frame.add(headLine);
        frame.add(underLine);
        frame.add(bplay);
        frame.add(bUpgrade);
        frame.add(bHelp);
        frame.add(bMainMenu);
        frame.add(gameLabel);
        frame.add(bCustomize);
        frame.add(bSave);
        frame.add(bLoad);
        frame.add(background);
    }

    //  actions for buttons
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //  remove component from the screen
        if (e.getSource() == this.bplay || e.getSource() == this.bUpgrade ||
                e.getSource() == this.bMainMenu || e.getSource() == this.bCustomize ||
                e.getSource() == this.bHelp)
        {
            this.setVisible(false);

            //  switch to new menu
            if (e.getSource() == this.bplay)
            {
                gameSpaceInvaders.getMenuPlay().setVisible(true);

                //  set is level complete visible
                if (gameSpaceInvaders.isLevel1())
                {
                    gameSpaceInvaders.getMenuPlay().getS1().setVisible(true);
                }
                if (gameSpaceInvaders.isLevel2())
                {
                    gameSpaceInvaders.getMenuPlay().getS2().setVisible(true);
                }
                if (gameSpaceInvaders.isLevel3())
                {
                    gameSpaceInvaders.getMenuPlay().getS3().setVisible(true);
                }
                if (gameSpaceInvaders.isLevel4())
                {
                    gameSpaceInvaders.getMenuPlay().getS4().setVisible(true);
                }
                if (gameSpaceInvaders.isLevel5())
                {
                    gameSpaceInvaders.getMenuPlay().getS5().setVisible(true);
                }
                if (gameSpaceInvaders.isLevel6())
                {
                    gameSpaceInvaders.getMenuPlay().getS6().setVisible(true);
                }
                if (gameSpaceInvaders.isLevel7())
                {
                    gameSpaceInvaders.getMenuPlay().getS7().setVisible(true);
                }
                if (gameSpaceInvaders.isLevel8())
                {
                    gameSpaceInvaders.getMenuPlay().getS8().setVisible(true);
                }
                if (gameSpaceInvaders.isLevel9())
                {
                    gameSpaceInvaders.getMenuPlay().getS9().setVisible(true);
                }

            }


            if (e.getSource() == this.bUpgrade)
            {
                gameSpaceInvaders.getMenuUpgrade().setVisible(true);

                //  set player stats
                gameSpaceInvaders.getMenuUpgrade().setSkillPoints("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
                gameSpaceInvaders.getMenuUpgrade().setPlife("PLAYER LIFE: " + gameSpaceInvaders.getPlayer().getLife());
                gameSpaceInvaders.getMenuUpgrade().setPspeed("PLAYER SPEED: " + gameSpaceInvaders.getPlayer().getSpeed());
                gameSpaceInvaders.getMenuUpgrade().setmSpeed("MISSILE SPEED: " + gameSpaceInvaders.getPlayer().getMissileSpeed());
                gameSpaceInvaders.getMenuUpgrade().setmDamage("MISSILE DAMAGE: " + gameSpaceInvaders.getPlayer().getMissileDamage());
            }

            if (e.getSource() == this.bCustomize)
            {
                gameSpaceInvaders.getMenuCustomize().setVisible(true);

                //  set player stats
                gameSpaceInvaders.getMenuCustomize().setSkillPoints(
                        ("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints()));
            }

            if (e.getSource() == this.bHelp)
            {
                gameSpaceInvaders.getMenuHelp().setVisible(true);
            }


            if (e.getSource() == this.bMainMenu)
            {
                gameSpaceInvaders.setGamestate(GAMESTATE.MENUHOME);
                gameSpaceInvaders.getMainGame().getMenuMain().setVisible(true);
                gameSpaceInvaders.getMainGame().setKeyListener(null);
            }
        }
    }


    //  set this visible or not
    public void setVisible(boolean isVisible)
    {
        if (isVisible)
        {
            //  set the whole panel to visible
            this.bplay.setVisible(true);
            this.bUpgrade.setVisible(true);
            this.bHelp.setVisible(true);
            this.bMainMenu.setVisible(true);
            this.headLine.setVisible(true);
            this.underLine.setVisible(true);
            this.gameLabel.setVisible(true);
            this.bCustomize.setVisible(true);
            this.bLoad.setVisible(true);
            this.bSave.setVisible(true);
            this.background.setVisible(true);
        }
        if (!isVisible)
        {
            //  set not visible
            this.bplay.setVisible(false);
            this.bUpgrade.setVisible(false);
            this.bHelp.setVisible(false);
            this.bMainMenu.setVisible(false);
            this.headLine.setVisible(false);
            this.underLine.setVisible(false);
            this.gameLabel.setVisible(false);
            this.bCustomize.setVisible(false);
            this.bLoad.setVisible(false);
            this.bSave.setVisible(false);
            this.background.setVisible(false);
        }
    }

    //  getters and setters
    protected JLabel getHeadLine()
    {
        return headLine;
    }

    protected void setHeadLine(String text)
    {
        this.headLine.setText(text);
    }

    protected JLabel getUnderLine()
    {
        return underLine;
    }

    protected void setUnderLine(String text)
    {
        this.underLine.setText(text);
    }

    protected JButton getBplay()
    {
        return bplay;
    }

    protected void setBplay(JButton bplay)
    {
        this.bplay = bplay;
    }

    protected JButton getbUpgrade()
    {
        return bUpgrade;
    }

    protected void setbUpgrade(JButton bUpgrade)
    {
        this.bUpgrade = bUpgrade;
    }

    protected JButton getbHelp()
    {
        return bHelp;
    }

    protected void setbHelp(JButton bHelp)
    {
        this.bHelp = bHelp;
    }

    protected JButton getbMainMenu()
    {
        return bMainMenu;
    }

    protected void setbMainMenu(JButton bMainMenu)
    {
        this.bMainMenu = bMainMenu;
    }

    public void setHeadLine(JLabel headLine)
    {
        this.headLine = headLine;
    }

    public void setUnderLine(JLabel underLine)
    {
        this.underLine = underLine;
    }

    public JLabel getGameLabel()
    {
        return gameLabel;
    }

    public void setGameLabel(JLabel gameLabel)
    {
        this.gameLabel = gameLabel;
    }
}
