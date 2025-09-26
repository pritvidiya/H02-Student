package h02;

import fopbot.Direction;
import fopbot.Robot;

import h02.frameWork.*;

/**
 * Main entry point in executing the program.
 *
 */
public class Main {
    public static final int WORLD_SIZE = 20;
    private static final int RANDOM_NUMBER = (int) (Math.random() * 3);
    private static final WorldType WORLD_TYPE = WorldType.WALL_WORLD; // TODO: change WorldType.WALL_WORLD to WorldType.BLOCK_WORLD if you want to test H2.2

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        AbstractWorld world = WorldFactory.createWorld(WORLD_TYPE, WORLD_SIZE);
        world.start();

        if (WORLD_TYPE == WorldType.WALL_WORLD) {
            // TODO: H2.1.1 (student implementation of robot)

            // TODO: H2.1.2 (student implementation for WALL_WORLD)

        }

        if (WORLD_TYPE == WorldType.BLOCK_WORLD){
            RobotFactory robotFactory = new RobotFactory(world);
            Robot blockRobot = robotFactory.createRobot();
            // TODO: H2.2 (student implementation for BlOCK_WORLD)

        }
    }
}

