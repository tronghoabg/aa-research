package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bl implements com.google.v.eg {
    ALERT_TRAIT_UNKNOWN(0),
    ALERT_TRAIT_CLOSE_TO_LANE(1),
    ALERT_TRAIT_FAR_FROM_LANE(2),
    ALERT_TRAIT_PEOPLE_AROUND(3),
    ALERT_TRAIT_NO_PEOPLE_AROUND(4),
    ALERT_TRAIT_CLEARLY_MARKED(5),
    ALERT_TRAIT_NOT_CLEARLY_MARKED(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f16386i;

    bl(int i2) {
        this.f16386i = i2;
    }

    public static bl a(int i2) {
        switch (i2) {
            case 0:
                return ALERT_TRAIT_UNKNOWN;
            case 1:
                return ALERT_TRAIT_CLOSE_TO_LANE;
            case 2:
                return ALERT_TRAIT_FAR_FROM_LANE;
            case 3:
                return ALERT_TRAIT_PEOPLE_AROUND;
            case 4:
                return ALERT_TRAIT_NO_PEOPLE_AROUND;
            case 5:
                return ALERT_TRAIT_CLEARLY_MARKED;
            case 6:
                return ALERT_TRAIT_NOT_CLEARLY_MARKED;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16386i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16386i);
    }
}
