interface AdvancedMediaPlayer {
    void playVideo(String file);

    void playAudio(String file);
}

class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVideo(String file) {
        System.out.println("Playing video using VLC: " + file);
    }

    @Override
    public void playAudio(String file) {
        System.out.println("Playing audio using VLC: " + file);
    }
}

class VLCPlayerAdapter implements PlayStrategy {
    private AdvancedMediaPlayer vlcPlayer;

    public VLCPlayerAdapter(AdvancedMediaPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void play(String file) {
        // adapting VLCPlayer's methods to PlayStrategy
        if (file.endsWith(".mp3")) {
            vlcPlayer.playAudio(file);
        } else if (file.endsWith(".mp4")) {
            vlcPlayer.playVideo(file);
        } else {
            System.out.println("Unsupported media type");
        }
    }
}
