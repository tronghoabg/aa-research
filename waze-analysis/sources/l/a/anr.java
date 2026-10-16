package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum anr implements com.google.v.eg {
    ERROR_TYPE_UNSPECIFIED(0),
    NO_NETWORK(1),
    NO_SERVER_CONNECTIVITY(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52816f;

    anr(int i2) {
        this.f52816f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52816f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52816f);
    }
}
