package com.pallindrome;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void printNonRepeating(String str){
        int freq[]=new int[26];//create frequency array

        Queue<Character>q=new LinkedList<>();

        for(int i=0;i<str.length();i++){//entering string characters into the queue
           char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;//increasing frequency

          while (!q.isEmpty() && freq[q.peek()-'a']>1){//till find first non repeating
              q.remove();
          }
          if (q.isEmpty()){
              System.out.print(-1+" ");

          }else {
              System.out.print(q.peek()+ " ");
          }

        }
        System.out.println();
    }

    public static void main(String[] args) {
	String str="aabccxb";
    printNonRepeating(str);
    }
}
