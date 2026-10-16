package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum zi implements com.google.v.eg {
    CHANNEL_UNSPECIFIED(0),
    NAVIGATION_PIN(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f55701e;

    zi(int i2) {
        this.f55701e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55701e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55701e);
    }
}
