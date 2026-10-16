package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum o implements eg {
    CLIENT_UNKNOWN(0),
    CHIRP(1),
    WAYMO(2),
    GV_ANDROID(3),
    GV_IOS(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f3813g;

    o(int i2) {
        this.f3813g = i2;
    }

    public static o a(int i2) {
        if (i2 == 0) {
            return CLIENT_UNKNOWN;
        }
        if (i2 == 1) {
            return CHIRP;
        }
        if (i2 == 2) {
            return WAYMO;
        }
        if (i2 == 3) {
            return GV_ANDROID;
        }
        if (i2 != 4) {
            return null;
        }
        return GV_IOS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3813g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3813g);
    }
}
