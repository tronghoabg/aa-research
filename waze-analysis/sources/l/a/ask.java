package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ask implements com.google.v.eg {
    SKIP_REASON_UNSPECIFIED(0),
    NAVIGATING(1),
    IN_CAR_PROJECTED_CONNECTED(2),
    ROAMING(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53118g;

    ask(int i2) {
        this.f53118g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53118g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53118g);
    }
}
