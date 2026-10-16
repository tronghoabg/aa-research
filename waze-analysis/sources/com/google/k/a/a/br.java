package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum br implements com.google.v.eg {
    CURVATURE_UNSPECIFIED(0),
    CURVATURE_UNKNOWN(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f11735d;

    br(int i2) {
        this.f11735d = i2;
    }

    public static br a(int i2) {
        if (i2 == 0) {
            return CURVATURE_UNSPECIFIED;
        }
        if (i2 != 1) {
            return null;
        }
        return CURVATURE_UNKNOWN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11735d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11735d);
    }
}
