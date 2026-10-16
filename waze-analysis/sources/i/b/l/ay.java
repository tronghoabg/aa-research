package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ay implements com.google.v.eg {
    CONNECTED(1),
    FAILED_ANOTHER_USER(2),
    INVALID_TOKEN(3),
    UNAUTHORIZED(4),
    ERROR(5),
    FAILED_ANOTHER_CARPOOL(6),
    FAILED_INVALID_COMMUNITY_FOR_RIDER(7),
    UNKNOWN(100);


    /* renamed from: j, reason: collision with root package name */
    private final int f48608j;

    ay(int i2) {
        this.f48608j = i2;
    }

    public static ay a(int i2) {
        if (i2 == 100) {
            return UNKNOWN;
        }
        switch (i2) {
            case 1:
                return CONNECTED;
            case 2:
                return FAILED_ANOTHER_USER;
            case 3:
                return INVALID_TOKEN;
            case 4:
                return UNAUTHORIZED;
            case 5:
                return ERROR;
            case 6:
                return FAILED_ANOTHER_CARPOOL;
            case 7:
                return FAILED_INVALID_COMMUNITY_FOR_RIDER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48608j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48608j);
    }
}
