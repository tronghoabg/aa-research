package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum axo implements com.google.v.eg {
    CONTEXT_UNSPECIFIED(0),
    TRIP_OVERVIEW_SCREEN(1),
    ETA_SCREEN(2),
    PLANNED_DRIVE_SCREEN(3),
    SAVED_PLANNED_DRIVE_EDIT_TIME(4),
    START_STATE_PLAN_DRIVE_EDIT_TIME(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f53408i;

    axo(int i2) {
        this.f53408i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53408i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53408i);
    }
}
