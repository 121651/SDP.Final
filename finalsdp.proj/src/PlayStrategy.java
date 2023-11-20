public interface PlayStrategy {
    void play(String file);
}

class AudioPlayStrategy implements PlayStrategy {
    @Override
    public void play(String file) {
        System.out.println("Playing audio file: " + file);
    }
}

class VideoPlayStrategy implements PlayStrategy {
    @Override
    public void play(String file) {
        System.out.println("Playing video file: " + file);
    }
}
