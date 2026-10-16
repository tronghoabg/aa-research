package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ayc implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    SETTINGS(1),
    CLOSE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53432f;

    ayc(int i2) {
        this.f53432f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53432f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53432f);
    }
}
