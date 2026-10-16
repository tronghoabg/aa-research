package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum qu implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    CLOSE(1),
    TIMER_EXPIRED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55323f;

    qu(int i2) {
        this.f55323f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55323f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55323f);
    }
}
