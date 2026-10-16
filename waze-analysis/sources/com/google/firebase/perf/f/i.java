package com.google.firebase.perf.f;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum i implements eg {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f10453f;

    i(int i2) {
        this.f10453f = i2;
    }

    public static i a(int i2) {
        if (i2 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i2 == 1) {
            return FOREGROUND;
        }
        if (i2 == 2) {
            return BACKGROUND;
        }
        if (i2 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f10453f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10453f);
    }
}
