public class Pokemon {

    private String nome;
    private String tipo;
    private double level;
    private double vida = 150;
    private double ataque;
    private double defesa;

    public Pokemon(String nome, String tipo, double level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;

        calculaAtributos();

    }

    public String getNome() {
        return this.nome;
    }

    public double getVida() {
        return this.vida;
    }

    public double getAtaque() {
        return this.ataque;
    }

    public double getDefesa() {
        return this.defesa;
    }

    private void calculaAtributos() {
        switch (tipo) {
            case "Fogo":
                vida = vida - 20;
                ataque = 60;
                defesa = 20;
                break;

            case "Agua":
                vida = vida - 5;
                ataque = 40;
                defesa = 35;
                break;

            case "Planta":
                vida = vida + 20;
                ataque = 15;
                defesa = 60;
                break;

            case "Pedra":
                vida = vida + 25;
                ataque = 30;
                defesa = 60;
                break;
        }
        calculaBonus();
    }


    private void calculaBonus() {

        // Pi <3

        vida = vida +     (level * 3.14 / 2);
        ataque = ataque + (level * 3.14 / 4);
        defesa = defesa + (level * 3.14 / 6);

    }

    public void ExibirCaracteristicas() {

        System.out.println("Nome: " + nome + " | " + "Tipo: " + tipo + " | " + "Level: " + level + " | " + "Vida: "
                + vida + " | " + "Ataque: " + ataque + " | " + "Defesa: " + defesa + "\n");

    }

}