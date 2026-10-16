package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum uf implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    ETA_CARD(1),
    ETA_POPUP(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55490f;

    uf(int i2) {
        this.f55490f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55490f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55490f);
    }
}
