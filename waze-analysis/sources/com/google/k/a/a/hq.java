package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hq implements com.google.v.eg {
    OFFERED_UNSPECIFIED(0),
    OFFERED(1),
    OFFERED_NOT(2),
    OFFERED_ON_WEBSITE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f11947f;

    hq(int i2) {
        this.f11947f = i2;
    }

    public static hq a(int i2) {
        if (i2 == 0) {
            return OFFERED_UNSPECIFIED;
        }
        if (i2 == 1) {
            return OFFERED;
        }
        if (i2 == 2) {
            return OFFERED_NOT;
        }
        if (i2 != 3) {
            return null;
        }
        return OFFERED_ON_WEBSITE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11947f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11947f);
    }
}
