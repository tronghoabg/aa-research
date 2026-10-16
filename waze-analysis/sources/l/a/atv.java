package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum atv implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    TIMER(1),
    JAMMED(2),
    NETWORK(3),
    FORCED(4),
    KICKED(5),
    LOGIN(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f53182j;

    atv(int i2) {
        this.f53182j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53182j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53182j);
    }
}
