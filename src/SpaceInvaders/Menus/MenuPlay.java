package SpaceInvaders.Menus;

import Main.Game;
import SpaceInvaders.Game.GAMESTATE;
import SpaceInvaders.Levels.Level;
import SpaceInvaders.Levels.LevelState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;

import static javax.imageio.ImageIO.read;

public class MenuPlay extends JPanel implements ActionListener
{
    //  game object
    private SpaceInvaders.Game.Game gameSpaceInvaders;

    public static final int width = Game.WIDTH, height = Game.HEIGHT;

    //  labels
    private JLabel headLine, underLine;

    //  is level complete label
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;

    // level skill point
    private JLabel s1, s2, s3, s4, s5, s6, s7, s8, s9;

    //  buttons
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, bHomeMenu;

    //
    private JLabel background;
    private ImageIcon backPic;

    public MenuPlay(JFrame frame, SpaceInvaders.Game.Game gameSpaceInvaders) throws IOException
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
        this.headLine.setText("PLAY");

        //  set underLine
        this.underLine = new JLabel();
        this.underLine.setBounds(100, 90, 300, 40);
        this.underLine.setForeground(Color.WHITE);
        this.underLine.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.underLine.setText("-SELECT LEVEL");


        //  set buttons
        //         b1 (900, 200, 200, 100);
        //         bupgrade(900, 400, 200, 100);
        //         bhelp(900, 600, 200, 100);
        //         bmainmenu(900, 30, 200, 50);

        this.b1 = new JButton();
        this.b1.setForeground(Color.white);
        this.b1.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.b1.setText("LEVEL 1");
        this.b1.setBackground(Color.BLACK);
        this.b1.setOpaque(false);
        this.b1.setContentAreaFilled(false);
        this.b1.setBounds(100, 200, 200, 100);

        this.l1 = new JLabel();
        this.l1.setBounds(100, 300, 300, 40);
        this.l1.setForeground(Color.WHITE);
        this.l1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.l1.setText("SKILL POINTS: 01");

        this.s1 = new JLabel();
        this.s1.setBounds(100, 330, 300, 40);
        this.s1.setForeground(Color.GREEN);
        this.s1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.s1.setText("COMPLETED");


        this.b2 = new JButton();
        this.b2.setForeground(Color.white);
        this.b2.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.b2.setText("LEVEL 2");
        this.b2.setBackground(Color.white);
        this.b2.setOpaque(false);
        this.b2.setContentAreaFilled(false);
        this.b2.setBounds(500, 200, 200, 100);

        this.l2 = new JLabel();
        this.l2.setBounds(500, 300, 300, 40);
        this.l2.setForeground(Color.WHITE);
        this.l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.l2.setText("SKILL POINTS: 01");

        this.s2 = new JLabel();
        this.s2.setBounds(500, 330, 300, 40);
        this.s2.setForeground(Color.GREEN);
        this.s2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.s2.setText("COMPLETED");


        this.b3 = new JButton();
        this.b3.setForeground(Color.white);
        this.b3.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.b3.setText("LEVEL 3");
        this.b3.setBackground(Color.white);
        this.b3.setOpaque(false);
        this.b3.setContentAreaFilled(false);
        this.b3.setBounds(900, 200, 200, 100);

        this.l3 = new JLabel();
        this.l3.setBounds(900, 300, 300, 40);
        this.l3.setForeground(Color.WHITE);
        this.l3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.l3.setText("SKILL POINTS: 01");

        this.s3 = new JLabel();
        this.s3.setBounds(900, 330, 300, 40);
        this.s3.setForeground(Color.GREEN);
        this.s3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.s3.setText("COMPLETED");


        this.b4 = new JButton();
        this.b4.setForeground(Color.white);
        this.b4.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.b4.setText("LEVEL 4");
        this.b4.setBackground(Color.white);
        this.b4.setOpaque(false);
        this.b4.setContentAreaFilled(false);
        this.b4.setBounds(100, 400, 200, 100);

        this.l4 = new JLabel();
        this.l4.setBounds(100, 500, 300, 40);
        this.l4.setForeground(Color.WHITE);
        this.l4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.l4.setText("SKILL POINTS: 02");

        this.s4 = new JLabel();
        this.s4.setBounds(100, 530, 300, 40);
        this.s4.setForeground(Color.GREEN);
        this.s4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.s4.setText("COMPLETED");


        this.b5 = new JButton();
        this.b5.setForeground(Color.white);
        this.b5.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.b5.setText("LEVEL 5");
        this.b5.setBackground(Color.white);
        this.b5.setOpaque(false);
        this.b5.setContentAreaFilled(false);
        this.b5.setBounds(500, 400, 200, 100);

        this.l5 = new JLabel();
        this.l5.setBounds(500, 500, 300, 40);
        this.l5.setForeground(Color.WHITE);
        this.l5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.l5.setText("SKILL POINTS: 02");

        this.s5 = new JLabel();
        this.s5.setBounds(500, 530, 300, 40);
        this.s5.setForeground(Color.GREEN);
        this.s5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.s5.setText("COMPLETED");


        this.b6 = new JButton();
        this.b6.setForeground(Color.white);
        this.b6.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.b6.setText("LEVEL 6");
        this.b6.setBackground(Color.white);
        this.b6.setOpaque(false);
        this.b6.setContentAreaFilled(false);
        this.b6.setBounds(900, 400, 200, 100);

        this.l6 = new JLabel();
        this.l6.setBounds(900, 500, 300, 40);
        this.l6.setForeground(Color.WHITE);
        this.l6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.l6.setText("SKILL POINTS: 02");

        this.s6 = new JLabel();
        this.s6.setBounds(900, 530, 300, 40);
        this.s6.setForeground(Color.GREEN);
        this.s6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.s6.setText("COMPLETED");


        this.b7 = new JButton();
        this.b7.setForeground(Color.white);
        this.b7.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.b7.setText("LEVEL 7");
        this.b7.setBackground(Color.white);
        this.b7.setOpaque(false);
        this.b7.setContentAreaFilled(false);
        this.b7.setBounds(100, 600, 200, 100);

        this.l7 = new JLabel();
        this.l7.setBounds(100, 700, 300, 40);
        this.l7.setForeground(Color.WHITE);
        this.l7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.l7.setText("SKILL POINTS: 03");

        this.s7 = new JLabel();
        this.s7.setBounds(100, 730, 300, 40);
        this.s7.setForeground(Color.GREEN);
        this.s7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.s7.setText("COMPLETED");


        this.b8 = new JButton();
        this.b8.setForeground(Color.white);
        this.b8.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.b8.setText("LEVEL 8");
        this.b8.setBackground(Color.white);
        this.b8.setOpaque(false);
        this.b8.setContentAreaFilled(false);
        this.b8.setBounds(500, 600, 200, 100);

        this.l8 = new JLabel();
        this.l8.setBounds(500, 700, 300, 40);
        this.l8.setForeground(Color.WHITE);
        this.l8.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.l8.setText("SKILL POINTS: 03");

        this.s8 = new JLabel();
        this.s8.setBounds(500, 730, 300, 40);
        this.s8.setForeground(Color.GREEN);
        this.s8.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.s8.setText("COMPLETED");


        this.b9 = new JButton();
        this.b9.setForeground(Color.white);
        this.b9.setFont(new Font(("Times New Roman"), Font.BOLD, 30));
        this.b9.setText("LEVEL 9");
        this.b9.setBackground(Color.white);
        this.b9.setOpaque(false);
        this.b9.setContentAreaFilled(false);
        this.b9.setBounds(900, 600, 200, 100);

        this.l9 = new JLabel();
        this.l9.setBounds(900, 700, 300, 40);
        this.l9.setForeground(Color.WHITE);
        this.l9.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.l9.setText("SKILL POINTS: 03");

        this.s9 = new JLabel();
        this.s9.setBounds(900, 730, 300, 40);
        this.s9.setForeground(Color.GREEN);
        this.s9.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.s9.setText("COMPLETED");


        this.bHomeMenu = new JButton();
        this.bHomeMenu.setForeground(Color.white);
        this.bHomeMenu.setFont(new Font(("Times New Roman"), Font.BOLD, 20));
        this.bHomeMenu.setText("HOME MENU");
        this.bHomeMenu.setBackground(Color.white);
        this.bHomeMenu.setOpaque(false);
        this.bHomeMenu.setContentAreaFilled(false);
        this.bHomeMenu.setBounds(900, 30, 200, 50);

        //  set actionlisteners to the buttons
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.b4.addActionListener(this);
        this.b5.addActionListener(this);
        this.b6.addActionListener(this);
        this.b7.addActionListener(this);
        this.b8.addActionListener(this);
        this.b9.addActionListener(this);
        this.bHomeMenu.addActionListener(this);


        //  add components to the panel
        this.add(headLine);
        this.add(underLine);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
        this.add(l6);
        this.add(l7);
        this.add(l8);
        this.add(l9);
        this.add(s1);
        this.add(s2);
        this.add(s3);
        this.add(s4);
        this.add(s5);
        this.add(s6);
        this.add(s7);
        this.add(s8);
        this.add(s9);
        this.add(bHomeMenu);
        this.add(background);

        //  set components to not visible
        this.b1.setVisible(false);
        this.b2.setVisible(false);
        this.b3.setVisible(false);
        this.b4.setVisible(false);
        this.b5.setVisible(false);
        this.b6.setVisible(false);
        this.b7.setVisible(false);
        this.b8.setVisible(false);
        this.b9.setVisible(false);
        this.l1.setVisible(false);
        this.l2.setVisible(false);
        this.l3.setVisible(false);
        this.l4.setVisible(false);
        this.l5.setVisible(false);
        this.l6.setVisible(false);
        this.l7.setVisible(false);
        this.l8.setVisible(false);
        this.l9.setVisible(false);
        this.s1.setVisible(false);
        this.s2.setVisible(false);
        this.s3.setVisible(false);
        this.s4.setVisible(false);
        this.s5.setVisible(false);
        this.s6.setVisible(false);
        this.s7.setVisible(false);
        this.s8.setVisible(false);
        this.s9.setVisible(false);
        this.bHomeMenu.setVisible(false);
        this.headLine.setVisible(false);
        this.underLine.setVisible(false);
        this.background.setVisible(false);


        //  add to frame
        frame.add(headLine);
        frame.add(underLine);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(l9);
        frame.add(s1);
        frame.add(s2);
        frame.add(s3);
        frame.add(s4);
        frame.add(s5);
        frame.add(s6);
        frame.add(s7);
        frame.add(s8);
        frame.add(s9);
        frame.add(bHomeMenu);
        frame.add(background);
    }

    //  actions for buttons
    public void actionPerformed(ActionEvent e)
    {
        //  remove component from the screen
        if (e.getSource() == this.b1 || e.getSource() == this.b2 ||
                e.getSource() == this.b3 || e.getSource() == this.b4 ||
                e.getSource() == this.b5 || e.getSource() == this.b6 ||
                e.getSource() == this.b7 || e.getSource() == this.b8 ||
                e.getSource() == this.b9 || e.getSource() == this.bHomeMenu)
        {
            this.setVisible(false);
        }

        //  play level
        if (e.getSource() == this.b1)
        {
            try
            {
                gameSpaceInvaders.setLevel(new Level(
                        gameSpaceInvaders,
                        LevelState.LEVEL1,
                        1,
                        3,
                        6,
                        4,
                        2,
                        4,
                        2,
                        1,
                        2,
                        1,
                        1,
                        1,
                        1));
            } catch (CloneNotSupportedException | IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.b2)
        {
            try
            {
                gameSpaceInvaders.setLevel(new Level(
                        gameSpaceInvaders,
                        LevelState.LEVEL2,
                        1,
                        5,
                        8,
                        6,
                        3,
                        5,
                        3,
                        2,
                        3,
                        1,
                        1,
                        1,
                        2));
            } catch (CloneNotSupportedException | IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.b3)
        {
            try
            {
                gameSpaceInvaders.setLevel(new Level(
                        gameSpaceInvaders,
                        LevelState.LEVEL3,
                        1,
                        6,
                        9,
                        7,
                        4,
                        6,
                        3,
                        2,
                        3,
                        2,
                        1,
                        1,
                        2));
            } catch (CloneNotSupportedException | IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.b4)
        {
            try
            {
                gameSpaceInvaders.setLevel(new Level(
                        gameSpaceInvaders,
                        LevelState.LEVEL4,
                        2,
                        4,
                        3,
                        7,
                        5,
                        4,
                        2,
                        4,
                        3,
                        3,
                        5,
                        2,
                        5));
            } catch (CloneNotSupportedException | IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.b5)
        {
            try
            {
                gameSpaceInvaders.setLevel(new Level(
                        gameSpaceInvaders,
                        LevelState.LEVEL5,
                        2,
                        4,
                        6,
                        8,
                        5,
                        7,
                        4,
                        3,
                        3,
                        3,
                        5,
                        2,
                        5));
            } catch (CloneNotSupportedException | IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.b6)
        {
            try
            {
                gameSpaceInvaders.setLevel(new Level(
                        gameSpaceInvaders,
                        LevelState.LEVEL6,
                        2,
                        6,
                        12,
                        10,
                        5,
                        10,
                        4,
                        5,
                        3,
                        3,
                        5,
                        2,
                        5));
            } catch (CloneNotSupportedException | IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.b7)
        {
            try
            {
                gameSpaceInvaders.setLevel(new Level(
                        gameSpaceInvaders,
                        LevelState.LEVEL7,
                        3,
                        6,
                        12,
                        15,
                        8,
                        13,
                        2,
                        5,
                        3,
                        5,
                        8,
                        3,
                        1));
            } catch (CloneNotSupportedException | IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.b8)
        {
            try
            {
                gameSpaceInvaders.setLevel(new Level(
                        gameSpaceInvaders,
                        LevelState.LEVEL8,
                        3,
                        10,
                        12,
                        18,
                        10,
                        15,
                        5,
                        10,
                        3,
                        10,
                        8,
                        2,
                        1));
            } catch (CloneNotSupportedException | IOException e1)
            {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == this.b9)
        {
            try
            {
                gameSpaceInvaders.setLevel(new Level(
                        gameSpaceInvaders,
                        LevelState.LEVEL9,
                        5,
                        15,
                        20,
                        20,
                        7,
                        15,
                        1,
                        12,
                        5,
                        10,
                        8,
                        2,
                        1));
            } catch (CloneNotSupportedException | IOException e1)
            {
                e1.printStackTrace();
            }
        }

        //  set game state to play
        if (e.getSource() == this.b1 || e.getSource() == this.b2 ||
                e.getSource() == this.b3 || e.getSource() == this.b4 ||
                e.getSource() == this.b5 || e.getSource() == this.b6 ||
                e.getSource() == this.b7 || e.getSource() == this.b8 ||
                e.getSource() == this.b9)
        {
            gameSpaceInvaders.setGamestate(GAMESTATE.PLAY);
        }


        //  main menu
        if (e.getSource() == this.bHomeMenu)
        {
            gameSpaceInvaders.getMenuHome().setVisible(true);
        }
    }

    //  set this visible or not
    public void setVisible(boolean isVisible)
    {
        if (isVisible)
        {
            //  set the whole panel to visible
            this.b1.setVisible(true);
            this.b2.setVisible(true);
            this.b3.setVisible(true);
            this.b4.setVisible(true);
            this.b5.setVisible(true);
            this.b6.setVisible(true);
            this.b7.setVisible(true);
            this.b8.setVisible(true);
            this.b9.setVisible(true);
            this.l1.setVisible(true);
            this.l2.setVisible(true);
            this.l3.setVisible(true);
            this.l4.setVisible(true);
            this.l5.setVisible(true);
            this.l6.setVisible(true);
            this.l7.setVisible(true);
            this.l8.setVisible(true);
            this.l9.setVisible(true);
            this.bHomeMenu.setVisible(true);
            this.headLine.setVisible(true);
            this.underLine.setVisible(true);
            this.background.setVisible(true);
        }
        if (!isVisible)
        {
            //  set not visible
            this.b1.setVisible(false);
            this.b2.setVisible(false);
            this.b3.setVisible(false);
            this.b4.setVisible(false);
            this.b5.setVisible(false);
            this.b6.setVisible(false);
            this.b7.setVisible(false);
            this.b8.setVisible(false);
            this.b9.setVisible(false);
            this.l1.setVisible(false);
            this.l2.setVisible(false);
            this.l3.setVisible(false);
            this.l4.setVisible(false);
            this.l5.setVisible(false);
            this.l6.setVisible(false);
            this.l7.setVisible(false);
            this.l8.setVisible(false);
            this.l9.setVisible(false);
            this.s1.setVisible(false);
            this.s2.setVisible(false);
            this.s3.setVisible(false);
            this.s4.setVisible(false);
            this.s5.setVisible(false);
            this.s6.setVisible(false);
            this.s7.setVisible(false);
            this.s8.setVisible(false);
            this.s9.setVisible(false);
            this.bHomeMenu.setVisible(false);
            this.headLine.setVisible(false);
            this.underLine.setVisible(false);
            this.background.setVisible(false);
        }
    }


    public JLabel getS1()
    {
        return s1;
    }

    public void setS1(JLabel s1)
    {
        this.s1 = s1;
    }

    public JLabel getS2()
    {
        return s2;
    }

    public void setS2(JLabel s2)
    {
        this.s2 = s2;
    }

    public JLabel getS3()
    {
        return s3;
    }

    public void setS3(JLabel s3)
    {
        this.s3 = s3;
    }

    public JLabel getS4()
    {
        return s4;
    }

    public void setS4(JLabel s4)
    {
        this.s4 = s4;
    }

    public JLabel getS5()
    {
        return s5;
    }

    public void setS5(JLabel s5)
    {
        this.s5 = s5;
    }

    public JLabel getS6()
    {
        return s6;
    }

    public void setS6(JLabel s6)
    {
        this.s6 = s6;
    }

    public JLabel getS7()
    {
        return s7;
    }

    public void setS7(JLabel s7)
    {
        this.s7 = s7;
    }

    public JLabel getS8()
    {
        return s8;
    }

    public void setS8(JLabel s8)
    {
        this.s8 = s8;
    }

    public JLabel getS9()
    {
        return s9;
    }

    public void setS9(JLabel s9)
    {
        this.s9 = s9;
    }
}
