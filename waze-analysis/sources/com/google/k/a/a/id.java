package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum id implements com.google.v.eg {
    SPICINESS_NONE(0),
    SPICINESS_MILD(1),
    SPICINESS_MEDIUM(2),
    SPICINESS_HOT(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f11984f;

    id(int i2) {
        this.f11984f = i2;
    }

    public static id a(int i2) {
        if (i2 == 0) {
            return SPICINESS_NONE;
        }
        if (i2 == 1) {
            return SPICINESS_MILD;
        }
        if (i2 == 2) {
            return SPICINESS_MEDIUM;
        }
        if (i2 != 3) {
            return null;
        }
        return SPICINESS_HOT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11984f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11984f);
    }
}
