package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum fu implements com.google.v.eg {
    CLOSED(1),
    MOVED(2),
    RESIDENTIAL(3),
    DUPLICATE(4),
    INAPPROPRIATE(5),
    WRONG_DETAILS(6),
    LOW_QUALITY(7),
    UNRELATED(8),
    OTHER(9),
    DOES_NOT_MATCH_SEARCH(10);


    /* renamed from: l, reason: collision with root package name */
    private final int f49512l;

    fu(int i2) {
        this.f49512l = i2;
    }

    public static fu a(int i2) {
        switch (i2) {
            case 1:
                return CLOSED;
            case 2:
                return MOVED;
            case 3:
                return RESIDENTIAL;
            case 4:
                return DUPLICATE;
            case 5:
                return INAPPROPRIATE;
            case 6:
                return WRONG_DETAILS;
            case 7:
                return LOW_QUALITY;
            case 8:
                return UNRELATED;
            case 9:
                return OTHER;
            case 10:
                return DOES_NOT_MATCH_SEARCH;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49512l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49512l);
    }
}
