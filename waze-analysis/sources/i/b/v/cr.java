package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum cr implements com.google.v.eg {
    PUBLIC(0),
    RESERVATION_ONLY(1),
    EVENT_ONLY(2),
    VALET_ONLY(3),
    PERMIT_ONLY(4),
    MONTHLY_ONLY(5),
    PRIVATE(6),
    RESTRICTED(7);


    /* renamed from: j, reason: collision with root package name */
    private final int f49444j;

    cr(int i2) {
        this.f49444j = i2;
    }

    public static cr a(int i2) {
        switch (i2) {
            case 0:
                return PUBLIC;
            case 1:
                return RESERVATION_ONLY;
            case 2:
                return EVENT_ONLY;
            case 3:
                return VALET_ONLY;
            case 4:
                return PERMIT_ONLY;
            case 5:
                return MONTHLY_ONLY;
            case 6:
                return PRIVATE;
            case 7:
                return RESTRICTED;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49444j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49444j);
    }
}
