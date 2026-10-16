package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum b implements com.google.v.eg {
    UNKNOWN(0),
    NONE(1),
    RECOMMENDED(2),
    PENDING_FRIEND_APPROVAL(3),
    PENDING_MY_APPROVAL(4),
    REMOVED(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f48616h;

    b(int i2) {
        this.f48616h = i2;
    }

    public static b a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return NONE;
        }
        if (i2 == 2) {
            return RECOMMENDED;
        }
        if (i2 == 3) {
            return PENDING_FRIEND_APPROVAL;
        }
        if (i2 == 4) {
            return PENDING_MY_APPROVAL;
        }
        if (i2 != 5) {
            return null;
        }
        return REMOVED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48616h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48616h);
    }
}
