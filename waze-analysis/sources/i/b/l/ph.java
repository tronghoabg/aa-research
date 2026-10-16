package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ph implements com.google.v.eg {
    DECLINE_REASON_UNSPECIFIED(0),
    EXPLICIT_DECLINE(1),
    DEFAULT_DECLINE(2),
    TOO_SOON(3),
    TOO_CLOSE(4),
    STILL_DISPLAYING_OLD_SUGGESTION(5),
    GOT_NEWER_SUGGESTION(6),
    SPLIT_POINT_NOT_FOUND(7),
    CARPLAY_IN_DASHBOARD_MODE(8);


    /* renamed from: k, reason: collision with root package name */
    private final int f48985k;

    ph(int i2) {
        this.f48985k = i2;
    }

    public static ph a(int i2) {
        switch (i2) {
            case 0:
                return DECLINE_REASON_UNSPECIFIED;
            case 1:
                return EXPLICIT_DECLINE;
            case 2:
                return DEFAULT_DECLINE;
            case 3:
                return TOO_SOON;
            case 4:
                return TOO_CLOSE;
            case 5:
                return STILL_DISPLAYING_OLD_SUGGESTION;
            case 6:
                return GOT_NEWER_SUGGESTION;
            case 7:
                return SPLIT_POINT_NOT_FOUND;
            case 8:
                return CARPLAY_IN_DASHBOARD_MODE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48985k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48985k);
    }
}
