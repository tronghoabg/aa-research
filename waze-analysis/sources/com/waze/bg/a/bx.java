package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bx implements com.google.v.eg {
    SPEED_LIMIT_DECREASE_UNSPECIFIED(0),
    SPEED_LIMIT_DECREASE_DEFAULT(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f16471d;

    bx(int i2) {
        this.f16471d = i2;
    }

    public static bx a(int i2) {
        if (i2 == 0) {
            return SPEED_LIMIT_DECREASE_UNSPECIFIED;
        }
        if (i2 != 1) {
            return null;
        }
        return SPEED_LIMIT_DECREASE_DEFAULT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16471d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16471d);
    }
}
