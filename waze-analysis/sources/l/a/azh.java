package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum azh implements com.google.v.eg {
    RESULT_SOURCE_UNSPECIFIED(0),
    WAZE(1),
    GOOGLE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53495f;

    azh(int i2) {
        this.f53495f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53495f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53495f);
    }
}
