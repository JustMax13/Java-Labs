package Lab8;

// import java.util.HashSet;
import java.util.TreeMap;

public class Video {
    private int _freeCommentID;
    private String _name;
    private String _url;
    private int _views;
    private int _likes;
    private int _dislikes;
    // Lab 8
    private TreeMap<Integer, VideoСomment> _comments;

    // для того, щоб просто взяти значення индексу наступного коментаря
    public int getFreeCommentID() { return _freeCommentID; }
    // саме для створення id коментаря
    public int newCommentID(){
        return _freeCommentID++; 
    }

    public String getName() { return _name; }
    public String getURL() { return _url; }
    public int getViews() { return _views; }
    public void addViews() { _views++; }
    public int getLikes() { return _likes; }
    public void addLike() { _likes++; }
    public int getDislikes() { return _dislikes; }
    public void addDislike() { _dislikes++; }
    public TreeMap<Integer, VideoСomment> getComments() { return _comments;} // lab 8

    public Video(String name){
        _name = name;

        _freeCommentID = 0;
        _url = "VlogUA/" + name; // В реальності потрібно не ім'я, а ID
        _views = 0;
        _likes = 0;
        _dislikes = 0;
        _comments = new TreeMap<>();
    }

    public static boolean someCommentHaveMoreLikesThanVideo(Video video){
        int maxLikeOnComment = 0;
        for (VideoСomment comment : video.getComments().values()) {
            int currentCommentLikes = comment.getLikes();
            if(maxLikeOnComment < currentCommentLikes){
                maxLikeOnComment = currentCommentLikes;
            }
        }

        if(video.getLikes() < maxLikeOnComment){
            return true;
        } else {
            return false;
        }
        
    }
}
