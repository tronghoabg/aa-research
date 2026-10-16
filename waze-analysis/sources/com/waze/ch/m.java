package com.waze.ch;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum m implements eg {
    MODE_UNSPECIFIED(0),
    BROWSE(1),
    ROAMING(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f22384e;

    m(int i2) {
        this.f22384e = i2;
    }

    public static m a(int i2) {
        if (i2 == 0) {
            return MODE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return BROWSE;
        }
        if (i2 != 2) {
            return null;
        }
        return ROAMING;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f22384e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22384e);
    }
}
