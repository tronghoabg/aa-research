package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ji implements com.google.v.eg {
    VOICE(0),
    FAX(1),
    TDD(2),
    DATA(3),
    MOBILE(4),
    MESSAGING(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f11637h;

    ji(int i2) {
        this.f11637h = i2;
    }

    public static ji a(int i2) {
        if (i2 == 0) {
            return VOICE;
        }
        if (i2 == 1) {
            return FAX;
        }
        if (i2 == 2) {
            return TDD;
        }
        if (i2 == 3) {
            return DATA;
        }
        if (i2 == 4) {
            return MOBILE;
        }
        if (i2 != 5) {
            return null;
        }
        return MESSAGING;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11637h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11637h);
    }
}
