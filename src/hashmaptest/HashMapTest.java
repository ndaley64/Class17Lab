package hashmaptest;

import hashmaptest.Pokemon;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ndaley
 */
public class HashMapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pokemon squirtle = new Pokemon(1, "Squirtle", "Water", "Normal");
        Pokemon bulbasaur = new Pokemon(4, "Bulbasaur", "Grass", "Poison");
        Pokemon charmander = new Pokemon(7, "Charmander", "Fire", "Normal");
        
        Map<Integer,Pokemon> pokemans = new HashMap<Integer,Pokemon>();
        
        pokemans.put(squirtle.getNationalDexID(), squirtle);
        pokemans.put(bulbasaur.getNationalDexID(), bulbasaur);
        pokemans.put(charmander.getNationalDexID(), charmander);
        
        System.out.println("Charmander by key: ");
        System.out.println(pokemans.get(7).getName());
        
        System.out.println("");
        System.out.println("Entire map through for each loop: ");
        Set<Integer> pokemanKeys = pokemans.keySet();
        for(Integer key : pokemanKeys){
            System.out.println(pokemans.get(key).getName());
        }
    }
}