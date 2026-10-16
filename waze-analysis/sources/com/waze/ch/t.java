package com.waze.ch;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum t implements eg {
    TRIGGER_REASON_UNSPECIFIED(0),
    NAVIGATION_START(1),
    REROUTE(2),
    PERIODIC_REFRESH(3),
    SWITCH_TO_FOREGROUND(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f22402g;

    t(int i2) {
        this.f22402g = i2;
    }

    public static t a(int i2) {
        if (i2 == 0) {
            return TRIGGER_REASON_UNSPECIFIED;
        }
        if (i2 == 1) {
            return NAVIGATION_START;
        }
        if (i2 == 2) {
            return REROUTE;
        }
        if (i2 == 3) {
            return PERIODIC_REFRESH;
        }
        if (i2 != 4) {
            return null;
        }
        return SWITCH_TO_FOREGROUND;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f22402g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22402g);
    }
}
