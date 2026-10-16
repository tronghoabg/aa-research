package i.b;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f implements eh {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f48407a;

    f(int i2) {
        this.f48407a = i2;
    }

    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        int i3 = this.f48407a;
        if (i3 == 0) {
            switch (i2) {
                case 0:
                    return g.UNDEFINED;
                case 1:
                    return g.PERSONAL_AND_CALENDAR;
                case 2:
                    return g.FAVORITES;
                case 3:
                    return g.DRIVE_AND_USAGE;
                case 4:
                    return g.CARPOOL;
                case 5:
                    return g.OTHER;
                case 6:
                    return g.CONTRIBUTION;
                case 7:
                    return g.CARPOOL_COUPON;
                case 8:
                    return g.CARPOOL_CREDIT;
                case 9:
                    return g.CARPOOL_BONUS;
                case 10:
                    return g.CARPOOL_REFERRAL;
                case 11:
                    return g.CARPOOL_INVOICE;
                case 12:
                    return g.CARPOOL_PAYMENT;
                case 13:
                    return g.CARPOOL_PAYMENT_ACCOUNT;
                case 14:
                    return g.CARPOOL_REVIEW;
                case 15:
                    return g.CARPOOL_REPORT;
                case 16:
                    return g.CARPOOL_ITINERARY;
                case 17:
                    return g.CARPOOL_OFFER;
                case 18:
                    return g.CARPOOL_CARPOOL;
                case 19:
                    return g.CARPOOL_MESSAGES;
                case 20:
                    return g.PLACES_PHOTOS;
                case 21:
                    return g.CARPOOL_PREFERENCES;
                case 22:
                    return g.SOCIAL;
                case 23:
                    return g.CONTRIBUTION_FEEDBACK;
                default:
                    return null;
            }
        }
        if (i3 == 1) {
            if (i2 == 0) {
                return d.NONE;
            }
            if (i2 != 1) {
                return null;
            }
            return d.HIDE;
        }
        switch (i2) {
            case 0:
                return h.DUMMY;
            case 1:
                return h.LONG_TO_DATE;
            case 2:
                return h.METERS_TO_KILOMETERS;
            case 3:
                return h.COORDINATE;
            case 4:
                return h.PLACE;
            case 5:
                return h.FAVORITE_TYPE;
            case 6:
                return h.IMAGE_TO_URL;
            case 7:
                return h.FIELDSTRING_TO_STRING;
            case 8:
                return h.USAGE_PARSE;
            case 9:
                return h.USAGE_PERIOD;
            case 10:
                return h.PRICING_DETAILS;
            case 11:
                return h.CREDIT_STATE_CONTEXT;
            case 12:
                return h.PRICING_QUOTE;
            case 13:
                return h.PAYMENTS_PROVIDER_INFO;
            case 14:
                return h.ENDORSEMENTS_SUMMARY;
            case 15:
                return h.GROUP_DESCRIPTION;
            case 16:
                return h.TIME_FRAME;
            case 17:
                return h.CONSTRAINED_LOCATION;
            case 18:
                return h.CARPOOL_VIA_POINTS;
            case 19:
                return h.CARPOOL_STATES;
            case 20:
                return h.GEO_CENTROID;
            case 21:
                return h.GEO_INDEX_ID;
            case 22:
                return h.PRETTY_ENUM;
            case 23:
                return h.COMMUNITY_TO_DISPLAY_NAME;
            case 24:
                return h.LOCATION_TO_ADDRESS_AND_COORDS;
            case 25:
                return h.MESSAGING_PLATFORM_IDENTIFIER;
            case 26:
                return h.MESSAGING_PLATFORM_TEXT;
            default:
                return null;
        }
    }
}
