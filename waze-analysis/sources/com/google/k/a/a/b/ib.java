package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ib implements com.google.v.eg {
    PEDESTRIAN_GRADE_FLAT(1),
    PEDESTRIAN_GRADE_UP(2),
    PEDESTRIAN_GRADE_DOWN(3);


    /* renamed from: e, reason: collision with root package name */
    private final int f11549e;

    ib(int i2) {
        this.f11549e = i2;
    }

    public static ib a(int i2) {
        if (i2 == 1) {
            return PEDESTRIAN_GRADE_FLAT;
        }
        if (i2 == 2) {
            return PEDESTRIAN_GRADE_UP;
        }
        if (i2 != 3) {
            return null;
        }
        return PEDESTRIAN_GRADE_DOWN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11549e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11549e);
    }
}
