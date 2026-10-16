package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ll implements com.google.v.eg {
    SPEED_LIMIT_CATEGORY_UNKNOWN(0),
    NONE(1),
    SCHOOL(2),
    CONSTRUCTION(3),
    STATUTORY(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f12076g;

    ll(int i2) {
        this.f12076g = i2;
    }

    public static ll a(int i2) {
        if (i2 == 0) {
            return SPEED_LIMIT_CATEGORY_UNKNOWN;
        }
        if (i2 == 1) {
            return NONE;
        }
        if (i2 == 2) {
            return SCHOOL;
        }
        if (i2 == 3) {
            return CONSTRUCTION;
        }
        if (i2 != 4) {
            return null;
        }
        return STATUTORY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12076g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12076g);
    }
}
