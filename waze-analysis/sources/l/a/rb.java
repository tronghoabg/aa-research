package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum rb implements com.google.v.eg {
    DESTINATION_REPORTING_ARRIVAL_TYPE_UNSPECIFIED(0),
    POST_ARRIVAL(1),
    PRE_ARRIVAL(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55335f;

    rb(int i2) {
        this.f55335f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55335f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55335f);
    }
}
