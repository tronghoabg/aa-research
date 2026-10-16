package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum m implements com.google.v.eg {
    UNKNOWN(0),
    FRIEND(1),
    FRIEND_OF_FRIEND(2),
    MEETING_FRIEND(3),
    ACQUAINTANCE(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f48871g;

    m(int i2) {
        this.f48871g = i2;
    }

    public static m a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return FRIEND;
        }
        if (i2 == 2) {
            return FRIEND_OF_FRIEND;
        }
        if (i2 == 3) {
            return MEETING_FRIEND;
        }
        if (i2 != 4) {
            return null;
        }
        return ACQUAINTANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48871g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48871g);
    }
}
