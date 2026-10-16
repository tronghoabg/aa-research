package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ju implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CANCEL(1),
    CONTINUE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55000f;

    ju(int i2) {
        this.f55000f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55000f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55000f);
    }
}
