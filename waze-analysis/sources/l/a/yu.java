package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum yu implements com.google.v.eg {
    DISMISS_UNSPECIFIED(0),
    SWIPE_DOWN_OR_TAP_ON_MAP(1),
    TAP_X_ICON(2),
    BACK_BUTTON(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55696g;

    yu(int i2) {
        this.f55696g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55696g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55696g);
    }
}
