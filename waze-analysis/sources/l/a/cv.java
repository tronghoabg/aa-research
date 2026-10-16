package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum cv implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    COLLAPSE(1),
    DENIAL(2),
    OPEN_SETTINGS(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54744g;

    cv(int i2) {
        this.f54744g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54744g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54744g);
    }
}
