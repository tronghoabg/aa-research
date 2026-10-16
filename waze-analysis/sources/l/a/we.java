package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum we implements com.google.v.eg {
    RESPONSE_STATUS_UNSPECIFIED(0),
    SUCCESS(1),
    SERVER_ERROR(2),
    PARSING_ERROR(3),
    NO_DATA(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f55599h;

    we(int i2) {
        this.f55599h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55599h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55599h);
    }
}
