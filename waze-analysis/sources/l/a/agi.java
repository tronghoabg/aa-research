package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum agi implements com.google.v.eg {
    LOCATION_PERMISSION_STATUS_UNSPECIFIED(0),
    AUTHORIZED_ALWAYS(1),
    AUTHORIZED_WHEN_IN_USE(2),
    DENIED(3),
    RESTRICTED(4),
    NOT_DETERMINED(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f52452i;

    agi(int i2) {
        this.f52452i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52452i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52452i);
    }
}
