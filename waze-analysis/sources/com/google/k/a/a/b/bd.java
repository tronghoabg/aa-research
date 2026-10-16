package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bd implements com.google.v.eg {
    ENTER_AND_EXIT(0),
    ENTER_ONLY(1),
    EXIT_ONLY(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11152e;

    bd(int i2) {
        this.f11152e = i2;
    }

    public static bd a(int i2) {
        if (i2 == 0) {
            return ENTER_AND_EXIT;
        }
        if (i2 == 1) {
            return ENTER_ONLY;
        }
        if (i2 != 2) {
            return null;
        }
        return EXIT_ONLY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11152e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11152e);
    }
}
