package loop;

import java.util.List;
import java.util.function.Predicate;

public class Main4 {
    public static void main(String[] args) {
        // 학생들 중 가장 점수가 높은 학생의 이름을 출력하시오.
        List<Student> students = List.of(
        );

        Student maxStudent = null;
        for(Student s : students) {
            if(maxStudent == null) {
                maxStudent = s;
            } else if(maxStudent.getScore() < s.getScore()) {
                maxStudent = s;
            }
        }
        if(maxStudent != null) {
            System.out.println(maxStudent.getName());
        }
    }
}