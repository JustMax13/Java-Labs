package Lab8;
import java.util.HashSet;
import java.util.TreeMap;

public class Vlog {
    private Bloger _bloger;
    // lab 8 update
    private TreeMap<Integer, Video> _videos; 
    private int _freeVideoID;

    public Bloger getBloger() { return _bloger; }
    // lab 8 update
    public int getFreeVideoID() { return _freeVideoID; }
    public int newVideoID() {
        return _freeVideoID++;
    }
    public TreeMap<Integer, Video> getVideos() { return _videos; }

    public Vlog(Bloger bloger){
        _bloger = bloger;
        // lab 8 update
        _freeVideoID = 0;
        _videos = new TreeMap<>();
    }

    public static int sumOfVideoViews(Vlog vlog){
        int sum = 0;
        for (Video video : vlog.getVideos().values()) {
            sum += video.getViews();
        }

        return sum;
    }
    // update lab 8
    public static HashSet<Video> mostUnlikedVideos(Vlog vlog){
        HashSet<Video> mostUnlikedVideos = new HashSet<>();
        int maxDislikeOnVideo = -1;
        for (Video video : vlog.getVideos().values()) {
            int dislikeOnVideo = video.getDislikes();

            if(maxDislikeOnVideo < dislikeOnVideo){
                maxDislikeOnVideo = dislikeOnVideo;
                
                mostUnlikedVideos = new HashSet<>();
                mostUnlikedVideos.add(video);
            } else if(maxDislikeOnVideo == dislikeOnVideo){
                mostUnlikedVideos.add(video);
            }
        }

        return mostUnlikedVideos;
    }
}
