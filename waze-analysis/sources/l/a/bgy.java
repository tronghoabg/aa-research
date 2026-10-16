package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bgy implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    ROAMING_TIMEOUT(1),
    NAVIGATION_START(2),
    USER_DISMISSED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53971g;

    bgy(int i2) {
        this.f53971g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53971g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53971g);
    }
}
