package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bcv implements com.google.v.eg {
    PARTICIPANT_TYPE_UNSPECIFIED(0),
    DRIVER(1),
    VIEWER(2),
    VIEWER_SHARING_LOCATION(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53744g;

    bcv(int i2) {
        this.f53744g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53744g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53744g);
    }
}
