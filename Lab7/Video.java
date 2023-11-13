package Lab7;

import java.util.ArrayList;
import java.util.List;

public class Video {
    private String _name;
    private String _url;
    private int _views;
    private int _likes;
    private int _dislikes;
    private List<VideoСomment> _comments;

    public String getName() { return _name; }
    public String getURL() { return _url; }
    public int getViews() { return _views; }
    public void addViews() { _views++; }
    public int getLikes() { return _likes; }
    public void addLike() { _likes++; }
    public int getDislikes() { return _dislikes; }
    public void addDislike() { _dislikes++; }
    public List<VideoСomment> getComments() { return _comments;}

    public Video(String name){
        _name = name;

        _url = "VlogUA/" + name; // В реальності потрібно не ім'я, а ID
        _views = 0;
        _likes = 0;
        _dislikes = 0;
        _comments = new ArrayList<>();
    }

    public static boolean someCommentHaveMoreLikesThanVideo(Video video){
        // ітератор: b
        // можна зробити через for з ітератором 'b', але через foreath зручніше
        int maxLikeOnComment = 0;
        for (VideoСomment comment : video.getComments()) {
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