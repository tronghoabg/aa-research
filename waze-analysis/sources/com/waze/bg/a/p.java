package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum p implements com.google.v.eg {
    ALERT_REPORTING_SOURCE_UNKNOWN(0),
    ALERT_REPORTING_SOURCE_MAPFACTS(1),
    ALERT_REPORTING_SOURCE_UGC(2),
    ALERT_REPORTING_SOURCE_FEED(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f16572f;

    p(int i2) {
        this.f16572f = i2;
    }

    public static p a(int i2) {
        if (i2 == 0) {
            return ALERT_REPORTING_SOURCE_UNKNOWN;
        }
        if (i2 == 1) {
            return ALERT_REPORTING_SOURCE_MAPFACTS;
        }
        if (i2 == 2) {
            return ALERT_REPORTING_SOURCE_UGC;
        }
        if (i2 != 3) {
            return null;
        }
        return ALERT_REPORTING_SOURCE_FEED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16572f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16572f);
    }
}
