package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum eb implements com.google.v.eg {
    UPDATE_SOURCE_UNSPECIFIED(0),
    USER_ACTION(1),
    SYSTEM(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54835f;

    eb(int i2) {
        this.f54835f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54835f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54835f);
    }
}
