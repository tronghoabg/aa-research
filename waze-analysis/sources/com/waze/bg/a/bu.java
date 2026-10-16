package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bu implements com.google.v.eg {
    PH_UNSPECIFIED(0),
    PH_SPEED_BUMP(1),
    PH_TOPES(2),
    PH_TOLL_BOOTH(3),
    PH_DANGEROUS_CURVE(4),
    PH_DANGEROUS_INTERSECTION(5),
    PH_DANGEROUS_SPLIT(6),
    PH_DANGEROUS_MERGE(7),
    PH_SCHOOL_ZONE(8);


    /* renamed from: k, reason: collision with root package name */
    private final int f16457k;

    bu(int i2) {
        this.f16457k = i2;
    }

    public static bu a(int i2) {
        switch (i2) {
            case 0:
                return PH_UNSPECIFIED;
            case 1:
                return PH_SPEED_BUMP;
            case 2:
                return PH_TOPES;
            case 3:
                return PH_TOLL_BOOTH;
            case 4:
                return PH_DANGEROUS_CURVE;
            case 5:
                return PH_DANGEROUS_INTERSECTION;
            case 6:
                return PH_DANGEROUS_SPLIT;
            case 7:
                return PH_DANGEROUS_MERGE;
            case 8:
                return PH_SCHOOL_ZONE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16457k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16457k);
    }
}
