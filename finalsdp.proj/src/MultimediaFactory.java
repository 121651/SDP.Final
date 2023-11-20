interface MultimediaFactory {
    PlayStrategy createPlayer();
}

class AudioPlayerFactory implements MultimediaFactory {
    @Override
    public PlayStrategy createPlayer() {
        return new AudioPlayStrategy();
    }
}

class VideoPlayerFactory implements MultimediaFactory {
    @Override
    public PlayStrategy createPlayer() {
        return new VideoPlayStrategy();
    }
}
