package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum xki implements defpackage.abpb {
    EV_CONNECTOR_TYPE_UNKNOWN(0),
    EV_CONNECTOR_TYPE_J1772(1),
    EV_CONNECTOR_TYPE_MENNEKES(2),
    EV_CONNECTOR_TYPE_CHADEMO(3),
    EV_CONNECTOR_TYPE_COMBO_1(4),
    EV_CONNECTOR_TYPE_COMBO_2(5),
    EV_CONNECTOR_TYPE_TESLA_ROADSTER(6),
    EV_CONNECTOR_TYPE_TESLA_HPWC(7),
    EV_CONNECTOR_TYPE_TESLA_SUPERCHARGER(8),
    EV_CONNECTOR_TYPE_GBT(9),
    EV_CONNECTOR_TYPE_6(10),
    EV_CONNECTOR_TYPE_LECCS(11),
    EV_CONNECTOR_TYPE_NACS(14),
    EV_CONNECTOR_TYPE_OTHER(101);

    private final int p;

    xki(int i) {
        this.p = i;
    }

    public static defpackage.xki b(int i) {
        if (i == 14) {
            return EV_CONNECTOR_TYPE_NACS;
        }
        if (i == 101) {
            return EV_CONNECTOR_TYPE_OTHER;
        }
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return EV_CONNECTOR_TYPE_UNKNOWN;
            case 1:
                return EV_CONNECTOR_TYPE_J1772;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return EV_CONNECTOR_TYPE_MENNEKES;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return EV_CONNECTOR_TYPE_CHADEMO;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return EV_CONNECTOR_TYPE_COMBO_1;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return EV_CONNECTOR_TYPE_COMBO_2;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return EV_CONNECTOR_TYPE_TESLA_ROADSTER;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return EV_CONNECTOR_TYPE_TESLA_HPWC;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return EV_CONNECTOR_TYPE_TESLA_SUPERCHARGER;
            case 9:
                return EV_CONNECTOR_TYPE_GBT;
            case 10:
                return EV_CONNECTOR_TYPE_6;
            case 11:
                return EV_CONNECTOR_TYPE_LECCS;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.p);
    }
}
