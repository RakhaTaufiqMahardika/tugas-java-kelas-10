/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;

/**
 *
 * @author Dan
 */
import java.util.Scanner;
public class Play {
    public static void main(String[] args){
        
        
        Hero Hero = new Hero();
        Enemy Enemy = new Enemy();
        Scanner input = new Scanner(System.in);
        GameObject GameObject = new GameObject();
        GameObject.display();
        
        System.out.print("Masukkan ID Hero: ");
        Hero.setID(input.nextInt());
        
        System.out.print("Masukkan nama Hero: ");
        Hero.setName(input.next());
        
        System.out.print("Masukkan HP Hero: ");
        Hero.setHP(input.nextInt());
        
        System.out.print("Masukkan Damage Hero: ");
        Enemy.setdamage(input.nextInt());
        
        System.out.println("---------------");        
        
        System.out.print("Masukkan nama Enemy: ");
        Enemy.setName(input.next());
        
        System.out.print("Masukkan HP Enemy: ");
        Enemy.setHP(input.nextInt());
        
        System.out.print("Masukkan Damage Enemy: ");
        Enemy.setdamage(input.nextInt());
        
        
        
        Hero.cetak();
        Enemy.cetak();
        
        if (Hero.HP>Enemy.HP){
            System.out.println(Hero.name +" Winner from "+ Enemy.name);
        }
        else{
            System.out.println(Hero.name +" Defeat from "+ Enemy.name);
        }
    }
}
