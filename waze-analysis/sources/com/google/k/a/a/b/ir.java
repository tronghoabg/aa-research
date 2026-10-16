package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ir implements com.google.v.eg {
    TYPE_ANY(0),
    TYPE_DANGER(1),
    TYPE_SKI_AREA(2),
    TYPE_SLOW_ZONE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f11591f;

    ir(int i2) {
        this.f11591f = i2;
    }

    public static ir a(int i2) {
        if (i2 == 0) {
            return TYPE_ANY;
        }
        if (i2 == 1) {
            return TYPE_DANGER;
        }
        if (i2 == 2) {
            return TYPE_SKI_AREA;
        }
        if (i2 != 3) {
            return null;
        }
        return TYPE_SLOW_ZONE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11591f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11591f);
    }
}
