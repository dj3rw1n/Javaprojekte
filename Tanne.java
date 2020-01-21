
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
    }

    
}
