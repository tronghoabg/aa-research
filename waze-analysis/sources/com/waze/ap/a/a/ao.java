package com.waze.ap.a.a;

import com.google.v.eg;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum ao implements eg {
    VALIDATION_UNSPECIFIED(0),
    VALIDATION_NOT_THERE(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f14937e;

    ao(int i2) {
        this.f14937e = i2;
    }

    public static ei a() {
        return n.f14956c;
    }

    public static ao b(int i2) {
        if (i2 == 0) {
            return VALIDATION_UNSPECIFIED;
        }
        if (i2 != 1) {
            return null;
        }
        return VALIDATION_NOT_THERE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f14937e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14937e);
    }
}
