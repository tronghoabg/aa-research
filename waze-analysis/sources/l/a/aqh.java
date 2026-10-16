package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aqh implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ADD_PASS(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f52994e;

    aqh(int i2) {
        this.f52994e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52994e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52994e);
    }
}
