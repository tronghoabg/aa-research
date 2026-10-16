package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum jh implements com.google.v.eg {
    FLAG_NO_COLD_CALLS(1),
    FLAG_PREFERRED(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f11629d;

    jh(int i2) {
        this.f11629d = i2;
    }

    public static jh a(int i2) {
        if (i2 == 1) {
            return FLAG_NO_COLD_CALLS;
        }
        if (i2 != 2) {
            return null;
        }
        return FLAG_PREFERRED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11629d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11629d);
    }
}
