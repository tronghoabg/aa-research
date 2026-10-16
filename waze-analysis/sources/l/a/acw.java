package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum acw implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CLOSE(1),
    BACK(2),
    MESSAGE(3),
    CHAT(4),
    DELETE(5),
    DELETE_ALL(6),
    READ(7),
    READ_ALL(8),
    SELECT(9),
    SELECT_ALL(10),
    SELECT_NONE(11),
    UNRECOGNIZED(-1);

    private final int o;

    acw(int i2) {
        this.o = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
