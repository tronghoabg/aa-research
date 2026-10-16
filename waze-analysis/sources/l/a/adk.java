package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum adk implements com.google.v.eg {
    INSIGHT_AVAILABLE_CLICK_OPTIONS_UNSPECIFIED(0),
    GENERIC_CLICK_OPTION(1),
    CLOSE(2),
    REROUTE_SUGGESTION_DEFAULT_ACCEPT(3),
    REROUTE_SUGGESTION_DEFAULT_DECLINE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52267h;

    adk(int i2) {
        this.f52267h = i2;
    }

    public static adk a(int i2) {
        if (i2 == 0) {
            return INSIGHT_AVAILABLE_CLICK_OPTIONS_UNSPECIFIED;
        }
        if (i2 == 1) {
            return GENERIC_CLICK_OPTION;
        }
        if (i2 == 2) {
            return CLOSE;
        }
        if (i2 == 3) {
            return REROUTE_SUGGESTION_DEFAULT_ACCEPT;
        }
        if (i2 != 4) {
            return null;
        }
        return REROUTE_SUGGESTION_DEFAULT_DECLINE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52267h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52267h);
    }
}
