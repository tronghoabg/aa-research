package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum arr implements com.google.v.eg {
    SUB_TYPE_UNSPECIFIED(0),
    TRAFFIC(1),
    HAZARD(2),
    POLICE(3),
    ACCIDENT(4),
    CHAT(5),
    BAD_WEATHER(6),
    CLOSURE(7),
    BLOCKED_LANE(8),
    ASSISTANCE(9),
    ANIMAL(10),
    UNRECOGNIZED(-1);

    private final int n;

    arr(int i2) {
        this.n = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
