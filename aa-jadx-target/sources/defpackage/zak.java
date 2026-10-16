package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum zak implements defpackage.abpb {
    UNKNOWN_DETAIL(0),
    NO_SENSORS(1),
    SENSORS_FAIL(2),
    NO_ACCESSORY_PERMISSION(3),
    NO_ACCESSORY_FD(4),
    SOCKET_FAIL(5),
    BAD_MIC_AUDIO_CONFIG(6),
    BAD_AUDIO_CONFIG(7),
    MISSING_AUDIO_CONFIG(8),
    NAV_NO_IMAGE_OPTIONS(9),
    NAV_BAD_SIZE(10),
    NAV_BAD_COLOR(11),
    BAD_VIDEO(12),
    MISSING_VIDEO(13),
    DISPLAY_REMOVAL_TIMEOUT(14),
    NO_AUDIO_CAPTURE(15),
    MISSING_LAUNCHER(16),
    NO_VIDEO_CONFIG(17),
    BAD_CODEC_RESOLUTION(18),
    BAD_DISPLAY_RESOLUTION(19),
    BAD_FPS(20),
    NO_DENSITY(21),
    BAD_DENSITY(22),
    NO_SENSORS2(23),
    NO_AUDIO_MIC(24),
    NO_DISPLAY(25),
    NO_INPUT(26),
    COMPOSITION_RENDER_ERROR(27),
    COMPOSITION_IDLE_RENDER_ERROR(28),
    COMPOSITION_SCREENSHOT_ERROR(29),
    COMPOSITION_WINDOW_INIT_ERROR(30),
    COMPOSITION_INIT_FAIL(31),
    VENDOR_START_FAIL(32),
    VIDEO_ENCODING_INIT_FAIL(33),
    BYEBYE_BY_CAR(34),
    BYEBYE_BY_USER(35),
    UNEXPECTED_BYEBYE_RESPONSE(36),
    BYEBYE_TIMEOUT(37),
    INVALID_ACK(38),
    INVALID_ACK_CONFIG(39),
    NO_VIDEO_CONFIGS(40),
    EARLY_VIDEO_FOCUS(41),
    ERROR_STARTING_SERVICES(42),
    AUTH_FAILED(43),
    AUTH_FAILED_BY_CAR(44),
    FRAMING_ERROR(45),
    UNEXPECTED_MESSAGE(46),
    BAD_VERSION(47),
    VIDEO_ACK_TIMEOUT(48),
    AUDIO_ACK_TIMEOUT(49),
    WRITER_IO_ERROR(50),
    WRITER_UNKNOWN_EXCEPTION(51),
    READER_CLOSE(52),
    READER_INIT_FAIL(53),
    READER_IO_ERROR(54),
    AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID(55),
    AUTH_FAILED_BY_CAR_CERT_EXPIRED(56),
    PING_TIMEOUT(57),
    MULTIPLE_DISPLAY_CONFIGS(58),
    WIFI_NETWORK_UNAVAILABLE(59),
    WIFI_NETWORK_DISCONNECTED(60),
    EMPTY_USB_ACCESSORY_LIST(61),
    SPURIOUS_USB_ACCESSORY_EVENT(62),
    INVALID_ACCESSORY(63),
    CONNECTION_TRANSFER_ABORTED(64),
    DISPLAY_ID_INVALID(65),
    BAD_PRIMARY_DISPLAY(66),
    NO_ACTIVITY_LAYOUT_CONFIG(67),
    DISPLAY_CONFLICT(68),
    TOO_MANY_INPUTS(69),
    OUT_OF_MEMORY(70),
    INVALID_UI_CONFIG(71),
    NO_AUDIO_PLAYBACK_SERVICE(72),
    NO_ACTIVITY_FOUND(73),
    TOO_MANY_CRASHES(74),
    AUTH_FAILED_OBSOLETE_SSL(75),
    MULTIPLE_VIDEO_CODEC_TYPES(76);

    public final int az;

    zak(int i) {
        this.az = i;
    }

    public static defpackage.zak b(int i) {
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return UNKNOWN_DETAIL;
            case 1:
                return NO_SENSORS;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return SENSORS_FAIL;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return NO_ACCESSORY_PERMISSION;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return NO_ACCESSORY_FD;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return SOCKET_FAIL;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return BAD_MIC_AUDIO_CONFIG;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return BAD_AUDIO_CONFIG;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return MISSING_AUDIO_CONFIG;
            case 9:
                return NAV_NO_IMAGE_OPTIONS;
            case 10:
                return NAV_BAD_SIZE;
            case 11:
                return NAV_BAD_COLOR;
            case 12:
                return BAD_VIDEO;
            case 13:
                return MISSING_VIDEO;
            case 14:
                return DISPLAY_REMOVAL_TIMEOUT;
            case 15:
                return NO_AUDIO_CAPTURE;
            case 16:
                return MISSING_LAUNCHER;
            case 17:
                return NO_VIDEO_CONFIG;
            case 18:
                return BAD_CODEC_RESOLUTION;
            case 19:
                return BAD_DISPLAY_RESOLUTION;
            case 20:
                return BAD_FPS;
            case 21:
                return NO_DENSITY;
            case 22:
                return BAD_DENSITY;
            case 23:
                return NO_SENSORS2;
            case 24:
                return NO_AUDIO_MIC;
            case 25:
                return NO_DISPLAY;
            case 26:
                return NO_INPUT;
            case 27:
                return COMPOSITION_RENDER_ERROR;
            case 28:
                return COMPOSITION_IDLE_RENDER_ERROR;
            case 29:
                return COMPOSITION_SCREENSHOT_ERROR;
            case 30:
                return COMPOSITION_WINDOW_INIT_ERROR;
            case 31:
                return COMPOSITION_INIT_FAIL;
            case 32:
                return VENDOR_START_FAIL;
            case 33:
                return VIDEO_ENCODING_INIT_FAIL;
            case 34:
                return BYEBYE_BY_CAR;
            case 35:
                return BYEBYE_BY_USER;
            case 36:
                return UNEXPECTED_BYEBYE_RESPONSE;
            case 37:
                return BYEBYE_TIMEOUT;
            case 38:
                return INVALID_ACK;
            case 39:
                return INVALID_ACK_CONFIG;
            case 40:
                return NO_VIDEO_CONFIGS;
            case 41:
                return EARLY_VIDEO_FOCUS;
            case 42:
                return ERROR_STARTING_SERVICES;
            case 43:
                return AUTH_FAILED;
            case 44:
                return AUTH_FAILED_BY_CAR;
            case 45:
                return FRAMING_ERROR;
            case 46:
                return UNEXPECTED_MESSAGE;
            case 47:
                return BAD_VERSION;
            case 48:
                return VIDEO_ACK_TIMEOUT;
            case 49:
                return AUDIO_ACK_TIMEOUT;
            case 50:
                return WRITER_IO_ERROR;
            case 51:
                return WRITER_UNKNOWN_EXCEPTION;
            case 52:
                return READER_CLOSE;
            case 53:
                return READER_INIT_FAIL;
            case 54:
                return READER_IO_ERROR;
            case 55:
                return AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID;
            case 56:
                return AUTH_FAILED_BY_CAR_CERT_EXPIRED;
            case 57:
                return PING_TIMEOUT;
            case 58:
                return MULTIPLE_DISPLAY_CONFIGS;
            case 59:
                return WIFI_NETWORK_UNAVAILABLE;
            case 60:
                return WIFI_NETWORK_DISCONNECTED;
            case 61:
                return EMPTY_USB_ACCESSORY_LIST;
            case 62:
                return SPURIOUS_USB_ACCESSORY_EVENT;
            case 63:
                return INVALID_ACCESSORY;
            case 64:
                return CONNECTION_TRANSFER_ABORTED;
            case 65:
                return DISPLAY_ID_INVALID;
            case 66:
                return BAD_PRIMARY_DISPLAY;
            case 67:
                return NO_ACTIVITY_LAYOUT_CONFIG;
            case 68:
                return DISPLAY_CONFLICT;
            case 69:
                return TOO_MANY_INPUTS;
            case 70:
                return OUT_OF_MEMORY;
            case 71:
                return INVALID_UI_CONFIG;
            case 72:
                return NO_AUDIO_PLAYBACK_SERVICE;
            case 73:
                return NO_ACTIVITY_FOUND;
            case 74:
                return TOO_MANY_CRASHES;
            case 75:
                return AUTH_FAILED_OBSOLETE_SSL;
            case 76:
                return MULTIPLE_VIDEO_CODEC_TYPES;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.az;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.az);
    }
}
