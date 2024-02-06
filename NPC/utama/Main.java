package utama;
import npc.*;

public class Main {
    public static void main(String[] args) {
        VillageNPC villager = new VillageNPC();

        villager.getStatus();
        villager.getName();

        EnemyNPC enemy = new EnemyNPC();

        enemy.getStatus();
        enemy.getName();
    }
}

// Output 1: "Ini adalah sebuah NPC Villager"

// Output 2: Program menghasilkan keluaran sesuai dengan permintaan daripada kelas main, yakni meminta menampilkan isi fungsi getStatus() dan getNama() dari fungsi kelas VillageNPC yang
// didefinisikan sebagai villager pada kelas main

// Output 3: Done!