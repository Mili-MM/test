package rafchatmessages;

public class EmojiPoruka extends Poruka{

    private Emoji emoji;

    public EmojiPoruka(String posiljalac, Emoji e) {
        super(posiljalac);
        this.emoji = e;
    }

    @Override
    protected String formirajSadrzinu() {
        return "";
    }

    public Emoji getEmoji() {
        return emoji;
    }

    public void setEmoji(Emoji emoji) {
        this.emoji = emoji;
    }
}
