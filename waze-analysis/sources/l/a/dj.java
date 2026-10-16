package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum dj implements com.google.v.eg {
    HOV_TOGGLE_STATE_UNSPECIFIED(0),
    NO_HOV(1),
    HOV_ONLY(2),
    HOV_OFF(3),
    HOV_ON(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f54795h;

    dj(int i2) {
        this.f54795h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54795h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54795h);
    }
}
