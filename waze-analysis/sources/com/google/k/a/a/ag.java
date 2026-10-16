package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ag implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    WINDOW(2),
    DOOR(3);


    /* renamed from: e, reason: collision with root package name */
    private final int f11090e;

    ag(int i2) {
        this.f11090e = i2;
    }

    public static ag a(int i2) {
        if (i2 == 0) {
            return TYPE_UNSPECIFIED;
        }
        if (i2 == 2) {
            return WINDOW;
        }
        if (i2 != 3) {
            return null;
        }
        return DOOR;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11090e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11090e);
    }
}
