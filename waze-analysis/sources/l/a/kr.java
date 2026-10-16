package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum kr implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    SELECTED(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f55025e;

    kr(int i2) {
        this.f55025e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55025e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55025e);
    }
}
