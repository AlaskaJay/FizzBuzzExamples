#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int runs = 100;

void fizzbuzz_iter();
void fizzbuzz_recur();

void main() {
	fizzbuzz_recur();
}

void fizzbuzz_iter() {
	for(int i = 1; i <= runs; i++) {
		if(i % 3 == 0 && i % 5 == 0) {
			printf("FizzBuzz!");
		}
		else if(i % 3 == 0) {
			printf("Fizz");
		}
		else if(i % 5 == 0) {
			printf("Buzz");
		}
		else {
			printf("%i", i);
		}
		printf("\n");
	}
}

void fizzbuzz_recur_helper(int i, int max) {
	if(i <= max) {
		char* s = (char*)malloc(sizeof(char)*8);
		if(i % 3 == 0)
			strcat(s, "Fizz");
		if(i % 5 == 0)
			strcat(s, "Buzz");
		if(strlen(s) == 0) {
			printf("%i\n", i);
		} else if (strlen(s) == 8) {
			printf("%s!\n", s);
		} else {
			printf("%s\n", s);
		}
		fizzbuzz_recur_helper(i+1, max);
	}
}

void fizzbuzz_recur() {
	fizzbuzz_recur_helper(1, runs);
}