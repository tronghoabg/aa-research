package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ale implements com.google.v.eg {
    NAV_CONNECT_CONSENT_FLOW_TYPE_UNSPECIFIED(0),
    NAV_CONNECT_INITIAL_CONSENT(1),
    NAV_CONNECT_MID_SESSION_CONSENT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52665f;

    ale(int i2) {
        this.f52665f = i2;
    }

    public static ale a(int i2) {
        if (i2 == 0) {
            return NAV_CONNECT_CONSENT_FLOW_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return NAV_CONNECT_INITIAL_CONSENT;
        }
        if (i2 != 2) {
            return null;
        }
        return NAV_CONNECT_MID_SESSION_CONSENT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52665f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52665f);
    }
}
