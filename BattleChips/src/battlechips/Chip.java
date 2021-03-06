/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlechips;

/**
 *
 * @author paulo
 */
public class Chip {
    
    public static final int BOTAO = 1;
    public static final int RESIS = 2;
    public static final int DECOD = 3;
    public static final int MICRO = 4;
    
    
    private final ChipPiece[] Pieces;
    private int numero;         //numero de identificação do chip
    private final int tipo;
    private int n_Pieces;
    private boolean crashed;
    private int Orientation;
    
     
    
    public Chip(int orient,int tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
        this.Orientation = orient;
        Pieces = new ChipPiece[tipo];
    }
    
    public int getTipo() {
        return tipo;
    }     
    
    public int getOrient() {
        return Orientation;
    }
    
    
    public int getIdent() {
        return numero;
    }
    
    public void setIdent(int ident) {
        numero = ident;
    }
    
    public ChipPiece getPiece(int index) {
        return Pieces[index];
    }
    
    public void addPiece (ChipPiece piece, int position) {
        Pieces[position-1] = piece;
    }
    
    public boolean checkCrached () {
        boolean iscrashed = true;
        for (int i=0; i<tipo; i++) {
            if (!Pieces[i].Iscrashed()) {
                iscrashed = false;
            }
        }
        crashed = iscrashed;
        return crashed;
    }
    
    public int NumCrashed () {
        int soma = 0;
        for (int i=0; i<tipo; i++) {
            if (Pieces[i].Iscrashed()) {
                soma++;
            }
        }
      return soma;
    }
    
       
    
}
