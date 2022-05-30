package FactoryDP;

import java.util.Random;
import java.util.Scanner;

public class Game {
    static Random random = new Random();

    public static void main(String[] args) {

        Mario luigi = new Mario("luigi");
        Scanner scan = new Scanner(System.in);

        System.out.printf("Game On.\nYou are playing as [%s].\n Jump Attack is [%d] and Mushroom is [%d].\n\n", luigi.getName(), luigi.getJumpAttack(), luigi.getMushroomAttack());

        int counter = 0;

        while (luigi.getHealth() > 0) {
            
            // default id
            int id = EnemyFactory.BIRD;
            
            // random id
            int random = getRandom(0, 20);
            if (random >= 0 && random < 5) id = EnemyFactory.BIRD;
            if (random >= 5 && random < 15) id = EnemyFactory.TURTLE;
            if (random >= 15 && random < 20) id = EnemyFactory.DINOSAUR;


            // Create enemy
            Enemy enemy = EnemyFactory.createEnemy(id);

            enemy.showUp();
            System.out.println("\n");

            play(luigi, enemy, scan);

            counter++;
            if (counter > 5) break;

        }
        
        scan.close();
        System.out.println("\n\nYou Won!! Tat Tart Tart Ta!");

    }

    public static void play(Mario hero, Enemy enemy, Scanner scan) {

        while (enemy.getHealth() > 0 || hero.getHealth() > 0) {
            
            // get input from user
            System.out.print("What do you want to do? [1=Jump Attack / 2=Mushroom Attack]\nOption: ");
            int answer = scan.nextInt();
            
            int heroAttack = 0;
            
            // valid inputs: 1,2
            while(answer > 2 || answer < 1) {
                System.out.print("\nInvalid option!");
                System.out.print("\nWhat do you want to do? [1=Jump Attack / 2=Mushroom Attack]\nOption: ");
                answer = scan.nextInt();
            }
            
            if(answer == 1) {
                System.out.print("\nYou have jumped tryna dodge the enemy!");
                heroAttack = hero.getJumpAttack();
            }
            else if (answer == 2) {
                heroAttack = hero.getMushroomAttack();
                System.out.print("\nYou have used Mushroom to attack the enemy!");
            }
            
            enemy.takeDamage(heroAttack);

            if (enemy.getHealth() <= 0) {
                System.out.printf("Enemy %s died!%n", enemy.getName());
                break;
            }

            System.out.printf("\n\nEnemy %s is attacking...%n", enemy.getName());
            hero.setHealth(hero.getHealth() - enemy.attack());


            System.out.printf("%s's health is [%d]%n%n", hero.getName(), hero.getHealth());


            if (hero.getHealth() <= 0) {
                System.out.printf("%s is Dead! Health: [%d].", hero.getName(), hero.getHealth());
                System.out.println("Game Over!");
                System.exit(0);
            }

        }
        
    }

    public static int getRandom(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}