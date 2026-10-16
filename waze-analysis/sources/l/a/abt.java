package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum abt implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    TOP_BAR(1),
    MAP(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52176f;

    abt(int i2) {
        this.f52176f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52176f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52176f);
    }
}
