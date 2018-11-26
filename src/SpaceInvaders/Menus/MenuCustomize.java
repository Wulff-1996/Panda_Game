package SpaceInvaders.Menus;

import Main.Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

public class MenuCustomize extends JPanel implements ActionListener
{

    //  game object
    private SpaceInvaders.Game.Game gameSpaceInvaders;

    public static final int width = Game.WIDTH, height = Game.HEIGHT;

    //  labels
    private JLabel headLine, underLine;

    //  label for showing skillPoints
    private JLabel skillPoints;

    //  labels for players missile and ships
    private JLabel missile1, missile2, missile3, missile4, missile5, missile6;
    private JLabel ship1, ship2, ship3, ship4, ship5, ship6;

    // pictures of missile and ships
    private ImageIcon m1, m2, m3, m4, m5, m6;
    private ImageIcon s1, s2, s3, s4, s5, s6;

    //  buttons
    private JButton bm2, bm3, bm4, bm5, em1, em2, em3, em4, em5;
    private JButton bs2, bs3, bs4, bs5, es1, es2, es3, es4, es5;
    private JButton bHomeMenu;

    //  cost
    private static int cm2 = 3, cm3 = 5, cm4 = 8, cm5 = 10;
    private static int cs2 = 3, cs3 = 5, cs4 = 8, cs5 = 10;

    //  buy state
    private boolean isboughtm2 = false, isboughtm3 = false, isboughtm4 = false, isboughtm5 = false,
            isIsboughts2 = false, isIsboughts3 = false, isIsboughts4 = false, isIsboughts5 = false;

    //  labels for showing cost of the skins
    private JLabel priceM2, priceM3, priceM4, priceM5, prices2, prices3, prices4, prices5;

    //
    private JLabel background;
    private ImageIcon backPic;

    public MenuCustomize(JFrame frame, SpaceInvaders.Game.Game gameSpaceInvaders) throws IOException
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
        this.headLine.setBounds(100, 30, 900, 60);
        this.headLine.setForeground(Color.WHITE);
        this.headLine.setFont(new Font("Times New Roman", Font.BOLD, 60));
        this.headLine.setText("CUSTOMIZE");

        //  set underLine
        this.underLine = new JLabel();
        this.underLine.setBounds(100, 90, 600, 40);
        this.underLine.setForeground(Color.WHITE);
        this.underLine.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.underLine.setText("-BUY OR EQUIPT SKINS");

        //  set skillPoints label
        this.skillPoints = new JLabel();
        this.skillPoints.setBounds(100, 200, 400, 40);
        this.skillPoints.setForeground(Color.WHITE);
        this.skillPoints.setFont(new Font("Times New Roman", Font.BOLD, 40));
        this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());

        //  set pictures
        this.m1 = new ImageIcon(ImageIO.read(getClass().getResource("/missile01.gif")));
        this.m2 = new ImageIcon(ImageIO.read(getClass().getResource("/missile01.gif")));
        this.m3 = new ImageIcon(ImageIO.read(getClass().getResource("/whitemissile.png")));
        this.m4 = new ImageIcon(ImageIO.read(getClass().getResource("/yellowmissile.png")));
        this.m5 = new ImageIcon(ImageIO.read(getClass().getResource("/greenmissile.png")));
        this.m6 = new ImageIcon(ImageIO.read(getClass().getResource("/blue missile.png")));
        this.s1 = new ImageIcon(ImageIO.read(getClass().getResource("/spaceship02.png")));
        this.s2 = new ImageIcon(ImageIO.read(getClass().getResource("/spaceship02.png")));
        this.s3 = new ImageIcon(ImageIO.read(getClass().getResource("/yellowspaceship.png")));
        this.s4 = new ImageIcon(ImageIO.read(getClass().getResource("/pastelspaceship.png")));
        this.s5 = new ImageIcon(ImageIO.read(getClass().getResource("/spaceship.png")));
        this.s6 = new ImageIcon(ImageIO.read(getClass().getResource("/purplespaceship.png")));


        //  label for pictures
        this.missile1 = new JLabel();
        this.missile1.setIcon(m1);
        this.missile1.setBounds(100, 300, 10, 20);

        this.missile2 = new JLabel();
        this.missile2.setIcon(m2);
        this.missile2.setBounds(300, 300, 10, 20);

        this.missile3 = new JLabel();
        this.missile3.setIcon(m3);
        this.missile3.setBounds(400, 300, 10, 20);

        this.missile4 = new JLabel();
        this.missile4.setIcon(m4);
        this.missile4.setBounds(500, 300, 10, 20);

        this.missile5 = new JLabel();
        this.missile5.setIcon(m5);
        this.missile5.setBounds(600, 300, 10, 20);

        this.missile6 = new JLabel();
        this.missile6.setIcon(m6);
        this.missile6.setBounds(700, 300, 10, 20);

        this.ship1 = new JLabel();
        this.ship1.setIcon(s1);
        this.ship1.setBounds(100, 500, 50, 75);

        this.ship2 = new JLabel();
        this.ship2.setIcon(s2);
        this.ship2.setBounds(300, 500, 50, 75);

        this.ship3 = new JLabel();
        this.ship3.setIcon(s3);
        this.ship3.setBounds(400, 500, 50, 75);

        this.ship4 = new JLabel();
        this.ship4.setIcon(s4);
        this.ship4.setBounds(500, 500, 50, 75);

        this.ship5 = new JLabel();
        this.ship5.setIcon(s5);
        this.ship5.setBounds(600, 500, 50, 75);

        this.ship6 = new JLabel();
        this.ship6.setIcon(s6);
        this.ship6.setBounds(700, 500, 50, 75);


        //  set labels for cost of skins
        this.priceM2 = new JLabel();
        this.priceM2.setBounds(400, 345, 100, 20);
        this.priceM2.setForeground(Color.WHITE);
        this.priceM2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.priceM2.setText("COST 03");

        this.priceM3 = new JLabel();
        this.priceM3.setBounds(500, 345, 100, 20);
        this.priceM3.setForeground(Color.WHITE);
        this.priceM3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.priceM3.setText("COST 05");

        this.priceM4 = new JLabel();
        this.priceM4.setBounds(600, 345, 100, 20);
        this.priceM4.setForeground(Color.WHITE);
        this.priceM4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.priceM4.setText("COST 08");

        this.priceM5 = new JLabel();
        this.priceM5.setBounds(700, 345, 100, 20);
        this.priceM5.setForeground(Color.WHITE);
        this.priceM5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.priceM5.setText("COST 10");

        this.prices2 = new JLabel();
        this.prices2.setBounds(400, 600, 100, 20);
        this.prices2.setForeground(Color.WHITE);
        this.prices2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.prices2.setText("COST 03");

        this.prices3 = new JLabel();
        this.prices3.setBounds(500, 600, 100, 20);
        this.prices3.setForeground(Color.WHITE);
        this.prices3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.prices3.setText("COST 05");

        this.prices4 = new JLabel();
        this.prices4.setBounds(600, 600, 100, 20);
        this.prices4.setForeground(Color.WHITE);
        this.prices4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.prices4.setText("COST 08");

        this.prices5 = new JLabel();
        this.prices5.setBounds(700, 600, 100, 20);
        this.prices5.setForeground(Color.WHITE);
        this.prices5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.prices5.setText("COST 10");


        //  buttons
        ///////////BUY MISSILE////////////////////////////////
        this.bm2 = new JButton();
        this.bm2.setForeground(Color.white);
        this.bm2.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.bm2.setText("BUY");
        this.bm2.setOpaque(false);
        this.bm2.setContentAreaFilled(false);
        this.bm2.setBounds(400, 395, 100, 30);

        this.bm3 = new JButton();
        this.bm3.setForeground(Color.white);
        this.bm3.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.bm3.setText("BUY");
        this.bm3.setOpaque(false);
        this.bm3.setContentAreaFilled(false);
        this.bm3.setBounds(500, 395, 100, 30);

        this.bm4 = new JButton();
        this.bm4.setForeground(Color.white);
        this.bm4.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.bm4.setText("BUY");
        this.bm4.setOpaque(false);
        this.bm4.setContentAreaFilled(false);
        this.bm4.setBounds(600, 395, 100, 30);

        this.bm5 = new JButton();
        this.bm5.setForeground(Color.white);
        this.bm5.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.bm5.setText("BUY");
        this.bm5.setOpaque(false);
        this.bm5.setContentAreaFilled(false);
        this.bm5.setBounds(700, 395, 100, 30);


        ////////////buy ship////////////////////////////////////////////////////////
        this.bs2 = new JButton();
        this.bs2.setForeground(Color.white);
        this.bs2.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.bs2.setText("BUY");
        this.bs2.setOpaque(false);
        this.bs2.setContentAreaFilled(false);
        this.bs2.setBounds(400, 650, 100, 30);

        this.bs3 = new JButton();
        this.bs3.setForeground(Color.white);
        this.bs3.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.bs3.setText("BUY");
        this.bs3.setOpaque(false);
        this.bs3.setContentAreaFilled(false);
        this.bs3.setBounds(500, 650, 100, 30);

        this.bs4 = new JButton();
        this.bs4.setForeground(Color.white);
        this.bs4.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.bs4.setText("BUY");
        this.bs4.setOpaque(false);
        this.bs4.setContentAreaFilled(false);
        this.bs4.setBounds(600, 650, 100, 30);

        this.bs5 = new JButton();
        this.bs5.setForeground(Color.white);
        this.bs5.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.bs5.setText("BUY");
        this.bs5.setOpaque(false);
        this.bs5.setContentAreaFilled(false);
        this.bs5.setBounds(700, 650, 100, 30);

        /////////////EQUIPT MISSILE SKIN
        this.em1 = new JButton();
        this.em1.setForeground(Color.white);
        this.em1.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.em1.setText("EQUIPT");
        this.em1.setOpaque(false);
        this.em1.setContentAreaFilled(false);
        this.em1.setBounds(300, 395, 100, 30);

        this.em2 = new JButton();
        this.em2.setForeground(Color.white);
        this.em2.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.em2.setText("EQUIPT");
        this.em2.setOpaque(false);
        this.em2.setContentAreaFilled(false);
        this.em2.setBounds(400, 395, 100, 30);

        this.em3 = new JButton();
        this.em3.setForeground(Color.white);
        this.em3.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.em3.setText("EQUIPT");
        this.em3.setOpaque(false);
        this.em3.setContentAreaFilled(false);
        this.em3.setBounds(500, 395, 100, 30);

        this.em4 = new JButton();
        this.em4.setForeground(Color.white);
        this.em4.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.em4.setText("EQUIPT");
        this.em4.setOpaque(false);
        this.em4.setContentAreaFilled(false);
        this.em4.setBounds(600, 395, 100, 30);

        this.em5 = new JButton();
        this.em5.setForeground(Color.white);
        this.em5.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.em5.setText("EQUIPT");
        this.em5.setOpaque(false);
        this.em5.setContentAreaFilled(false);
        this.em5.setBounds(700, 395, 100, 30);


        ////////////////////EQUIPT SHIP////////////////////////////
        this.es1 = new JButton();
        this.es1.setForeground(Color.white);
        this.es1.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.es1.setText("EQUIPT");
        this.es1.setOpaque(false);
        this.es1.setContentAreaFilled(false);
        this.es1.setBounds(300, 650, 100, 30);

        this.es2 = new JButton();
        this.es2.setForeground(Color.white);
        this.es2.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.es2.setText("EQUIPT");
        this.es2.setOpaque(false);
        this.es2.setContentAreaFilled(false);
        this.es2.setBounds(400, 650, 100, 30);

        this.es3 = new JButton();
        this.es3.setForeground(Color.white);
        this.es3.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.es3.setText("EQUIPT");
        this.es3.setOpaque(false);
        this.es3.setContentAreaFilled(false);
        this.es3.setBounds(500, 650, 100, 30);

        this.es4 = new JButton();
        this.es4.setForeground(Color.white);
        this.es4.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.es4.setText("EQUIPT");
        this.es4.setOpaque(false);
        this.es4.setContentAreaFilled(false);
        this.es4.setBounds(600, 650, 100, 30);

        this.es5 = new JButton();
        this.es5.setForeground(Color.white);
        this.es5.setFont(new Font("Times New Roman", Font.BOLD, 10));
        this.es5.setText("EQUIPT");
        this.es5.setOpaque(false);
        this.es5.setContentAreaFilled(false);
        this.es5.setBounds(700, 650, 100, 30);

        ////////////////MENU HOME/////////////////////
        this.bHomeMenu = new JButton();
        this.bHomeMenu.setForeground(Color.white);
        this.bHomeMenu.setFont(new Font(("Times New Roman"), Font.BOLD, 20));
        this.bHomeMenu.setText("HOME MENU");
        this.bHomeMenu.setBackground(Color.black);
        this.bHomeMenu.setOpaque(false);
        this.bHomeMenu.setContentAreaFilled(false);
        this.bHomeMenu.setBounds(900, 30, 200, 50);

        // set actionlistener
        this.bm2.addActionListener(this);
        this.bm3.addActionListener(this);
        this.bm4.addActionListener(this);
        this.bm5.addActionListener(this);
        this.bs2.addActionListener(this);
        this.bs3.addActionListener(this);
        this.bs4.addActionListener(this);
        this.bs5.addActionListener(this);
        this.es1.addActionListener(this);
        this.es2.addActionListener(this);
        this.es3.addActionListener(this);
        this.es4.addActionListener(this);
        this.es5.addActionListener(this);
        this.em1.addActionListener(this);
        this.em2.addActionListener(this);
        this.em3.addActionListener(this);
        this.em4.addActionListener(this);
        this.em5.addActionListener(this);
        this.bHomeMenu.addActionListener(this);

        //  add to the panel
        this.add(headLine);
        this.add(underLine);
        this.add(skillPoints);
        this.add(missile1);
        this.add(missile2);
        this.add(missile3);
        this.add(missile4);
        this.add(missile5);
        this.add(missile6);
        this.add(ship1);
        this.add(ship2);
        this.add(ship3);
        this.add(ship4);
        this.add(ship5);
        this.add(ship6);
        this.add(bm2);
        this.add(bm3);
        this.add(bm4);
        this.add(bm5);
        this.add(bs2);
        this.add(bs3);
        this.add(bs4);
        this.add(bs5);
        this.add(em1);
        this.add(em2);
        this.add(em3);
        this.add(em4);
        this.add(em5);
        this.add(es1);
        this.add(es2);
        this.add(es3);
        this.add(es4);
        this.add(es5);
        this.add(priceM2);
        this.add(priceM3);
        this.add(priceM4);
        this.add(priceM5);
        this.add(prices2);
        this.add(prices3);
        this.add(prices4);
        this.add(prices5);
        this.add(bHomeMenu);
        this.add(background);


        //  set not visible
        this.bHomeMenu.setVisible(false);
        this.background.setVisible(false);
        this.headLine.setVisible(false);
        this.underLine.setVisible(false);
        this.skillPoints.setVisible(false);
        this.missile1.setVisible(false);
        this.missile2.setVisible(false);
        this.missile3.setVisible(false);
        this.missile4.setVisible(false);
        this.missile5.setVisible(false);
        this.missile6.setVisible(false);
        this.ship1.setVisible(false);
        this.ship2.setVisible(false);
        this.ship3.setVisible(false);
        this.ship4.setVisible(false);
        this.ship5.setVisible(false);
        this.ship6.setVisible(false);
        this.bm2.setVisible(false);
        this.bm3.setVisible(false);
        this.bm4.setVisible(false);
        this.bm5.setVisible(false);
        this.bs2.setVisible(false);
        this.bs3.setVisible(false);
        this.bs4.setVisible(false);
        this.bs5.setVisible(false);
        this.em1.setVisible(false);
        this.em2.setVisible(false);
        this.em3.setVisible(false);
        this.em4.setVisible(false);
        this.em5.setVisible(false);
        this.es1.setVisible(false);
        this.es2.setVisible(false);
        this.es3.setVisible(false);
        this.es4.setVisible(false);
        this.es5.setVisible(false);
        this.prices2.setVisible(false);
        this.prices3.setVisible(false);
        this.prices4.setVisible(false);
        this.prices5.setVisible(false);
        this.priceM2.setVisible(false);
        this.priceM3.setVisible(false);
        this.priceM4.setVisible(false);
        this.priceM5.setVisible(false);

        //  add components to the frame
        frame.add(headLine);
        frame.add(underLine);
        frame.add(skillPoints);
        frame.add(bHomeMenu);
        frame.add(missile1);
        frame.add(missile2);
        frame.add(missile3);
        frame.add(missile4);
        frame.add(missile5);
        frame.add(missile6);
        frame.add(ship1);
        frame.add(ship2);
        frame.add(ship3);
        frame.add(ship4);
        frame.add(ship5);
        frame.add(ship6);
        frame.add(bm2);
        frame.add(bm3);
        frame.add(bm4);
        frame.add(bm5);
        frame.add(bs2);
        frame.add(bs3);
        frame.add(bs4);
        frame.add(bs5);
        frame.add(em1);
        frame.add(em2);
        frame.add(em3);
        frame.add(em4);
        frame.add(em5);
        frame.add(es1);
        frame.add(es2);
        frame.add(es3);
        frame.add(es4);
        frame.add(es5);
        frame.add(priceM2);
        frame.add(priceM3);
        frame.add(priceM4);
        frame.add(priceM5);
        frame.add(prices2);
        frame.add(prices3);
        frame.add(prices4);
        frame.add(prices5);
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
        if (e.getSource() == this.bm2 && gameSpaceInvaders.getPlayer().getSkillPoints() >= cm2)
        {
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - cm2);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.isboughtm2 = true;
            this.bm2.setVisible(false);
            this.priceM2.setVisible(false);
            this.em2.setVisible(true);
        }

        if (e.getSource() == this.bm3 && gameSpaceInvaders.getPlayer().getSkillPoints() >= cm3)
        {
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - cm3);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.isboughtm3 = true;
            this.bm3.setVisible(false);
            this.priceM3.setVisible(false);
            this.em3.setVisible(true);
        }

        if (e.getSource() == this.bm4 && gameSpaceInvaders.getPlayer().getSkillPoints() >= cm4)
        {
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - cm4);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.isboughtm4 = true;
            this.bm4.setVisible(false);
            this.priceM4.setVisible(false);
            this.em4.setVisible(true);
        }

        if (e.getSource() == this.bm5 && gameSpaceInvaders.getPlayer().getSkillPoints() >= cm5)
        {
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - cm5);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.isboughtm5 = true;
            this.bm5.setVisible(false);
            this.priceM5.setVisible(false);
            this.em5.setVisible(true);
        }

        ////////////BUY  SHIP//////////////////////////////////////////////
        if (e.getSource() == this.bs2 && gameSpaceInvaders.getPlayer().getSkillPoints() >= cs2)
        {
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - cs2);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.isIsboughts2 = true;
            this.bs2.setVisible(false);
            this.prices2.setVisible(false);
            this.es2.setVisible(true);
        }

        if (e.getSource() == this.bs3 && gameSpaceInvaders.getPlayer().getSkillPoints() >= cs3)
        {
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - cs3);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.isIsboughts3 = true;
            this.bs3.setVisible(false);
            this.prices3.setVisible(false);
            this.es3.setVisible(true);
        }

        if (e.getSource() == this.bs4 && gameSpaceInvaders.getPlayer().getSkillPoints() >= cs4)
        {
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - cs4);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.isIsboughts4 = true;
            this.bs4.setVisible(false);
            this.prices4.setVisible(false);
            this.es4.setVisible(true);
        }

        if (e.getSource() == this.bs5 && gameSpaceInvaders.getPlayer().getSkillPoints() >= cs5)
        {
            gameSpaceInvaders.getPlayer().setSkillPoints(gameSpaceInvaders.getPlayer().getSkillPoints() - cs5);
            this.skillPoints.setText("SKILL POINTS: " + gameSpaceInvaders.getPlayer().getSkillPoints());
            this.isIsboughts5 = true;
            this.bs5.setVisible(false);
            this.prices5.setVisible(false);
            this.es5.setVisible(true);
        }

        ////////////////////////EQUIPT////////////////////////////////////////////////////////////
        if (e.getSource() == this.em1)
        {
            try
            {
                gameSpaceInvaders.setMissileImage(ImageIO.read(getClass().getResource("/missile01.gif")));
                this.missile1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/missile01.gif"))));
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.em2)
        {
            try
            {
                gameSpaceInvaders.setMissileImage(ImageIO.read(getClass().getResource("/whitemissile.png")));
                this.missile1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/whitemissile.png"))));
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.em3)
        {
            try
            {
                gameSpaceInvaders.setMissileImage(ImageIO.read(getClass().getResource("/yellowmissile.png")));
                this.missile1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/yellowmissile.png"))));
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.em4)
        {
            try
            {
                gameSpaceInvaders.setMissileImage(ImageIO.read(getClass().getResource("/greenmissile.png")));
                this.missile1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/greenmissile.png"))));
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.em5)
        {
            try
            {
                gameSpaceInvaders.setMissileImage(ImageIO.read(getClass().getResource("/blue missile.png")));
                this.missile1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/blue missile.png"))));
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.es1)
        {
            try
            {
                gameSpaceInvaders.getPlayer().setImage(ImageIO.read(getClass().getResource("/spaceship02.png")));
                this.ship1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/spaceship02.png"))));
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }

        }

        if (e.getSource() == this.es2)
        {
            try
            {
                gameSpaceInvaders.getPlayer().setImage(ImageIO.read(getClass().getResource("/yellowspaceship.png")));
                this.ship1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/yellowspaceship.png"))));
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.es3)
        {
            try
            {
                gameSpaceInvaders.getPlayer().setImage(ImageIO.read(getClass().getResource("/pastelspaceship.png")));
                this.ship1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/pastelspaceship.png"))));
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.es4)
        {
            try
            {
                gameSpaceInvaders.getPlayer().setImage(ImageIO.read(getClass().getResource("/spaceship.png")));
                this.ship1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/spaceship.png"))));
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.es5)
        {
            try
            {
                gameSpaceInvaders.getPlayer().setImage(ImageIO.read(getClass().getResource("/purplespaceship.png")));
                this.ship1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/purplespaceship.png"))));
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }
    }

    public void setVisible(boolean visible)
    {
        if (visible)
        {
            this.bHomeMenu.setVisible(true);
            this.background.setVisible(true);
            this.headLine.setVisible(true);
            this.underLine.setVisible(true);
            this.skillPoints.setVisible(true);
            this.missile1.setVisible(true);
            this.missile2.setVisible(true);
            this.missile3.setVisible(true);
            this.missile4.setVisible(true);
            this.missile5.setVisible(true);
            this.missile6.setVisible(true);
            this.ship1.setVisible(true);
            this.ship2.setVisible(true);
            this.ship3.setVisible(true);
            this.ship4.setVisible(true);
            this.ship5.setVisible(true);
            this.ship6.setVisible(true);
            if (this.isboughtm2)
            {
                this.bm2.setVisible(false);
                this.priceM2.setVisible(false);
                this.em2.setVisible(true);
            } else if (!this.isboughtm2)
            {
                this.bm2.setVisible(true);
                this.priceM2.setVisible(true);
                this.em2.setVisible(false);
            }
            if (this.isboughtm3)
            {
                this.bm3.setVisible(false);
                this.priceM3.setVisible(false);
                this.em3.setVisible(true);
            } else if (!this.isboughtm3)
            {
                this.bm3.setVisible(true);
                this.priceM3.setVisible(true);
                this.em3.setVisible(false);
            }
            if (this.isboughtm4)
            {
                this.bm4.setVisible(false);
                this.priceM4.setVisible(false);
                this.em4.setVisible(true);
            } else if (!this.isboughtm4)
            {
                this.bm4.setVisible(true);
                this.priceM4.setVisible(true);
                this.em4.setVisible(false);
            }
            if (this.isboughtm5)
            {
                this.bm5.setVisible(false);
                this.priceM5.setVisible(false);
                this.em5.setVisible(true);
            } else if (!this.isboughtm5)
            {
                this.bm5.setVisible(true);
                this.priceM5.setVisible(true);
                this.em5.setVisible(false);
            }
            if (this.isIsboughts2)
            {
                this.bs2.setVisible(false);
                this.prices2.setVisible(false);
                this.es2.setVisible(true);
            } else if (!this.isIsboughts2)
            {
                this.bs2.setVisible(true);
                this.prices2.setVisible(true);
                this.es2.setVisible(false);
            }
            if (this.isIsboughts3)
            {
                this.bs3.setVisible(false);
                this.prices3.setVisible(false);
                this.es3.setVisible(true);
            } else if (!this.isIsboughts3)
            {
                this.bs3.setVisible(true);
                this.prices3.setVisible(true);
                this.es3.setVisible(false);
            }
            if (this.isIsboughts4)
            {
                this.bs4.setVisible(false);
                this.prices4.setVisible(false);
                this.es4.setVisible(true);
            } else if (!this.isIsboughts4)
            {
                this.bs4.setVisible(true);
                this.prices4.setVisible(true);
                this.es4.setVisible(false);
            }
            if (this.isIsboughts5)
            {
                this.bs5.setVisible(false);
                this.prices5.setVisible(false);
                this.es5.setVisible(true);
            } else if (!this.isIsboughts5)
            {
                this.bs5.setVisible(true);
                this.prices5.setVisible(true);
                this.es5.setVisible(false);
            }
            this.em1.setVisible(true);
            this.es1.setVisible(true);
        }
        if (!visible)
        {
            this.bHomeMenu.setVisible(false);
            this.background.setVisible(false);
            this.headLine.setVisible(false);
            this.underLine.setVisible(false);
            this.skillPoints.setVisible(false);
            this.missile1.setVisible(false);
            this.missile2.setVisible(false);
            this.missile3.setVisible(false);
            this.missile4.setVisible(false);
            this.missile5.setVisible(false);
            this.missile6.setVisible(false);
            this.ship1.setVisible(false);
            this.ship2.setVisible(false);
            this.ship3.setVisible(false);
            this.ship4.setVisible(false);
            this.ship5.setVisible(false);
            this.ship6.setVisible(false);
            this.bm2.setVisible(false);
            this.bm3.setVisible(false);
            this.bm4.setVisible(false);
            this.bm5.setVisible(false);
            this.bs2.setVisible(false);
            this.bs3.setVisible(false);
            this.bs4.setVisible(false);
            this.bs5.setVisible(false);
            this.em1.setVisible(false);
            this.em2.setVisible(false);
            this.em3.setVisible(false);
            this.em4.setVisible(false);
            this.em5.setVisible(false);
            this.es1.setVisible(false);
            this.es2.setVisible(false);
            this.es3.setVisible(false);
            this.es4.setVisible(false);
            this.es5.setVisible(false);
            this.priceM2.setVisible(false);
            this.priceM3.setVisible(false);
            this.priceM4.setVisible(false);
            this.priceM5.setVisible(false);
            this.prices2.setVisible(false);
            this.prices3.setVisible(false);
            this.prices4.setVisible(false);
            this.prices5.setVisible(false);

        }
    }

    public JLabel getSkillPoints()
    {
        return skillPoints;
    }

    public void setSkillPoints(String skillPoints)
    {
        this.skillPoints.setText(skillPoints);
    }

    public boolean isIsboughtm2()
    {
        return isboughtm2;
    }

    public void setIsboughtm2(boolean isboughtm2)
    {
        this.isboughtm2 = isboughtm2;
    }

    public boolean isIsboughtm3()
    {
        return isboughtm3;
    }

    public void setIsboughtm3(boolean isboughtm3)
    {
        this.isboughtm3 = isboughtm3;
    }

    public boolean isIsboughtm4()
    {
        return isboughtm4;
    }

    public void setIsboughtm4(boolean isboughtm4)
    {
        this.isboughtm4 = isboughtm4;
    }

    public boolean isIsboughtm5()
    {
        return isboughtm5;
    }

    public void setIsboughtm5(boolean isboughtm5)
    {
        this.isboughtm5 = isboughtm5;
    }

    public boolean isIsboughts2()
    {
        return isIsboughts2;
    }

    public void setIsboughts2(boolean isboughts2)
    {
        isIsboughts2 = isboughts2;
    }

    public boolean isIsboughts3()
    {
        return isIsboughts3;
    }

    public void setIsboughts3(boolean isboughts3)
    {
        isIsboughts3 = isboughts3;
    }

    public boolean isIsboughts4()
    {
        return isIsboughts4;
    }

    public void setIsboughts4(boolean isboughts4)
    {
        isIsboughts4 = isboughts4;
    }

    public boolean isIsboughts5()
    {
        return isIsboughts5;
    }

    public void setIsboughts5(boolean isboughts5)
    {
        isIsboughts5 = isboughts5;
    }
}