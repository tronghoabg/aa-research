package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ep implements com.google.v.eg {
    UNKNOWN(0),
    CROSSABLE(1),
    UNMARKED_CROSSING(17),
    MARKED_CROSSING(18),
    UNCROSSABLE(2);


    /* renamed from: g, reason: collision with root package name */
    private final int f11313g;

    ep(int i2) {
        this.f11313g = i2;
    }

    public static ep a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return CROSSABLE;
        }
        if (i2 == 2) {
            return UNCROSSABLE;
        }
        if (i2 == 17) {
            return UNMARKED_CROSSING;
        }
        if (i2 != 18) {
            return null;
        }
        return MARKED_CROSSING;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11313g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11313g);
    }
}
