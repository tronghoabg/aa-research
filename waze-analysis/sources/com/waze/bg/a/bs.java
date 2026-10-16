package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bs implements com.google.v.eg {
    CRASH_PRONE_UNSPECIFIED(0),
    CRASH_PRONE_SHORT_LENGTH(1),
    CRASH_PRONE_LONG_LENGTH(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f16434e;

    bs(int i2) {
        this.f16434e = i2;
    }

    public static bs a(int i2) {
        if (i2 == 0) {
            return CRASH_PRONE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CRASH_PRONE_SHORT_LENGTH;
        }
        if (i2 != 2) {
            return null;
        }
        return CRASH_PRONE_LONG_LENGTH;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16434e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16434e);
    }
}
