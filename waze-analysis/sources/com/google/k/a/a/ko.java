package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ko implements com.google.v.eg {
    STATE_UNSPECIFIED(0),
    INACTIVE(1),
    SUSPECTED_ACTIVE(2),
    ACTIVE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f12045f;

    ko(int i2) {
        this.f12045f = i2;
    }

    public static ko a(int i2) {
        if (i2 == 0) {
            return STATE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return INACTIVE;
        }
        if (i2 == 2) {
            return SUSPECTED_ACTIVE;
        }
        if (i2 != 3) {
            return null;
        }
        return ACTIVE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12045f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12045f);
    }
}
