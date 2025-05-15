package loop;

import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        // 문자열의 길이가 5 이상인 단어의 개수를 출력하시오.
        List<String> words = List.of("apple", "cat", "banana", "dog", "grapes");
        int count = 0;
        for( int i = 0; i < words.toArray().length; i++) {
            if(words.get(i).length() > 5) {
                count++;
            }
        }
        System.out.println("문자열의 길이가 5이상인 단어의 개수 : " + count);
    }
}
