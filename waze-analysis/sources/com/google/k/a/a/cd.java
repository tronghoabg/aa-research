package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum cd implements com.google.v.eg {
    UNSPECIFIED(0),
    BEZIER(1),
    CIRCLE(2),
    STRAIGHT_EDGE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f11745f;

    cd(int i2) {
        this.f11745f = i2;
    }

    public static cd a(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED;
        }
        if (i2 == 1) {
            return BEZIER;
        }
        if (i2 == 2) {
            return CIRCLE;
        }
        if (i2 != 3) {
            return null;
        }
        return STRAIGHT_EDGE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11745f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11745f);
    }
}
