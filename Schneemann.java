
import GLOOP.*;


public class Schneemann{
  GLKugel k1;
  GLKugel k2;
  GLKugel k3;
  GLKugel k4,k5,k6,k7;
  GLZylinder z1;
  GLZylinder z2;
  GLKegel kg1;


  
   
    public Schneemann(double pX ,double pZ)
    {
      k1 = new GLKugel (pX,75,pZ,110);
      k2 = new GLKugel (pX,200,pZ,80);
      k3 = new GLKugel (pX,300,pZ,50);
      
      z1 = new GLZylinder (pX,350,pZ,75,5);
      z1.drehe(90,0,0);
      
      z2 = new GLZylinder (pX,390,pZ,35,80);
      z2.drehe (90,0,0);
      
      kg1 = new GLKegel (pX-50,pZ+300,pZ,8,70);
      kg1.drehe (0,90,0);
      
      k4 = new GLKugel (pX-50,pZ+320,15,5);
      k4.setzeFarbe (0,0,0);
      
      k5 = new GLKugel (pX-50,pZ+320,-15,5);
      k5.setzeFarbe (0,0,0);
      
      k6 = new GLKugel (pX-110,pZ+75,0,5);
      k6.setzeFarbe (0,0,0);
      
      //k7 = new GLKugel (pX
      
      
      z1.setzeFarbe (0,0,0) ;
      z2.setzeFarbe (0,0,0) ;
      kg1.setzeTextur ("orange.jpg") ;
      
    }

   
    
  }
