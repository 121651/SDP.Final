public class BasicMediaPlayer implements MultimediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Playing: " + filename);
    }
}