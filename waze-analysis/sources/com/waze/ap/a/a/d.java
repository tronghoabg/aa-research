package com.waze.ap.a.a;

import com.google.v.eg;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum d implements eg {
    CONFIRMATION_UNSPECIFIED(0),
    FALSE(1),
    TRUE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f14943f;

    d(int i2) {
        this.f14943f = i2;
    }

    public static ei a() {
        return n.f14955b;
    }

    public static d b(int i2) {
        if (i2 == 0) {
            return CONFIRMATION_UNSPECIFIED;
        }
        if (i2 == 1) {
            return FALSE;
        }
        if (i2 != 2) {
            return null;
        }
        return TRUE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f14943f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14943f);
    }
}
