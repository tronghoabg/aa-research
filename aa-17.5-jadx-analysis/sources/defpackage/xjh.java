package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* loaded from: classes.dex */
public enum xjh implements abnz {
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
    EV_CONNECTOR_TYPE_OTHER(EnergyProfile.EVCONNECTOR_TYPE_OTHER);

    private final int p;

    xjh(int i) {
        this.p = i;
    }

    public static xjh b(int i) {
        if (i == 14) {
            return EV_CONNECTOR_TYPE_NACS;
        }
        if (i == 101) {
            return EV_CONNECTOR_TYPE_OTHER;
        }
        switch (i) {
            case 0:
                return EV_CONNECTOR_TYPE_UNKNOWN;
            case 1:
                return EV_CONNECTOR_TYPE_J1772;
            case 2:
                return EV_CONNECTOR_TYPE_MENNEKES;
            case 3:
                return EV_CONNECTOR_TYPE_CHADEMO;
            case 4:
                return EV_CONNECTOR_TYPE_COMBO_1;
            case 5:
                return EV_CONNECTOR_TYPE_COMBO_2;
            case 6:
                return EV_CONNECTOR_TYPE_TESLA_ROADSTER;
            case 7:
                return EV_CONNECTOR_TYPE_TESLA_HPWC;
            case 8:
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

    @Override // defpackage.abnz
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
