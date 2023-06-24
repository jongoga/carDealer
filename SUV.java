/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autosalloni;

/**
 *
 * @author Jon
 */
public class SUV extends Automjeti{
    
    private boolean eshte4x4;
    
    public SUV(String nrShasise, String prodhuesi, int vitiProdhimit,boolean eshte4x4){
        super(nrShasise, prodhuesi, vitiProdhimit);
        this.eshte4x4=eshte4x4;
    }
    
    public boolean getEshte4x4(){
        return eshte4x4;
    }
    public void setEshte4x4(boolean eshte4x4){
        this.eshte4x4=eshte4x4;
    }
    
    @Override
    public String toString(){
        return "SUV"+super.toString()+" : "+ (eshte4x4 ? " " : "nuk eshte4x4");
    }
    
}
