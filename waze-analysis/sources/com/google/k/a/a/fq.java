package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum fq implements com.google.v.eg {
    UNKNOWN_STRIPE_MATERIAL(1),
    PAINT_STRIPE(2),
    ROUND_DOT(3),
    SQUARE_DOT(4);


    /* renamed from: f, reason: collision with root package name */
    private final int f11830f;

    fq(int i2) {
        this.f11830f = i2;
    }

    public static fq a(int i2) {
        if (i2 == 1) {
            return UNKNOWN_STRIPE_MATERIAL;
        }
        if (i2 == 2) {
            return PAINT_STRIPE;
        }
        if (i2 == 3) {
            return ROUND_DOT;
        }
        if (i2 != 4) {
            return null;
        }
        return SQUARE_DOT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11830f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11830f);
    }
}
