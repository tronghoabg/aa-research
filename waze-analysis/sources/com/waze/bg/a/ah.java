package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum ah implements com.google.v.eg {
    PRIMARY(0),
    SECONDARY(1),
    COMMENT(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f16323e;

    ah(int i2) {
        this.f16323e = i2;
    }

    public static ah a(int i2) {
        if (i2 == 0) {
            return PRIMARY;
        }
        if (i2 == 1) {
            return SECONDARY;
        }
        if (i2 != 2) {
            return null;
        }
        return COMMENT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16323e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16323e);
    }
}
