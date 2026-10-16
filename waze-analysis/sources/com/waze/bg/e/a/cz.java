package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum cz implements com.google.v.eg {
    DETOUR_TYPE_UNSPECIFIED(0),
    SMALL(1),
    EXIT_ENTRY(2),
    REASSURANCE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f16661f;

    cz(int i2) {
        this.f16661f = i2;
    }

    public static cz a(int i2) {
        if (i2 == 0) {
            return DETOUR_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SMALL;
        }
        if (i2 == 2) {
            return EXIT_ENTRY;
        }
        if (i2 != 3) {
            return null;
        }
        return REASSURANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16661f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16661f);
    }
}
