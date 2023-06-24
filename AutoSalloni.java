/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autosalloni;

/**
 *
 * @author Admin
 */
public class AutoSalloni {

    private String emri;
    private Automjeti[] automjetet;
    private int index=0;
    
    public AutoSalloni(String emri, int nrA){
        this.emri=emri;
        automjetet=new Automjeti[nrA]; 
    }
    
    public boolean ekziston (Automjeti a){
        for(int i=0;i<index;i++){
            if(automjetet[i].equals(a)){
                return true;
            }
        }return false;
    }
    
    
    public void shtoAutomjetin(Automjeti a){
        if(a==null){
            System.out.println("Nuk keni shtypur asnje automjet");
            return;
        }
        if(index== automjetet.length){
            System.out.println("Ska vend ne varg");
            return;
        }
        if(ekziston(a)){
            System.out.println("Automjeti ekziston ne varg");
            return;
        }
        automjetet[index++]=a;
    }
     public SUV SUVMeIVjeter(){
        if(index ==0){
            System.out.println("Nuk ka asnje SUV ne sallon");
            return null;
        }
        SUV meIVjeter=null;
        for(int i=0; i<index;i++){
            if(automjetet[i] instanceof SUV){
                SUV aktual =(SUV)automjetet[i];
                if(meIVjeter == null || aktual.getVitiProdhimit()>= meIVjeter.getVitiProdhimit()){
                    meIVjeter= aktual;
                }
            }
        }
        if(meIVjeter== null){
            System.out.println("NUk ka asnje SUV ne sallon");
        }return meIVjeter;
    }
    
    
    public static void main(String[] args) {
        AutoSalloni as=new AutoSalloni("Jon ",100);
        as.shtoAutomjetin(new Limuzina("S85dep54","Mercedes s500",2019,"zeze" ));
        as.shtoAutomjetin(new Limuzina("S8445dep54","AUDI A8",2019,"zeze" ));
        as.shtoAutomjetin(new Limuzina("S8255dep54","Mercedes s650",2019,"zeze" ));
        as.shtoAutomjetin(new SUV("S8255dep54","Mercedes GLE",2019,true ));
        SUV meIVjeter2= as.SUVMeIVjeter();
        as.shtoAutomjetin(new SUV("S8255dep54","Mercedes G650",2019,true ));
        SUV meIVjeter1= as.SUVMeIVjeter();
        as.shtoAutomjetin(new SUV("S8255dep54","BMW X6M",2018,true ));
        as.shtoAutomjetin (new Limuzina ("dsf3244 ", " BMW 750L ",2019,"Bardh"));
        Automjeti a=new Limuzina ("dsf3244", "BMW 750L",2019,"Bardh");
        Automjeti a1=new SUV ("dsf3244", "BMW X7M",2019,true);
        System.out.println("Automjeti: "+a+ (as.ekziston(a)? " " : " nuk "+ " ekziston " ) );
        System.out.println();
        SUV meIVjeter=as.SUVMeIVjeter();
        if(meIVjeter != null )
            System.out.println("SUV me i vjeter "+ meIVjeter);
        System.out.println();
    }
    
}
