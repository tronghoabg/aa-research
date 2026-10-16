package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gf implements com.google.v.eg {
    STYLE_CONTIGUOUS(0),
    STYLE_SINGLE(1),
    STYLE_TURN(2),
    STYLE_IN_OUT(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f11376f;

    gf(int i2) {
        this.f11376f = i2;
    }

    public static gf a(int i2) {
        if (i2 == 0) {
            return STYLE_CONTIGUOUS;
        }
        if (i2 == 1) {
            return STYLE_SINGLE;
        }
        if (i2 == 2) {
            return STYLE_TURN;
        }
        if (i2 != 3) {
            return null;
        }
        return STYLE_IN_OUT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11376f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11376f);
    }
}
