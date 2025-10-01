package rafchatmessages;

public abstract class Poruka {
    private String posiljalac;

    public Poruka(String posiljalac) {
        this.posiljalac = posiljalac;
    }

    protected abstract String formirajSadrzinu();

    public String formirajIspis()
    {
        return " ";
    }

    public String getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(String posiljalac) {
        this.posiljalac = posiljalac;
    }
}
