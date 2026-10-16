package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum fd implements com.google.v.eg {
    UNKNOWN_STRIPE_PATTERN(1),
    NO_STRIPE_PATTERN(2),
    LONGITUDINAL_STRIPE(3),
    DIAGONAL_STRIPE(4),
    LATERAL_STRIPE(5),
    SINGLE_CROSSING_LINE(6),
    DOUBLE_CROSSING_LINE(7),
    TRIANGLE_CROSSING_LINE_POINTING_LEFT(8),
    TRIANGLE_CROSSING_LINE_POINTING_RIGHT(9),
    STRUCTURED_CROSSING_LINE(10);


    /* renamed from: l, reason: collision with root package name */
    private final int f11805l;

    fd(int i2) {
        this.f11805l = i2;
    }

    public static fd a(int i2) {
        switch (i2) {
            case 1:
                return UNKNOWN_STRIPE_PATTERN;
            case 2:
                return NO_STRIPE_PATTERN;
            case 3:
                return LONGITUDINAL_STRIPE;
            case 4:
                return DIAGONAL_STRIPE;
            case 5:
                return LATERAL_STRIPE;
            case 6:
                return SINGLE_CROSSING_LINE;
            case 7:
                return DOUBLE_CROSSING_LINE;
            case 8:
                return TRIANGLE_CROSSING_LINE_POINTING_LEFT;
            case 9:
                return TRIANGLE_CROSSING_LINE_POINTING_RIGHT;
            case 10:
                return STRUCTURED_CROSSING_LINE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11805l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11805l);
    }
}
