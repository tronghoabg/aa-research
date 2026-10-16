package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum cz implements com.google.v.eg {
    UNKNOWN(0),
    LEFT(1),
    RIGHT(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11226e;

    cz(int i2) {
        this.f11226e = i2;
    }

    public static cz a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return LEFT;
        }
        if (i2 != 2) {
            return null;
        }
        return RIGHT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11226e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11226e);
    }
}
