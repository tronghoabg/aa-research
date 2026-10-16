package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum zaj implements defpackage.abpb {
    UNKNOWN_CODE(0),
    PROTOCOL_INCOMPATIBLE_VERSION(1),
    PROTOCOL_WRONG_CONFIGURATION(2),
    PROTOCOL_IO_ERROR(3),
    PROTOCOL_BYEBYE_REQUESTED_BY_CAR(4),
    PROTOCOL_BYEBYE_REQUESTED_BY_USER(5),
    PROTOCOL_WRONG_MESSAGE(6),
    PROTOCOL_AUTH_FAILED(7),
    PROTOCOL_AUTH_FAILED_BY_CAR(8),
    TIMEOUT(9),
    NO_LAUNCHER(10),
    COMPOSITION(11),
    CAR_NOT_RESPONDING(12),
    PROTOCOL_AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID(13),
    PROTOCOL_AUTH_FAILED_BY_CAR_CERT_EXPIRED(14),
    CONNECTION_ERROR(15),
    USB_ACCESSORY_ERROR(16),
    CAR_SERVICE_INIT_ERROR(17),
    CAR_SERVICE_CONNECTION_ERROR(18),
    USB_CHARGE_ONLY(19),
    PREFLIGHT_FAILED(20),
    SOCKET_VPN_CONNECTION_ERROR(21),
    NO_MANAGE_USB_PERMISSION_ERROR(22),
    FRX_ERROR(23),
    AUDIO_ERROR(24),
    NO_NEARBY_DEVICES_PERMISSION_ERROR(25),
    PROJECTION_PROCESS_CRASH_LOOP(26),
    BLUETOOTH_FAILURE(1000),
    SESSION_OBSOLETE_DUE_TO_NEW_CONNECTION(1001);

    public final int D;

    zaj(int i) {
        this.D = i;
    }

    public static defpackage.zaj b(int i) {
        if (i == 1000) {
            return BLUETOOTH_FAILURE;
        }
        if (i == 1001) {
            return SESSION_OBSOLETE_DUE_TO_NEW_CONNECTION;
        }
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return UNKNOWN_CODE;
            case 1:
                return PROTOCOL_INCOMPATIBLE_VERSION;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return PROTOCOL_WRONG_CONFIGURATION;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return PROTOCOL_IO_ERROR;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return PROTOCOL_BYEBYE_REQUESTED_BY_CAR;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return PROTOCOL_BYEBYE_REQUESTED_BY_USER;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return PROTOCOL_WRONG_MESSAGE;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return PROTOCOL_AUTH_FAILED;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return PROTOCOL_AUTH_FAILED_BY_CAR;
            case 9:
                return TIMEOUT;
            case 10:
                return NO_LAUNCHER;
            case 11:
                return COMPOSITION;
            case 12:
                return CAR_NOT_RESPONDING;
            case 13:
                return PROTOCOL_AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID;
            case 14:
                return PROTOCOL_AUTH_FAILED_BY_CAR_CERT_EXPIRED;
            case 15:
                return CONNECTION_ERROR;
            case 16:
                return USB_ACCESSORY_ERROR;
            case 17:
                return CAR_SERVICE_INIT_ERROR;
            case 18:
                return CAR_SERVICE_CONNECTION_ERROR;
            case 19:
                return USB_CHARGE_ONLY;
            case 20:
                return PREFLIGHT_FAILED;
            case 21:
                return SOCKET_VPN_CONNECTION_ERROR;
            case 22:
                return NO_MANAGE_USB_PERMISSION_ERROR;
            case 23:
                return FRX_ERROR;
            case 24:
                return AUDIO_ERROR;
            case 25:
                return NO_NEARBY_DEVICES_PERMISSION_ERROR;
            case 26:
                return PROJECTION_PROCESS_CRASH_LOOP;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.D;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.D);
    }
}
