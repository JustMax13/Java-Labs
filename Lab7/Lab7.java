package Lab7;

import java.util.List;

public class Lab7 {
    // Варіант 24: 
    // Класи:
           // - Відеоблог (відеоблогер, список відео)
           // - Відео (назва, URL, кількість переглядів, кількість лайків, кількість дізлайків,
           // список коментарів)
           // - Коментар (текст, кількість лайків, кількість дізлайків)
    // Задача:
           // ітератор 'c' - 1) Знайти загальну сумарну кількість переглядів усіх відео разом
           // ітератор 'b' -2) Визначити, чи є коментар, що набрав лайків більше, ніж відео, до якого він
           // дописаний
           // ітератор 'a' -3) Визначити відео, що набрало найбільшу кількість дізлайків. Якщо таких відео
           // декілька, то скласти їх список. Якщо таке відео одне, цей список повинен мати
           // один елемент. Якщо таких відео немає, список має бути порожнім (без елементів)

    public static void main(String[] args) throws Exception {
       completeTasks(createVlog());
    }

    public static Vlog createVlog(){
       Vlog topVlogInUA = new Vlog(new Bloger("Top vlog in UA"));
       // Перше відео ---
       topVlogInUA.getVideos().add(new Video("How to become a top blogger?")); // 0
       Video firstVideo = topVlogInUA.getVideos().get(0);
       for(int i = 0; i < 349; i++){
              firstVideo.addViews();
       }
       for(int i = 0; i < 226; i++){
              firstVideo.addLike();
       }
       for(int i = 0; i < 14; i++){
              firstVideo.addDislike();
       }

       // ---
       // Друге відео ---
       topVlogInUA.getVideos().add(new Video("Why is the earth round?")); // 1
       Video secondVideo = topVlogInUA.getVideos().get(1);
       for(int i = 0; i < 286; i++){
              secondVideo.addViews();
       }
       for(int i = 0; i < 139; i++){
              secondVideo.addLike();
       }
       for(int i = 0; i < 67; i++){
              secondVideo.addDislike();
       }

       // 1й комент
       secondVideo.getComments().add(new VideoСomment("So cool video!"));
       VideoСomment firstComment = secondVideo.getComments().get(0);
       for(int i = 0; i < 20; i++){
              firstComment.addLike();
       }
       for(int i = 0; i < 8; i++){
              firstComment.addDislike();
       }
       // 2й комент
       secondVideo.getComments().add(new VideoСomment("A lot of useful and new information, thank you"));
       VideoСomment secondComment = secondVideo.getComments().get(1);
       for(int i = 0; i < 16; i++){
              secondComment.addLike();
       }
       for(int i = 0; i < 3; i++){
              secondComment.addDislike();
       }
       // 3й комент
       secondVideo.getComments().add(new VideoСomment("It was sooo boring"));
       VideoСomment thirdComment = secondVideo.getComments().get(2);
       for(int i = 0; i < 167; i++){ // <--- Task 2
              thirdComment.addLike();
       }
       for(int i = 0; i < 26; i++){
              thirdComment.addDislike();
       }
       // ---

       return topVlogInUA;
    }
    public static void completeTasks(Vlog value){
       System.out.println("Task 1. Sum of views video in vlog: " + Vlog.sumOfVideoViews(value));
       System.out.println("Task 2. The comment under the video got more likes: "
        + Video.someCommentHaveMoreLikesThanVideo(value.getVideos().get(1)));

       System.out.println("Task 3. The largest number of dislikes on a video: "); 
       List<Video> mostUnlikedVideo =  Vlog.mostUnlikedVideos(value);
       for (Video video : mostUnlikedVideo) {
              System.out.println("\t'" + video.getName() + "'");
       }
    }
}