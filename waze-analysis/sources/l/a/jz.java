package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum jz implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ACCOUNT_SELECTED(1),
    NEXT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55006f;

    jz(int i2) {
        this.f55006f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55006f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55006f);
    }
}
