package com.google.f.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum d implements eg {
    UNSPECIFIED(0),
    WIRE(1),
    TEXT(2),
    JSON(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f8808f;

    d(int i2) {
        this.f8808f = i2;
    }

    public static d a(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED;
        }
        if (i2 == 1) {
            return WIRE;
        }
        if (i2 == 2) {
            return TEXT;
        }
        if (i2 != 3) {
            return null;
        }
        return JSON;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f8808f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f8808f);
    }
}
