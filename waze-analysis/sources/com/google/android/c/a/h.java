package com.google.android.c.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum h implements eg {
    DEVICE_TYPE_UNKNOWN(0),
    DEVICE_TYPE_PHONE(1),
    DEVICE_TYPE_PHONE_GO(2),
    DEVICE_TYPE_TV(3),
    DEVICE_TYPE_WEARABLE(4),
    DEVICE_TYPE_AUTOMOTIVE(5),
    DEVICE_TYPE_BATTLESTAR(6),
    DEVICE_TYPE_CHROME_OS(7),
    DEVICE_TYPE_XR(8),
    DEVICE_TYPE_DESKTOP(9),
    DEVICE_TYPE_XR_PERIPHERAL(10);

    private final int m;

    h(int i2) {
        this.m = i2;
    }

    public static h a(int i2) {
        switch (i2) {
            case 0:
                return DEVICE_TYPE_UNKNOWN;
            case 1:
                return DEVICE_TYPE_PHONE;
            case 2:
                return DEVICE_TYPE_PHONE_GO;
            case 3:
                return DEVICE_TYPE_TV;
            case 4:
                return DEVICE_TYPE_WEARABLE;
            case 5:
                return DEVICE_TYPE_AUTOMOTIVE;
            case 6:
                return DEVICE_TYPE_BATTLESTAR;
            case 7:
                return DEVICE_TYPE_CHROME_OS;
            case 8:
                return DEVICE_TYPE_XR;
            case 9:
                return DEVICE_TYPE_DESKTOP;
            case 10:
                return DEVICE_TYPE_XR_PERIPHERAL;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
