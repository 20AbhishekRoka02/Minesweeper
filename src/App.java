import java.awt.*;
import java.awt.event.*;
// import java.awt.event.WindowListener;
import java.util.Random;

// import javax.swing.Action;



public class App implements WindowListener, ActionListener {
    

    
    Frame frame = new Frame();
    Button b;
    String [][][] grid3d = new String[9][3][3];

    App(){

        //Assigning random integer in range 1 to 6 to centre of grid
        int min=1;
        int max=6;
        
        Random random = new Random();
        for (int i = 0; i < grid3d.length; i++) {            
            grid3d[i][1][1] = ""+ (random.nextInt(max-min+1)+min);            
        }

        
        System.out.println("Resulting grid");
        for (int i = 0; i < grid3d.length; i++) {            
            System.out.println(grid3d[i][1][1]);            
        }

        //Added Random number to center of each grid.
        //------------------------Segment ends here------------------------------
        frame.setTitle("Minesweeper");  
        this.marticeCreator();    
        
        frame.setSize(500,500);
        frame.setResizable(false);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(this);

    }

    void marticeCreator(){
        b= new Button();
        b.setActionCommand("button action command");
        b.setBackground(Color.BLUE);
        b.setLabel("BLUE");

        b.setBounds(50,100,80,30);
        b.addActionListener(this);
        
        frame.add(b);
    }

    void printing(){
        System.out.println("Hello, World!");
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App gui = new App();
        gui.printing();
    }

    //From Action Listener
    public void actionPerformed(ActionEvent arg0){
        if (arg0.getSource() == b){
            System.out.println("Button b");
            Button clickedbtn = (Button) arg0.getSource();

            if (clickedbtn.getBackground() == Color.BLUE){
                clickedbtn.setBackground(Color.YELLOW);
                clickedbtn.setLabel("YELLOW");
            }
            else{
                clickedbtn.setBackground(Color.BLUE);
                clickedbtn.setLabel("BLUE");
            }

            
            System.out.println(clickedbtn.getBackground());
            
        }
        System.out.println("Button clicked!");
    }

    public void windowOpened(WindowEvent e){

    }

    
    public void windowClosing(WindowEvent e){
        frame.dispose();
        System.exit(1);

    }

    
    public void windowClosed(WindowEvent e){
        // frame.dispose();
        // System.exit(1);
    }

    
    public void windowIconified(WindowEvent e){

    }

    
    public void windowDeiconified(WindowEvent e){

    }


    public void windowActivated(WindowEvent e){

    }


    public void windowDeactivated(WindowEvent e){
      
        // frame.dispose();
        // System.exit(1);
    }


}
