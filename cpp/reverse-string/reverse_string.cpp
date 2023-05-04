#include "reverse_string.h"
#include <string>
#include <iostream>

namespace reverse_string {
	std::string reverse_string(std::string input) {
		int len = static_cast<int>(input.length());
		std::string reversed = "";

		for (int i = 0; i < len; i++) {
			int x = len - i - 1;
			reversed += input[x];
		}
		std::cout << reversed;
		return reversed;
	}
}  // namespace reverse_string
