package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum au implements com.google.v.eg {
    REPORTING_MANNER_UNSPECIFIED(0),
    REPORTING_MANNER_DEFAULT(1),
    REPORTING_MANNER_VOICE_CONVERSATION(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f16332e;

    au(int i2) {
        this.f16332e = i2;
    }

    public static au a(int i2) {
        if (i2 == 0) {
            return REPORTING_MANNER_UNSPECIFIED;
        }
        if (i2 == 1) {
            return REPORTING_MANNER_DEFAULT;
        }
        if (i2 != 2) {
            return null;
        }
        return REPORTING_MANNER_VOICE_CONVERSATION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16332e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16332e);
    }
}
