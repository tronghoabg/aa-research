package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum pb implements com.google.v.eg {
    DETOUR_REMOVE_REASON_UNSPECIFIED(0),
    BLOCKED(1),
    INVALID(2),
    NO_LONGER_SIMILAR_ETA(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48968f;

    pb(int i2) {
        this.f48968f = i2;
    }

    public static pb a(int i2) {
        if (i2 == 0) {
            return DETOUR_REMOVE_REASON_UNSPECIFIED;
        }
        if (i2 == 1) {
            return BLOCKED;
        }
        if (i2 == 2) {
            return INVALID;
        }
        if (i2 != 3) {
            return null;
        }
        return NO_LONGER_SIMILAR_ETA;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48968f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48968f);
    }
}
