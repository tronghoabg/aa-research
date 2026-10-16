package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum d implements com.google.v.eg {
    REPORTING_MANNER_UNSPECIFIED(0),
    REPORTING_MANNER_DEFAULT(1),
    REPORTING_MANNER_VOICE(2),
    REPORTING_MANNER_VOICE_CONVERSATION(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f16541f;

    d(int i2) {
        this.f16541f = i2;
    }

    public static d a(int i2) {
        if (i2 == 0) {
            return REPORTING_MANNER_UNSPECIFIED;
        }
        if (i2 == 1) {
            return REPORTING_MANNER_DEFAULT;
        }
        if (i2 == 2) {
            return REPORTING_MANNER_VOICE;
        }
        if (i2 != 3) {
            return null;
        }
        return REPORTING_MANNER_VOICE_CONVERSATION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16541f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16541f);
    }
}
