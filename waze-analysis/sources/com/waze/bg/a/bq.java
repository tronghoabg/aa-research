package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bq implements com.google.v.eg {
    CLOSURE_UNSPECIFIED(0),
    CLOSURE_DEFAULT(1),
    CLOSURE_HAZARD(2),
    CLOSURE_CONSTRUCTION(3),
    CLOSURE_EVENT(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f16422g;

    bq(int i2) {
        this.f16422g = i2;
    }

    public static bq a(int i2) {
        if (i2 == 0) {
            return CLOSURE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CLOSURE_DEFAULT;
        }
        if (i2 == 2) {
            return CLOSURE_HAZARD;
        }
        if (i2 == 3) {
            return CLOSURE_CONSTRUCTION;
        }
        if (i2 != 4) {
            return null;
        }
        return CLOSURE_EVENT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16422g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16422g);
    }
}
