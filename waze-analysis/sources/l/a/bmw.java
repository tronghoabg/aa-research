package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bmw implements com.google.v.eg {
    UGC_BUTTON_STATE_UNSPECIFIED(0),
    UGC_BUTTON_SHOWN(1),
    UGC_BUTTON_HIDDEN(2),
    UGC_BUTTON_SHRINK(3),
    UGC_BUTTON_UNSHRINK(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f54318h;

    bmw(int i2) {
        this.f54318h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54318h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54318h);
    }
}
