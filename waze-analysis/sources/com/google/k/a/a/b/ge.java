package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ge implements com.google.v.eg {
    SCOPE_DIRECTION(0),
    SCOPE_SIDE(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f11370d;

    ge(int i2) {
        this.f11370d = i2;
    }

    public static ge a(int i2) {
        if (i2 == 0) {
            return SCOPE_DIRECTION;
        }
        if (i2 != 1) {
            return null;
        }
        return SCOPE_SIDE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11370d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11370d);
    }
}
