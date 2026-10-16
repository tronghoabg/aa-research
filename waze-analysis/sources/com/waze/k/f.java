package com.waze.k;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum f implements eg {
    TYPE_UNSPECIFIED(0),
    MENU(1),
    MAP(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f25011e;

    f(int i2) {
        this.f25011e = i2;
    }

    public static f a(int i2) {
        if (i2 == 0) {
            return TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return MENU;
        }
        if (i2 != 2) {
            return null;
        }
        return MAP;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f25011e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f25011e);
    }
}
