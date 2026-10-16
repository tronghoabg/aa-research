package com.waze.ch;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum w implements eg {
    REASON_UNSPECIFIED(0),
    NO_ADS_AVAILABLE(1),
    NO_NEW_ADS_FETCHED(2),
    FEATURE_DISABLED(3),
    ROUTE_TOO_SHORT(4),
    FREQUENCY_CAPPING(5),
    ROUTE_NOT_MATCHED(6),
    ROUTE_NOT_AVAILABLE(7),
    ROUTE_COMPLETED(8);


    /* renamed from: k, reason: collision with root package name */
    private final int f22413k;

    w(int i2) {
        this.f22413k = i2;
    }

    public static w a(int i2) {
        switch (i2) {
            case 0:
                return REASON_UNSPECIFIED;
            case 1:
                return NO_ADS_AVAILABLE;
            case 2:
                return NO_NEW_ADS_FETCHED;
            case 3:
                return FEATURE_DISABLED;
            case 4:
                return ROUTE_TOO_SHORT;
            case 5:
                return FREQUENCY_CAPPING;
            case 6:
                return ROUTE_NOT_MATCHED;
            case 7:
                return ROUTE_NOT_AVAILABLE;
            case 8:
                return ROUTE_COMPLETED;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f22413k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22413k);
    }
}
