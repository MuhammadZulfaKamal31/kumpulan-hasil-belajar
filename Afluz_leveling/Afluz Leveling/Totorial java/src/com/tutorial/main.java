package com.tutorial;

class Player {
    String name;// default, dia akan dibaca dan ditulis
    public int exp;// pubic, dia akan di bisa dibaca dan di tulis
    private int health;// private hanya akan dibaca dan ditulis di dalam kelas

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default modifier acces
    void display() {// di nulis outputnya di dalam class

        System.out.println("\nName\t: " + this.name);
        System.out.println("\nexp\t: " + this.exp);
        System.out.println("\nhealth\t: " + this.health);// membaca, tapi di dalam class
        tambahExp();
    }

    // public// ini kita bisa ubah nama dengan public yang ada di dalam class
    public void ubahName(String namaBaru) {
        this.name = namaBaru;
    }

    // private// ini merubah prifate dengan void
    private void tambahExp() {
        this.exp += 100;
    }
}

public class main {
    public static void main(String[] args) {

        Player player1 = new Player("", 0, 0);

        // =====default=================================//
        System.out.println(player1.name);// membaca data
        player1.name = "mutiara";// menulis data// ini mengubah nama dengan assigment, di dalam main
        System.out.println(player1.name);// membaca data

        // =============public================
        System.out.println(player1.exp);
        player1.exp = 27;
        System.out.println(player1.exp);

        // =============privata=============
        // System.out.println(player1.health);
        // player1.health = 27;
        // System.out.println(player1.health);

        // ==========================methode============

        // =========default=================
        player1.display();// dipangil
        // public
        player1.ubahName("zulfa");
        player1.display();

        // prifate
    }
}
