package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hw implements com.google.v.eg {
    CONDITION_GOOD(1),
    CONDITION_POOR(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f11507d;

    hw(int i2) {
        this.f11507d = i2;
    }

    public static hw a(int i2) {
        if (i2 == 1) {
            return CONDITION_GOOD;
        }
        if (i2 != 2) {
            return null;
        }
        return CONDITION_POOR;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11507d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11507d);
    }
}
