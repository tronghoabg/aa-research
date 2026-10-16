package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum axj implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BACK(1),
    SAVE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53393f;

    axj(int i2) {
        this.f53393f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53393f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53393f);
    }
}
