public class MultimediaPlayerApp {
    public static void main(String[] args) {
        // Using Adapter pattern
        AdvancedMediaPlayer vlcPlayer = new VLCPlayer();
        MultimediaPlayer adaptedPlayer = new Adapter(vlcPlayer);
        adaptedPlayer.play("video.mp4");

        // Using Decorator pattern
        MultimediaPlayer basicPlayer = new BasicMediaPlayer();
        MultimediaDecorator playerWithVolume = new VolumeDecorator(basicPlayer);
        playerWithVolume.play("audio.mp3");
        playerWithVolume.setVolume(50);
    }
}
