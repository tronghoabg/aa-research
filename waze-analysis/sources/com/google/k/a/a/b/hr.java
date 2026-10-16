package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hr implements com.google.v.eg {
    BARRIER_NONE(1),
    BARRIER_PRESENT(2),
    BARRIER_LEGAL(33),
    BARRIER_PHYSICAL(34);


    /* renamed from: f, reason: collision with root package name */
    private final int f11472f;

    hr(int i2) {
        this.f11472f = i2;
    }

    public static hr a(int i2) {
        if (i2 == 1) {
            return BARRIER_NONE;
        }
        if (i2 == 2) {
            return BARRIER_PRESENT;
        }
        if (i2 == 33) {
            return BARRIER_LEGAL;
        }
        if (i2 != 34) {
            return null;
        }
        return BARRIER_PHYSICAL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11472f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11472f);
    }
}
