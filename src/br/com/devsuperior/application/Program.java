package br.com.devsuperior.application;

import br.com.devsuperior.entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Champion champion = new Champion();
        Champion champion2 = new Champion();

        System.out.println("Digite os dados do primeiro campeao: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        champion.setName(name);
        System.out.print("Vida inicial: ");
        int life = sc.nextInt();
        champion.setLife(life);
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        champion.setAttack(attack);
        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        champion.setArmor(armor);
        sc.nextLine();

        System.out.println("Digite os dados do segundo campeao 2: ");
        System.out.print("Nome: ");
        name = sc.nextLine();
        champion2.setName(name);
        System.out.print("Vida inicial: ");
        life = sc.nextInt();
        champion2.setLife(life);
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        champion2.setAttack(attack);
        System.out.print("Armadura: ");
        armor = sc.nextInt();
        champion2.setArmor(armor);

        System.out.print("Quantos turnos voce deseja executar? ");
        int turno = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= turno; i++) {

            System.out.printf("Resultado do turno %d:\n", i);

            champion.takeDamage(champion2);
            champion2.takeDamage(champion);

            System.out.println(champion.status());
            System.out.println(champion2.status());
            System.out.println();

            if (champion.getLife() == 0 || champion2.getLife() == 0) {
                break;
            }
        }
        System.out.println("FIM DO COMBATE!");
    }
}
