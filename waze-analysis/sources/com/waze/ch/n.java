package com.waze.ch;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum n implements eg {
    TRIGGER_REASON_UNSPECIFIED(0),
    DISCOVERY_START(1),
    VIEWPORT_CHANGE(2),
    PERIODIC_REFRESH(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f22390f;

    n(int i2) {
        this.f22390f = i2;
    }

    public static n a(int i2) {
        if (i2 == 0) {
            return TRIGGER_REASON_UNSPECIFIED;
        }
        if (i2 == 1) {
            return DISCOVERY_START;
        }
        if (i2 == 2) {
            return VIEWPORT_CHANGE;
        }
        if (i2 != 3) {
            return null;
        }
        return PERIODIC_REFRESH;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f22390f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22390f);
    }
}
