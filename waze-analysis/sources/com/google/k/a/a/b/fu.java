package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum fu implements com.google.v.eg {
    CONFLATION_PICK_FIRST_VALUE(0),
    CONFLATION_UNION_CSV(1),
    CONFLATION_SUM(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11354e;

    fu(int i2) {
        this.f11354e = i2;
    }

    public static fu a(int i2) {
        if (i2 == 0) {
            return CONFLATION_PICK_FIRST_VALUE;
        }
        if (i2 == 1) {
            return CONFLATION_UNION_CSV;
        }
        if (i2 != 2) {
            return null;
        }
        return CONFLATION_SUM;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11354e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11354e);
    }
}
