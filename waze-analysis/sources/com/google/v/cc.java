package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum cc implements eg {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);


    /* renamed from: e, reason: collision with root package name */
    private final int f12789e;

    cc(int i2) {
        this.f12789e = i2;
    }

    public static cc a(int i2) {
        if (i2 == 1) {
            return SPEED;
        }
        if (i2 == 2) {
            return CODE_SIZE;
        }
        if (i2 != 3) {
            return null;
        }
        return LITE_RUNTIME;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12789e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12789e);
    }
}
