import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // 파일명 : Collections.java
        // 작성자 : 202010629 글로벌경영학과 박상우
        // 작성일 : 2024.11.26
        // 내용 : 문제은행에서 랜덤하게 문제들을 선택하여 중복되지 않게 문제를 출력하는 Collections 클래스

        System.out.println("hw13_1 : 박상우");
        String[] questionBank = {
                "파란색이 영어로 무엇인가?",
                "빨간색이 영어로 무엇인가?",
                "사과는 영어로 무엇인가?",
                "한국의 수도는?",
                "일본의 수도는?",
                "1+2는?",
                "9-3은?",
                "99-33은?",
                "3*2는?",
                "12/3은?"
        };
        Random random = new Random();

        HashSet<Integer> selectedQuestions = new HashSet<>();

        // 5개의 문제 선택(contains()를 활용하여 아직 포함되지 않은 문제들을 추가(중복 방지))
        while (selectedQuestions.size() < 5) {
            int index = random.nextInt(questionBank.length);
            if (!selectedQuestions.contains(index)) {
                selectedQuestions.add(index);
            }
        }

        // 배열에 문제를 저장한 순서와 관계없이 랜덤하게 출력하기 위해 선택된 문자를 저장할 배열을 설정
        String[] selectedQuestionsArray = new String[5];
        int i = 0;

        for (int index : selectedQuestions) {
            selectedQuestionsArray[i] = questionBank[index];
            i++;
        }

        for (int j = selectedQuestionsArray.length - 1; j > 0; j--) {
            int k = random.nextInt(j+1); // 1~5 사이 랜덤 선택
            String temp = selectedQuestionsArray[j];
            selectedQuestionsArray[j] = selectedQuestionsArray[k];
            selectedQuestionsArray[k] = temp;
        }
        int questionNumber = 1;
        for (int n = 0; n < selectedQuestionsArray.length; n++) {
            System.out.println(questionNumber + ") " + selectedQuestionsArray[n]);
            questionNumber++;
        }
    }
}
