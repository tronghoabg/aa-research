package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aei implements com.google.v.eg {
    INSIGHT_MESSAGE_TYPE_UNSPECIFIED(0),
    REAL_TIME_LOCATION_BASED_INSIGHT(1),
    PERMANENT_LOCATION_BASED_INSIGHT(2),
    NON_LOCATION_BASED_MESSAGE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52357g;

    aei(int i2) {
        this.f52357g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52357g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52357g);
    }
}
