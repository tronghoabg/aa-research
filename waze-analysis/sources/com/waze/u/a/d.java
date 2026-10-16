package com.waze.u.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum d implements eg {
    ENCODING_UNSPECIFIED(0),
    MULAW(1),
    OGG_OPUS(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f41615e;

    d(int i2) {
        this.f41615e = i2;
    }

    public static d a(int i2) {
        if (i2 == 0) {
            return ENCODING_UNSPECIFIED;
        }
        if (i2 == 1) {
            return MULAW;
        }
        if (i2 != 2) {
            return null;
        }
        return OGG_OPUS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f41615e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f41615e);
    }
}
