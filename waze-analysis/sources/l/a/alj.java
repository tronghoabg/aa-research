package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum alj implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    DATE_EXPIRED(1),
    TEXT_VERSION_CHANGED(2),
    NOT_GRANTED(3),
    USER_CLICK(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52684h;

    alj(int i2) {
        this.f52684h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52684h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52684h);
    }
}
