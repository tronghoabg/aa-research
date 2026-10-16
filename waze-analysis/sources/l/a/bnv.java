package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bnv implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    NO_GPS(1),
    USER_INVISIBLE(2),
    USER_OFFLINE(3),
    OTHER(4),
    CLOSURE_SEGMENT_CALCULATION_FAILED(5),
    BE_COMMUNICATION_FAILED(6),
    BE_COMMUNICATION_FAILED_AND_RETRY_PENDING(7),
    BE_REACHED_MAX_COUNT(8),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f54369l;

    bnv(int i2) {
        this.f54369l = i2;
    }

    public static bnv a(int i2) {
        switch (i2) {
            case 0:
                return REASON_UNSPECIFIED;
            case 1:
                return NO_GPS;
            case 2:
                return USER_INVISIBLE;
            case 3:
                return USER_OFFLINE;
            case 4:
                return OTHER;
            case 5:
                return CLOSURE_SEGMENT_CALCULATION_FAILED;
            case 6:
                return BE_COMMUNICATION_FAILED;
            case 7:
                return BE_COMMUNICATION_FAILED_AND_RETRY_PENDING;
            case 8:
                return BE_REACHED_MAX_COUNT;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54369l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54369l);
    }
}
