import GLOOP.*;
public class Winterlandschaft extends Geschenk {
    private GLEntwicklerkamera kamera;
    private GLLicht  licht;  
    private GLHimmel himmel;
    private GLBoden  boden;
    Schneemann s1;
    Tanne t1;


    public Winterlandschaft(){
        kamera = new GLEntwicklerkamera(1920,1080);
        kamera.setzePosition(-600,400,800);
        licht  = new GLLicht();  
        boden  = new GLBoden("Schnee.jpg");
        himmel = new GLHimmel("Himmel.jpg");
        //s1 = new Schneemann (0,0);
        t1 = new Tanne (0,0);
    }
}
