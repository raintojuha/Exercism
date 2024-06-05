/**
 * CHEAT SHEET
 * I'll gather useful conepts here from the excercises
 */

console.log("Hello World!");


// Using functions, constants and variables in other files
export const THIS_IS_A_CONSTANT = 0;

export function returnsTrue(){
    return true;
}

import {
    // eslint-disable-next-line import/named
    THIS_IS_A_CONSTANT,
    returnsTrue
  } from './cheat-sheet.js';


// Single line boolean checks
// (if statement) ? then : else

return knightIsAwake ? false : true;
return (petDogIsPresent && !archerIsAwake) || (!petDogIsPresent && !archerIsAwake && !knightIsAwake && prisonerIsAwake) ? true : false;

let i = 5;
i = i > 0 ? 6 : 4;
// i = 6