package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum k implements com.google.v.eg {
    SAME_DEST_STATUS_UNKNOWN(0),
    SAME_DEST_STATUS_DRIVING(1),
    SAME_DEST_STATUS_ARRIVED(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f48813e;

    k(int i2) {
        this.f48813e = i2;
    }

    public static k a(int i2) {
        if (i2 == 0) {
            return SAME_DEST_STATUS_UNKNOWN;
        }
        if (i2 == 1) {
            return SAME_DEST_STATUS_DRIVING;
        }
        if (i2 != 2) {
            return null;
        }
        return SAME_DEST_STATUS_ARRIVED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48813e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48813e);
    }
}
