package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ke implements com.google.v.eg {
    TYPE_OCCASION(1),
    TYPE_RANGE(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f11684d;

    ke(int i2) {
        this.f11684d = i2;
    }

    public static ke a(int i2) {
        if (i2 == 1) {
            return TYPE_OCCASION;
        }
        if (i2 != 2) {
            return null;
        }
        return TYPE_RANGE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11684d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11684d);
    }
}
