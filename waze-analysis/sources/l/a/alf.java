package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum alf implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ALLOW(1),
    DO_NOT_ALLOW(2),
    PRIVACY_POLICY(3),
    LEARN_MORE(4),
    CLOSE(5),
    SESSION_ENDED(6),
    ISV_PRIVACY_POLICY(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f52676k;

    alf(int i2) {
        this.f52676k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52676k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52676k);
    }
}
