package com.company;

public class JavaWilder {
    public String nom;
    public String prenom;
    public int age;

    public JavaWilder(String nom, String prenom, int age) {//Constructeur
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        }
        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


        public void sayHello(){//Methode SayHello permet d'afficher Bonjour + prenom + nom + age
            System.out.println("Bonjour " + getPrenom() + " " + getNom() + " vous avez " + getAge() + " ans !" );
        }
    }
