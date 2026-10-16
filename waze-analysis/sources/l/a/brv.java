package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum brv implements com.google.v.eg {
    ANSWER_UNSPECIFIED(0),
    WAZE_ASKS_ANSWER_YES(1),
    WAZE_ASKS_ANSWER_NO(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54604f;

    brv(int i2) {
        this.f54604f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54604f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54604f);
    }
}
