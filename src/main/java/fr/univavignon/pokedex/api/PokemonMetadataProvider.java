package fr.univavignon.pokedex.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of the {@link IPokemonMetadataProvider} interface to provide metadata for Pokémon.
 * This class provides the logic for retrieving metadata for Pokémon.
 * 
 */
public class PokemonMetadataProvider implements IPokemonMetadataProvider {
    /**
     * The map of Pokémon metadata.
     */
    private final Map<Integer, PokemonMetadata> metadataMap;

    /**
     * Constructor for the PokemonMetadataProvider class.
     * Initializes the metadata for Pokémon.
     */
    public PokemonMetadataProvider() {
        metadataMap = new HashMap<>();
        // Initialize Pokémon metadata (example)
        metadataMap.put(0, new PokemonMetadata(0, "Bulbasaur", 126, 126, 90));
        metadataMap.put(1, new PokemonMetadata(1, "Ivysaur", 156, 158, 120));
        metadataMap.put(2, new PokemonMetadata(2, "Venusaur", 198, 200, 160));
        // Add more Pokémon here
    }

    /**
     * Retrieves the metadata of a Pokémon by its index.
     *
     * @param index The index of the Pokémon.
     * @return The metadata of the Pokémon.
     * @throws PokedexException if the metadata for the given index is not found.
     */
    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if (!metadataMap.containsKey(index)) {
            throw new PokedexException("Pokemon metadata not found for index: " + index);
        }
        return metadataMap.get(index);
    }
}