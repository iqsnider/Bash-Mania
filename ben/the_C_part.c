#include <stdio.h>
#include <unistd.h>

int main() {
    printf("Hello, I am C");

    if (fork())
        execl("./c_to_rust.sh", "./c_to_rust.sh", NULL);

}
