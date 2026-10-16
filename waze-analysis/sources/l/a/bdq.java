package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bdq implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BACK(1),
    CLOSE(2),
    CONTINUE_AS_GUEST(3),
    EMAIL(4),
    GOOGLE(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f53787i;

    bdq(int i2) {
        this.f53787i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53787i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53787i);
    }
}
