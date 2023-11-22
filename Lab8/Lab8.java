package Lab8;

import java.util.Map;

public class Lab8 {

    public static void main(String[] args) throws Exception {
       completeTasks(createVlog());
    }

    public static Vlog createVlog(){
       Vlog topVlogInUA = new Vlog(new Bloger("Top vlog in UA"));
       // Перше відео ---
       topVlogInUA.getVideos().put(topVlogInUA.newVideoID(), new Video("How to become a top blogger?")); // 0
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
       topVlogInUA.getVideos().put(topVlogInUA.newVideoID(), new Video("Why is the earth round?")); // 1
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

       // Update in lab 8
       // 1й комент
       secondVideo.getComments().put(secondVideo.newCommentID(), new VideoСomment("So cool video!"));
       VideoСomment firstComment = secondVideo.getComments().get(0);
       for(int i = 0; i < 20; i++){
              firstComment.addLike();
       }
       for(int i = 0; i < 8; i++){
              firstComment.addDislike();
       }
       // 2й комент
       
       secondVideo.getComments().put(secondVideo.newCommentID(), new VideoСomment("A lot of useful and new information, thank you"));
       VideoСomment secondComment = secondVideo.getComments().get(1);
       for(int i = 0; i < 16; i++){
              secondComment.addLike();
       }
       for(int i = 0; i < 3; i++){
              secondComment.addDislike();
       }
       // 3й комент
       secondVideo.getComments().put(secondVideo.newCommentID(), new VideoСomment("It was sooo boring"));
       VideoСomment thirdComment = secondVideo.getComments().get(2);
       for(int i = 0; i < 167; i++){
              thirdComment.addLike();
       }
       for(int i = 0; i < 26; i++){
              thirdComment.addDislike();
       }
       // ---

       return topVlogInUA;
    }
    // update in lab 8
    public static void completeTasks(Vlog value){
       // для наглядності виведемо усі відео
       System.out.println("\n_______________");
       for(Map.Entry<Integer, Video> entry : value.getVideos().entrySet()) {
              System.out.println("Video key = " + entry.getKey() + 
              ",\n Video name: '" + entry.getValue().getName() + "'.");
       }

       System.out.println("\n_______________");
       // а також усі коментарі під 2м відео
       for (Map.Entry<Integer, VideoСomment> entry : value.getVideos().get(1).getComments().entrySet()) {
              System.out.println("Comment key = " + entry.getKey() + 
              ",\n Comment text: '" + entry.getValue().getText() + "'.");
       }
    }
}