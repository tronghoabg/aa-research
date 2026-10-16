package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ru implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    DETOUR_AVOIDED(1),
    DETOUR_TAKEN(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55382f;

    ru(int i2) {
        this.f55382f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55382f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55382f);
    }
}
