package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ci implements eg {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12801e;

    ci(int i2) {
        this.f12801e = i2;
    }

    public static ci a(int i2) {
        if (i2 == 0) {
            return IDEMPOTENCY_UNKNOWN;
        }
        if (i2 == 1) {
            return NO_SIDE_EFFECTS;
        }
        if (i2 != 2) {
            return null;
        }
        return IDEMPOTENT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12801e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12801e);
    }
}
