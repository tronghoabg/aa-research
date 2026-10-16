package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bht implements com.google.v.eg {
    TAKEOVER_ACTION_UNSPECIFIED(0),
    TAKEOVER_ACTION_INFO(1),
    TAKEOVER_ACTION_DRIVE_THERE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54010f;

    bht(int i2) {
        this.f54010f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54010f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54010f);
    }
}
