package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aad implements com.google.v.eg {
    GOOGLE_ASSISTANT_ONBOARDING_TRIGGERING_FLOW_UNSPECIFIED(0),
    GOOGLE_ASSISTANT_ONBOARDING_TRIGGERING_FLOW_STARTUP(1),
    GOOGLE_ASSISTANT_ONBOARDING_TRIGGERING_FLOW_MIC(2),
    GOOGLE_ASSISTANT_ONBOARDING_TRIGGERING_FLOW_SETTINGS(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52076g;

    aad(int i2) {
        this.f52076g = i2;
    }

    public static aad a(int i2) {
        if (i2 == 0) {
            return GOOGLE_ASSISTANT_ONBOARDING_TRIGGERING_FLOW_UNSPECIFIED;
        }
        if (i2 == 1) {
            return GOOGLE_ASSISTANT_ONBOARDING_TRIGGERING_FLOW_STARTUP;
        }
        if (i2 == 2) {
            return GOOGLE_ASSISTANT_ONBOARDING_TRIGGERING_FLOW_MIC;
        }
        if (i2 != 3) {
            return null;
        }
        return GOOGLE_ASSISTANT_ONBOARDING_TRIGGERING_FLOW_SETTINGS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52076g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52076g);
    }
}
