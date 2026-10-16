package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum pbp implements defpackage.abpb {
    CALL_SITE_UNSET(0),
    GAL_READ(1),
    GAL_WRITE(2),
    GAL_PRE_READ(3),
    RFCOMM_CONNECT(101),
    WPP_TCP_CONNECT(102),
    WPP_READ(103),
    WPP_WRITE(104),
    WPP_PRE_READ(105),
    WPP_RECEIVE_MESSAGE(106),
    WPP_SEND_MESSAGE(107),
    WPP_READ_WRITE_MESSAGE_RAND(108),
    WPP_READ_WRITE_MESSAGE_RAND_DELAY(109),
    GAL_READ_WRITE_MESSAGE_RAND(110),
    GAL_READ_WRITE_MESSAGE_RAND_DELAY(111),
    WIFI_NETWORK_REQUEST(112),
    WIFI_NETWORK_AVAILABLE(113),
    USB_FD_CLOSE(201),
    LIST_USB_ACCESSORIES(203);

    private final int u;

    pbp(int i) {
        this.u = i;
    }

    public static defpackage.pbp b(int i) {
        if (i == 0) {
            return CALL_SITE_UNSET;
        }
        if (i == 1) {
            return GAL_READ;
        }
        if (i == 2) {
            return GAL_WRITE;
        }
        if (i == 3) {
            return GAL_PRE_READ;
        }
        if (i == 201) {
            return USB_FD_CLOSE;
        }
        if (i == 203) {
            return LIST_USB_ACCESSORIES;
        }
        switch (i) {
            case 101:
                return RFCOMM_CONNECT;
            case 102:
                return WPP_TCP_CONNECT;
            case 103:
                return WPP_READ;
            case 104:
                return WPP_WRITE;
            case 105:
                return WPP_PRE_READ;
            case 106:
                return WPP_RECEIVE_MESSAGE;
            case 107:
                return WPP_SEND_MESSAGE;
            case 108:
                return WPP_READ_WRITE_MESSAGE_RAND;
            case 109:
                return WPP_READ_WRITE_MESSAGE_RAND_DELAY;
            case 110:
                return GAL_READ_WRITE_MESSAGE_RAND;
            case 111:
                return GAL_READ_WRITE_MESSAGE_RAND_DELAY;
            case 112:
                return WIFI_NETWORK_REQUEST;
            case 113:
                return WIFI_NETWORK_AVAILABLE;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.u);
    }
}
