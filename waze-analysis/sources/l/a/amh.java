package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum amh implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ALTERNATIVE_ROUTES(1),
    CALENDAR_SETTINGS(2),
    DELETE_PLANNED_DRIVE(3),
    EDIT_PLANNED_DRIVE(4),
    INFO(5),
    FIND_PARKING(6),
    SHARE_LOCATION(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f52742k;

    amh(int i2) {
        this.f52742k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52742k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52742k);
    }
}
