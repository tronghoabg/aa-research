package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum lv implements com.google.v.eg {
    IMPACT_LEVEL_UNSPECIFIED(0),
    NONE(1),
    LOW(2),
    MEDIUM(3),
    HIGH(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f48858g;

    lv(int i2) {
        this.f48858g = i2;
    }

    public static lv a(int i2) {
        if (i2 == 0) {
            return IMPACT_LEVEL_UNSPECIFIED;
        }
        if (i2 == 1) {
            return NONE;
        }
        if (i2 == 2) {
            return LOW;
        }
        if (i2 == 3) {
            return MEDIUM;
        }
        if (i2 != 4) {
            return null;
        }
        return HIGH;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48858g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48858g);
    }
}
