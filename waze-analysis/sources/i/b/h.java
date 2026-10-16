package i.b;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum h implements eg {
    DUMMY(0),
    LONG_TO_DATE(1),
    METERS_TO_KILOMETERS(2),
    COORDINATE(3),
    PLACE(4),
    FAVORITE_TYPE(5),
    IMAGE_TO_URL(6),
    FIELDSTRING_TO_STRING(7),
    USAGE_PARSE(8),
    USAGE_PERIOD(9),
    PRICING_DETAILS(10),
    CREDIT_STATE_CONTEXT(11),
    PRICING_QUOTE(12),
    PAYMENTS_PROVIDER_INFO(13),
    ENDORSEMENTS_SUMMARY(14),
    GROUP_DESCRIPTION(15),
    TIME_FRAME(16),
    CONSTRAINED_LOCATION(17),
    CARPOOL_VIA_POINTS(18),
    CARPOOL_STATES(19),
    GEO_CENTROID(20),
    GEO_INDEX_ID(21),
    PRETTY_ENUM(22),
    COMMUNITY_TO_DISPLAY_NAME(23),
    LOCATION_TO_ADDRESS_AND_COORDS(24),
    MESSAGING_PLATFORM_IDENTIFIER(25),
    MESSAGING_PLATFORM_TEXT(26);

    private static final eh B = new f(2);
    private final int D;

    h(int i2) {
        this.D = i2;
    }

    public static eh a() {
        return B;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.D;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.D);
    }
}
