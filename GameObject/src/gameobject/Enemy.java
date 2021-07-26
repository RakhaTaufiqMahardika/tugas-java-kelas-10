/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;
public class Enemy extends GameObject {
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
        System.out.println("Nama Enemy = "+getName());
        System.out.println("Hit Points = "+getHP());
        System.out.println("Damage = "+getdamage());
 
    }

}