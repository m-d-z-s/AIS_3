package me.mdzs.ais3.domain;

public class Solver {
    private final UserInput userInput;
    public Solver(UserInput userInput) {
        this.userInput = userInput;
    }

    /**
     * Calculates the degree of earthquake by user's input.
     * @return degree of earthquake
     * @throws InvalidConditionException if user's input is invalid
     */
    public String calculate() throws InvalidConditionException {
        String result = "";

        if (userInput.value.get("curvatureOfTheHorizon") || userInput.value.get("objectsThrownUpInAir"))
            result = "Degree 12";
        else if (userInput.value.get("railwayTracksBend"))
            result = "Degree 11";
        else if (userInput.value.get("bridgesCollapse"))
            result = "Degree 10";
        else if (userInput.value.get("hugeStructuralDamage") || userInput.value.get("cracksInTheGround"))
            result = "Degree 9";
        else if (userInput.value.get("brickWallsFall") || userInput.value.get("treeBranchesFall"))
            result = "Degree 8";
        else if (userInput.value.get("bigWavesOnWater"))
            result = "Degree 7";
        else if (userInput.value.get("bricksCrack") || userInput.value.get("furnitureMoves") || userInput.value.get("windowsBurst"))
            result = "Degree 6";
        else if (userInput.value.get("waterSpillsOut"))
            result = "Degree 5";
        else if (userInput.value.get("windowsRattling"))
            result = "Degree 4";
        else if (userInput.value.get("furnitureSways"))
            result = "Degree 3";
        else if (userInput.value.get("petIsNervous"))
            result = "Degree 1-2";
        else throw new InvalidConditionException();

        return result;
    }
}
