package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum dw implements com.google.v.eg {
    ACTION_SOURCE_UNSPECIFIED(0),
    MAP(1),
    CARD(2),
    INCAR_CHECKLIST(3),
    HARDWARE_BACK(4),
    RECENTER_ICON(5),
    DRIVING_INSTRUCTIONS_BAR(6),
    SCREEN_MODE_TOGGLE(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f54823k;

    dw(int i2) {
        this.f54823k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54823k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54823k);
    }
}
