public class VolumeDecorator implements MultimediaDecorator {
    private MultimediaPlayer multimediaPlayer;
    private int volume;

    public VolumeDecorator(MultimediaPlayer multimediaPlayer) {
        this.multimediaPlayer = multimediaPlayer;
    }
    @Override
    public void play(String filename) {
        multimediaPlayer.play(filename);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Setting volume to: " + volume);
    }
}