package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum xqd implements defpackage.abpb {
    VIDEO_800x480(1),
    VIDEO_1280x720(2),
    VIDEO_1920x1080(3),
    VIDEO_2560x1440(4),
    VIDEO_3840x2160(5),
    VIDEO_720x1280(6),
    VIDEO_1080x1920(7),
    VIDEO_1440x2560(8),
    VIDEO_2160x3840(9);

    public final int j;

    xqd(int i) {
        this.j = i;
    }

    public static defpackage.xqd b(int i) {
        switch (i) {
            case 1:
                return VIDEO_800x480;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return VIDEO_1280x720;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return VIDEO_1920x1080;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return VIDEO_2560x1440;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return VIDEO_3840x2160;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return VIDEO_720x1280;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return VIDEO_1080x1920;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return VIDEO_1440x2560;
            case 9:
                return VIDEO_2160x3840;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
