package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum apj implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CLOSE(1),
    FIND_PARKING(2),
    MARK_PARKING(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52918g;

    apj(int i2) {
        this.f52918g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52918g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52918g);
    }
}
