package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum re implements com.google.v.eg {
    DESTINATION_REPORTING_QUESTION_TYPE_UNSPECIFIED(0),
    END_OF_DRIVE_REPORTING(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f55352e;

    re(int i2) {
        this.f55352e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55352e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55352e);
    }
}
