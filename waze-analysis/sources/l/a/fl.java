package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum fl implements com.google.v.eg {
    STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGOUND(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54863f;

    fl(int i2) {
        this.f54863f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54863f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54863f);
    }
}
