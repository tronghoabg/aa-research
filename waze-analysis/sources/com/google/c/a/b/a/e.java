package com.google.c.a.b.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum e implements eg {
    NAVIGATION_STATE_UNSPECIFIED(0),
    NO_NAVIGATION(1),
    ACTIVE_NAVIGATION_WITH_DESTINATION(2),
    ACTIVE_NAVIGATION_WITH_NO_DESTINATION(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f7164f;

    e(int i2) {
        this.f7164f = i2;
    }

    public static e a(int i2) {
        if (i2 == 0) {
            return NAVIGATION_STATE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return NO_NAVIGATION;
        }
        if (i2 == 2) {
            return ACTIVE_NAVIGATION_WITH_DESTINATION;
        }
        if (i2 != 3) {
            return null;
        }
        return ACTIVE_NAVIGATION_WITH_NO_DESTINATION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f7164f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7164f);
    }
}
