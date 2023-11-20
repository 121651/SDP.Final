abstract class MultimediaDecorator implements PlayStrategy {
    private PlayStrategy playStrategy;

    public MultimediaDecorator(PlayStrategy playStrategy) {
        this.playStrategy = playStrategy;
    }

    @Override
    public void play(String file) {
        playStrategy.play(file);
    }
}

class LoopingDecorator extends MultimediaDecorator {
    public LoopingDecorator(PlayStrategy playStrategy) {
        super(playStrategy);
    }

    @Override
    public void play(String file) {
        super.play(file);
        System.out.println("Looping the media");
    }
}
