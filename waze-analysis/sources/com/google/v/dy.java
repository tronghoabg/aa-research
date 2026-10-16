package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum dy implements eg {
    STRIP_ENUM_PREFIX_UNSPECIFIED(0),
    STRIP_ENUM_PREFIX_KEEP(1),
    STRIP_ENUM_PREFIX_GENERATE_BOTH(2),
    STRIP_ENUM_PREFIX_STRIP(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f12903f;

    dy(int i2) {
        this.f12903f = i2;
    }

    public static dy a(int i2) {
        if (i2 == 0) {
            return STRIP_ENUM_PREFIX_UNSPECIFIED;
        }
        if (i2 == 1) {
            return STRIP_ENUM_PREFIX_KEEP;
        }
        if (i2 == 2) {
            return STRIP_ENUM_PREFIX_GENERATE_BOTH;
        }
        if (i2 != 3) {
            return null;
        }
        return STRIP_ENUM_PREFIX_STRIP;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12903f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12903f);
    }
}
