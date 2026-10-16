package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum rd implements com.google.v.eg {
    DESTINATION_REPORTING_QUESTION_TITLE_UNSPECIFIED(0),
    ARE_PARKING_SPOTS_AVAILABLE(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f55347e;

    rd(int i2) {
        this.f55347e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55347e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55347e);
    }
}
