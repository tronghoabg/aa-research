package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gi implements com.google.v.eg {
    STANDARD(0),
    VALET(1),
    PERMIT(2),
    PICKUP_GOODS(3),
    PICKUP_PASSENGERS(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f11842g;

    gi(int i2) {
        this.f11842g = i2;
    }

    public static gi a(int i2) {
        if (i2 == 0) {
            return STANDARD;
        }
        if (i2 == 1) {
            return VALET;
        }
        if (i2 == 2) {
            return PERMIT;
        }
        if (i2 == 3) {
            return PICKUP_GOODS;
        }
        if (i2 != 4) {
            return null;
        }
        return PICKUP_PASSENGERS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11842g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11842g);
    }
}
