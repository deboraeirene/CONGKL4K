/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conkgl4k;

import javax.swing.*;

/**
 *
 * @author MSA
 */
public class Player {
    int[] wilayah={6,6,6,6,6,6,0};
    private int Player;
    private ImageIcon[] Indicator;
    private String NickName;
    private String Difficult;
    
    public Player(int player,ImageIcon[] indic,String name,String Diff){
        this.Player=player;
        this.Indicator=indic;
        this.NickName=name;
        this.Difficult=Diff;
    }
    
    public Player(){
        
    }

    public int[] getWilayah() {
        return wilayah;
    }

    public void setWilayah(int[] wilayah) {
        this.wilayah = wilayah;
    }

    public int getPlayer() {
        return Player;
    }

    public void setPlayer(int Player) {
        this.Player = Player;
    }

    public ImageIcon[] getIndicator() {
        return Indicator;
    }

    public void setIndicator(ImageIcon[] Indicator) {
        this.Indicator = Indicator;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public String getDifficult() {
        return Difficult;
    }

    public void setDifficult(String Difficult) {
        this.Difficult = Difficult;
    }
    
}
