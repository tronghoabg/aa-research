package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bps implements com.google.v.eg {
    VENUE_OPENING_STATUS_UNSPECIFIED(0),
    VENUE_OPENING_SOON(1),
    VENUE_OPEN_NOW(2),
    VENUE_OPEN_24_HOURS(3),
    VENUE_CLOSED(4),
    VENUE_CLOSES_SOON(5),
    VENUE_TEMPORARILY_CLOSED(6),
    VENUE_PERMANENTLY_CLOSED(7),
    UNKNOWN(8),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f54487l;

    bps(int i2) {
        this.f54487l = i2;
    }

    public static bps a(int i2) {
        switch (i2) {
            case 0:
                return VENUE_OPENING_STATUS_UNSPECIFIED;
            case 1:
                return VENUE_OPENING_SOON;
            case 2:
                return VENUE_OPEN_NOW;
            case 3:
                return VENUE_OPEN_24_HOURS;
            case 4:
                return VENUE_CLOSED;
            case 5:
                return VENUE_CLOSES_SOON;
            case 6:
                return VENUE_TEMPORARILY_CLOSED;
            case 7:
                return VENUE_PERMANENTLY_CLOSED;
            case 8:
                return UNKNOWN;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54487l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54487l);
    }
}
