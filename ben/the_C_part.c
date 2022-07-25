#include <stdio.h>
#include <stdlib.h>

int main() {
    printf("Hello, I am C");

    // run shell script (currently loops back to C++)
    int status = system("./a.out");

}