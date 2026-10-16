package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum dx implements eg {
    OPTIMIZE_MODE_UNSPECIFIED(0),
    SPEED(1),
    CODE_SIZE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12897e;

    dx(int i2) {
        this.f12897e = i2;
    }

    public static dx a(int i2) {
        if (i2 == 0) {
            return OPTIMIZE_MODE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SPEED;
        }
        if (i2 != 2) {
            return null;
        }
        return CODE_SIZE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12897e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12897e);
    }
}
