package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum dv implements eg {
    API_LEVEL_UNSPECIFIED(0),
    API_OPEN(1),
    API_HYBRID(2),
    API_OPAQUE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f12892f;

    dv(int i2) {
        this.f12892f = i2;
    }

    public static dv a(int i2) {
        if (i2 == 0) {
            return API_LEVEL_UNSPECIFIED;
        }
        if (i2 == 1) {
            return API_OPEN;
        }
        if (i2 == 2) {
            return API_HYBRID;
        }
        if (i2 != 3) {
            return null;
        }
        return API_OPAQUE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12892f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12892f);
    }
}
