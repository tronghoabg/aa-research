package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bfx implements com.google.v.eg {
    NEW_STATE_UNSPECIFIED(0),
    PARTIALLY_OPEN(1),
    SERACH_ONLY(2),
    FULL_SCREEN(3),
    REMOVED(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f53898h;

    bfx(int i2) {
        this.f53898h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53898h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53898h);
    }
}
