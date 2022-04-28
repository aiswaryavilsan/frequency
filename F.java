package com.learn;

public class F
{
    public static void main(String[] args) {
        String s1 = "frequency of characters in string";
        int[] f = new int[s1.length()];
        int x, y;
        char string[] = s1.toCharArray();

        for(x = 0; x <s1.length(); x++) {
            f[x] = 1;
            for(y = x+1; y <s1.length(); y++) {
                if(string[x] == string[y]) {
                    f[x]++;
                    string[y] = '0';
                }
            }
        }
        System.out.println("Characters with frequencies");
        for(x = 0; x <f.length; x++) {
            if(string[x] != ' ' && string[x] != '0')
                System.out.println(string[x] + ":" + f[x]);
        }
    }
}
