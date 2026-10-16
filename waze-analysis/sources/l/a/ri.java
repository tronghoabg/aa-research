package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ri implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    ANOTHER_QUESTION_SHOWN(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f55364e;

    ri(int i2) {
        this.f55364e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55364e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55364e);
    }
}
