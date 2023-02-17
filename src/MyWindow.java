import java.awt.*; //Frame package
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by dev on 30/10/2015.
 */
public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            } // says if you click thee close button, the window closes
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim Buchalka", 60, 100);
    }

    //all this stuff is really just to demonstrate that I can do a lot of stuff and only hve to write a small amount of code
//by importing Java inbuilt packages that allow for things like front changse, window pop up, drawing, etc.

    //what I can also do is to create a package where the main method is stored in a different package. Then can
    // import package into a different project if that package contains code you want to reuse. If I want to individually
    // select classes I want to reuse, I can go into finder on computer and go through folder pulldowns to find a class
    // and copy and paste it into thee appropraite folder of a new project
}

