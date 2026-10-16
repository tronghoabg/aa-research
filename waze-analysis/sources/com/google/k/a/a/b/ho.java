package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ho implements com.google.v.eg {
    DISPLAY_PREFERRED(1),
    DISPLAY_BEST(17),
    DISPLAY_OK(2),
    DISPLAY_HIDE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f11466f;

    ho(int i2) {
        this.f11466f = i2;
    }

    public static ho a(int i2) {
        if (i2 == 1) {
            return DISPLAY_PREFERRED;
        }
        if (i2 == 2) {
            return DISPLAY_OK;
        }
        if (i2 == 3) {
            return DISPLAY_HIDE;
        }
        if (i2 != 17) {
            return null;
        }
        return DISPLAY_BEST;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11466f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11466f);
    }
}
