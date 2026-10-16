package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aqs implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ADD(1),
    BACK(2),
    CALENDAR_DRIVE(3),
    NOTIFICATION_TOGGLE(4),
    NAVIGATE_TO_PLANNED_DRIVE(5),
    SETTINGS(6),
    CALENDAR_SYNC(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f53028k;

    aqs(int i2) {
        this.f53028k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53028k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53028k);
    }
}
