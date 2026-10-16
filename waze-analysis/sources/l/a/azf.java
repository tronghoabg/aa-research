package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum azf implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    SELECT(1),
    PIN(2),
    MAP(3),
    ALGO_TRANSPARENCY_LINK(4),
    CLOSE(5),
    BACK_TO_LIST(6),
    BACK(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f53489k;

    azf(int i2) {
        this.f53489k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53489k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53489k);
    }
}
