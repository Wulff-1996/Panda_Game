package SpaceInvaders.Menus;

import Main.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;

import static javax.imageio.ImageIO.read;

public class MenuUpgrade extends JPanel implements ActionListener
{

    //  game object
    private SpaceInvaders.Game.Game gameSpaceInvaders;

    public static final int width = Game.WIDTH, height = Game.HEIGHT;

    //  labels
    private JLabel headLine, underLine;

    //  label for showing skillPoints
    private JLabel skillPoints;

    //  labels for player stats
    private JLabel plife, pspeed, mSpeed, mDamage;

    // picture of the caractar
    private JLabel carackterLabel;
    private ImageIcon carackterImage;

    //  buttons
    private JButton blife, bspeed, bMspeed, bMdamage, slife, sspeed, sMspeed, sMdamage, bHomeMenu;

    //
    private JLabel background;
    private ImageIcon backPic;

    public MenuUpgrade(JFrame frame, SpaceInvaders.Game.Game gameSpaceInvaders) throws IOException
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
        this.headLine.setText("UPGRADE");

        //  set underLine
        this.underLine = new JLabel();
        this.underLine.setBounds(100, 90, 400, 40);
        this.underLine.setForeground(Color.WHITE);
        this.underLine.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.underLine.setText("-BUY UPGRADES BY SKILL POINTS");

        //  set skillPoints label
        this.skillPoints = new JLabel();
        this.skillPoints.setBounds(100, 200, 400, 40);
        this.skillPoints.setForeground(Color.WHITE);
        this.skillPoints.setFont(new Font("Times New Roman", Font.BOLD, 40));
        this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());

        //  set carackter image
        this.carackterImage = new ImageIcon(read(getClass().getResource("/upgradePic.png")));

        //  set caracter label
        this.carackterLabel = new JLabel();
        this.carackterLabel.setBounds(100, 300, 300, 400);
        this.carackterLabel.setIcon(carackterImage);

        //  caracter stats labels
        this.plife = new JLabel();
        this.plife.setBounds(450, 300, 350, 40);
        this.plife.setForeground(Color.WHITE);
        this.plife.setFont(new Font("Times New Roman", Font.BOLD, 30));
        this.plife.setText("PLAYER LIFE: " + gameSpaceInvaders.getPlayer().getLife());

        this.pspeed = new JLabel();
        this.pspeed.setBounds(450, 400, 350, 40);
        this.pspeed.setForeground(Color.WHITE);
        this.pspeed.setFont(new Font("Times New Roman", Font.BOLD, 30));
        this.pspeed.setText("PLAYER SPEED: " + gameSpaceInvaders.getPlayer().getSpeed());

        this.mSpeed = new JLabel();
        this.mSpeed.setBounds(450, 500, 350, 40);
        this.mSpeed.setForeground(Color.WHITE);
        this.mSpeed.setFont(new Font("Times New Roman", Font.BOLD, 30));
        this.mSpeed.setText("MISSILE SPEED: " + gameSpaceInvaders.getPlayer().getMissileSpeed());

        this.mDamage = new JLabel();
        this.mDamage.setBounds(450, 600, 350, 40);
        this.mDamage.setForeground(Color.WHITE);
        this.mDamage.setFont(new Font("Times New Roman", Font.BOLD, 30));
        this.mDamage.setText("MISSILE DAMAGE: " + gameSpaceInvaders.getPlayer().getMissileDamage());


        //  buttons
        this.blife = new JButton();
        this.blife.setForeground(Color.white);
        this.blife.setFont(new Font("Times New Roman", Font.BOLD, 35));
        this.blife.setText("BUY");
        this.blife.setOpaque(false);
        this.blife.setContentAreaFilled(false);
        this.blife.setBounds(800, 300, 150, 50);

        this.slife = new JButton();
        this.slife.setForeground(Color.white);
        this.slife.setFont(new Font("Times New Roman", Font.BOLD, 35));
        this.slife.setText("SELL");
        this.slife.setOpaque(false);
        this.slife.setContentAreaFilled(false);
        this.slife.setBounds(950, 300, 150, 50);

        this.bspeed = new JButton();
        this.bspeed.setForeground(Color.white);
        this.bspeed.setFont(new Font("Times New Roman", Font.BOLD, 35));
        this.bspeed.setText("BUY");
        this.bspeed.setOpaque(false);
        this.bspeed.setContentAreaFilled(false);
        this.bspeed.setBounds(800, 400, 150, 50);

        this.sspeed = new JButton();
        this.sspeed.setForeground(Color.white);
        this.sspeed.setFont(new Font("Times New Roman", Font.BOLD, 35));
        this.sspeed.setText("SELL");
        this.sspeed.setOpaque(false);
        this.sspeed.setContentAreaFilled(false);
        this.sspeed.setBounds(950, 400, 150, 50);

        this.bMspeed = new JButton();
        this.bMspeed.setForeground(Color.white);
        this.bMspeed.setFont(new Font("Times New Roman", Font.BOLD, 35));
        this.bMspeed.setText("BUY");
        this.bMspeed.setOpaque(false);
        this.bMspeed.setContentAreaFilled(false);
        this.bMspeed.setBounds(800, 500, 150, 50);

        this.sMspeed = new JButton();
        this.sMspeed.setForeground(Color.white);
        this.sMspeed.setFont(new Font("Times New Roman", Font.BOLD, 35));
        this.sMspeed.setText("SELL");
        this.sMspeed.setOpaque(false);
        this.sMspeed.setContentAreaFilled(false);
        this.sMspeed.setBounds(950, 500, 150, 50);

        this.bMdamage = new JButton();
        this.bMdamage.setForeground(Color.white);
        this.bMdamage.setFont(new Font("Times New Roman", Font.BOLD, 35));
        this.bMdamage.setText("BUY");
        this.bMdamage.setOpaque(false);
        this.bMdamage.setContentAreaFilled(false);
        this.bMdamage.setBounds(800, 600, 150, 50);

        this.sMdamage = new JButton();
        this.sMdamage.setForeground(Color.white);
        this.sMdamage.setFont(new Font("Times New Roman", Font.BOLD, 35));
        this.sMdamage.setText("SELL");
        this.sMdamage.setOpaque(false);
        this.sMdamage.setContentAreaFilled(false);
        this.sMdamage.setBounds(950, 600, 150, 50);

        this.bHomeMenu = new JButton();
        this.bHomeMenu.setForeground(Color.white);
        this.bHomeMenu.setFont(new Font(("Times New Roman"), Font.BOLD, 20));
        this.bHomeMenu.setText("HOME MENU");
        this.bHomeMenu.setBackground(Color.black);
        this.bHomeMenu.setOpaque(false);
        this.bHomeMenu.setContentAreaFilled(false);
        this.bHomeMenu.setBounds(900, 30, 200, 50);

        // set actionlistener
        this.bspeed.addActionListener(this);
        this.sspeed.addActionListener(this);
        this.blife.addActionListener(this);
        this.slife.addActionListener(this);
        this.bMspeed.addActionListener(this);
        this.sMspeed.addActionListener(this);
        this.bMdamage.addActionListener(this);
        this.sMdamage.addActionListener(this);
        this.bHomeMenu.addActionListener(this);

        //  add to the panel
        this.add(background);
        this.add(headLine);
        this.add(underLine);
        this.add(skillPoints);
        this.add(plife);
        this.add(pspeed);
        this.add(mSpeed);
        this.add(mDamage);
        this.add(carackterLabel);
        this.add(bspeed);
        this.add(sspeed);
        this.add(blife);
        this.add(slife);
        this.add(bMspeed);
        this.add(sMspeed);
        this.add(bMdamage);
        this.add(sMdamage);
        this.add(bHomeMenu);


        //  set not visible
        this.bspeed.setVisible(false);
        this.sspeed.setVisible(false);
        this.blife.setVisible(false);
        this.slife.setVisible(false);
        this.bMspeed.setVisible(false);
        this.sMspeed.setVisible(false);
        this.bMdamage.setVisible(false);
        this.sMdamage.setVisible(false);
        this.bHomeMenu.setVisible(false);
        this.background.setVisible(false);
        this.headLine.setVisible(false);
        this.underLine.setVisible(false);
        this.skillPoints.setVisible(false);
        this.carackterLabel.setVisible(false);
        this.plife.setVisible(false);
        this.pspeed.setVisible(false);
        this.mSpeed.setVisible(false);
        this.mDamage.setVisible(false);

        //  add components to the frame
        frame.add(headLine);
        frame.add(underLine);
        frame.add(carackterLabel);
        frame.add(skillPoints);
        frame.add(plife);
        frame.add(pspeed);
        frame.add(mSpeed);
        frame.add(mDamage);
        frame.add(bspeed);
        frame.add(sspeed);
        frame.add(blife);
        frame.add(slife);
        frame.add(bMspeed);
        frame.add(sMspeed);
        frame.add(bMdamage);
        frame.add(sMdamage);
        frame.add(bHomeMenu);
        frame.add(background);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //  back to home menu -------------------------------------------------------------------
        if (e.getSource() == this.bHomeMenu)
        {
            this.setVisible(false);
            gameSpaceInvaders.getMenuHome().setVisible(true);
        }

        //  buy ----------------------------------------------------------------------------------
        if (gameSpaceInvaders.getPlayer().getSkillPoints() > 0)
        {
            if (e.getSource() == this.blife)
            {
                gameSpaceInvaders.getPlayer().setLife(gameSpaceInvaders.getPlayer().getLife() + 1);
                gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - 1);
                this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
                this.plife.setText("PLAYER LIFE: " + gameSpaceInvaders.getPlayer().getLife());
            }
            if (e.getSource() == this.bspeed)
            {
                gameSpaceInvaders.getPlayer().setSpeed(gameSpaceInvaders.getPlayer().getSpeed() + 1);
                gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - 1);
                this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
                this.pspeed.setText("PLAYER SPEED: " + gameSpaceInvaders.getPlayer().getSpeed());
            }
            if (e.getSource() == this.bMspeed)
            {
                gameSpaceInvaders.getPlayer().setMissileSpeed((int) ((float) gameSpaceInvaders.getPlayer().getMissileSpeed() + 1));
                gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - 1);
                this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
                this.mSpeed.setText("MISSILE SPEED: " + gameSpaceInvaders.getPlayer().getMissileSpeed());
            }
            if (e.getSource() == this.bMdamage)
            {
                gameSpaceInvaders.getPlayer().setMissileDamage(gameSpaceInvaders.getPlayer().getMissileDamage() + 1);
                gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - 1);
                this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
                this.mDamage.setText("MISSILE DAMAGE: " + gameSpaceInvaders.getPlayer().getMissileDamage());
            }
        }

        //  sell-------------------------------------------------------------------------
        if (e.getSource() == this.slife && gameSpaceInvaders.getPlayer().getLife() > 1)
        {
            gameSpaceInvaders.getPlayer().setLife(gameSpaceInvaders.getPlayer().getLife() - 1);
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() + 1);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.plife.setText("PLAYER LIFE: " + gameSpaceInvaders.getPlayer().getLife());
        }
        if (e.getSource() == this.sspeed && gameSpaceInvaders.getPlayer().getSpeed() > 1)
        {
            gameSpaceInvaders.getPlayer().setSpeed(gameSpaceInvaders.getPlayer().getSpeed() - 1);
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() + 1);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.pspeed.setText("PLAYER SPEED: " + gameSpaceInvaders.getPlayer().getSpeed());
        }
        if (e.getSource() == this.sMspeed && gameSpaceInvaders.getPlayer().getMissileSpeed() > 1)
        {
            gameSpaceInvaders.getPlayer().setMissileSpeed((gameSpaceInvaders.getPlayer().getMissileSpeed() - 1));
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() + 1);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.mSpeed.setText("MISSILE SPEED: " + gameSpaceInvaders.getPlayer().getMissileSpeed());
        }
        if (e.getSource() == this.sMdamage && gameSpaceInvaders.getPlayer().getMissileDamage() > 1)
        {
            gameSpaceInvaders.getPlayer().setMissileDamage(gameSpaceInvaders.getPlayer().getMissileDamage() - 1);
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() + 1);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.mDamage.setText("MISSILE DAMAGE: " + gameSpaceInvaders.getPlayer().getMissileDamage());
        }

    }

    public void setVisible(boolean visible)
    {
        if (visible)
        {
            this.bspeed.setVisible(true);
            this.sspeed.setVisible(true);
            this.blife.setVisible(true);
            this.slife.setVisible(true);
            this.bMspeed.setVisible(true);
            this.sMspeed.setVisible(true);
            this.bMdamage.setVisible(true);
            this.sMdamage.setVisible(true);
            this.bHomeMenu.setVisible(true);
            this.background.setVisible(true);
            this.headLine.setVisible(true);
            this.underLine.setVisible(true);
            this.plife.setVisible(true);
            this.pspeed.setVisible(true);
            this.mSpeed.setVisible(true);
            this.mDamage.setVisible(true);
            this.carackterLabel.setVisible(true);
            this.skillPoints.setVisible(true);
        }
        if (!visible)
        {
            this.bspeed.setVisible(false);
            this.sspeed.setVisible(false);
            this.blife.setVisible(false);
            this.slife.setVisible(false);
            this.bMspeed.setVisible(false);
            this.sMspeed.setVisible(false);
            this.bMdamage.setVisible(false);
            this.sMdamage.setVisible(false);
            this.bHomeMenu.setVisible(false);
            this.background.setVisible(false);
            this.headLine.setVisible(false);
            this.underLine.setVisible(false);
            this.plife.setVisible(false);
            this.pspeed.setVisible(false);
            this.mSpeed.setVisible(false);
            this.mDamage.setVisible(false);
            this.carackterLabel.setVisible(false);
            this.skillPoints.setVisible(false);

        }
    }

    public JLabel getSkillPoints()
    {
        return skillPoints;
    }

    public void setSkillPoints(String text)
    {
        this.skillPoints.setText(text);
    }

    public JLabel getPlife()
    {
        return plife;
    }

    public void setPlife(String text)
    {
        this.plife.setText(text);
    }

    public JLabel getPspeed()
    {
        return pspeed;
    }

    public void setPspeed(String text)
    {
        this.pspeed.setText(text);
    }

    public JLabel getmSpeed()
    {
        return mSpeed;
    }

    public void setmSpeed(String text)
    {
        this.mSpeed.setText(text);
    }

    public JLabel getmDamage()
    {
        return mDamage;
    }

    public void setmDamage(String text)
    {
        this.mDamage.setText(text);
    }
}
