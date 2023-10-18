package org.example;

public class Main {
        public static void main(String[] args) {
            Boss boss = new Boss();
            boss.setName("Boss");
            boss.setHealth(900);
            boss.setDamage(100);

            Weapon bossWeapon = new Weapon();
            bossWeapon.setWeaponType(WeaponType.SWORD);
            bossWeapon.setWeaponName(" Sword");
            boss.setWeapon(bossWeapon);

            System.out.println("Boss Name: " + boss.getName());
            System.out.println("Boss Health: " + boss.getHealth());
            System.out.println("Boss Damage: " + boss.getDamage());
            System.out.println("Boss Weapon Type: " + boss.getWeapon().getWeaponType());
            System.out.println("Boss Weapon Name: " + boss.getWeapon().getWeaponName());
        }
    }

