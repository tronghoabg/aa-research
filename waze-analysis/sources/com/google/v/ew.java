package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ew implements eg {
    NEST_IN_FILE_CLASS_UNKNOWN(0),
    NO(1),
    YES(2),
    LEGACY(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f12926f;

    ew(int i2) {
        this.f12926f = i2;
    }

    public static ew a(int i2) {
        if (i2 == 0) {
            return NEST_IN_FILE_CLASS_UNKNOWN;
        }
        if (i2 == 1) {
            return NO;
        }
        if (i2 == 2) {
            return YES;
        }
        if (i2 != 3) {
            return null;
        }
        return LEGACY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12926f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12926f);
    }
}
