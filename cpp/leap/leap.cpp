#include "leap.h"
#include <iostream>

namespace leap {

    bool is_leap_year(int year){
        
        if (year % 4 == 0){ // Might be a leap year

            if (year % 100 == 0){ // Might not be leap year

                if (year % 400 == 0){ // Except if it is
                    return true; // Divisible by 4, 100 and 400
                } else {
                    return false; // Divisible by 4 and 100 but not 400
                }
            }
            return true; // Divisible by 4
        }
        return false; // Not divisible by 4
    }

}  // namespace leap
