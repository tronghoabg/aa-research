package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum wr implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    MOTORCYCLE(1),
    PRIVATE(2),
    TAXI(3),
    DONE(4),
    SKIP(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f55612i;

    wr(int i2) {
        this.f55612i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55612i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55612i);
    }
}
