package Menus;

import Main.Game;
import javafx.scene.layout.Background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class MenuObject extends JPanel implements ActionListener
{
    //  game object (MAIN GAME)
    Game game;

    public static final int width = Game.WIDTH, height = Game.HEIGHT;

    //  labels
    JLabel headLine, underLine, bacground;

    //  buttons
    JButton b1, b2, b3, b4;
    private int buttonWidth = 400, buttonHeight = 200, buttonSpace = 100;
    private int b1X = 100, b1Y = 200;
    private int b2X = 700, b2Y = 200;
    private int b3X = 100, b3Y = 500;
    private int b4X = 700, b4Y = 500;

    //  pictures
    private ImageIcon icon1, icon2, icon3, icon4;

    public MenuObject(JFrame frame, Game game)
    {
        //  use for button actions
        this.game = game;

        //  set size of the panel
        this.setPreferredSize(new Dimension(width, height));
        this.setMaximumSize(new Dimension(width, height));
        this.setMinimumSize(new Dimension(width, height));

        //  set background
        this.bacground = new JLabel();
        this.bacground.setBounds(0, 0, 1300, 900);
        this.bacground.setBackground(Color.white);

        //  set headLine
        this.headLine = new JLabel();
        this.headLine.setBounds(100, 30, 750, 60);
        this.headLine.setFont(new Font("Times New Roman", Font.BOLD, 60));
        this.headLine.setText("set headline here");

        //  set underLine
        this.underLine = new JLabel();
        this.underLine.setBounds(100, 90, 300, 40);
        this.underLine.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.underLine.setText("set underline here");

        //  pictures for the buttons
        this.icon1 = new ImageIcon();
        this.icon2 = new ImageIcon();
        this.icon3 = new ImageIcon();
        this.icon4 = new ImageIcon();

        //  set buttons
        this.b1 = new JButton("b1");
        this.b1.setBackground(Color.white);
        this.b1.setIcon(icon1);
        this.b1.setBounds(b1X, b1Y, buttonWidth, buttonHeight);

        this.b2 = new JButton("b2");
        this.b2.setBackground(Color.white);
        this.b2.setIcon(icon2);
        this.b2.setBounds(b2X, b2Y, buttonWidth, buttonHeight);

        this.b3 = new JButton("b3");
        this.b3.setBackground(Color.white);
        this.b3.setIcon(icon3);
        this.b3.setBounds(b3X, b3Y, buttonWidth, buttonHeight);

        this.b4 = new JButton("b4");
        this.b4.setBackground(Color.white);
        this.b4.setIcon(icon4);
        this.b4.setBounds(b4X, b4Y, buttonWidth, buttonHeight);

        //  set actionlisteners to the buttons
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.b4.addActionListener(this);

        //  add components to the panel
        this.add(headLine);
        this.add(underLine);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(bacground);

        //  set components to not visible
        this.b1.setVisible(false);
        this.b2.setVisible(false);
        this.b3.setVisible(false);
        this.b4.setVisible(false);
        this.headLine.setVisible(false);
        this.underLine.setVisible(false);
        this.bacground.setVisible(false);

        //  add to frame
        frame.add(headLine);
        frame.add(underLine);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(bacground);
    }

    //  actions for buttons
    public abstract void actionPerformed(ActionEvent e);

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
            this.headLine.setVisible(true);
            this.underLine.setVisible(true);
            this.bacground.setVisible(true);
        } else
        {
            //  set not visible
            this.b1.setVisible(false);
            this.b2.setVisible(false);
            this.b3.setVisible(false);
            this.b4.setVisible(false);
            this.headLine.setVisible(false);
            this.underLine.setVisible(false);
            this.bacground.setVisible(false);
        }
    }

    //  getters and setters
    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

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

    protected JButton getB1()
    {
        return b1;
    }

    protected void setB1(JButton b1)
    {
        this.b1 = b1;
    }

    protected JButton getB2()
    {
        return b2;
    }

    protected void setB2(JButton b2)
    {
        this.b2 = b2;
    }

    protected JButton getB3()
    {
        return b3;
    }

    protected void setB3(JButton b3)
    {
        this.b3 = b3;
    }

    protected JButton getB4()
    {
        return b4;
    }

    protected void setB4(JButton b4)
    {
        this.b4 = b4;
    }

    protected int getButtonWidth()
    {
        return buttonWidth;
    }

    protected void setButtonWidth(int buttonWidth)
    {
        this.buttonWidth = buttonWidth;
    }

    protected int getButtonHeight()
    {
        return buttonHeight;
    }

    protected void setButtonHeight(int buttonHeight)
    {
        this.buttonHeight = buttonHeight;
    }

    protected int getButtonSpace()
    {
        return buttonSpace;
    }

    protected void setButtonSpace(int buttonSpace)
    {
        this.buttonSpace = buttonSpace;
    }

    protected int getB1X()
    {
        return b1X;
    }

    protected void setB1X(int b1X)
    {
        this.b1X = b1X;
    }

    protected int getB1Y()
    {
        return b1Y;
    }

    protected void setB1Y(int b1Y)
    {
        this.b1Y = b1Y;
    }

    protected int getB2X()
    {
        return b2X;
    }

    protected void setB2X(int b2X)
    {
        this.b2X = b2X;
    }

    protected int getB2Y()
    {
        return b2Y;
    }

    protected void setB2Y(int b2Y)
    {
        this.b2Y = b2Y;
    }

    protected int getB3X()
    {
        return b3X;
    }

    protected void setB3X(int b3X)
    {
        this.b3X = b3X;
    }

    protected int getB3Y()
    {
        return b3Y;
    }

    protected void setB3Y(int b3Y)
    {
        this.b3Y = b3Y;
    }

    protected int getB4X()
    {
        return b4X;
    }

    protected void setB4X(int b4X)
    {
        this.b4X = b4X;
    }

    protected int getB4Y()
    {
        return b4Y;
    }

    protected void setB4Y(int b4Y)
    {
        this.b4Y = b4Y;
    }

    protected ImageIcon getIcon1()
    {
        return icon1;
    }

    protected void setIcon1(ImageIcon icon1)
    {
        this.icon1 = icon1;
    }

    protected ImageIcon getIcon2()
    {
        return icon2;
    }

    protected void setIcon2(ImageIcon icon2)
    {
        this.icon2 = icon2;
    }

    protected ImageIcon getIcon3()
    {
        return icon3;
    }

    protected void setIcon3(ImageIcon icon3)
    {
        this.icon3 = icon3;
    }

    protected ImageIcon getIcon4()
    {
        return icon4;
    }

    protected void setIcon4(ImageIcon icon4)
    {
        this.icon4 = icon4;
    }
}
