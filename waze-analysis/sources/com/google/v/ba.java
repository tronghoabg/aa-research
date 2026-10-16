package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ba implements eg {
    ENFORCE_NAMING_STYLE_UNKNOWN(0),
    STYLE2024(1),
    STYLE_LEGACY(2),
    STYLE2026(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f12701f;

    ba(int i2) {
        this.f12701f = i2;
    }

    public static ba a(int i2) {
        if (i2 == 0) {
            return ENFORCE_NAMING_STYLE_UNKNOWN;
        }
        if (i2 == 1) {
            return STYLE2024;
        }
        if (i2 == 2) {
            return STYLE_LEGACY;
        }
        if (i2 != 3) {
            return null;
        }
        return STYLE2026;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12701f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12701f);
    }
}
