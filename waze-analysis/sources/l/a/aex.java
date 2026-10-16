package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aex implements com.google.v.eg {
    TRIGGER_EVENT_UNSPECIFIED(0),
    INITIAL_LOADING(1),
    RECALCULATION_AFTER_VEHICLE_TYPE_CHANGE(2),
    RECALCULATION_AFTER_PREFERENCE_CHANGE(3),
    RECALCULATION_AFTER_ENDPOINT_EDIT(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52407h;

    aex(int i2) {
        this.f52407h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52407h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52407h);
    }
}
