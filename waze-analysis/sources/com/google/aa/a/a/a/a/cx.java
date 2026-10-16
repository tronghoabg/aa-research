package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum cx implements eg {
    UNKNOWN_DEVICE_TYPE(0),
    PHONE(1),
    TABLET(2),
    LAPTOP(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f3763f;

    cx(int i2) {
        this.f3763f = i2;
    }

    public static cx a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_DEVICE_TYPE;
        }
        if (i2 == 1) {
            return PHONE;
        }
        if (i2 == 2) {
            return TABLET;
        }
        if (i2 != 3) {
            return null;
        }
        return LAPTOP;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3763f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3763f);
    }
}
