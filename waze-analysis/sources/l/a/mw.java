package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum mw implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    LIKE(1),
    DISLIKE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55123f;

    mw(int i2) {
        this.f55123f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55123f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55123f);
    }
}
