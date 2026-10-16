package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum t implements com.google.v.eg {
    ITEMCLASS(1),
    ATTRIBUTE(2),
    VALUESPACE(3),
    DATASTORE(4);


    /* renamed from: f, reason: collision with root package name */
    private final int f11714f;

    t(int i2) {
        this.f11714f = i2;
    }

    public static t a(int i2) {
        if (i2 == 1) {
            return ITEMCLASS;
        }
        if (i2 == 2) {
            return ATTRIBUTE;
        }
        if (i2 == 3) {
            return VALUESPACE;
        }
        if (i2 != 4) {
            return null;
        }
        return DATASTORE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11714f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11714f);
    }
}
