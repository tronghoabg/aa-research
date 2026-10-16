package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bnf implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CANCEL(1),
    LATER(2),
    REPORT(3),
    SELECT(4),
    CLOSE(5),
    CLOSE_SIRI_EDUCATION_CARD(6),
    START_REPORTING_CONVERSATION(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f54336k;

    bnf(int i2) {
        this.f54336k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54336k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54336k);
    }
}
