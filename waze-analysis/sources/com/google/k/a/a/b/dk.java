package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum dk implements com.google.v.eg {
    CROSSING_ALLOWED(1),
    CROSSING_DISALLOWED(2),
    CROSSING_LEGALLY_DISALLOWED(33),
    CROSSING_PHYSICALLY_IMPOSSIBLE(34);


    /* renamed from: f, reason: collision with root package name */
    private final int f11249f;

    dk(int i2) {
        this.f11249f = i2;
    }

    public static dk a(int i2) {
        if (i2 == 1) {
            return CROSSING_ALLOWED;
        }
        if (i2 == 2) {
            return CROSSING_DISALLOWED;
        }
        if (i2 == 33) {
            return CROSSING_LEGALLY_DISALLOWED;
        }
        if (i2 != 34) {
            return null;
        }
        return CROSSING_PHYSICALLY_IMPOSSIBLE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11249f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11249f);
    }
}
