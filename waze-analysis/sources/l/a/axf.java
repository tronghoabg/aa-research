package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum axf implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CLOSE(1),
    EDIT(2),
    NEW(3),
    SELECT(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f53380h;

    axf(int i2) {
        this.f53380h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53380h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53380h);
    }
}
