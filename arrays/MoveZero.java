package arrays;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    void pushZerosToEnd(int[] arr) {
        int Nonzeroindex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[Nonzeroindex++] = arr[i];
            }
        }
        while(Nonzeroindex <arr.length){
            arr[Nonzeroindex++] = 0;
        }
    }
        public int longestUniqueSubstr(String s) {
            int maxlen = 0;
            Deque<Character> deque = new LinkedList<>(); 
            for(int end=0; end<s.length(); end++){
                char ch = s.charAt(end);
                while(deque.contains(ch)){
                    deque.pollFirst();
                }
                deque.addLast(ch);
                maxlen = Math.max(maxlen, deque.size());
            }
            return maxlen;
        }
    }