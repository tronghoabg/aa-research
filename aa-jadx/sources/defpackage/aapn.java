package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum aapn implements defpackage.abpb {
    OTHER_NETWORK(0),
    DISCONNECTED(1),
    WIFI(2),
    CELL(3),
    BLUETOOTH(4),
    ETHERNET(5),
    SATELLITE(6);

    public final int h;

    aapn(int i2) {
        this.h = i2;
    }

    public static defpackage.aapn b(int i2) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
