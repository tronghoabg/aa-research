package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum pv implements com.google.v.eg {
    CARD_TRIGGER_UNSPECIFIED(0),
    PLANNED_DRIVE(1),
    CALENDAR_EVENT(2),
    ETA_CHECK(3),
    PREDICTION(4),
    SUGGESTED_DESTINATION(5),
    SET_HOME_CTA(6),
    SET_WORK_CTA(7),
    ADD_CONTACTS_CTA(8),
    ADD_CALENDAR_CTA(9),
    STICKY(10),
    HISTORY(11),
    UNRECOGNIZED(-1);

    private final int o;

    pv(int i2) {
        this.o = i2;
    }

    public static pv a(int i2) {
        switch (i2) {
            case 0:
                return CARD_TRIGGER_UNSPECIFIED;
            case 1:
                return PLANNED_DRIVE;
            case 2:
                return CALENDAR_EVENT;
            case 3:
                return ETA_CHECK;
            case 4:
                return PREDICTION;
            case 5:
                return SUGGESTED_DESTINATION;
            case 6:
                return SET_HOME_CTA;
            case 7:
                return SET_WORK_CTA;
            case 8:
                return ADD_CONTACTS_CTA;
            case 9:
                return ADD_CALENDAR_CTA;
            case 10:
                return STICKY;
            case 11:
                return HISTORY;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
