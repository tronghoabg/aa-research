package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hx implements com.google.v.eg {
    CONSTRUCTION_PLANNED(1),
    CONSTRUCTION_STARTED(2),
    CONSTRUCTION_COMPLETE(3),
    CONSTRUCTION_CLOSED_FOR_MAINTENANCE(4),
    CONSTRUCTION_DISTURBED_BY_MAINTENANCE(5);


    /* renamed from: g, reason: collision with root package name */
    private final int f11514g;

    hx(int i2) {
        this.f11514g = i2;
    }

    public static hx a(int i2) {
        if (i2 == 1) {
            return CONSTRUCTION_PLANNED;
        }
        if (i2 == 2) {
            return CONSTRUCTION_STARTED;
        }
        if (i2 == 3) {
            return CONSTRUCTION_COMPLETE;
        }
        if (i2 == 4) {
            return CONSTRUCTION_CLOSED_FOR_MAINTENANCE;
        }
        if (i2 != 5) {
            return null;
        }
        return CONSTRUCTION_DISTURBED_BY_MAINTENANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11514g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11514g);
    }
}
