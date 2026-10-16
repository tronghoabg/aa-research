package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum awo implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    GO(1),
    BACK(2),
    SETTINGS(3),
    CHANGE_VIEW(4),
    CHOOSE_ROUTE(5),
    ALGO_TRANSPARENCY_LINK(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f53334j;

    awo(int i2) {
        this.f53334j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53334j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53334j);
    }
}
