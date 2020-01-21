
import GLOOP.*;
public class Tanne
{
    GLZylinder Stamm;
    GLKegel s1,s2,s3;
    
    
    
    public Tanne(double pX ,double pZ)
    {
        Stamm = new GLZylinder(pX,0,pZ,50,150);
        Stamm.drehe(90,0,0);
        Stamm.setzeTextur("braun.jpg");
        
        s1 = new GLKegel (pX, 150, pZ,150,150);
        s1.setzeTextur ("grün.jpg");
        s1.drehe (90,0,0);
        
        s2 = new GLKegel (pX, 250, pZ,150,150);
        s2.setzeTextur ("grün.jpg");
        s2.drehe (90,0,0);
        
        s3 = new GLKegel (pX, 350, pZ,150,150);
        s3.setzeTextur ("grün.jpg");
        s3.drehe (90,0,0);
        
    }

    
}
