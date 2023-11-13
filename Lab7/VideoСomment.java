package Lab7;

public class VideoСomment {
    private String _text;
    private int _likes;
    private int _dislikes;

    public String getText() { return _text; }
    public void setText(String value) { _text = value; }
    public int getLikes() { return _likes; }
    public void addLike() { _likes++; }
    public int getDislikes() { return _dislikes; }
    public void addDislike() { _dislikes++; }

    public VideoСomment(String text){
        _text = text;
    }
}
