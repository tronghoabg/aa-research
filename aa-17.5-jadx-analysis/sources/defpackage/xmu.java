package defpackage;

/* loaded from: classes3.dex */
public enum xmu implements abnz {
    IDENTIFIER_TYPE_INVALID(0),
    IDENTIFIER_TYPE_AMFM_FREQUENCY(1),
    IDENTIFIER_TYPE_RDS_PI(2),
    IDENTIFIER_TYPE_HD_STATION_ID_EXT(3),
    IDENTIFIER_TYPE_HD_STATION_NAME(4),
    IDENTIFIER_TYPE_DAB_DMB_SID_EXT(5),
    IDENTIFIER_TYPE_DAB_ENSEMBLE(6),
    IDENTIFIER_TYPE_DAB_SCID(7),
    IDENTIFIER_TYPE_DAB_FREQUENCY(8),
    IDENTIFIER_TYPE_DAB_SID_EXT(9);

    public final int k;

    xmu(int i) {
        this.k = i;
    }

    public static xmu b(int i) {
        switch (i) {
            case 0:
                return IDENTIFIER_TYPE_INVALID;
            case 1:
                return IDENTIFIER_TYPE_AMFM_FREQUENCY;
            case 2:
                return IDENTIFIER_TYPE_RDS_PI;
            case 3:
                return IDENTIFIER_TYPE_HD_STATION_ID_EXT;
            case 4:
                return IDENTIFIER_TYPE_HD_STATION_NAME;
            case 5:
                return IDENTIFIER_TYPE_DAB_DMB_SID_EXT;
            case 6:
                return IDENTIFIER_TYPE_DAB_ENSEMBLE;
            case 7:
                return IDENTIFIER_TYPE_DAB_SCID;
            case 8:
                return IDENTIFIER_TYPE_DAB_FREQUENCY;
            case 9:
                return IDENTIFIER_TYPE_DAB_SID_EXT;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
