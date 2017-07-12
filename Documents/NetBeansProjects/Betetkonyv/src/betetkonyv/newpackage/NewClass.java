
package betetkonyv.newpackage;
import betetkonyv.Betetkonyv;

 class Betetkonyv_haszn2 
    {
    public static void main(String[] args)
    {
    
    Betetkonyv sajatBetetkonyv=new Betetkonyv(0,16);
    sajatBetetkonyv.befizetes(10000);
    
        System.out.println("hozam 5 év múlva");
        System.out.println("\t kamatos kamatozás nélkül:"+(int) sajatBetetkonyv.hozam(5));
        
        System.out.println("\t kamatos kamatozassal:"+(int) sajatBetetkonyv.hozamK(5));
        
    
    }
    }


