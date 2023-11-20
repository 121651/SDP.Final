public class MultimediaPlayer {
    private static MultimediaPlayer instance;

    private MultimediaPlayer() {
        // private constructor to prevent instantiation
    }

    public static MultimediaPlayer getInstance() {
        if (instance == null) {
            instance = new MultimediaPlayer();
        }
        return instance;
    }

    public void play(String file) {
        System.out.println("Playing: " + file);
    }
}
