package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gu implements com.google.v.eg {
    ANY(0),
    CAR(1),
    MOTORCYCLE(2),
    TRUCK(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f11856f;

    gu(int i2) {
        this.f11856f = i2;
    }

    public static gu a(int i2) {
        if (i2 == 0) {
            return ANY;
        }
        if (i2 == 1) {
            return CAR;
        }
        if (i2 == 2) {
            return MOTORCYCLE;
        }
        if (i2 != 3) {
            return null;
        }
        return TRUCK;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11856f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11856f);
    }
}
