package pl.setblack.alienw;

/**
 * Created by kanap on 16.12.2016.
 */
public class AlienSource {
    final  int value;


    AlienSource(final int value) {
        this.value = value;
    }

    public AlienSource(AlienSourceDefinifion def) {
        this(def.getCode());
    }

    public AlienSource with(AlienSource other) {
        return new AlienSource(this.value | other.value);
    }


    public AlienSource without(AlienSource other) {
        return  new AlienSource(this.value & (other.value  ^ 0xffffffff));
    }


}
