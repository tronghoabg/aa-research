package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aqm implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CLOSE(1),
    PRIMARY(2),
    SECONDARY(3),
    INFO(4),
    NEXT(5),
    PHOTO(6),
    MORE(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f53005k;

    aqm(int i2) {
        this.f53005k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53005k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53005k);
    }
}
