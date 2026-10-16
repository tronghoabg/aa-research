package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bgu implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    GO(1),
    GO_TIMEOUT(2),
    CLOSE(3),
    INFO(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f53964h;

    bgu(int i2) {
        this.f53964h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53964h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53964h);
    }
}
