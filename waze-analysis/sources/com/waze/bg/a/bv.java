package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bv implements com.google.v.eg {
    PERSONAL_SAFETY_UNSPECIFIED(0),
    PERSONAL_SAFETY_DEFAULT(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f16461d;

    bv(int i2) {
        this.f16461d = i2;
    }

    public static com.google.v.ei a() {
        return o.p;
    }

    public static bv b(int i2) {
        if (i2 == 0) {
            return PERSONAL_SAFETY_UNSPECIFIED;
        }
        if (i2 != 1) {
            return null;
        }
        return PERSONAL_SAFETY_DEFAULT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16461d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16461d);
    }
}
