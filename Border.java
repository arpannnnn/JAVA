import java.awt.*;
  class Border{
    public Border(){
           Button north=new Button("North");
           Button south=new Button("south");
           Button east=new Button("east");
           Button west=new Button("west");
           Button center=new Button("center");
           Frame F= new Frame ("Border");
           F.setSize(400,300);
           F.add(north,BorderLayout.NORTH);
           F.add(south,BorderLayout.SOUTH);
           F.add(east,BorderLayout.EAST);
           F.add(west,BorderLayout.WEST);
           
        F.add(center);
           F.setVisible(true);
           F.setLayout(new BorderLayout());
           

            

    }
    public static void main(String[]args) {
        new Border();
        
    }
  }