package utils;

import java.io.File;

/**
 * Projeto de POO 2017
 * 
 * @author Luiz Eduardo
 * Baseado em material do Prof. Jose Fernando Junior
 */
public class Consts {
    public static final int CELL_SIZE = 32;
    public static final int NUM_CELLS_X = 15;
    public static final int NUM_CELLS_Y = 20;
    public static final int HEADER_SIZE = 2;
    public static final int SPRITE_CELL_SIZE = 48;
    
    public static final int WALK_STEP_DEC_PLACES = 1;
    public static final double WALK_STEP = 0.1;
    
    public static final String PATH = File.separator+"imgs"+File.separator;
    
    public static final int DELAY = 20;
    public static final int TIMER_FOGO = 40;
    
    public static enum Sprite {
        //Para a escolha das imagens do PacMan:
        PACMAN_CLOSE,
        PACMAN_LEFT_0,
        PACMAN_LEFT_1,
        PACMAN_RIGHT_0,
        PACMAN_RIGHT_1,
        PACMAN_TOP_0,
        PACMAN_TOP_1,
        PACMAN_BOTTOM_0,
        PACMAN_BOTTOM_1,

        CHERRY,
        STRAWBERRY,
        
        WALL_VERTICAL,
        WALL_HORIZONTAL,
        
        POWER_PELLETS,
        PACDOTS
    }
    
    public static enum Animation {
        PACMAN_LEFT,
        PACMAN_RIGHT,
        PACMAN_UP,
        PACMAN_DOWN
    }
    
    public static enum ImgCollection {
        PACMAN,
        FRUIT,
        WALL
    }
}
