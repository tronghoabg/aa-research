package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* loaded from: classes.dex */
public enum yzr implements abnz {
    UNKNOWN(0),
    TOAST(1),
    MEDIA(2),
    IM_NOTIFICATION(3),
    NAV_NOTIFICATION_HERO(4),
    SMS_NOTIFICATION(5),
    CALL(6),
    RECENT_CALL(7),
    GMM_SUGGESTION(8),
    NOW_FREQUENT_PLACE(9),
    NOW_TRAFFIC_INCIDENTS(10),
    NOW_WEATHER(11),
    NOW_WEATHER_LIST(12),
    NOW_REMINDER(13),
    NOW_REMINDER_LIST(14),
    NOW_FLIGHT_STATUS(15),
    NOW_FLIGHT_LIST(16),
    NOW_CONCERT_TICKET(17),
    NOW_SPORT_EVENT_TICKET(18),
    NOW_CAR_RENTAL(19),
    NOW_HOTEL_PLACE(20),
    NOW_RESTAURANT_PLACE(21),
    NOW_CALENDAR_EVENT(22),
    NAV_NOTIFICATION_NORMAL(23),
    SDK_NOTIFICATION(24),
    NAV_SUGGESTION(25),
    BATTERY_LOW(26),
    NOW_ROUTINE(27),
    VISUAL_PREVIEW_DISCOVERY(28),
    DEVELOPER(29),
    OPT_IN_ABOVE_ONGOING(30),
    OPT_IN_BELOW_ONGOING(31),
    VANAGON_DEPRECATION_PHASE_ONE(32),
    VANAGON_DEPRECATION_PHASE_TWO(33),
    OS_DEPRECATION(34);

    public final int J;

    yzr(int i) {
        this.J = i;
    }

    public static yzr b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return TOAST;
            case 2:
                return MEDIA;
            case 3:
                return IM_NOTIFICATION;
            case 4:
                return NAV_NOTIFICATION_HERO;
            case 5:
                return SMS_NOTIFICATION;
            case 6:
                return CALL;
            case 7:
                return RECENT_CALL;
            case 8:
                return GMM_SUGGESTION;
            case 9:
                return NOW_FREQUENT_PLACE;
            case 10:
                return NOW_TRAFFIC_INCIDENTS;
            case 11:
                return NOW_WEATHER;
            case 12:
                return NOW_WEATHER_LIST;
            case 13:
                return NOW_REMINDER;
            case 14:
                return NOW_REMINDER_LIST;
            case 15:
                return NOW_FLIGHT_STATUS;
            case 16:
                return NOW_FLIGHT_LIST;
            case 17:
                return NOW_CONCERT_TICKET;
            case 18:
                return NOW_SPORT_EVENT_TICKET;
            case 19:
                return NOW_CAR_RENTAL;
            case 20:
                return NOW_HOTEL_PLACE;
            case 21:
                return NOW_RESTAURANT_PLACE;
            case 22:
                return NOW_CALENDAR_EVENT;
            case 23:
                return NAV_NOTIFICATION_NORMAL;
            case 24:
                return SDK_NOTIFICATION;
            case 25:
                return NAV_SUGGESTION;
            case 26:
                return BATTERY_LOW;
            case 27:
                return NOW_ROUTINE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return VISUAL_PREVIEW_DISCOVERY;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return DEVELOPER;
            case 30:
                return OPT_IN_ABOVE_ONGOING;
            case 31:
                return OPT_IN_BELOW_ONGOING;
            case 32:
                return VANAGON_DEPRECATION_PHASE_ONE;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return VANAGON_DEPRECATION_PHASE_TWO;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return OS_DEPRECATION;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.J;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.J);
    }
}
