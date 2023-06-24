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
public class Automjeti {
    
    private String nrShasise;
    private String prodhuesi;
    private int vitiProdhimit;
    
    public Automjeti(String nrShasise, String prodhuesi,int vitiProdhimit){
        this.nrShasise=nrShasise;
        this.prodhuesi=prodhuesi;
        this.vitiProdhimit=vitiProdhimit;
    }
    
    public String getProdhuesi(){
        return prodhuesi;
    }
    public void setProdhuesi(String prodhuesi){
        this.prodhuesi=prodhuesi;
    }
    
    public int getVitiProdhimit(){
        return vitiProdhimit;
    }
    public void setVitiProdhimit(int vitiProdhimit){
        this.vitiProdhimit=vitiProdhimit;
    }
    
    public String getNrShasise(){
        return nrShasise;
    }
    
    @Override
    public String toString(){
        return nrShasise + " : " +prodhuesi+" - "+ vitiProdhimit;
    }
    
    @Override
    public boolean equals(Object obj){
       if(obj instanceof Automjeti){
            Automjeti a= (Automjeti) obj;
            return nrShasise.equals(a.getNrShasise());
        }return false;
    }
    
    
    
}
