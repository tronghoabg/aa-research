package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum acm implements com.google.v.eg {
    IN_CAR_SCREEN_MODE_UNSPECIFIED(0),
    IN_CAR_SCREEN_MODE_CARPLAY(1),
    IN_CAR_SCREEN_MODE_AA_MAIN_SCREEN(2),
    IN_CAR_SCREEN_MODE_AA_COOLWALK(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52210g;

    acm(int i2) {
        this.f52210g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52210g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52210g);
    }
}
