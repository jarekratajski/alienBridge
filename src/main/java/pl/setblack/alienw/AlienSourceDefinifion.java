package pl.setblack.alienw;

/**
 * Created by kanap on 16.12.2016.
 */
public enum AlienSourceDefinifion {
    FRONT_LOWER_LEFT ( (int)0x00000001),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    FRONT_LOWER_CENTER((int)0x00000002),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    FRONT_LOWER_RIGHT((int)0x00000004),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    FRONT_MIDDLE_LEFT((int)0x00000008),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    FRONT_MIDDLE_CENTER((int)0x00000010),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    FRONT_MIDDLE_RIGHT((int)0x00000020),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    FRONT_UPPER_LEFT((int)0x00000040),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    FRONT_UPPER_CENTER((int)0x00000080),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    FRONT_UPPER_RIGHT((int)0x00000100),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    MIDDLE_LOWER_LEFT((int)0x00000200),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    MIDDLE_LOWER_CENTER((int)0x00000400),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    MIDDLE_LOWER_RIGHT((int)0x00000800),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    MIDDLE_MIDDLE_LEFT((int)0x00001000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    MIDDLE_MIDDLE_CENTER((int)0x00002000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    MIDDLE_MIDDLE_RIGHT((int)0x00004000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    MIDDLE_UPPER_LEFT((int)0x00008000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    MIDDLE_UPPER_CENTER((int)0x00010000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    MIDDLE_UPPER_RIGHT((int)0x00020000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    REAR_LOWER_LEFT((int)0x00040000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    REAR_LOWER_CENTER((int)0x00080000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    REAR_LOWER_RIGHT((int)0x00100000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    REAR_MIDDLE_LEFT((int)0x00200000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    REAR_MIDDLE_CENTER((int)0x00400000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    REAR_MIDDLE_RIGHT((int)0x00800000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    REAR_UPPER_LEFT((int)0x01000000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    REAR_UPPER_CENTER((int)0x02000000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    REAR_UPPER_RIGHT((int)0x04000000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    ALL((int)0x07FFFFFF),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    ALL_RIGHT((int)0x04924924),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    ALL_LEFT((int)0x01249249),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    ALL_UPPER((int)0x070381C0),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    ALL_LOWER((int)0x001C0E07),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    ALL_FRONT((int)0x000001FF),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    ALL_REAR((int)0x07FC0000),
    /** <i>native declaration : includes\LFXDecl.h</i> */
    OFF((int)0x00000000);

    private final int internalCode;
    AlienSourceDefinifion(final int internalCode) {
        this.internalCode = internalCode;
    }


     int getCode() {
        return internalCode;
    }

     public AlienSource getSource() {
        return new AlienSource(this.getCode());
     }
}
