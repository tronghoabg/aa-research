package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bt implements eg {
    DEVICE_TYPE_UNKNOWN(0),
    DEVICE_TYPE_QV1(1),
    DEVICE_TYPE_SQ(2),
    DEVICE_TYPE_RQ(3),
    DEVICE_TYPE_EMULATOR(4),
    DEVICE_TYPE_C302(5),
    DEVICE_TYPE_VEN(6),
    DEVICE_TYPE_NEW(9),
    DEVICE_TYPE_QV2(10),
    DEVICE_TYPE_BQ(11),
    DEVICE_TYPE_LIN(12),
    DEVICE_TYPE_RHO(13),
    DEVICE_TYPE_UST(14),
    DEVICE_TYPE_PIC(15),
    DEVICE_TYPE_COR(16),
    DEVICE_TYPE_NQ(17),
    DEVICE_TYPE_KRAMER(18),
    DEVICE_TYPE_ORTIGIA(19),
    DEVICE_TYPE_C302_WIRED2K_CAMERA(20);

    private final int u;

    bt(int i2) {
        this.u = i2;
    }

    public static bt a(int i2) {
        switch (i2) {
            case 0:
                return DEVICE_TYPE_UNKNOWN;
            case 1:
                return DEVICE_TYPE_QV1;
            case 2:
                return DEVICE_TYPE_SQ;
            case 3:
                return DEVICE_TYPE_RQ;
            case 4:
                return DEVICE_TYPE_EMULATOR;
            case 5:
                return DEVICE_TYPE_C302;
            case 6:
                return DEVICE_TYPE_VEN;
            case 7:
            case 8:
            default:
                return null;
            case 9:
                return DEVICE_TYPE_NEW;
            case 10:
                return DEVICE_TYPE_QV2;
            case 11:
                return DEVICE_TYPE_BQ;
            case 12:
                return DEVICE_TYPE_LIN;
            case 13:
                return DEVICE_TYPE_RHO;
            case 14:
                return DEVICE_TYPE_UST;
            case 15:
                return DEVICE_TYPE_PIC;
            case 16:
                return DEVICE_TYPE_COR;
            case 17:
                return DEVICE_TYPE_NQ;
            case 18:
                return DEVICE_TYPE_KRAMER;
            case 19:
                return DEVICE_TYPE_ORTIGIA;
            case 20:
                return DEVICE_TYPE_C302_WIRED2K_CAMERA;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
