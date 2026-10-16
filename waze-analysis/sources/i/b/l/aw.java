package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum aw implements com.google.v.eg {
    SHOULD_SWITCH(1),
    SHOULD_LET_USER_DECIDE(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f48598d;

    aw(int i2) {
        this.f48598d = i2;
    }

    public static aw a(int i2) {
        if (i2 == 1) {
            return SHOULD_SWITCH;
        }
        if (i2 != 2) {
            return null;
        }
        return SHOULD_LET_USER_DECIDE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48598d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48598d);
    }
}
