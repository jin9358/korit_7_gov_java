package loop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        // 중복된 단어를 빼고 출력하시오.
        List<String> words = List.of("apple", "banana", "apple", "grape", "banana");
//        Set<String> setWords = new HashSet<>();
//        for(int i = 0; i < words.size(); i++) {
//            setWords.addAll(words);
//        }
//        System.out.println(setWords);
        List<String> words2 = words.stream().distinct().collect(Collectors.toList());
        System.out.println(words2);
    }
}
