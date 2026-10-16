package com.waze.ch;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum q implements eg {
    REASON_UNSPECIFIED(0),
    NO_ADS_AVAILABLE(1),
    FEATURE_DISABLED(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f22395e;

    q(int i2) {
        this.f22395e = i2;
    }

    public static q a(int i2) {
        if (i2 == 0) {
            return REASON_UNSPECIFIED;
        }
        if (i2 == 1) {
            return NO_ADS_AVAILABLE;
        }
        if (i2 != 2) {
            return null;
        }
        return FEATURE_DISABLED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f22395e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22395e);
    }
}
