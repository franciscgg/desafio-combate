package br.com.devsuperior.application;

import br.com.devsuperior.entities.Champion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Champion> champions = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            Champion champion = new Champion();
            System.out.println("Digite os dados do" + i + " campeao:");
            System.out.print("Nome: ");
            champion.setName(sc.nextLine());
            System.out.print("Vida inicial: ");
            champion.setLife(sc.nextInt());
            System.out.print("Ataque: ");
            champion.setAttack(sc.nextInt());
            System.out.print("Armadura: ");
            champion.setArmor(sc.nextInt());
            System.out.println();
            sc.nextLine();
            champions.add(champion);
        }

        System.out.print("Quantos turnos voce deseja executar? ");
        int turno = sc.nextInt();
        System.out.println();

        Champion champion1 = champions.get(0);
        Champion champion2 = champions.get(1);

        for (int i = 1; i <= turno; i++) {
            System.out.printf("Resultado do turno %d:\n", i);

            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);

            System.out.println(champion1.status());
            System.out.println(champion2.status());
            System.out.println();

            if (champion1.getLife() == 0 || champion2.getLife() == 0) {
                break;
            }
        }
        System.out.println("FIM DO COMBATE!");
        sc.close();
    }
}
