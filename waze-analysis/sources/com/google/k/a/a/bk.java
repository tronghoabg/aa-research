package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bk implements com.google.v.eg {
    COMPARISONOPERATOR_UNKNOWN(0),
    LESS_THAN(1),
    GREATER_THAN(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11731e;

    bk(int i2) {
        this.f11731e = i2;
    }

    public static bk a(int i2) {
        if (i2 == 0) {
            return COMPARISONOPERATOR_UNKNOWN;
        }
        if (i2 == 1) {
            return LESS_THAN;
        }
        if (i2 != 2) {
            return null;
        }
        return GREATER_THAN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11731e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11731e);
    }
}
