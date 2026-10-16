package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bhi implements com.google.v.eg {
    SUGGESTION_CARD_TIMER_BEHAVIOR_UNSPECIFIED(0),
    SUGGESTION_CARD_GO_TIMER(1),
    SUGGESTION_CARD_ROAMING_CLOSE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53998f;

    bhi(int i2) {
        this.f53998f = i2;
    }

    public static bhi a(int i2) {
        if (i2 == 0) {
            return SUGGESTION_CARD_TIMER_BEHAVIOR_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SUGGESTION_CARD_GO_TIMER;
        }
        if (i2 != 2) {
            return null;
        }
        return SUGGESTION_CARD_ROAMING_CLOSE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53998f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53998f);
    }
}
