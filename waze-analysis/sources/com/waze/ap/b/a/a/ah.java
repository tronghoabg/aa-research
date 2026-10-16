package com.waze.ap.b.a.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum ah implements eg {
    DISPLAY_STATE_UNSPECIFIED(0),
    DISPLAY_STATE_SHOWN(1),
    DISPLAY_STATE_HIDDEN(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f15019f;

    ah(int i2) {
        this.f15019f = i2;
    }

    public static ah a(int i2) {
        if (i2 == 0) {
            return DISPLAY_STATE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return DISPLAY_STATE_SHOWN;
        }
        if (i2 != 2) {
            return null;
        }
        return DISPLAY_STATE_HIDDEN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f15019f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15019f);
    }
}
