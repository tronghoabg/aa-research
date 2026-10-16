package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum dn implements com.google.v.eg {
    METHOD_UNSPECIFIED(0),
    CASH(1),
    CREDIT_CARD(2),
    CHECK(3),
    ELECTRONIC(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f11268g;

    dn(int i2) {
        this.f11268g = i2;
    }

    public static dn a(int i2) {
        if (i2 == 0) {
            return METHOD_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CASH;
        }
        if (i2 == 2) {
            return CREDIT_CARD;
        }
        if (i2 == 3) {
            return CHECK;
        }
        if (i2 != 4) {
            return null;
        }
        return ELECTRONIC;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11268g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11268g);
    }
}
