package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum jg implements com.google.v.eg {
    CONTACT_CATEGORY_UNSPECIFIED(0),
    CUSTOMER_SERVICE(1),
    RESERVATIONS(2),
    SALES(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f11625f;

    jg(int i2) {
        this.f11625f = i2;
    }

    public static jg a(int i2) {
        if (i2 == 0) {
            return CONTACT_CATEGORY_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CUSTOMER_SERVICE;
        }
        if (i2 == 2) {
            return RESERVATIONS;
        }
        if (i2 != 3) {
            return null;
        }
        return SALES;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11625f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11625f);
    }
}
