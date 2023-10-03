package me.mdzs.ais3.domain;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class UserInput stores input from user's checkboxes and interprets it by
 * their meaning.
 */
public class UserInput {

    /**
     * List of names of conditions (static).
     */
    private final List<String> conditionNames = List.of("petIsNervous", "furnitureSways",
            "windowsRattling", "waterSpillsOut", "bricksCrack","furnitureMoves",
            "windowsBurst", "bigWavesOnWater", "brickWallsFall", "treeBranchesFall",
            "hugeStructuralDamage", "cracksInTheGround", "bridgesCollapse","railwayTracksBend",
            "curvatureOfTheHorizon", "objectsThrownUpInAir");

    /**
     * Map of conditions and their values.
     */
    public final Map<String, Boolean> value;

    /**
     * Constructor of UserInput class.
     * @param input list of booleans from checkboxes
     */
    public UserInput(@NotNull List<Boolean> input) {
        value = new HashMap<>();
        for (int i = 0; i < input.size(); i++) {
            value.put(conditionNames.get(i), input.get(i));
        }
    }
}
