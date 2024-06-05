// @ts-check

/**
 * Implement the classes etc. that are needed to solve the
 * exercise in this file. Do not forget to export the entities
 * you defined so they are available for the tests.
 */


import { Size } from './size.js';
import { Point } from './point.js';


const SIZE = new Size(80, 60);
const POINT = new Point();

//console.log(SIZE.getHeight());

POINT.move(10, 70);
//console.log(POINT.getY());


class ProgramWindow {
    constructor(){
        this._screenSize = new Size(800, 600);
        this._size = new Size(700, 500);
        this._position = new Point();
    }

    /**
     * Resize ProgramWindow with following limitations;
     *  - Minimum width and height is 1
     *  - If resized window exeeds screen, it is to be clipped
     * @param {Size} size
     */
    resize(size){

        // Check if width or height is less than 1
        if(size.getWidth() < 1){size.resize(1, size.getHeight());}
        if(size.getHeight() < 1){size.resize(size.getWidth(), 1);}

        // Check if new width exeeds window
        if(this._position.getX() + size.getWidth() > this._screenSize.getWidth()){
            size.resize(
                        size.getWidth() - ((this._position.getX() + size.getWidth()) - this._screenSize.getWidth()),
                        size.getHeight());
        }

        // Check if new height exeeds window
        if(this._position.getY() + size.getHeight() > this._screenSize.getHeight()){
            size.resize(
                        size.getWidth(),
                        size.getHeight() - ((this._position.getY() + size.getHeight()) - this._screenSize.getHeight()));
        }

        this._size.resize(size.getWidth(), size.getHeight());
    }
}

const PROGRAM_WINDOW = new ProgramWindow();

let i = 5;
i = i > 0 ? 6 : 4;

console.log(i);
