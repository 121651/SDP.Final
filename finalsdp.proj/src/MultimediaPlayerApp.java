public class MultimediaPlayerApp {
    public static void main(String[] args) {
        // Singleton Pattern
        MultimediaPlayer player = MultimediaPlayer.getInstance();

        // Strategy Pattern
        PlayStrategy audioPlayer = new AudioPlayStrategy();
        PlayStrategy videoPlayer = new VideoPlayStrategy();

        audioPlayer.play("audio.mp3");
        videoPlayer.play("video.mp4");

        // Adapter Pattern
        AdvancedMediaPlayer vlcPlayer = new VLCPlayer();
        PlayStrategy vlcAdapter = new VLCPlayerAdapter(vlcPlayer);
        vlcAdapter.play("audio.mp3");
        vlcAdapter.play("video.mp4");

        // Decorator Pattern
        PlayStrategy loopingAudioPlayer = new LoopingDecorator(new AudioPlayStrategy());
        loopingAudioPlayer.play("audio.mp3");

        // Observer Pattern
        Observer observer = new MultimediaPlayerObserver();
        Subject subject = new Subject();
        subject.addObserver(observer);
        subject.notifyObservers("Multimedia player state changed");

        // Factory Pattern
        MultimediaFactory audioFactory = new AudioPlayerFactory();
        PlayStrategy createdAudioPlayer = audioFactory.createPlayer();
        createdAudioPlayer.play("audio.mp3");
    }
}
