package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bry implements com.google.v.eg {
    QUESTION_TYPE_UNSPECIFIED(0),
    ENRICH_ALERT(1),
    FEEDBACK_ALERT(2),
    MULTI_ASK(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54611g;

    bry(int i2) {
        this.f54611g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54611g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54611g);
    }
}
