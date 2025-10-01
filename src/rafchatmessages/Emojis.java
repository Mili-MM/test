package rafchatmessages;

import java.util.ArrayList;
import java.util.List;

public class Emojis {
    private List<Emoji> emojiList = new ArrayList<Emoji>();
    private static Emojis instance;

    private Emojis()
    {

    }

    public boolean dodajEmoji(String naziv, String skracenica)
    {
        return true;
    }

    public static Emojis getInstance() {
        return instance;
    }

    public static void setInstance(Emojis instance) {
        Emojis.instance = instance;
    }

    public List<Emoji> getEmojiList() {
        return emojiList;
    }
}
