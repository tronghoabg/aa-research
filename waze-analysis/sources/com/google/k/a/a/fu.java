package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum fu implements com.google.v.eg {
    STATUS_UNSPECIFIED(0),
    STATUS_NORMAL(1),
    STATUS_DISPUTED(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11835e;

    fu(int i2) {
        this.f11835e = i2;
    }

    public static fu a(int i2) {
        if (i2 == 0) {
            return STATUS_UNSPECIFIED;
        }
        if (i2 == 1) {
            return STATUS_NORMAL;
        }
        if (i2 != 2) {
            return null;
        }
        return STATUS_DISPUTED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11835e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11835e);
    }
}
