package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xhn implements defpackage.abpb {
    UNKNOWN(0),
    HVAC_TEMPERATURE_SET(358614275),
    HVAC_AUTO_ON(354419978),
    HVAC_DUAL_ON(354419977),
    HVAC_SEAT_TEMPERATURE(356517131),
    HVAC_FAN_SPEED(356517120),
    HVAC_FAN_DIRECTION(356517121),
    HVAC_FAN_DIRECTION_AVAILABLE(356582673),
    ELECTRONIC_TOLL_COLLECTION_CARD_STATUS(289410874),
    HVAC_TEMPERATURE_DISPLAY_UNITS(289408270),
    HVAC_AC_ON(354419973),
    HVAC_MAX_AC_ON(354419974),
    HVAC_DEFROSTER(320865540),
    HVAC_MAX_DEFROST_ON(354419975),
    HVAC_POWER_ON(354419984),
    HVAC_AUTO_RECIRC_ON(354419986),
    HVAC_RECIRC_ON(354419976),
    HVAC_SEAT_VENTILATION(356517139),
    HVAC_SIDE_MIRROR_HEAT(339739916),
    HVAC_STEERING_WHEEL_HEAT(289408269),
    DOOR_LOCK(371198722),
    IGNITION_STATE(289408009),
    HMG_HVAC_MTC_TEMPERATURE(624984185),
    HMG_HVAC_TEMPERATURE_RANGE(557940737),
    HMG_HVAC_TEMPERATURE_SET_CELSIUS(627081341),
    HMG_HVAC_TEMPERATURE_SET_FAHRENHEIT(627081339),
    HMG_CAR_ALERTS_COUNT(34908672),
    HMG_MAIN_CONTENT_AREA_OVERLAY(34908673),
    UNRECOGNIZED(-1);

    private final int E;

    xhn(int i) {
        this.E = i;
    }

    public static defpackage.xhn b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 34908672:
                return HMG_CAR_ALERTS_COUNT;
            case 34908673:
                return HMG_MAIN_CONTENT_AREA_OVERLAY;
            case 289408009:
                return IGNITION_STATE;
            case 289408269:
                return HVAC_STEERING_WHEEL_HEAT;
            case 289408270:
                return HVAC_TEMPERATURE_DISPLAY_UNITS;
            case 289410874:
                return ELECTRONIC_TOLL_COLLECTION_CARD_STATUS;
            case 320865540:
                return HVAC_DEFROSTER;
            case 339739916:
                return HVAC_SIDE_MIRROR_HEAT;
            case 354419973:
                return HVAC_AC_ON;
            case 354419974:
                return HVAC_MAX_AC_ON;
            case 354419975:
                return HVAC_MAX_DEFROST_ON;
            case 354419976:
                return HVAC_RECIRC_ON;
            case 354419977:
                return HVAC_DUAL_ON;
            case 354419978:
                return HVAC_AUTO_ON;
            case 354419984:
                return HVAC_POWER_ON;
            case 354419986:
                return HVAC_AUTO_RECIRC_ON;
            case 356517120:
                return HVAC_FAN_SPEED;
            case 356517121:
                return HVAC_FAN_DIRECTION;
            case 356517131:
                return HVAC_SEAT_TEMPERATURE;
            case 356517139:
                return HVAC_SEAT_VENTILATION;
            case 356582673:
                return HVAC_FAN_DIRECTION_AVAILABLE;
            case 358614275:
                return HVAC_TEMPERATURE_SET;
            case 371198722:
                return DOOR_LOCK;
            case 557940737:
                return HMG_HVAC_TEMPERATURE_RANGE;
            case 624984185:
                return HMG_HVAC_MTC_TEMPERATURE;
            case 627081339:
                return HMG_HVAC_TEMPERATURE_SET_FAHRENHEIT;
            case 627081341:
                return HMG_HVAC_TEMPERATURE_SET_CELSIUS;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.abpk.b() : this.E;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.E);
    }
}
