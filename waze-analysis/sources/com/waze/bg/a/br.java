package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum br implements com.google.v.eg {
    CRASH_UNSPECIFIED(0),
    CRASH_DEFAULT(1),
    CRASH_PILE_UP(2),
    CRASH_MAJOR(3),
    CRASH_MINOR(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f16429g;

    br(int i2) {
        this.f16429g = i2;
    }

    public static com.google.v.ei a() {
        return o.f16566l;
    }

    public static br b(int i2) {
        if (i2 == 0) {
            return CRASH_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CRASH_DEFAULT;
        }
        if (i2 == 2) {
            return CRASH_PILE_UP;
        }
        if (i2 == 3) {
            return CRASH_MAJOR;
        }
        if (i2 != 4) {
            return null;
        }
        return CRASH_MINOR;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16429g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16429g);
    }
}
