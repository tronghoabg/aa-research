package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ui implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    ETA_CARD(1),
    ETA_POPUP(2),
    ENCOURAGEMENT_POPUP(3),
    APP_LAUNCH_DIALOG(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f55498h;

    ui(int i2) {
        this.f55498h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55498h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55498h);
    }
}
