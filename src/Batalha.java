public class Batalha {
    
    private double meuPokemonVida;
    private double PokemonInimigoVida;
    private String meuPokemonNome;
    private String PokemonInimigoNome;
    
    public void meuPokemon(String nome, double vida){
        
        this.meuPokemonVida = vida;
        this.meuPokemonNome = nome;
        
    }
    
    public void PokemonInimigo(String nome, double vida){
        
        this.PokemonInimigoVida = vida;
        this.PokemonInimigoNome = nome;
        
    }
    
    public void Fight(){
        
        System.out.println("A batalha vai começar!...");
        System.out.println("\n");
  
        
        if(meuPokemonVida > PokemonInimigoVida){
            
            System.out.println("Você venceu! Parabéns " + meuPokemonNome);
            
        }else{
            
            System.out.println("Você perdeu! Vencedor: " + PokemonInimigoNome);
            
        }
        
    }

}
