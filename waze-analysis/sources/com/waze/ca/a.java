package com.waze.ca;

import com.google.v.eg;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum a implements eg {
    MEASUREMENT_SYSTEM_UNSPECIFIED(0),
    METRIC(1),
    IMPERIAL(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f18730f;

    a(int i2) {
        this.f18730f = i2;
    }

    public static ei a() {
        return f.f18732b;
    }

    public static a b(int i2) {
        if (i2 == 0) {
            return MEASUREMENT_SYSTEM_UNSPECIFIED;
        }
        if (i2 == 1) {
            return METRIC;
        }
        if (i2 != 2) {
            return null;
        }
        return IMPERIAL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f18730f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f18730f);
    }
}
