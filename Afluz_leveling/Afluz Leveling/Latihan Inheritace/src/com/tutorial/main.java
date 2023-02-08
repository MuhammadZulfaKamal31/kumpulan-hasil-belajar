package com.tutorial;

public class main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Tanjirou", 10, 100);
        HeroStrength hero2 = new HeroStrength("Zenitsu", 5, 100);
        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
    }
}
