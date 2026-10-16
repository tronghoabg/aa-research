package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum i implements com.google.v.eg {
    ACQUAINTANCE_UNKNOWN(0),
    ACQUAINTANCE_NONE(1),
    ACQUAINTANCE_RECOMMENDED(2),
    ACQUAINTANCE_PENDING_FRIEND_APPROVAL(3),
    ACQUAINTANCE_PENDING_MY_APPROVAL(4),
    ACQUAINTANCE_REMOVED(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f48770h;

    i(int i2) {
        this.f48770h = i2;
    }

    public static i a(int i2) {
        if (i2 == 0) {
            return ACQUAINTANCE_UNKNOWN;
        }
        if (i2 == 1) {
            return ACQUAINTANCE_NONE;
        }
        if (i2 == 2) {
            return ACQUAINTANCE_RECOMMENDED;
        }
        if (i2 == 3) {
            return ACQUAINTANCE_PENDING_FRIEND_APPROVAL;
        }
        if (i2 == 4) {
            return ACQUAINTANCE_PENDING_MY_APPROVAL;
        }
        if (i2 != 5) {
            return null;
        }
        return ACQUAINTANCE_REMOVED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48770h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48770h);
    }
}
