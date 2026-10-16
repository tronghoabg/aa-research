package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum rf implements com.google.v.eg {
    DESTINATION_REPORTING_STRING_ANSWER_UNSPECIFIED(0),
    DESTINATION_REPORTING_STRING_ANSWER_NO(1),
    DESTINATION_REPORTING_STRING_ANSWER_YES(2),
    DESTINATION_REPORTING_STRING_ANSWER_LIMITED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55359g;

    rf(int i2) {
        this.f55359g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55359g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55359g);
    }
}
