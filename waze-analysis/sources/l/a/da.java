package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum da implements com.google.v.eg {
    ALERTER_NOT_VISIBLE_REASON_UNSPECIFIED(0),
    SILENT(1),
    GROUPED(2),
    CAPPED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54751g;

    da(int i2) {
        this.f54751g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54751g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54751g);
    }
}
