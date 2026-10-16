package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aem implements com.google.v.eg {
    INSIGHT_COMPONENT_STATE_UNSPECIFIED(0),
    MINI(1),
    MINI_FULL(2),
    REGULAR(3),
    EXTENDED(4),
    HIDDEN(5),
    REMOVED(6),
    MULTI(7),
    STREET(8),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f52369l;

    aem(int i2) {
        this.f52369l = i2;
    }

    public static aem a(int i2) {
        switch (i2) {
            case 0:
                return INSIGHT_COMPONENT_STATE_UNSPECIFIED;
            case 1:
                return MINI;
            case 2:
                return MINI_FULL;
            case 3:
                return REGULAR;
            case 4:
                return EXTENDED;
            case 5:
                return HIDDEN;
            case 6:
                return REMOVED;
            case 7:
                return MULTI;
            case 8:
                return STREET;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52369l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52369l);
    }
}
