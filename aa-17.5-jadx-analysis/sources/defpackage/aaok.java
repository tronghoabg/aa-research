package defpackage;

/* loaded from: classes3.dex */
public enum aaok implements abnz {
    OTHER_NETWORK(0),
    DISCONNECTED(1),
    WIFI(2),
    CELL(3),
    BLUETOOTH(4),
    ETHERNET(5),
    SATELLITE(6);

    public final int h;

    aaok(int i2) {
        this.h = i2;
    }

    public static aaok b(int i2) {
        switch (i2) {
            case 0:
                return OTHER_NETWORK;
            case 1:
                return DISCONNECTED;
            case 2:
                return WIFI;
            case 3:
                return CELL;
            case 4:
                return BLUETOOTH;
            case 5:
                return ETHERNET;
            case 6:
                return SATELLITE;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
