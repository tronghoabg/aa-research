package com.waze.k;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum o implements eg {
    ACTION_UNSPECIFIED(0),
    SHOWN(1),
    CLICKED(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f25019e;

    o(int i2) {
        this.f25019e = i2;
    }

    public static o a(int i2) {
        if (i2 == 0) {
            return ACTION_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SHOWN;
        }
        if (i2 != 2) {
            return null;
        }
        return CLICKED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f25019e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f25019e);
    }
}
