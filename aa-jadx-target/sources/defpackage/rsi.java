package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum rsi implements defpackage.abpb {
    UNKNOWN(0),
    CONTROL(1),
    VIDEO_SINK(2),
    AUDIO_SINK_GUIDANCE(3),
    AUDIO_SINK_SYSTEM(4),
    AUDIO_SINK_MEDIA(5),
    AUDIO_SOURCE(6),
    SENSOR_SOURCE(7),
    INPUT_SOURCE(8),
    BLUETOOTH(9),
    NAVIGATION_STATUS(10),
    MEDIA_PLAYBACK_STATUS(11),
    MEDIA_BROWSER(12),
    PHONE_STATUS(13),
    NOTIFICATION(14),
    RADIO(15),
    VENDOR_EXTENSION(16),
    WIFI_PROJECTION(17),
    WIFI_DISCOVERY(18),
    CAR_CONTROL(19),
    CAR_LOCAL_MEDIA(20),
    BUFFERED_MEDIA_SINK(21),
    CAR_INTENT(22),
    UNRECOGNIZED(-1);

    private final int z;

    rsi(int i) {
        this.z = i;
    }

    public static defpackage.rsi b(int i) {
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return UNKNOWN;
            case 1:
                return CONTROL;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return VIDEO_SINK;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return AUDIO_SINK_GUIDANCE;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return AUDIO_SINK_SYSTEM;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return AUDIO_SINK_MEDIA;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return AUDIO_SOURCE;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return SENSOR_SOURCE;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return INPUT_SOURCE;
            case 9:
                return BLUETOOTH;
            case 10:
                return NAVIGATION_STATUS;
            case 11:
                return MEDIA_PLAYBACK_STATUS;
            case 12:
                return MEDIA_BROWSER;
            case 13:
                return PHONE_STATUS;
            case 14:
                return NOTIFICATION;
            case 15:
                return RADIO;
            case 16:
                return VENDOR_EXTENSION;
            case 17:
                return WIFI_PROJECTION;
            case 18:
                return WIFI_DISCOVERY;
            case 19:
                return CAR_CONTROL;
            case 20:
                return CAR_LOCAL_MEDIA;
            case 21:
                return BUFFERED_MEDIA_SINK;
            case 22:
                return CAR_INTENT;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.abpk.b() : this.z;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.z);
    }
}
