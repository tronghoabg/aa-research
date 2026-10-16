package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aov implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    OVERVIEW(1),
    RECENTER(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52903f;

    aov(int i2) {
        this.f52903f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52903f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52903f);
    }
}
