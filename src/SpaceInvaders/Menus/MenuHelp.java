package SpaceInvaders.Menus;

import Main.Game;
import SpaceInvaders.Game.GAMESTATE;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static javax.imageio.ImageIO.*;
import static javax.imageio.ImageIO.read;

public class MenuHelp extends JPanel implements ActionListener
{

    //  game object
    private SpaceInvaders.Game.Game gameSpaceInvaders;

    public static final int width = Game.WIDTH, height = Game.HEIGHT;

    //  labels
    private JLabel headLine, underLine, info;

    //  picture
    private ImageIcon helpImage;

    //  buttons
    private JButton bMainMenu;

    //
    private JLabel background;
    private ImageIcon backPic;

    //  image for gamelabel
    private ImageIcon gamePic;

    public MenuHelp(JFrame frame, SpaceInvaders.Game.Game gameSpaceInvaders) throws IOException
    {
        //  use for button actions
        this.gameSpaceInvaders = gameSpaceInvaders;

        //  set size of the panel
        this.setPreferredSize(new Dimension(width, height));
        this.setMaximumSize(new Dimension(width, height));
        this.setMinimumSize(new Dimension(width, height));

        //  background picture
        this.backPic = new ImageIcon(read(getClass().getResource("/spacebackground.png")));

        //  help text picture
        this.helpImage = new ImageIcon(read(getClass().getResource("/HELP.png")));

        //  background image
        this.background = new JLabel();
        this.background.setBounds(0, 0, 1300, 900);
        this.background.setIcon(backPic);

        //  set headLine
        this.headLine = new JLabel();
        this.headLine.setBounds(100, 30, 750, 60);
        this.headLine.setForeground(Color.WHITE);
        this.headLine.setFont(new Font("Times New Roman", Font.BOLD, 60));
        this.headLine.setText("HELP");

        //  set underLine
        this.underLine = new JLabel();
        this.underLine.setBounds(100, 90, 300, 40);
        this.underLine.setForeground(Color.WHITE);
        this.underLine.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.underLine.setText("-INFORMATION OF THIS GAME");

        //  set info
        this.info = new JLabel();
        this.info.setBounds(100, 200, 800, 500);
        this.info.setIcon(helpImage);

        this.bMainMenu = new JButton();
        this.bMainMenu.setForeground(Color.white);
        this.bMainMenu.setFont(new Font(("Times New Roman"), Font.BOLD, 20));
        this.bMainMenu.setText("MAIN MENU");
        this.bMainMenu.setBackground(Color.white);
        this.bMainMenu.setOpaque(false);
        this.bMainMenu.setContentAreaFilled(false);
        this.bMainMenu.setBounds(900, 30, 200, 50);

        //  set actionlisteners to the buttons
        this.bMainMenu.addActionListener(this);


        //  add components to the panel
        this.add(headLine);
        this.add(underLine);
        this.add(bMainMenu);
        this.add(info);
        this.add(background);

        //  set components to not visible
        this.bMainMenu.setVisible(false);
        this.headLine.setVisible(false);
        this.underLine.setVisible(false);
        this.info.setVisible(false);
        this.background.setVisible(false);


        //  add to frame
        frame.add(headLine);
        frame.add(underLine);
        frame.add(bMainMenu);
        frame.add(info);
        frame.add(background);
    }

    //  actions for buttons
    public void actionPerformed(ActionEvent e)
    {
        //  remove component from the screen
        if (e.getSource() == this.bMainMenu)
        {
            this.setVisible(false);
            gameSpaceInvaders.getMenuHome().setVisible(true);
        }
    }


    //  set this visible or not
    public void setVisible(boolean isVisible)
    {
        if (isVisible)
        {
            //  set the whole panel to visible
            this.bMainMenu.setVisible(true);
            this.headLine.setVisible(true);
            this.underLine.setVisible(true);
            this.info.setVisible(true);
            this.background.setVisible(true);
        }
        if (!isVisible)
        {
            //  set not visible
            this.bMainMenu.setVisible(false);
            this.headLine.setVisible(false);
            this.underLine.setVisible(false);
            this.info.setVisible(false);
            this.background.setVisible(false);
        }
    }
}
