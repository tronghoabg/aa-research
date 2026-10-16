package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ao implements eg {
    TRANSMISSION_TYPE_UNKNOWN(0),
    XHR_POST(1),
    IMAGE_GET(2),
    SEND_BEACON(3),
    FETCH(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f3654g;

    ao(int i2) {
        this.f3654g = i2;
    }

    public static ao a(int i2) {
        if (i2 == 0) {
            return TRANSMISSION_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return XHR_POST;
        }
        if (i2 == 2) {
            return IMAGE_GET;
        }
        if (i2 == 3) {
            return SEND_BEACON;
        }
        if (i2 != 4) {
            return null;
        }
        return FETCH;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3654g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3654g);
    }
}
