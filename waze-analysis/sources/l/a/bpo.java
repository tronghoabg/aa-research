package l.a;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes9.dex */
public enum bpo implements com.google.v.eg {
    VEHICLE_TYPE_SELECTION_SOURCE_UNSPECIFIED(0),
    MAIN_SETTINGS_MENU(1),
    CAR_ICON_SETTINGS(2),
    TRIP_OVERVIEW_SCREEN(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54475g;

    bpo(int i2) {
        this.f54475g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54475g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54475g);
    }
}
