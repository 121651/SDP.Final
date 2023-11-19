public class Adapter implements MultimediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public Adapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String filename) {
        advancedMediaPlayer.playVideo(filename);
    }
}