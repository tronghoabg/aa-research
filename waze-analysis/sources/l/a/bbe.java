package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bbe implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    APP_LAUNCH(1),
    DESTINATIONS_DATA_CHANGED(2),
    END_OF_DRIVE(3),
    LOCATION_CHANGED(4),
    SETTINGS_CHANGED(5),
    USER_CHANGED(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f53648j;

    bbe(int i2) {
        this.f53648j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53648j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53648j);
    }
}
