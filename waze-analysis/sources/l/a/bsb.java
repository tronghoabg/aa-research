package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bsb implements com.google.v.eg {
    REASON_NOT_SHOWN_UNSPECIFIED(0),
    ANOTHER_WAZE_ASKS_SHOWN(1),
    QUESTION_IS_CAPPED(2),
    ALERTER_ALREADY_SHOWN(3),
    NO_QUESTION_PROVIDED(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f54619h;

    bsb(int i2) {
        this.f54619h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54619h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54619h);
    }
}
