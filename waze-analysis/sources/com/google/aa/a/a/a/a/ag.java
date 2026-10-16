package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ag implements eg {
    BACKEND_TYPE_UNKNOWN(0),
    BACKEND_TYPE_PRODUCTION(1),
    BACKEND_TYPE_ENG(2),
    BACKEND_TYPE_TEAMFOOD(3),
    BACKEND_TYPE_DOGFOOD(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f3640g;

    ag(int i2) {
        this.f3640g = i2;
    }

    public static ag a(int i2) {
        if (i2 == 0) {
            return BACKEND_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return BACKEND_TYPE_PRODUCTION;
        }
        if (i2 == 2) {
            return BACKEND_TYPE_ENG;
        }
        if (i2 == 3) {
            return BACKEND_TYPE_TEAMFOOD;
        }
        if (i2 != 4) {
            return null;
        }
        return BACKEND_TYPE_DOGFOOD;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3640g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3640g);
    }
}
