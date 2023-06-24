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
public class Limuzina extends Automjeti {
    
    private String ngjyra;
    
    public Limuzina (String nrShasise, String prodhuesi, int vitiProdhimit, String ngjyra){
        super(nrShasise , prodhuesi, vitiProdhimit);
        this.ngjyra=ngjyra;
    }
    
    public String getNgjyra(){
        return ngjyra;
    }
    public void setNgjyra(String ngjyra){
        this.ngjyra=ngjyra;
    }
    
    @Override
    public String toString(){
        return "Limuzina"+super.toString()+" : "+ngjyra; 
    }
    
}
