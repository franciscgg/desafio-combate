package br.com.devsuperior.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public void takeDamage(Champion other){
        int damage = other.attack - this.armor;
        if (damage < 1) {
            damage = 1;
        }
        this.life -= damage;

        if (this.life < 0) {
            this.life = 0;
        }
    }

    public String status() {
        if (life == 0) {
            return name + ": " + life + " de vida (morreu)";
        }
        return name + ": " + life + " de vida";
    }
}
