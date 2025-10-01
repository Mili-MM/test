package rafchatmessages;

import java.util.ArrayList;
import java.util.List;

public class KombinovanaPoruka extends Poruka{

    private List<Poruka> sadrzina;


    public KombinovanaPoruka(String posiljalac) {
        super(posiljalac);
    }

    public void dodajUSadrzinu(Poruka p)
    {

    }

    @Override
    protected String formirajSadrzinu() {
        return "Ovako je sa novom granom";
    }

    public List<Poruka> getSadrzina() {
        return sadrzina;
    }

    public void setSadrzina(List<Poruka> sadrzina) {
        this.sadrzina = sadrzina;
    }
}
