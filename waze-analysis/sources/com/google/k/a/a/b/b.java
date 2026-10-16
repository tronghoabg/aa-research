package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum b implements com.google.v.eg {
    TYPE_PRIMARY(1),
    TYPE_SECONDARY(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f11147d;

    b(int i2) {
        this.f11147d = i2;
    }

    public static b a(int i2) {
        if (i2 == 1) {
            return TYPE_PRIMARY;
        }
        if (i2 != 2) {
            return null;
        }
        return TYPE_SECONDARY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11147d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11147d);
    }
}
