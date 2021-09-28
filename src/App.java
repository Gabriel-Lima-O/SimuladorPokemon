public class App {
    public static void main(String[] args) throws Exception {


        Pokemon meuPokemon = new Pokemon("Charmander", "Fogo", 25);
        Pokemon PokemonInimigo = new Pokemon("Squirtle", "Agua", 20);
        
        Batalha batalha1 = new Batalha();
               
        System.out.println("Seu Pokémon: ");
            
            meuPokemon.ExibirCaracteristicas();
        
        System.out.println("Pokémon Inimigo: ");
            PokemonInimigo.ExibirCaracteristicas();
        
        batalha1.meuPokemon(meuPokemon.getNome(),meuPokemon.getVida());
        batalha1.PokemonInimigo(PokemonInimigo.getNome(),PokemonInimigo.getVida());
        
        batalha1.Fight();  

    }
}
