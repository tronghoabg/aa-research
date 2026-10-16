package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum alm implements com.google.v.eg {
    SKIP_REASON_UNSPECIFIED(0),
    EXISTING_CONSENT(1),
    UNKNOWN(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52690f;

    alm(int i2) {
        this.f52690f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52690f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52690f);
    }
}
