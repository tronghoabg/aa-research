package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum hw implements com.google.v.eg {
    CARD_TYPE_UNSPECIFIED(0),
    CARD_TYPE_CLOSURE(1),
    CARD_TYPE_MTE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f16722e;

    hw(int i2) {
        this.f16722e = i2;
    }

    public static hw a(int i2) {
        if (i2 == 0) {
            return CARD_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CARD_TYPE_CLOSURE;
        }
        if (i2 != 2) {
            return null;
        }
        return CARD_TYPE_MTE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16722e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16722e);
    }
}
