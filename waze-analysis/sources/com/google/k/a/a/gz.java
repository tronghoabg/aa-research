package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gz implements com.google.v.eg {
    TYPE_ANY(0),
    TYPE_FOOD(1),
    TYPE_SERVICE(2),
    TYPE_PRODUCT(3),
    TYPE_JOB(4),
    TYPE_3P_JOB(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f11871h;

    gz(int i2) {
        this.f11871h = i2;
    }

    public static gz a(int i2) {
        if (i2 == 0) {
            return TYPE_ANY;
        }
        if (i2 == 1) {
            return TYPE_FOOD;
        }
        if (i2 == 2) {
            return TYPE_SERVICE;
        }
        if (i2 == 3) {
            return TYPE_PRODUCT;
        }
        if (i2 == 4) {
            return TYPE_JOB;
        }
        if (i2 != 5) {
            return null;
        }
        return TYPE_3P_JOB;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11871h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11871h);
    }
}
