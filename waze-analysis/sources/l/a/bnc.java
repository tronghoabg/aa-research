package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bnc implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    EXPAND(1),
    TIMER_EXPIRED(2),
    CLICK_MORE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54325g;

    bnc(int i2) {
        this.f54325g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54325g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54325g);
    }
}
