package com.google.k.a.a;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gr implements com.google.v.eg {
    RESTRICTION_UNKNOWN(0),
    RESTRICTION_PARKING(1),
    RESTRICTION_STANDING(17),
    RESTRICTION_STOPPING(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS),
    RESTRICTION_PICKUP_GOODS(18),
    RESTRICTION_PICKUP_PASSENGERS(19);


    /* renamed from: h, reason: collision with root package name */
    private final int f11850h;

    gr(int i2) {
        this.f11850h = i2;
    }

    public static gr a(int i2) {
        if (i2 == 0) {
            return RESTRICTION_UNKNOWN;
        }
        if (i2 == 1) {
            return RESTRICTION_PARKING;
        }
        if (i2 == 273) {
            return RESTRICTION_STOPPING;
        }
        switch (i2) {
            case 17:
                return RESTRICTION_STANDING;
            case 18:
                return RESTRICTION_PICKUP_GOODS;
            case 19:
                return RESTRICTION_PICKUP_PASSENGERS;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11850h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11850h);
    }
}
