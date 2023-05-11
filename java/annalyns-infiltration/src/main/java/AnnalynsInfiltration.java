class AnnalynsInfiltration {
	
	/**
	 * If knight is awake - can not fast attack
	 */
    public static boolean canFastAttack(boolean knightIsAwake) {
    	if(knightIsAwake) {
    		return false;
    	} else {
    		return true;
    	}
    }

    /**
     * If any one of the three are awake - can spy
     */
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake || archerIsAwake || prisonerIsAwake) {
        	return true;
        } else {
        	return false;
        }
    }

    /**
     * If prisoner is awake but acher is not - can 
     */
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
    	if(prisonerIsAwake && !archerIsAwake) {
    		return true;
    	} else {
    		return false;
    	}
    }

    /**
     * If pet dog is present
     * 		- archer must be asleep
     * 
     * If pet dog not present
     * 		- prisoner must be awake
     * 		- knight and arcer must be asleep
     */
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
    	if(petDogIsPresent && !archerIsAwake || prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
