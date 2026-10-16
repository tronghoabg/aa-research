package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bge implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    APP_LAUNCH(1),
    NAVIGATION_END(2),
    UGC_MENU_DISMISS(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53923g;

    bge(int i2) {
        this.f53923g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53923g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53923g);
    }
}
