//code by CW Coleman
//save as JavaPlot.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Wait {
  public static void oneSec() {
    try {
      Thread.currentThread().sleep(1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
  public static void manySec(long s) {
     try {
       Thread.currentThread().sleep(s * 1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
      public static void millSec(long s) {
     try {
       Thread.currentThread().sleep(s);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
}


public class JavaPlot extends JFrame {
   public JavaPlot()
   {
      super( "Java Plot" );
      setSize(400,400);
      setVisible( true );
   }
   public void paint( Graphics g ){
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		    // only change code below this line
        int x, y, h, k, t;
        int iRed, iGreen, iBlue, aiRed, aiGreen, aiBlue;//integer RGB
        double sRed, sGreen, sBlue;// double start RGB
        double eRed, eGreen, eBlue;// double end RGB
        double aRed, aGreen, aBlue;// ajust RGB
        x = 168;  y = 368; h = 34; k = 20; t = 18;
        double theta;
        iRed = 255;
        iGreen = 255;
        iBlue = 255;
        aiRed = 255;  // adjust integer Red
        for (x = 0;x <800;x++){
		        if (iRed > 255) iRed = 0;
            if (iRed < 0) iRed = 255;
            g.setColor(new Color(iRed,iGreen,iBlue));
          //  g.drawLine(h,k,800-h,600+k);
            g.drawLine(t,k,450-h,600+k);
            iRed = iRed + aiRed;
            h = h + 1;
            k = k + 1;
		        System.out.println("Ctrl+c to stop. t = " + t+" h= "+h+" k ="+k);
		        Wait.millSec(125);  // call to Wait class
            // only change code above this line
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      }//end for
  }

// execute application
  public static void main( String args[] ){
    JavaPlot myobject = new JavaPlot();//change this
  	   	// adapter to handle only windowClosing event
        myobject.addWindowListener(
  			   new WindowAdapter() {
				      public void windowClosing( WindowEvent event )
				          {System.exit( 0 );}
                }  // end WindowAdapter
        ); // end call to addWindowListener
   }//end main
 }// end class Painter
