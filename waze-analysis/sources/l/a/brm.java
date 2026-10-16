package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum brm implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    CLOSE(1),
    TIMER_EXPIRED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54578f;

    brm(int i2) {
        this.f54578f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54578f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54578f);
    }
}
