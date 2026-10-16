package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bdy implements com.google.v.eg {
    FAILURE_REASON_UNSPECIFIED(0),
    UNRECOGNIZED_REPORT_TYPE(1),
    NO_REPORT_LOCATION(2),
    CLIENT_ERROR(3),
    BACKEND_ERROR(4),
    UNKNOWN_ERROR_WHILE_CLARIFYING_REPORT_TYPE(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f53796i;

    bdy(int i2) {
        this.f53796i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53796i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53796i);
    }
}
