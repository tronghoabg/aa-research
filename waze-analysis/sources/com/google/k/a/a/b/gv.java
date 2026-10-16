package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gv implements com.google.v.eg {
    TYPE_UNIFIED(0),
    TYPE_ELEMENTARY(1),
    TYPE_SECONDARY(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11426e;

    gv(int i2) {
        this.f11426e = i2;
    }

    public static gv a(int i2) {
        if (i2 == 0) {
            return TYPE_UNIFIED;
        }
        if (i2 == 1) {
            return TYPE_ELEMENTARY;
        }
        if (i2 != 2) {
            return null;
        }
        return TYPE_SECONDARY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11426e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11426e);
    }
}
