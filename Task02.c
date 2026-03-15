 // TASK : 2
 #include<stdio.h>
 #include<conio.h>
 #include<string.h>
 int main()
 {
     const char *s = "Hello world";
     int i = 0, length = strlen(s);
     clrscr();

     printf("After doing AND operation with 127: \n");
     for(i; i < length; i++)
     {
	 char ch = s[i] & 127;
	 printf("%c ", ch);
     }

     printf("\nAfter doing XOR operation with 127 : \n");
     for(i = 0; i < length; i++)
     {
	 char ch = s[i] ^ 127;
	 printf("%c ", ch);
     }

     getch();
     return 0;
 }