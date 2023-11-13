package Lab7;
import java.util.ArrayList;
import java.util.List;

public class Vlog {
    private Bloger _bloger;
    private List<Video> _videos;

    public Bloger getBloger() { return _bloger; }
    public List<Video> getVideos() { return _videos; }

    public Vlog(Bloger bloger){
        _bloger = bloger;
        _videos = new ArrayList<>();
    }

    public static int sumOfVideoViews(Vlog vlog){
        // ітератор: c
        // можна зробити через for з ітератором 'c', але через foreath зручніше. в випадку використання
        // for, щоб вяти елемент, достатньо використати list.get(index)
        int sum = 0;
        for (Video video : vlog.getVideos()) {
            sum += video.getViews();
        }

        return sum;
    }
    public static List<Video> mostUnlikedVideos(Vlog vlog){
        // ітератор: a
        // можна зробити через for з ітератором 'a', але через foreath зручніше
        List<Video> mostUnlikedVideos = new ArrayList<>();
        int maxDislikeOnVideo = -1;
        for (Video video : vlog.getVideos()) {
            int dislikeOnVideo = video.getDislikes();

            if(maxDislikeOnVideo < dislikeOnVideo){
                maxDislikeOnVideo = dislikeOnVideo;
                
                mostUnlikedVideos = new ArrayList<>();
                mostUnlikedVideos.add(video);
            } else if(maxDislikeOnVideo == dislikeOnVideo){
                mostUnlikedVideos.add(video);
            }
        }

        return mostUnlikedVideos;
    }
}
