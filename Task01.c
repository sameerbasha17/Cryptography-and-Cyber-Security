// TASK : 01

#include <stdio.h>
#include <string.h>
#include <conio.h>

int main() {
    const char *s = "Hello World";
    int i = 0;
    int length = strlen(s);
    clrscr();

    for(i; i < length; i++)
    {
        char c = s[i] ^ 0;
        printf("%c ", c);
    }

    getch();
    return 0;
}