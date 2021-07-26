/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;
public class Hero extends GameObject {
    
    public void setID(int ID){
        this.ID=ID;
    }
    public int getID(){
        return ID;
    }
    public void setName(String name){
        super.name=name;
    }
    public String getName(){
        return name;
    }
    public void setHP(int HP){
        super.HP=HP;
    }
    public int getHP(){
        return HP;
    }
    public void setdamage(int damage){
        super.Damage=damage;
    }
    public int getdamage(){
        return Damage;
    }
    
    public void cetak(){
        System.out.println("Nama Hero  = "+getName());
        System.out.println("Hit Points = "+getHP());
        System.out.println("Damage     = "+getdamage());
        System.out.println("ID = "+getID());
    }
}
