package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum awl implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CLOSE(1),
    GO_ANYWAY(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53324f;

    awl(int i2) {
        this.f53324f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53324f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53324f);
    }
}
