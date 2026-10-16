package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bgq implements com.google.v.eg {
    CARD_TRIGGER_UNSPECIFIED(0),
    PREDICTION(1),
    RESUME(2),
    PLANNED_DRIVE(3),
    CALENDAR_EVENT(4),
    ETA_CHECK(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f53940i;

    bgq(int i2) {
        this.f53940i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53940i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53940i);
    }
}
