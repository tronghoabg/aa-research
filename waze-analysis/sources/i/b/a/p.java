package i.b.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum p implements eg {
    WAZE_EVENT_NAME_UNSPECIFIED(0),
    WAZE_LICENSE_AGREEMENT(1),
    WAZE_SAY_OK_WAZE(2),
    WAZE_AVOID_DANGEROUS_TURNS(3),
    WAZE_AVOID_RESTRICTED_AREAS(4),
    WAZE_AVOID_TRAILS(5),
    WAZE_AVOID_TOLL(6),
    WAZE_AVOID_FREEWAYS(7),
    WAZE_AVOID_FERRIES(8),
    WAZE_VEHICLE_TYPE(9),
    WAZE_HOV_PASSES(10),
    WAZE_ACCEPTED_EULA(11),
    WAZE_FACEBOOK_CONNECTED(12),
    WAZE_TWITTER_CONNECTED(13),
    WAZE_TWITTER_SEND_REPORTS(14),
    WAZE_TWITTER_SEND_DRIVES(15),
    WAZE_TWITTER_SEND_SOCIAL(16),
    WAZE_SPEEDOMETER(17),
    WAZE_SPEED_LIMIT(18),
    WAZE_SPOTIFY(19),
    WAZE_ALLOW_MAP_CHAT(20),
    WAZE_ALLOW_PRIVATE_MESSAGE(21),
    WAZE_GO_INVISIBLE(22),
    WAZE_SUBMIT_LOGS(23),
    WAZE_ADDED_PHOTO(24),
    WAZE_ADDED_ADDED_FIRST_NAME(25),
    WAZE_ADDED_LAST_NAME(26),
    WAZE_ADDED_USERNAME(27),
    WAZE_ADDED_EMAIL(28),
    WAZE_ADDED_PHONE(29),
    WAZE_PERMISSION_MOTION(30),
    WAZE_PERMISSION_CALENDAR(31),
    WAZE_PERMISSION_CAMERA(32),
    WAZE_PERMISSION_MICROPHONE(33),
    WAZE_PERMISSION_NOTIFICATIONS(34),
    WAZE_PERMISSION_LOCATION(35),
    WAZE_PERMISSION_CONTACTS(36),
    WAZE_ADDED_PASSWORD(37),
    WAZE_LICENCE_PLATE(38),
    WAZE_DELETE_ACCOUNT(39),
    WAZE_CALENDAR_REMOVE_SAVED_ADDRESSES(40),
    WAZE_ADDED_HOME(41),
    WAZE_ADDED_WORK(42),
    WAZE_ACCEPTED_PRIVACY_BUMP(43),
    WAZE_PRIVACY_BUMP_AGREE(44),
    WAZE_PERSONALIZED_ADS_PERMISSION(45),
    WAZE_FACEBOOK_PERMISSION_FRIENDS_ON_LINE(46),
    WAZE_FACEBOOK_PERMISSION_FRIENDS_ON_THE_WAY(47),
    WAZE_FACEBOOK_PERMISSION_EVENTS(48),
    WAZE_FACEBOOK_PERMISSION_CARPOOL_MATCHING(49),
    WAZE_SDK_PARTNER_DATA_SHARING(50),
    WAZE_COMMUTE_MANAGEMENT_APPS(51),
    WAZE_WEB_CARPOOL_LEADERBOARD_OPT_IN(52),
    WAZE_GOOGLE_ASSISTANT_AGREED_TO_TERMS(53),
    WAZE_SHARE_DRIVE_WITH_THIRD_PARTY_APP(54),
    WAZE_GROUP_WITH_CONSENT(55),
    WAZE_GOOGLE_CONNECTED(56),
    WAZE_ACCEPTED_CARPOOL_WEB_PRIVACY(57),
    WAZE_THIRD_PARTY_CARPOOL_PUBLISH(58),
    WAZE_PERMISSION_PRECISE_LOCATION(59),
    WAZE_CARPOOL_SHARE_WITH_THIRD_PARTY_APP_RIDE_DETAILS(60),
    WAZE_CARPOOL_SHARE_WITH_THIRD_PARTY_APP_PROFILE(61),
    WAZE_TRIP_SUGGESTIONS(62),
    WAZE_EV_DRIVER(63),
    WAZE_EV_CONNECTOR(64),
    WAZE_EV_NETWORK(65),
    WAZE_EXTERNAL_TRIP_SHARING_CONSENT_CHANGE(66);

    private final int aq;

    p(int i2) {
        this.aq = i2;
    }

    public static p a(int i2) {
        switch (i2) {
            case 0:
                return WAZE_EVENT_NAME_UNSPECIFIED;
            case 1:
                return WAZE_LICENSE_AGREEMENT;
            case 2:
                return WAZE_SAY_OK_WAZE;
            case 3:
                return WAZE_AVOID_DANGEROUS_TURNS;
            case 4:
                return WAZE_AVOID_RESTRICTED_AREAS;
            case 5:
                return WAZE_AVOID_TRAILS;
            case 6:
                return WAZE_AVOID_TOLL;
            case 7:
                return WAZE_AVOID_FREEWAYS;
            case 8:
                return WAZE_AVOID_FERRIES;
            case 9:
                return WAZE_VEHICLE_TYPE;
            case 10:
                return WAZE_HOV_PASSES;
            case 11:
                return WAZE_ACCEPTED_EULA;
            case 12:
                return WAZE_FACEBOOK_CONNECTED;
            case 13:
                return WAZE_TWITTER_CONNECTED;
            case 14:
                return WAZE_TWITTER_SEND_REPORTS;
            case 15:
                return WAZE_TWITTER_SEND_DRIVES;
            case 16:
                return WAZE_TWITTER_SEND_SOCIAL;
            case 17:
                return WAZE_SPEEDOMETER;
            case 18:
                return WAZE_SPEED_LIMIT;
            case 19:
                return WAZE_SPOTIFY;
            case 20:
                return WAZE_ALLOW_MAP_CHAT;
            case 21:
                return WAZE_ALLOW_PRIVATE_MESSAGE;
            case 22:
                return WAZE_GO_INVISIBLE;
            case 23:
                return WAZE_SUBMIT_LOGS;
            case 24:
                return WAZE_ADDED_PHOTO;
            case 25:
                return WAZE_ADDED_ADDED_FIRST_NAME;
            case 26:
                return WAZE_ADDED_LAST_NAME;
            case 27:
                return WAZE_ADDED_USERNAME;
            case 28:
                return WAZE_ADDED_EMAIL;
            case 29:
                return WAZE_ADDED_PHONE;
            case 30:
                return WAZE_PERMISSION_MOTION;
            case 31:
                return WAZE_PERMISSION_CALENDAR;
            case 32:
                return WAZE_PERMISSION_CAMERA;
            case 33:
                return WAZE_PERMISSION_MICROPHONE;
            case 34:
                return WAZE_PERMISSION_NOTIFICATIONS;
            case 35:
                return WAZE_PERMISSION_LOCATION;
            case 36:
                return WAZE_PERMISSION_CONTACTS;
            case 37:
                return WAZE_ADDED_PASSWORD;
            case 38:
                return WAZE_LICENCE_PLATE;
            case 39:
                return WAZE_DELETE_ACCOUNT;
            case 40:
                return WAZE_CALENDAR_REMOVE_SAVED_ADDRESSES;
            case 41:
                return WAZE_ADDED_HOME;
            case 42:
                return WAZE_ADDED_WORK;
            case 43:
                return WAZE_ACCEPTED_PRIVACY_BUMP;
            case 44:
                return WAZE_PRIVACY_BUMP_AGREE;
            case 45:
                return WAZE_PERSONALIZED_ADS_PERMISSION;
            case 46:
                return WAZE_FACEBOOK_PERMISSION_FRIENDS_ON_LINE;
            case 47:
                return WAZE_FACEBOOK_PERMISSION_FRIENDS_ON_THE_WAY;
            case 48:
                return WAZE_FACEBOOK_PERMISSION_EVENTS;
            case 49:
                return WAZE_FACEBOOK_PERMISSION_CARPOOL_MATCHING;
            case 50:
                return WAZE_SDK_PARTNER_DATA_SHARING;
            case 51:
                return WAZE_COMMUTE_MANAGEMENT_APPS;
            case 52:
                return WAZE_WEB_CARPOOL_LEADERBOARD_OPT_IN;
            case 53:
                return WAZE_GOOGLE_ASSISTANT_AGREED_TO_TERMS;
            case 54:
                return WAZE_SHARE_DRIVE_WITH_THIRD_PARTY_APP;
            case 55:
                return WAZE_GROUP_WITH_CONSENT;
            case 56:
                return WAZE_GOOGLE_CONNECTED;
            case 57:
                return WAZE_ACCEPTED_CARPOOL_WEB_PRIVACY;
            case 58:
                return WAZE_THIRD_PARTY_CARPOOL_PUBLISH;
            case 59:
                return WAZE_PERMISSION_PRECISE_LOCATION;
            case 60:
                return WAZE_CARPOOL_SHARE_WITH_THIRD_PARTY_APP_RIDE_DETAILS;
            case 61:
                return WAZE_CARPOOL_SHARE_WITH_THIRD_PARTY_APP_PROFILE;
            case 62:
                return WAZE_TRIP_SUGGESTIONS;
            case 63:
                return WAZE_EV_DRIVER;
            case 64:
                return WAZE_EV_CONNECTOR;
            case 65:
                return WAZE_EV_NETWORK;
            case 66:
                return WAZE_EXTERNAL_TRIP_SHARING_CONSENT_CHANGE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.aq;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.aq);
    }
}
