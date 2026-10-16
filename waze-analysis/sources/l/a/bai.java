package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bai implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ADD_COMMENT(1),
    CLOSE(2),
    CANCEL(3),
    EMERGENCY_CALL(4),
    LATER(5),
    PHOTO(6),
    REPORT(7),
    ROAD_ASSISTANCE(8),
    SELECT(9),
    SEND_LOCATION(10),
    UNRECOGNIZED(-1);

    private final int n;

    bai(int i2) {
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
