package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bf implements eg {
    UNKNOWN_DEVICE_TYPE(0),
    LAPTOP(1),
    TABLET(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f3675e;

    bf(int i2) {
        this.f3675e = i2;
    }

    public static bf a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_DEVICE_TYPE;
        }
        if (i2 == 1) {
            return LAPTOP;
        }
        if (i2 != 2) {
            return null;
        }
        return TABLET;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3675e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3675e);
    }
}
