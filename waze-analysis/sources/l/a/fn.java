package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum fn implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    UPGRADE(1),
    CANCEL(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54869f;

    fn(int i2) {
        this.f54869f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54869f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54869f);
    }
}
